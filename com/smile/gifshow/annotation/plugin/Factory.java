package com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import jm8.b;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class Factory	// class@000fd4
{
    public b mInitializer;
    public Object mInstance;

    public void Factory(){
       super();
    }
    public Object create(){
       Object obj = this.newInstance();
       if (obj instanceof b) {
          obj.a(obj);
       }else {
          Factory tmInitialize = this.mInitializer;
          if (tmInitialize != null) {
             tmInitialize.a(obj);
          }
       }
       return obj;
    }
    public synchronized final Object getInstance(){
       if (this.mInstance == null) {
          this.mInstance = this.create();
       }
       return this.mInstance;
    }
    public abstract Object newInstance();
    public void setInitializer(b p0){
       if (p0 == null) {
          return;
       }
       if (this.mInitializer != null) {
          throw new IllegalStateException("不能重复设置 initializer, "+p0);
       }
       this.mInitializer = p0;
       return;
    }
}
