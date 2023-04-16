package bf9.h;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ee9.m;
import hc9.e;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Intent;
import android.app.Activity;
import java.lang.String;
import ekd.j0;
import cf9.a;
import oc9.t;
import vf9.b;
import bf9.c;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import bf9.b;
import hc9.e$a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import i4b.g;
import java.util.Map;
import o56.c;
import o56.a;
import xf6.l;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import hc9.f;
import ye9.j;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.MagicEmoji;
import lnc.a1;
import w3b.p;
import com.yxcorp.gifshow.camera.record.video.w;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import android.view.ViewStub;
import bf9.a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.text.TextPaint;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import bf9.d;
import erd.g;
import crd.b;
import eoc.f;
import lm6.j;
import bf9.e;
import lnc.b9;
import oc9.w;
import java.util.List;
import java.util.Iterator;
import java.io.Serializable;
import java.lang.Integer;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import java.lang.StringBuilder;
import q87.c;

public class h extends e0	// class@000492
{
    public boolean A;
    public String B;
    public int C;
    public MagicEmoji$MagicFace q;
    public w r;
    public View s;
    public TextView t;
    public Map u;
    public b v;
    public boolean w;
    public e x;
    public int y;
    public m z;

    public void h(CameraPageType p0,b p1,m p2,e p3){
       super(p0, p1);
       d te = this.e;
       if (te != null && (te.getIntent() != null && j0.a(this.e.getIntent(), "showDebugInfo", false))) {
          this.L0(new a(p0, p1, p3));
       }
    label_0024 :
       this.x = p3;
       this.z = p2;
       this.d.n(b.class, new c(this));
       this.x.b(new b(this));
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       super.A0();
       this.i2();
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       super.I7();
       this.g2();
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, h.class, "10")) {
          return;
       }
       super.P1();
       this.i2();
       return;
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, h.class, "17")) {
          return;
       }
       n.Y(this.s, 4, true);
       return;
    }
    public final void h2(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       SimpleMagicFace mId = p0.mId;
       if (mId != null) {
          g.a.remove(mId);
       }
       boolean b = true;
       if (a.a().c() && l.c("key_force_platform_immerse_magic", false)) {
          if (p0.mExtraParams == null) {
             p0.mExtraParams = new MagicFaceExtraParams();
          }
          p0.mExtraParams.mIsImmerseMode = b;
       }
       this.q = p0;
       this.z.w(p0, b);
       h tz = this.z;
       tz.A(false);
       tz.B(false);
       tz.t(b);
       tz = this.q;
       MagicEmojiResponse magicEmojiRe = PatchProxy.applyOneRefs(tz, null, j.class, "3");
       if (magicEmojiRe != PatchProxyResult.class) {
       }else {
          ArrayList uArrayList = new ArrayList();
          MagicEmoji magicEmoji = new MagicEmoji();
          magicEmoji.mTabType = 5;
          magicEmoji.mName = a1.p(0x7f104b08);
          magicEmoji.mId = "0";
          ArrayList uArrayList1 = new ArrayList();
          magicEmoji.mMagicFaces = uArrayList1;
          uArrayList1.add(tz);
          uArrayList.add(magicEmoji);
          MagicEmojiResponse magicEmojiRe1 = new MagicEmojiResponse();
          magicEmojiRe1.mMagicEmojis = uArrayList;
          magicEmojiRe1.mIsFromNetwork = false;
          magicEmojiRe1.mDefaultTabId = "0";
          magicEmojiRe = magicEmojiRe1;
       }
       p.b().l(this.r.k2(), magicEmojiRe);
       return;
    }
    public final void i2(){
       boolean b;
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "16")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, oh, "20");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.w != null){
          Object obj1 = PatchProxy.apply(null, this, oh, "21");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(this.a2() || (this.y > null || CameraLogger.d(this.d))){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             b = true;
          }
       }
       b = false;
       if (b) {
          n.Y(this.s, 0, true);
       }
       return;
    }
    public void k(View p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "2")) {
          return;
       }
       super.k(p0);
       p0 = p0.findViewById(R.id.platform_refresh_stub).inflate();
       this.s = p0;
       p0.setOnClickListener(new a(this));
       TextView textView = this.s.findViewById(R.id.platform_refresh_tv);
       this.t = textView;
       textView.getPaint().setFakeBoldText(true);
       if (!PatchProxy.applyVoid(null, this, oh, "11")) {
          this.Y1(f.a(PanelShowEvent.class, new d(this)));
          this.Y1(f.a(j.class, new e(this)));
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       super.onDestroy();
       h tq = this.q;
       if (tq != null) {
          SimpleMagicFace mId = tq.mId;
          if (mId != null) {
             g.a.remove(mId);
          }
       }
       this.q = null;
       p.b().l(this.r.k2(), null);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.v);
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       super.q1();
       this.g2();
       return;
    }
    public void w1(Intent p0){
       Iterator obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "1")) {
          return;
       }
       super.w1(p0);
       d td = this.d;
       t ot = PatchProxy.applyOneRefs(td, this, oh, "22");
       Object obj = null;
       if (ot != patchProxyRe) {
       }else {
          obj1 = td.b().za().iterator();
          while (true) {
             if (obj1.hasNext()) {
                t ot1 = obj1.next();
                if (ot1 instanceof w) {
                   ot = ot1;
                }
             }else {
                ot = obj;
             }
          }
       }
       this.r = ot;
       this.u = j.e(j0.f(p0, "openPlatformParam"));
       d te = this.e;
       obj1 = PatchProxy.applyOneRefs(te, obj, j.class, "5");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else {
          Serializable serializable = j0.e(te.getIntent(), "openPlatformMagicFace");
          if (serializable instanceof MagicEmoji$MagicFace) {
             obj = j.g(serializable);
          }
       }
       this.h2(obj);
       h tu = this.u;
       if (tu != null) {
          this.B = tu.get("musicId");
          String str = this.u.get("musicType");
          if (this.B != null && str != null) {
             try{
                this.C = Integer.parseInt(str);
             }catch(java.lang.NumberFormatException e7){
                a.D().e("PlatformMagicController", "parse music type error", e7);
             }
             Object[] objArray = new Object[0];
             a.D().w("PlatformMagicController", "musicId: "+this.B+"musicType: "+this.C, objArray);
          }
       }
       this.w = false;
       this.y = 0;
       return;
    }
}
