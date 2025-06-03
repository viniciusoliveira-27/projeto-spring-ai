package com.example.spring_ai.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RecipeService {

    private final ChatModel chatModel;

    public RecipeService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String createRecipe(String ingredients,
                               String cuisine,
                               String dietaryRestrictions){
        var template = """
                Eu preciso criar uma receita usando os ingredientes a seguir: {ingredients}
                O tipo de cozinha que eu prefiro é {cuisine}
                Por favor considere as restrições da dieta: {dietaryRestrictions}
                Por favor me forneça uma receita detalhada incluindo título, lista de ingredientes e instruções de cozimento
                
                """;

        // Setar os valores das variaveis
        PromptTemplate promptTemplate = new PromptTemplate(template);
        Map<String, Object> params = Map.of(
                "ingredients", ingredients,
                "cuisine", cuisine,
                "dietaryRestrictions", dietaryRestrictions
        );

        Prompt prompt = promptTemplate.create(params);

        return chatModel.call(prompt).getResult().getOutput().getText();
    }
}
