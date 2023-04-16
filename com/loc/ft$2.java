package com.loc.ft$2;
import java.lang.ThreadLocal;
import java.nio.charset.Charset;
import java.lang.String;
import java.lang.Object;

public final class ft$2 extends ThreadLocal	// class@00143b
{

    public void ft$2(){
       super();
    }
    public static Charset a(){
       return Charset.forName("UTF-8");
    }
    public final Object initialValue(){
       return ft$2.a();
    }
}
