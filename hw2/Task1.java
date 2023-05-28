// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Task1 {
    private String sqlStr = "SELECT * FROM students WHERE ";
    private String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";    
    public String buildStr() {
        StringBuilder sb = new StringBuilder(sqlStr);
        String paramsReplace = params.replace("\"", "").replace("{", "").replace("}", "").replace(",", "").replace(":", " ");
        String[] array = paramsReplace.split(" ");                                 
        for (int i = 1; i < array.length; i += 2) {            
            if (array[i].equals("null") == false) {
                sb.append(array[i - 1] + " = " + "\"" + array[i] + "\"");       
            }
            if (i + 2 < array.length) {
                if (array[i + 2].equals("null") == false) {
                    sb.append(" AND ");
                }
            }
        }
        sb.append(";");
        return sb.toString();
    }
}
