package gha.m;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import pr6.d;
import com.yxcorp.gifshow.model.FollowTabNotify;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import co5.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import wa5.e;
import on5.b;
import co5.j$b;
import gha.p;
import java.lang.Integer;
import fg6.a;
import com.google.gson.Gson;
import ro5.c0;
import co5.j$a;
import com.kwai.kcube.TabIdentifier;

public class m implements ImageCallback	// class@002add
{
    public final d b;
    public final FollowTabNotify c;
    public final int d;
    public final int e;

    public void m(d p0,FollowTabNotify p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       m e;
       m om;
       Bitmap uBitmap1;
       int b1;
       String str;
       Object obj3;
       m om1;
       j oj;
       m om2;
       j$a uoa;
       Object obj = this;
       TabIdentifier obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, m.class, "1")) {
          return;
       }
       if (obj1 != null && obj.b.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
          if (obj.c.isCustomHeadUrl() || (obj.c.isFollowTabMultiDynamic() && !e.b())) {
             return;
          }else {
             m b = obj.b;
             TabIdentifier c = b.c;
             j$b uob = PatchProxy.apply(null, null, j.class, "1");
             if (uob != PatchProxyResult.class) {
             }else {
                uob = new j$b();
             }
             Object obj2 = uob;
             m d = obj.d;
             e = obj.e;
             if (PatchProxy.isSupport(p.class)) {
                om = e;
                Bitmap uBitmap = PatchProxy.applyThreeRefs(p0, Integer.valueOf(d), Integer.valueOf(e), null, p.class, "8");
                if (uBitmap != PatchProxyResult.class) {
                label_007f :
                   uBitmap1 = uBitmap;
                   b1 = true;
                }else if(d <= null || om <= null){
                   b1 = p0.getWidth();
                   int height = p0.getHeight();
                   if (b1 && height) {
                      if (d == b1 && om == height) {
                         uBitmap = p.b(p0);
                         goto label_007f ;
                      }else {
                         b1 = true;
                         try{
                            uBitmap1 = Bitmap.createScaledBitmap(obj1, d, om, b1);
                         }catch(java.lang.OutOfMemoryError e0){
                            uBitmap1 = p.b(p0);
                         }catch(java.lang.Exception e0){
                         }
                      }
                   }
                }
                b1 = true;
                uBitmap1 = null;
             }else {
                om = e;
                goto label_0083 ;
             }
          }
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
