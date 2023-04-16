package com.loc.ft$1;
import java.lang.ThreadLocal;
import java.nio.charset.CharsetDecoder;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;

public final class ft$1 extends ThreadLocal	// class@00143a
{

    public void ft$1(){
       super();
    }
    public static CharsetDecoder a(){
       return Charset.forName("UTF-8").newDecoder();
    }
    public final Object initialValue(){
       return ft$1.a();
    }
}
