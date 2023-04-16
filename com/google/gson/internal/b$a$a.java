package com.google.gson.internal.b$a$a;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;

public class b$a$a implements CharSequence	// class@001952
{
    public char[] b;

    public void b$a$a(){
       super();
    }
    public char charAt(int p0){
       return this.b[p0];
    }
    public int length(){
       return this.b.length;
    }
    public CharSequence subSequence(int p0,int p1){
       return new String(this.b, p0, (p1 - p0));
    }
}
