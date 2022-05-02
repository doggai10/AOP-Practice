package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {

    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder(){} // pointcut signature

    //클래스 이름 패턴이 *service 인거
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService(){}

    @Pointcut("allOrder() && allService()")
    public void orderAndService(){}

}
