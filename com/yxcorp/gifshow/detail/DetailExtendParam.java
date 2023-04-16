package com.yxcorp.gifshow.detail.DetailExtendParam;
import java.io.Serializable;
import tl8.d;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.smile.gifshow.annotation.provider.v2.a;
import java.io.ObjectInputStream;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tl8.c;
import java.util.Set;

public class DetailExtendParam implements Serializable, d	// class@001335
{
    public a mAccessorWrapper;
    public static final long serialVersionUID = 0xcdcf5d6e076a2ea8;

    public void DetailExtendParam(){
       super();
       this.mAccessorWrapper = Accessors.d().e(this);
    }
    private void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailExtendParam.class, "2")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
    public Object a(Class p0){
       return c.b(this, p0);
    }
    public Set c(){
       return c.a(this);
    }
    public void d(String p0,Object p1){
       c.f(this, p0, p1);
    }
    public void e(Class p0,Object p1){
       c.d(this, p0, p1);
    }
    public Object get(String p0){
       return c.c(this, p0);
    }
    public final a getAccessors(){
       return this.mAccessorWrapper;
    }
    public void set(Object p0){
       c.e(this, p0);
    }
    public final void setupAccessors(){
       if (PatchProxy.applyVoid(null, this, DetailExtendParam.class, "1")) {
          return;
       }
       this.mAccessorWrapper = Accessors.d().e(this);
       return;
    }
}
