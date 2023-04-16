package com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;
import java.lang.RuntimeException;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public class BasePool$InvalidSizeException extends RuntimeException	// class@0010fd
{

    public void BasePool$InvalidSizeException(Object p0){
       super("Invalid size: "+p0.toString());
    }
}
