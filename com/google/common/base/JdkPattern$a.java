package com.google.common.base.JdkPattern$a;
import ok.d;
import java.util.regex.Matcher;
import java.lang.Object;
import ok.n;
import java.lang.String;

public final class JdkPattern$a extends d	// class@00171a
{
    public final Matcher a;

    public void JdkPattern$a(Matcher p0){
       super();
       n.j(p0);
       this.a = p0;
    }
    public int a(){
       return this.a.end();
    }
    public boolean b(){
       return this.a.find();
    }
    public boolean c(int p0){
       return this.a.find(p0);
    }
    public boolean d(){
       return this.a.matches();
    }
    public String e(String p0){
       return this.a.replaceAll(p0);
    }
    public int f(){
       return this.a.start();
    }
}
