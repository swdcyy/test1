package com.samsung.android.sdk.camera.impl.internal.a;
import android.media.Image;
import java.lang.String;
import java.lang.Class;
import com.samsung.android.sdk.camera.impl.internal.a$a;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.IllegalStateException;
import android.media.Image$Plane;

public class a extends Image	// class@000b82
{
    public ByteBuffer b;
    public boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public a$a[] h;
    public Method i;
    public long j;
    public static final String k;

    static {
       a.k = a.class.getSimpleName();
    }
    public void close(){
       if (this.c == null) {
          a th = this.h;
          int len = th.length;
          for (int i = 0; i < len; i = i + 1) {
             th[i].a();
          }
          try{
             this.h = null;
             if (this.d == null) {
                Object[] objArray = new Object[]{this.b};
                this.i.invoke(null, objArray);
             }
          label_0026 :
             this.b = e0;
             this.c = true;
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.IllegalArgumentException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }
       }
    }
    public final void finalize(){
       this.close();
       super.finalize();
    }
    public int getFormat(){
       if (this.c == null) {
          return this.e;
       }
       throw new IllegalStateException("Image is already released");
    }
    public int getHeight(){
       if (this.c == null) {
          return this.g;
       }
       throw new IllegalStateException("Image is already released");
    }
    public Image$Plane[] getPlanes(){
       if (this.c == null) {
          return this.h;
       }
       throw new IllegalStateException("Image is already released");
    }
    public long getTimestamp(){
       if (this.c == null) {
          return this.j;
       }
       throw new IllegalStateException("Image is already released");
    }
    public int getWidth(){
       if (this.c == null) {
          return this.f;
       }
       throw new IllegalStateException("Image is already released");
    }
}
