package a1.a;
import android.content.Context;
import java.lang.Object;
import a1.a$a;
import a1.a$b;
import q0.f;
import android.view.LayoutInflater$Factory;
import android.view.LayoutInflater;
import android.os.Handler;
import android.os.Handler$Callback;
import a1.a$d;
import java.lang.StackTraceElement;
import android.content.res.Resources;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.lang.Math;
import java.lang.System;
import android.view.ViewGroup;
import a1.a$e;
import java.util.Objects;
import a1.a$c;
import com.yxcorp.utility.Log;

public final class a	// class@00003f
{
    public LayoutInflater a;
    public Handler b;
    public a$d c;
    public Handler$Callback d;

    public void a(Context p0){
       super();
       this.d = new a$a(this);
       a$b uob = new a$b(p0);
       this.a = uob;
       uob.setFactory(new f());
       this.b = new Handler(this.d);
       this.c = a$d.b();
    }
    public final StackTraceElement[] a(Context p0,int p1){
       StackTraceElement[] stackTraceEl = new StackTraceElement[8];
       stackTraceEl[0] = new StackTraceElement("AppCompatAsyncLayoutInflater.inflate", " [!!! crash layoutResId: "+p0.getResources().getResourceName(p1)+" !!!] ", "AppCompatAsyncLayoutInflater.java", 85);
       StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
       System.arraycopy(stackTrace, 3, stackTraceEl, 1, Math.min(7, stackTrace.length));
       return stackTraceEl;
    }
    public void b(int p0,ViewGroup p1,a$e p2){
       Objects.requireNonNull(p2, "callback argument may not be null!");
       a$c uoc = this.c.c();
       uoc.a = this;
       uoc.c = p0;
       uoc.b = p1;
       uoc.e = p2;
       uoc.f = this.a(this.a.getContext(), p0);
       Log.g("AsyncLayoutInflater", "enqueue inflate request: "+uoc.toString());
       this.c.a(uoc);
    }
}
