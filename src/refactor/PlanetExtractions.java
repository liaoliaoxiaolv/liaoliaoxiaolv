package refactor;

/**
 * https://blog.jetbrains.com/idea/2020/12/3-ways-to-refactor-your-code-in-intellij-idea/
 * 重构代码的三种方法
 *
 * @author moqi
 * On 12/22/20 10:42
 */

public class PlanetExtractions {

    Planet myPlanet = new Planet("earth");

    // I'm using PlanetExtractions to get the facts for my country
    // I'm using planetextractions to get the facts for my country
    private void printPlanetFacts(final String country) {
        System.out.println("Planet name is " + myPlanet.getName());
        System.out.println("Current season is " + myPlanet.getCountryWeather());
        System.out.println("Number of times the planet rotates around the sun is " + 365);
        System.out.println("Number of characters in planet name = " + myPlanet.getName().length());

        switch (myPlanet.getCountryWeather()) {
            case "Spring" -> System.out.println("The weather is warm in the UK");
            case "Summer" -> System.out.println("The weather is hot in the UK");
            case "Autumn" -> System.out.println("The weather is cool in the UK");
            default -> System.out.println("The weather is cold in the UK");
        }
    }

}
