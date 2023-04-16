package com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class Utf8Safe$UnpairedSurrogateException extends IllegalArgumentException	// class@00193d
{

    public void Utf8Safe$UnpairedSurrogateException(int p0,int p1){
       super("Unpaired surrogate at index "+p0+" of "+p1);
    }
}
