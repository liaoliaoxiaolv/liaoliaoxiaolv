package language.injection;

/**
 * 语言注入
 *
 * 官方文档：https://www.jetbrains.com/help/idea/using-language-injections.html
 *
 * @author moqi
 * On 11/21/20 12:39
 */

public class Demo {

    public static void main(String[] args) {

        String json = "{\n" +
                "  \"name\": \"zhangsan\",\n" +
                "  \"age\": 66,\n" +
                "  \"isMale\": true,\n" +
                "  \"hasCat\": null,\n" +
                "  \"likeNumber\": [\n" +
                "    6,\n" +
                "    6,\n" +
                "    6\n" +
                "  ]\n" +
                "}";







        String mysql = "select\n" +
                "   " +
                " Host,\n" +
                "    User\n" +
                "from\n" +
                "    user;";







        String sql = "select\n" +
                "    *\n" +
                "from\n" +
                "    t\n" +
                "where\n" +
                "    json_field = '{\n" +
                "  \"name\": \"zhangsan\"\n" +
                "}';";

        String notInjectSql = "select\n" +
                "    *\n" +
                "from\n" +
                "    t\n" +
                "where\n" +
                "    json_field = '{\n" +
                "  \"name\": \"zhangsan\"\n" +
                "}';";

    }

}
