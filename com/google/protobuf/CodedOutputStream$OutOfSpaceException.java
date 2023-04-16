package com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import java.io.IOException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class CodedOutputStream$OutOfSpaceException extends IOException	// class@0003ea
{
    public static final long serialVersionUID = 0x9f95917c52ce6e25;

    public void CodedOutputStream$OutOfSpaceException(){
       super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
    public void CodedOutputStream$OutOfSpaceException(String p0){
       super("CodedOutputStream was writing to a flat byte array and ran out of space.: "+p0);
    }
    public void CodedOutputStream$OutOfSpaceException(String p0,Throwable p1){
       super("CodedOutputStream was writing to a flat byte array and ran out of space.: "+p0, p1);
    }
    public void CodedOutputStream$OutOfSpaceException(Throwable p0){
       super("CodedOutputStream was writing to a flat byte array and ran out of space.", p0);
    }
}
