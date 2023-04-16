package com.facebook.imagepipeline.image.a;
import java.io.Closeable;
import bd.f;
import bd.e;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import bd.h;
import bd.g;
import java.util.Map;
import java.lang.Class;
import java.lang.System;
import java.lang.Integer;
import cb.a;

public abstract class a implements Closeable, f, e	// class@0010fa
{
    public Map b;
    public static final String[] c;

    static {
       String[] stringArray = new String[]{"encoded_size","encoded_width","encoded_height","uri_source","image_format","bitmap_config"};
       a.c = stringArray;
    }
    public void a(){
       super();
       this.b = new HashMap();
    }
    public h a(){
       return g.d;
    }
    public abstract int c();
    public abstract void close();
    public boolean e(){
       return false;
    }
    public void f(Map p0){
       if (p0 == null) {
          return;
       }
       String[] c = a.c;
       int len = c.length;
       int i = 0;
       while (i < len) {
          object oobject = c[i];
          Object obj = p0.get(oobject);
          if (obj != null) {
             this.b.put(oobject, obj);
          }
          i = i + 1;
       }
       return;
    }
    public void finalize(){
       if (this.isClosed()) {
          return;
       }
       Object[] objArray = new Object[]{this.getClass().getSimpleName(),Integer.valueOf(System.identityHashCode(this))};
       a.z("CloseableImage", "finalize: %s %x still open.", objArray);
       this.close();
       super.finalize();
       return;
    }
    public Map getExtras(){
       return this.b;
    }
    public abstract boolean isClosed();
}
