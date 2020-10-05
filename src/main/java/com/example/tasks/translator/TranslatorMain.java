package com.example.tasks.translator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class TranslatorMain {
    //Map initialization https://stackoverflow.com/a/6802502
    private static final Map<String,String> translatedWords = new HashMap<String, String>(){{
        put("Hot","Жарко");
        put("Rainy","Дождливо");
        put("Warm","Тепло");
        put("Cold","Холодно");
        put("Snowy","Снежно");
        put("Windy","Ветренно");
        put("Cloudy","Облачно");
        put("Clear","Ясно");
        put("Foggy","Туманно");
        put("Overcast","Пасмурно");
    }};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word: ");
        while (true){
            String input = scanner.nextLine();
            Optional<Map.Entry<String, String>> matchingEntry = translatedWords
                    .entrySet()
                    .stream()
                    .filter((e)->e.getValue().equalsIgnoreCase(input))
                    .findFirst();
            if( matchingEntry.isPresent() ) System.out.println("Word '"+input+"' is found. Translation: "+matchingEntry.get().getKey());
            else System.out.println("Word '"+input+"' is not found.");
        }
    }
}
