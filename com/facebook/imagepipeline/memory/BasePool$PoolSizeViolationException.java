package com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;

public class BasePool$PoolSizeViolationException extends RuntimeException	// class@0010fe
{

    public void BasePool$PoolSizeViolationException(int p0,int p1,int p2,int p3){
       super("Pool hard cap violation? Hard cap = "+p0+" Used size = "+p1+" Free size = "+p2+" Request size = "+p3);
    }
}
