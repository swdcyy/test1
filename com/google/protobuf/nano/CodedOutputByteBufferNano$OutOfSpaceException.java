package com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.String;

public class CodedOutputByteBufferNano$OutOfSpaceException extends IOException	// class@0005c3
{
    public static final long serialVersionUID = 0x9f95917c52ce6e25;

    public void CodedOutputByteBufferNano$OutOfSpaceException(int p0,int p1){
       super("CodedOutputStream was writing to a flat byte array and ran out of space \(pos "+p0+" limit "+p1+"\).");
    }
}
