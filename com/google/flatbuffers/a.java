package com.google.flatbuffers.a;
import java.lang.Object;
import com.google.flatbuffers.Utf8Safe;
import java.nio.ByteBuffer;
import java.lang.String;
import java.lang.CharSequence;

public abstract class a	// class@000544
{
    public static a a;

    public void a(){
       super();
    }
    public static a d(){
       if (a.a == null) {
          a.a = new Utf8Safe();
       }
       return a.a;
    }
    public abstract String a(ByteBuffer p0,int p1,int p2);
    public abstract void b(CharSequence p0,ByteBuffer p1);
    public abstract int c(CharSequence p0);
}
