package com.google.common.io.c$a;
import com.google.common.io.c$c;
import java.lang.Object;
import java.io.Closeable;
import java.lang.Throwable;
import sk.b;
import java.util.logging.Level;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.logging.Logger;

public final class c$a implements c$c	// class@0018e7
{
    public static final c$a a;

    static {
       c$a.a = new c$a();
    }
    public void c$a(){
       super();
    }
    public void a(Closeable p0,Throwable p1,Throwable p2){
       b.a.log(Level.WARNING, "Suppressing exception thrown when closing "+p0, p2);
    }
}
