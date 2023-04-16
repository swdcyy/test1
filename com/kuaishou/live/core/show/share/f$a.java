package com.kuaishou.live.core.show.share.f$a;
import com.kuaishou.live.core.show.share.f$b;
import com.kuaishou.live.core.show.share.f;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import qj2.y;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import qj2.a0;
import androidx.lifecycle.MutableLiveData;
import qj2.x;
import a71.d;
import x61.c;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz;
import vj2.a;
import sx1.i;
import sx1.c;
import java.util.Set;
import com.kuaishou.live.core.show.share.e;
import pj2.c0;
import java.lang.Integer;
import qj2.w;
import t02.a0;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import ry1.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;

public class f$a implements f$b	// class@001012
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean A4(CDNUrl[] p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a.w;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, y.class, "8");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          LiveLogTag bOTTOM_BAR_S = LiveLogTag.BOTTOM_BAR_SHARE_GUIDE;
          b.Z(bOTTOM_BAR_S, "V2 showShareToIMGuide");
          if (!obj.c()) {
             b.B(bOTTOM_BAR_S, "V2 showShareToIMGuide abort");
          }else {
             b = true;
             if (obj.d()) {
                obj.f = b;
                obj.d.l(p0);
                obj.c.setValue(obj.d);
             }else {
                obj.a.Gk(1013, 1001, new x(obj, p0));
             }
          }
       }
       return b;
    }
    public void B4(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "11")) {
          return;
       }
       f w = this.a.w;
       if (w != null) {
          w.b();
       }
       return;
    }
    public void F1(LiveShareSubBiz p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "4")) {
          return;
       }
       this.a.E.g(p0);
       return;
    }
    public void I0(LiveShareSubBiz p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "5")) {
          return;
       }
       this.a.E.e(p0, null, true);
       return;
    }
    public void L3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "14")) {
          return;
       }
       this.a.F.remove(p0);
       return;
    }
    public void N0(LiveShareSubBiz p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "3")) {
          return;
       }
       this.a.E.d(p0, p1);
       return;
    }
    public boolean s4(){
       f obj = PatchProxy.apply(null, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.v;
       boolean b = (obj != null && obj.c != null)? true: false;
       return b;
    }
    public void u4(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "13")) {
          return;
       }
       this.a.F.add(p0);
       return;
    }
    public boolean v4(){
       f obj = PatchProxy.apply(null, this, f$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.w;
       if (obj != null) {
          return obj.e();
       }
       return false;
    }
    public void w1(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.a.S8();
       this.a.W8(p0);
       return;
    }
    public boolean w4(int p0,boolean p1){
       f obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "6");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.a.w;
       boolean b = false;
       if (obj != null) {
          Objects.requireNonNull(obj);
          y oy = y.class;
          if (PatchProxy.isSupport(oy)) {
             Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), obj, oy, "3");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }
          }
          if (obj.c()) {
             b = true;
             if (obj.d()) {
                obj.g = p0;
                obj.e = b;
                obj.d.n(p0, p1);
                obj.c.setValue(obj.d);
             }else {
                obj.a.Gk(1013, 1001, new w(obj, p0, p1));
             }
          }
       }
       return b;
    }
    public void x4(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "7")) {
          return;
       }
       f w = this.a.w;
       if (w != null) {
          w.a();
       }
       return;
    }
    public boolean y4(){
       f obj = PatchProxy.apply(null, this, f$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.w;
       boolean b = (obj != null && obj.f())? true: false;
       return b;
    }
    public String z4(String p0){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$a obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       String str = PatchProxy.applyOneRefs(p0, obj, f.class, "4");
       if (str != patchProxyRe) {
       }else {
          LiveUserStatusResponse liveUserStat = obj.y.b3.D1();
          str = null;
          liveUserStat = (liveUserStat != null)? liveUserStat.mSpecifiedSubBiz: str;
          if (p0 != null && TextUtils.x(liveUserStat)) {
             f c = obj.C;
             if (c != null) {
                str = c.get(p0);
             }
          }else {
             str = liveUserStat;
          }
       }
       return str;
    }
}
