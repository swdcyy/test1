package kf.a;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import ze.c;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.facebook.react.bridge.ReadableArray;
import kf.b;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

public abstract class a extends ReactShadowNodeImpl	// class@0024ae
{
    public float b;
    public Matrix c;
    public final float d;
    public static final float[] e;
    public static final float[] f;

    static {
       float[] uofloatArray = new float[9];
       a.e = uofloatArray;
       float[] uofloatArray1 = new float[9];
       a.f = uofloatArray1;
    }
    public void a(){
       super();
       this.b = 0x3f800000;
       this.c = new Matrix();
       this.d = c.e().density;
    }
    public abstract void b(Canvas p0,Paint p1,float p2);
    public void c(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0.restore();
       return;
    }
    public final void d(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       p0.save();
       a tc = this.c;
       if (tc != null) {
          p0.concat(tc);
       }
       return;
    }
    public boolean isVirtual(){
       return true;
    }
    public void setOpacity(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.b = p0;
       this.markUpdated();
       return;
    }
    public void setTransform(ReadableArray p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "4")) {
          return;
       }
       Object[] objArray = null;
       if (p0 != null) {
          float[] e = a.e;
          int i = b.a(p0, e);
          if (i == 6) {
             if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
                float[] f = a.f;
                f[0] = e[0];
                f[1] = e[2];
                a td = this.d;
                f[2] = e[4] * td;
                f[3] = e[1];
                f[4] = e[3];
                f[5] = e[5] * td;
                f[6] = 0;
                f[7] = 0;
                f[8] = 0x3f800000;
                if (this.c == null) {
                   this.c = new Matrix();
                }
                this.c.setValues(f);
             }
          }else if(i == -1){
             throw new JSApplicationIllegalArgumentException("Transform matrices must be of size 6");
          }
       }else {
          this.c = objArray;
       }
       this.markUpdated();
       return;
    }
}
