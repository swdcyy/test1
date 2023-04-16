package ara.e$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import java.util.Map;
import com.yxcorp.gifshow.growth.uninstall.model.UninstallAppDetainment;
import java.util.List;
import android.content.Context;
import android.content.pm.ShortcutManager;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ara.e;
import java.lang.Integer;
import android.graphics.Bitmap$Config;
import java.util.ArrayList;
import android.content.Intent;
import android.net.Uri;
import java.lang.CharSequence;
import android.content.pm.ShortcutInfo$Builder;
import android.graphics.drawable.Icon;
import android.content.pm.ShortcutInfo;
import cra.w;
import q87.c;

public class e$b implements ImageCallback	// class@0002cb
{
    public final Map b;
    public final UninstallAppDetainment c;
    public final List d;
    public final int e;
    public final Context f;
    public final ShortcutManager g;

    public void e$b(Map p0,UninstallAppDetainment p1,List p2,int p3,Context p4,ShortcutManager p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       ArrayList uArrayList;
       int i3;
       UninstallAppDetainment uninstallApp;
       Bitmap uBitmap;
       Intent intent;
       Object[] objArray1;
       Object obj = this;
       Object[] obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e$b.class, "1")) {
          return;
       }
       e$b b = obj.b;
       e$b c = obj.c;
       e$b d = obj.d;
       e$b e = obj.e;
       e$b f = obj.f;
       e$b g = obj.g;
       e uoe = e.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{obj1,b,c,d,Integer.valueOf(e),f,g};
          if (!PatchProxy.applyVoid(objArray, null, uoe, "2")) {
          label_004d :
             if (obj1 != null && !p0.isRecycled()) {
                b.put(c.mScheme, obj1.copy(p0.getConfig(), p0.isMutable()));
             }else {
                b.put(c.mScheme, obj1);
             }
             if (b.size() == d.size()) {
                if (PatchProxy.isSupport(uoe)) {
                   obj1 = new Object[i];
                   obj1[0] = d;
                   obj1[1] = b;
                   obj1[2] = Integer.valueOf(e);
                   obj1[3] = f;
                   obj1[4] = g;
                   if (!PatchProxy.applyVoid(obj1, null, uoe, "5")) {
                   }
                }else {
                }
             }
          }
       }else {
          goto label_004d ;
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
