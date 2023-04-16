package com.oasisfeng.condom.util.Lazy;
import java.lang.Object;

public abstract class Lazy	// class@000a9d
{
    public Object mInstance;

    public void Lazy(){
       super();
    }
    public abstract Object create();
    public final Object get(){
       _monitor_enter(this);
       Lazy tmInstance = this.mInstance;
       if (tmInstance != null) {
       }else {
          tmInstance = this.create();
          this.mInstance = tmInstance;
       }
       _monitor_exit(this);
       return tmInstance;
    }
}
