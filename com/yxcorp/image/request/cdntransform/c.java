package com.yxcorp.image.request.cdntransform.c;
import xb.t$b;
import java.lang.String;
import com.yxcorp.image.request.cdntransform.IImageCDNTransformer$CDNResizeMode;
import java.lang.Object;

public class c	// class@001a28
{
    public int a;
    public int b;
    public String c;
    public t$b d;
    public IImageCDNTransformer$CDNResizeMode e;

    public void c(int p0,int p1,t$b p2,String p3,IImageCDNTransformer$CDNResizeMode p4){
       super();
       this.a = 0;
       this.b = 0;
       this.c = "";
       this.d = null;
       this.e = null;
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       this.e = p4;
    }
    public IImageCDNTransformer$CDNResizeMode a(){
       return this.e;
    }
    public int b(){
       return this.b;
    }
    public t$b c(){
       return this.d;
    }
    public int d(){
       return this.a;
    }
}
