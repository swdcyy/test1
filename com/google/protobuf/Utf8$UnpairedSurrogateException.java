package com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class Utf8$UnpairedSurrogateException extends IllegalArgumentException	// class@0004ed
{

    public void Utf8$UnpairedSurrogateException(int p0,int p1){
       super("Unpaired surrogate at index "+p0+" of "+p1);
    }
}
