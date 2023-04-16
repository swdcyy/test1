package com.facebook.imagepipeline.decoder.DecodeException;
import java.lang.RuntimeException;
import java.lang.String;
import bd.d;
import java.lang.Throwable;

public class DecodeException extends RuntimeException	// class@0010f8
{
    public final d mEncodedImage;

    public void DecodeException(String p0,d p1){
       super(p0);
       this.mEncodedImage = p1;
    }
    public void DecodeException(String p0,Throwable p1,d p2){
       super(p0, p1);
       this.mEncodedImage = p2;
    }
    public d getEncodedImage(){
       return this.mEncodedImage;
    }
}
