package m9a.v;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import android.view.View;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p5a.b;
import p5a.c;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import java.lang.RuntimeException;
import java.lang.IllegalStateException;
import m9a.v$a;
import n3d.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import m9a.v$b;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig$a;
import androidx.lifecycle.LifecycleOwner;
import tkd.b;
import tkd.d;
import vm5.e;
import android.content.Intent;
import sd5.a;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import m9a.d0;
import android.view.Window;
import android.transition.Transition;

public final class v	// class@002f99
{
    public static final v a;

    static {
       v.a = new v();
    }
    public void v(){
       super();
    }
    public static final void a(Activity p0,QPhoto p1,int p2,int p3,int p4,int p5,int p6,boolean p7,a p8,PhotoDetailLogger p9,View p10,Integer p11,int p12,View p13,View p14,boolean p15){
       int position;
       PhotoDetailParam photoDetailP;
       DetailPlayConfig detailPlayCo;
       int i;
       Intent intent;
       NormalDetailBizParam normalDetail;
       String str;
       String str1;
       Window window;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p8;
       object oobject3 = p9;
       object oobject4 = p10;
       object oobject5 = p11;
       object oobject6 = p13;
       object oobject7 = p14;
       boolean b = p15;
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object[] objArray = new Object[16];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = oobject2;
          objArray[9] = oobject3;
          objArray[10] = oobject4;
          objArray[11] = oobject5;
          objArray[12] = Integer.valueOf(p12);
          objArray[13] = oobject6;
          objArray[14] = oobject7;
          objArray[15] = Boolean.valueOf(p15);
          if (PatchProxy.applyVoid(objArray, null, ov, "1")) {
             return;
          }
       }
       a.p(oobject1, "photo");
       a.p(oobject2, "playModule");
       a.p(oobject6, "elementContainer");
       if (!oobject instanceof GifshowActivity) {
          oobject = null;
       }
       object oobject8 = oobject;
       if (oobject8 != null) {
          if (b.f(p1)) {
             try{
                QPhotoMediaPlayerCacheManager.f(oobject1, p8.d());
             }catch(java.lang.IllegalStateException e0){
                e0.printStackTrace();
             }catch(io.reactivex.exceptions.OnErrorNotImplementedException e0){
                e0.printStackTrace();
             }
          }
       }
       return;
    }
}
