package com.kuaishou.live.core.show.luckystar.pendant.a;
import fc2.b;
import im8.g;
import vl8.c;
import android.content.Context;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.luckystar.pendant.a$b;
import com.kwai.robust.PatchProxyResult;
import fc2.e;
import java.util.Map;
import java.util.HashMap;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import ks5.i;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.luckystar.pendant.a$c;
import com.kuaishou.live.core.show.luckystar.pendant.a$d;
import com.kuaishou.live.core.show.luckystar.pendant.a$a;
import android.graphics.drawable.Drawable;
import lnc.a1;

public class a extends c implements b, g	// class@000cf4
{
    public LiveTopPendantTempPlayService c;
    public final Context d;
    public final View$OnClickListener e;
    public a$b f;
    public i g;

    public void a(Context p0,View$OnClickListener p1){
       super();
       this.d = p0;
       this.e = p1;
    }
    public void f(long p0,CDNUrl[] p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uoa, "5")) {
          return;
       }
       uoa = this.f;
       if (uoa != null) {
          uoa.f(p0, p1);
       }
       return;
    }
    public void g(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a tf = this.f;
       if (tf != null) {
          tf.g(p0);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(a.class, new e());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tf = this.f;
       if (tf != null) {
          tf.j();
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tf = this.f;
       if (tf != null) {
          this.c.c(tf);
          this.f.release();
       }
       this.f = null;
       return;
    }
    public void w(i p0,boolean p1,boolean p2,CDNUrl[] p3){
       a$c uoc;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, a.class, "1")) {
          return;
       }
       this.s();
       b.Q(LiveLogTag.LUCKY_STAR.appendTag("LuckyStarNewPendantController"), "showLuckyStarPendantView", c.k("isV2Style", Boolean.valueOf(p1), "showEnterAnimation", Boolean.valueOf(p2)));
       if (PatchProxy.isSupport(uoa)) {
          uoc = PatchProxy.applyThreeRefs(Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, a.class, "2");
          if (uoc != PatchProxyResult.class) {
          }else if(!p1){
             uoc = new a$c(this.d, this.e);
          }else {
             a$d uod = new a$d(this.d, this.e, p2, p3, null);
          }
       }else {
          goto label_005d ;
       }
       this.f = uoc;
       this.c.b(uoc);
       if (p2) {
          this.f.r(p0);
       }else {
          this.f.s(a1.f(R.drawable.arg_RES_7f081494));
       }
       return;
    }
}
