package com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$b;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$a;
import java.lang.Object;
import android.util.SparseArray;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.Reference;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.ref.WeakReference;
import tzc.a;

public abstract class LinearBitmapContainer$b implements LinearBitmapContainer$a	// class@0019dc
{
    public final SparseArray a;
    public int b;
    public int c;

    public void LinearBitmapContainer$b(){
       super();
       this.a = new SparseArray();
    }
    public final Bitmap a(int p0){
       Bitmap obj;
       LinearBitmapContainer$b uob = LinearBitmapContainer$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0 >= 0 && (p0 >= this.getCount() || (this.b > null && this.c > null))) {
          Reference reference = this.a.get(p0);
          int i = 0;
          if (reference != null) {
             Object[] objArray = new Object[i];
             a.D().s("LinearBitmapContainer", "hit cache index:"+p0, objArray);
             obj = reference.get();
          }
          if (obj == null) {
             Object[] objArray1 = new Object[i];
             a.D().s("LinearBitmapContainer", "create bitmap index:"+p0, objArray1);
             obj = this.d(p0, this.b, this.c);
             if (obj != null) {
                this.a.put(p0, new WeakReference(obj));
             }
          }
       }
    label_0089 :
       return obj;
    }
    public boolean b(int p0){
       return a.a(this, p0);
    }
    public final void c(int p0){
       LinearBitmapContainer$b uob = LinearBitmapContainer$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
    public abstract Bitmap d(int p0,int p1,int p2);
    public final void e(int p0,int p1){
       LinearBitmapContainer$b uob = LinearBitmapContainer$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.a.clear();
       this.b = p0;
       this.c = p1;
       return;
    }
    public final int getHeight(){
       return this.c;
    }
    public final int getWidth(){
       return this.b;
    }
}
