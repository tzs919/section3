package annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppendProcessor {
    @Around("@annotation(appendAnnotation)")
    public String process(ProceedingJoinPoint joinPoint, Append appendAnnotation) throws Throwable {
        String res = appendAnnotation.word() + " " + joinPoint.proceed() + " " + appendAnnotation.word();
        return res;
    }
}
