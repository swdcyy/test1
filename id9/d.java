package id9.d;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import id9.b0;
import oc9.t;
import id9.z;
import id9.t;
import com.yxcorp.gifshow.camera.record.followshoot.b;
import jd9.f;
import com.yxcorp.gifshow.camera.record.base.d;
import hd9.n;
import id9.a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eg9.a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import java.lang.Boolean;
import qr4.i;
import qr4.m$m;
import qr4.m$k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import qr4.k$j;
import qr4.k$d;
import lq.i;
import tkd.b;
import tkd.d;
import hb0.b;
import java.util.Map;
import q16.a$a;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.app.Activity;
import android.view.View;
import android.view.MotionEvent;
import ekd.j0;
import oa0.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ed9.b;
import id9.b;
import erd.g;
import crd.b;
import mc9.a;
import id9.c;

public class d extends e0	// class@0027ea
{
    public BaseFeed q;
    public String r;
    public int s;
    public String t;
    public String u;
    public String v;
    public z w;
    public b x;
    public t y;

    public void d(CameraPageType p0,b p1){
       super(p0, p1);
       this.L0(new b0(p0, p1));
       z oz = new z(p0, p1);
       this.w = oz;
       this.L0(oz);
       t ot = new t(p0, p1);
       this.y = ot;
       this.L0(ot);
       b uob = new b(p0, p1);
       this.x = uob;
       this.L0(uob);
       if (this.g2()) {
          this.L0(new f(p0, p1));
       }
       this.d.n(n.class, new a(this));
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.d.m(new a(false));
       super.I7();
       return;
    }
    public void L3(a p0){
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.L3(p0);
       if (p0 == null) {
          return;
       }
       n on = this.d.d(n.j);
       a e = p0.e;
       String id = this.q.getId();
       boolean b = (on.c != null)? true: false;
       on = on.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.isSupport(videoContext) || !PatchProxy.applyVoidThreeRefs(id, Boolean.valueOf(b), Boolean.valueOf(on), e, VideoContext.class, "180")) {
          VideoContext.b();
          e.a.b.A = new m$m();
          m$k0 a = e.a.b.A;
          a.b = b;
          a.a = id;
          a.c = on;
       }
       if (!TextUtils.x(this.t)) {
          d ts = this.s;
          if (ts != null) {
             e = p0.e;
             d tt = this.t;
             d tu = this.u;
             Objects.requireNonNull(e);
             if (!PatchProxy.isSupport(videoContext) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(ts), tt, tu, e, VideoContext.class, "181")) {
                VideoContext.b();
                i c = e.a.c;
                if (c.Y == null) {
                   c.Y = new k$d();
                }
                k$j y = e.a.c.Y;
                y.a = ts;
                y.b = tt;
                y.c = tu;
             }
          }
       }
       if (i.h()) {
          Map obj = i.m().z("toolbox_template_params");
          if (obj instanceof String) {
             obj = d.a(0x338f144a).KV(obj);
             String str = obj.get("photo_id");
             String str1 = obj.get("tab_id");
             String str2 = obj.get("template_name");
             String str3 = obj.get("template_type");
             if (!TextUtils.x(str)) {
                VideoContext.e2(p0.e, str, str1, str2, str3);
             }
          }
       }
       return;
    }
    public boolean R0(){
       return true;
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       super.de(p0, p1);
       if (!TextUtils.x(this.v)) {
          p0.e0(this.v);
       }
       return;
    }
    public final boolean g2(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e.getIntent() != null) {
          objArray = this.e.getIntent();
       }
       boolean b = false;
       if (objArray != null && objArray.getBooleanExtra("isGoToLipSync", b)) {
          b = true;
       }
       return b;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       return true;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.w1(p0);
       String str = "key_count_down_enable";
       if (j0.g(p0, str)) {
          a.r1(j0.a(p0, str, true));
       }else {
          a.r1(true);
       }
       this.q = SerializableHook.getSerializableExtra(p0, "source_photo_origin_photo");
       this.r = p0.getStringExtra("source_photo_origin_file");
       this.s = j0.b(p0, "templateId", 0);
       this.t = j0.f(p0, "templateName");
       this.u = j0.f(p0, "templateGroup");
       this.v = j0.f(p0, "tag");
       this.d.l(b.class, new b(this));
       this.d.l(a.class, new c(this));
       return;
    }
}
