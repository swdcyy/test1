package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$k$a;
import java.lang.Runnable;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$k;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import z5.d;

public class ReactBindingXModule$k$a implements Runnable	// class@000e2c
{
    public final Runnable b;
    public final ReactBindingXModule$k c;

    public void ReactBindingXModule$k$a(ReactBindingXModule$k p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       try{
          this.b.run();
       }catch(java.lang.Exception e0){
          d.a("unexpected internal error", e0);
       }
       return;
    }
}
