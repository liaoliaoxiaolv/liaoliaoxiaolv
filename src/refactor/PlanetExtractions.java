package refactor;

/**
 * https://blog.jetbrains.com/idea/2020/12/3-ways-to-refactor-your-code-in-intellij-idea/
 * 重构代码的三种方法
 *
 * @author moqi
 * On 12/22/20 10:42
 */

public class PlanetExtractions {

    private static final int NUMBER_OF_DAYS_IN_A_YEAR = 365;
    private final String theWeatherIs = "The weather is";
    Planet myPlanet = new Planet("earth");

    private void printPlanetFacts(final String country) {

        System.out.println("Planet name is " + myPlanet.getName());
        System.out.println("Current season is " + myPlanet.getCountryWeather());
        System.out.println("Number of times the planet rotates around the sun is " + NUMBER_OF_DAYS_IN_A_YEAR);

        int planetNameLength = myPlanet.getName().length();
        System.out.println("Number of characters in planet name = " + planetNameLength);

        getWeather("UK");
    }

    private void getWeather(final String country) {
        switch (myPlanet.getCountryWeather()) {
            case "Spring" -> System.out.println(theWeatherIs + " warm in the " + country);
            case "Summer" -> System.out.println(theWeatherIs + " hot in the " + country);
            case "Autumn" -> System.out.println(theWeatherIs + " cool in the " + country);
            default -> System.out.println(theWeatherIs + " cold in the " + country);
        }
    }

}
