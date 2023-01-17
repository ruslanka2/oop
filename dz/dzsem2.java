 package dz;
// Задача 2
import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;

public class dzsem2 {
  
    public static void main(String[] args)throws IOException {
        
        int [] mas = {11, 3, 14, 16, 7,90,1};
        System.out.println(Arrays.toString(mas));
        boolean isSorted = false;
        int buf;
        Logger logger=Logger.getLogger(dzsem2.class.getName());
        FileHandler fh = new  FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
        logger.log(Level.WARNING,Arrays.toString(mas));
                }
            
            }
    
        }
        }
        }
// Задача 1
// import java.util.LinkedHashMap;
// import java.util.Map;


// public class dzsem2 {
//     public static void main(String[] args) {
//         Map<String, String> map = new LinkedHashMap<>();
//         map.put("name","Ivanov");
//         map.put("country","Russia");
//         map.put("city","Izhevsk");
//         map.put("age",null);
//         map.put("name1","Ivanov");
//         map.put("name2","Ivanov");

//         System.out.println(getQuery(map));
//     }

//     public static String getQuery(Map<String, String> params) {
//         StringBuilder result = new StringBuilder();
//         if (params == null || params.isEmpty())
//             return result.toString();

//         for (Map.Entry<String, String> pair : params.entrySet()) {
//             if (pair.getKey() == null || pair.getValue() == null)
//                 continue;

//             result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
//         }

//         if (result.length() > 5)
//             result.delete(result.length() - 5, result.length());

//         return result.toString();
//     }
// }      
        
    
    
   
