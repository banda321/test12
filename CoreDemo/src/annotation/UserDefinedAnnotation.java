package annotation;
//let me write something
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.swing.text.Element;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
	int value1() default  10;
	String value2() default  "Ranjan";
	}
@Test(value1=12,value2="Hero")
class MyTest{
	
	public void show(){
		
	}
	
}
public class UserDefinedAnnotation {
	public static void main(String[] args) {
		MyTest mt=new MyTest();
		Class cls=mt.getClass();
		Annotation anno=cls.getAnnotation(Test.class);
		Test tst=(Test) anno;
		System.out.println(tst.value1());
	}

}
