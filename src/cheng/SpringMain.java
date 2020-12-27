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
		
		
		
		
		//����
		String str = "#user.age"; //���ʾContext��user�����е�getName����
		String str1 = "user.name";  //���ʾ��ȡ�������getUser��getName����
	  //1.�������ʽ������/
	  ExpressionParser parser = new SpelExpressionParser();
	  //2.�ý�����ȥ�����ַ���
	  Expression expr=  parser.parseExpression(str1);
	  
	  //����漰����������Ҫʹ��ExpressionContext
	  StandardEvaluationContext ctx = new StandardEvaluationContext();
	  ctx.setVariable("date", new java.util.Date());
	  ctx.setVariable("user", new User("�����",(short)500));
	  //���ø�����
	 //ctx.setRootObject(new );
	  //3.����Experssion��getValue()����
	  System.out.println(expr.getValue(ctx));
	}
}
