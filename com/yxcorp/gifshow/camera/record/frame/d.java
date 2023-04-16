package com.yxcorp.gifshow.camera.record.frame.d;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.camera.record.frame.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oa0.a;
import xf6.g;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import ra9.a;
import brd.t;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.model.config.FrameGuideConfig;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import j8c.a;
import q87.c;
import zf6.k;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import oe6.e;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.camera.record.frame.d$a;
import kd9.b0;
import com.yxcorp.gifshow.widget.record.CoverVideoView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import u07.t$a;
import android.app.Activity;
import u07.a;
import k2b.e0;
import java.lang.StringBuilder;
import kd9.w;
import u07.u;
import kd9.x;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import kd9.z;
import kd9.a0;
import kd9.y;
import com.kwai.library.widget.popup.common.c;

public class d implements a	// class@000de0
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public boolean c(){
       d obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (!a.F() || g.f0())? 1: null;
       if (obj) {
          return b;
       }else {
          this.b.d.b().V7().u(RecordBubbleItem.FRAME_GUIDE);
          return false;
       }
    }
    public c d(){
       return RecordBubbleItem.FRAME_GUIDE;
    }
    public void dismiss(){
       a.b(this);
    }
    public t e(){
       return a.a(this);
    }
    public boolean f(){
       return a.d(this);
    }
    public boolean g(String p0){
       return a.c(this, p0);
    }
    public boolean i(FragmentActivity p0,PostBubbleManager$c p1){
       d d;
       int i6;
       b0 uob0;
       Object[] obj = this;
       Object obj1 = p0;
       Object[] obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FrameGuideConfig obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, d.class, "2");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       obj3 = FrameGuideConfig.class;
       String str = a.a.getString("posterEditFrameConfig", "null");
       obj3 = (str == null || str == "")? null: b.a(str, obj3);
       boolean i = 0;
       if (!FrameGuideConfig.isConfigValid(obj3)) {
          obj.b.d.b().V7().u(RecordBubbleItem.FRAME_GUIDE);
          Object[] objArray = new Object[i];
          a.D().w("FrameGuideController", "url is empty, dialog can\'t show", objArray);
          return i;
       }else {
          boolean b = k.d();
          FrameGuideConfig mDarkGuideCo = (b)? obj3.mDarkGuideCoverUrl: obj3.mLightGuideCoverUrl;
          CDNUrl uCDNUrl = mDarkGuideCo.get(i);
          obj3 = (b)? obj3.mDarkGuideVideoUrl: obj3.mLightGuideVideoUrl;
          CDNUrl uCDNUrl1 = obj3.get(i);
          b = e.J();
          d b1 = obj.b;
          int i1 = 1;
          boolean b2 = (PostExperimentUtils.j0() == i1)? true: false;
          boolean b3 = PostExperimentUtils.h1();
          d = obj.b.d;
          int i2 = 5;
          int i3 = 4;
          b = (b == i3 || b == i2)? true: false;
          d$a uoa = new d$a(obj, obj2, obj);
          i2 = 6;
          int i4 = 3;
          int i5 = 2;
          if (PatchProxy.isSupport(b0.class)) {
             obj2 = new Object[]{obj1,uCDNUrl1,uCDNUrl,Boolean.valueOf(b2),Boolean.valueOf(b3),d,Boolean.valueOf(b),uoa};
             i6 = 5;
             uob0 = PatchProxy.apply(obj2, null, b0.class, "1");
             if (uob0 != patchProxyRe) {
             label_01db :
                b1.o = uob0;
                this.b.o.Z();
                a.X0(true);
                return true;
             }
          }else {
             i6 = 5;
          }
          i = b;
          b0 uob01 = 4;
          boolean b4 = 6;
          CoverVideoView uCoverVideoV = new CoverVideoView(uCDNUrl1, uCDNUrl, p0, 0, 8, null);
          t$a uoa1 = (i)? a.b(new t$a(obj1)): a.c(new t$a(obj1));
          e0 uoe0 = (obj1 instanceof e0)? obj1: null;
          Object[] objArray1 = new Object[0];
          a.D().w("FrameGuideDialog", "createFrameGuideDialog isSingleBtn? "+i, objArray1);
          if (i) {
             if (!PatchProxy.applyVoidThreeRefs(uoa1, uoa, uoe0, null, b0.class, "2")) {
                uoa1.S0(R.string.arg_RES_7f10019b);
                uoa1.u0(new w(uoe0));
                uoa1.s0(new x(uoe0));
                uoa1.w0(true);
                uoa1.z(true);
                uoa1.M(uoa);
             }
          }else {
             int i7 = 1;
             if (PatchProxy.isSupport(b0.class)) {
                obj = new Object[b4];
                obj[0] = uoa1;
                obj[i7] = Boolean.valueOf(b2);
                obj[i5] = Boolean.valueOf(b3);
                obj[i4] = d;
                obj[uob01] = uoa;
                obj[i6] = uoe0;
                if (!PatchProxy.applyVoid(obj, null, b0.class, "3")) {
                }
             }else {
             }
          }
       label_01d5 :
          uob0 = new b0(uoa1, i1);
          goto label_01db ;
       }
    }
}
