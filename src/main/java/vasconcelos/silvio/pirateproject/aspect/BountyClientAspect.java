package vasconcelos.silvio.pirateproject.aspect;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import lombok.AllArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
@AllArgsConstructor
public class BountyClientAspect {

    private final ObservationRegistry observationRegistry;


    @Around("execution (* vasconcelos.silvio.pirateproject.service.BountyClient.*(..))")
    public Object measureBountyClientMethod(ProceedingJoinPoint joinPoint) {
        String methodName = ((MethodSignature) joinPoint.getSignature()).getMethod().getName();
        return Observation.createNotStarted(methodName, observationRegistry).observe(() -> {
            try {
                return joinPoint.proceed();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
    }
}
