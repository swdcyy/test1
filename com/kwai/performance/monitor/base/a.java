package com.kwai.performance.monitor.base.a;
import yf7.d;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.d$a;
import java.lang.RuntimeException;

public final class a implements d	// class@001108
{

    public void a(){
       super();
    }
    public void a(Map p0){
       a.q(p0, "exceptionMessages");
       d$a.a(this, p0);
    }
    public void b(String p0,int p1,String p2){
       a.q(p0, "message");
       a.q(p0, "message");
       throw new RuntimeException();
    }
    public void c(String p0,String p1,boolean p2){
       a.q(p0, "key");
       a.q(p0, "key");
       throw new RuntimeException();
    }
    public void d(String p0,int p1,String p2){
       a.q(p0, "message");
       d$a.d(this, p0, p1, p2);
       throw null;
    }
    public void e(String p0,String p1,boolean p2){
       a.q(p0, "key");
       a.q(p0, "key");
       throw new RuntimeException();
    }
}
