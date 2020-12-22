package refactor;

/**
 * Planet Bean 类
 *
 * @author moqi
 * On 12/22/20 10:44
 */

public class Planet {
    public String name;
    public String season;

    public Planet(String name) {
        this.name = name;
    }

    public String getCountryWeather() {
        return season;
    }

    public String getName() {
        return name;
    }
}
