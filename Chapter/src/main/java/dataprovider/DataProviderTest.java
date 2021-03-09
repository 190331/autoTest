package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider ="methodData")
    public void test1(String name ,int age){
        System.out.println("test1的name是"+name+"test1的age是"+age);

    }
    @Test(dataProvider ="methodData")
    public void test2(String name ,int age){
        System.out.println("test2的name是"+name+"test2的age是"+age);

    }
    @DataProvider(name = "methodData")
    public Object[][] methodProviderTest(Method method){

        Object[][] result=null;
            if (method.getName().equals("test1")){
                    result = new Object[][]{
                            {"刘备",28},
                            {"关羽",25}
                    };
            }else if (method.getName().equals("test2")){
                    result = new Object[][]{
                            {"悟空",108},
                            {"八戒",99}
                    };
            }
            return result;
    };
}
