package com.kuaishou.merchant.live.basic.router.f;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import ot3.l0;
import com.kuaishou.merchant.api.live.basic.model.SwitchToolParams;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import q14.s;
import java.util.Objects;
import java.lang.Integer;
import brd.t;
import android.util.SparseArray;
import q14.i;
import q14.j;
import io.reactivex.g;
import com.kuaishou.merchant.live.basic.router.f$a;
import erd.g;
import crd.b;

public final class f implements e	// class@0018c6
{

    public void f(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Map obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = p0.c().c();
          String str = l0.i("liveStreamId", obj);
          int i = l0.e("type", obj);
          SwitchToolParams switchToolPa = new SwitchToolParams();
          switchToolPa.mActivity = p0.a();
          switchToolPa.mLiveStreamId = str;
          switchToolPa.mRootTag = l0.e("rootTag", obj);
          s os = s.d();
          Objects.requireNonNull(os);
          s os1 = s.class;
          if (PatchProxy.isSupport(os1)) {
             ot = PatchProxy.applyTwoRefs(Integer.valueOf(i), switchToolPa, os, os1, "5");
             if (ot != patchProxyRe) {
             }else if(os.a.indexOfKey(i) < 0){
                ot = t.just(Boolean.FALSE);
             }else {
                i oi = os.a.get(i);
                ot = (oi == null)? t.just(Boolean.FALSE): t.create(new j(oi, switchToolPa));
             }
          }else {
             goto label_005e ;
          }
          ot.subscribe(new f$a(p0));
       }
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
