package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$b;
import v63.b;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import z1.k;
import kotlin.jvm.internal.a;
import trd.t0;
import android.graphics.Bitmap;
import java.lang.Integer;
import cm1.a;
import com.yxcorp.gifshow.models.Gift;

public final class LiveLiteGiftPresenter$b implements b	// class@001dad
{
    public final LiveLiteGiftPresenter a;

    public void LiveLiteGiftPresenter$b(LiveLiteGiftPresenter p0){
       this.a = p0;
       super();
    }
    public Map d6(){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLiteGiftPresenter obj = PatchProxy.apply(objArray, this, LiveLiteGiftPresenter$b.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.Z;
       if (obj != null) {
          obj1 = PatchProxy.apply(objArray, obj, LiveLiteGiftManager.class, "18");
          if (obj1 != patchProxyRe) {
          }else {
             Object obj2 = obj.d().get();
             a.o(obj2, "bizLogParams.get\(\)");
             obj1 = obj2;
          }
          if (obj1 != null) {
          label_003a :
             return obj1;
          }
       }
       obj1 = t0.z();
       goto label_003a ;
    }
    public Bitmap e6(int p0){
       LiveLiteGiftPresenter$b uob = LiveLiteGiftPresenter$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.b(p0);
    }
    public Gift l0(int p0){
       LiveLiteGiftPresenter$b uob = LiveLiteGiftPresenter$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.a(p0);
    }
}
