package cheng;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpringMain
{

	
	
	public static void main(String[] args)
	{
		
		
		
		
		//变量
		String str = "#user.age"; //这表示Context中user对象中的getName方法
		String str1 = "user.name";  //这表示获取根对象的getUser的getName方法
	  //1.创建表达式解析器/
	  ExpressionParser parser = new SpelExpressionParser();
	  //2.用解析器去解析字符串
	  Expression expr=  parser.parseExpression(str1);
	  
	  //如果涉及到变量，需要使用ExpressionContext
	  StandardEvaluationContext ctx = new StandardEvaluationContext();
	  ctx.setVariable("date", new java.util.Date());
	  ctx.setVariable("user", new User("孙悟空",(short)500));
	  //设置根对象
	 //ctx.setRootObject(new );
	  //3.调用Experssion的getValue()方法
	  System.out.println(expr.getValue(ctx));
	}
}
