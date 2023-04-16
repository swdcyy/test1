package com.kwai.stentor.commo.a;
import xt7.c;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import com.kwai.stentor.commo.LogListener;
import java.lang.StringBuilder;
import com.kwai.stentor.commo.LogListener$StentorLogLevel;
import xt7.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.Log;

public abstract class a implements c	// class@00190a
{
    public boolean a;
    public int b;
    public ReentrantLock c;
    public int d;
    public d e;
    public LogListener f;
    public String g;

    public void a(String p0){
       super();
       this.a = true;
       this.c = new ReentrantLock();
       this.e = null;
       this.f = null;
       this.g = "";
       this.g = p0;
       this.d = 10;
    }
    public void a(LogListener p0){
       this.f = p0;
    }
    public void b(){
       this.b = 0;
    }
    public void c(int p0){
       this.f("set max delay time: "+p0, LogListener$StentorLogLevel.DEBUG);
       this.d = p0;
    }
    public void d(d p0){
       this.e = p0;
    }
    public void destroy(){
    }
    public void f(String p0,LogListener$StentorLogLevel p1){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (!TextUtils.isEmpty(this.g)) {
          p0 = this.g+" "+p0;
       }
       a tf = this.f;
       if (tf != null) {
          tf.a(p0, p1);
       }else {
          Log.b(this.g, p0);
       }
       return;
    }
}
