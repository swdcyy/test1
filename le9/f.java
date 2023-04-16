package le9.f;
import ui9.b;
import com.yxcorp.gifshow.camera.record.base.d;
import le9.f$c;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le9.f$d;
import le9.f$e;
import java.util.HashMap;
import java.util.ArrayList;
import le9.g;
import le9.f$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import le9.e;
import le9.f$b;
import me9.c;
import le9.h;
import me9.d;
import me9.k;
import me9.l;
import me9.q;
import me9.m;
import me9.j;
import me9.a;
import android.app.Activity;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import java.util.Collection;
import ekd.q;
import com.google.gson.JsonObject;
import qrd.l1;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import ne9.b;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import java.util.Map;
import com.yxcorp.utility.TextUtils;
import ne9.a;
import java.util.Iterator;
import java.lang.Iterable;
import le9.d;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import crd.b;
import ce9.l;
import brd.t;
import le9.a;
import le9.b;
import le9.c;
import erd.g;
import erd.a;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import android.view.View;
import java.util.List;
import ui9.j;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBoomGameListener;
import android.content.Intent;
import ekd.j0;

public final class f extends d implements b	// class@002dc4
{
    public final f$d n;
    public final f$e o;
    public final HashMap p;
    public final HashMap q;
    public String r;
    public final List s;
    public final b t;
    public static final f$c u;

    static {
       f.u = new f$c(null);
    }
    public void f(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.t = p1;
       this.n = new f$d(this);
       f$e uoe = new f$e(this);
       this.o = uoe;
       this.p = new HashMap();
       this.q = new HashMap();
       ArrayList uArrayList = new ArrayList();
       this.s = uArrayList;
       p1.n(g.class, new f$a(this));
       p1.n(e.class, new f$b(this));
       uArrayList.add(new c(uoe));
       uArrayList.add(new d(uoe));
       uArrayList.add(new k(uoe));
       uArrayList.add(new l(uoe));
       uArrayList.add(new q(uoe));
       uArrayList.add(new m(uoe));
       uArrayList.add(new j(uoe));
       d te = this.e;
       a.o(te, "mActivity");
       uArrayList.add(new a(uoe, te));
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, f.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MagicDataConveyController", "onEffectDescriptionUpdated", objArray);
       MagicEmoji$MagicFace magicFace = this.g2();
       if (magicFace != null) {
          MagicEmoji$MagicFace mExtraParams = magicFace.mExtraParams;
          Bitmap uBitmap = null;
          if (mExtraParams != null && (!q.f(mExtraParams.mExternalResourceDependentKeys) || magicFace.mExtraParams.mRunTimeData != null)) {
             JsonObject jsonObject = new JsonObject();
             jsonObject.H("readLocalResource", Boolean.TRUE);
             this.h2(new MagicRequest(5100, "-1", jsonObject, ""), new b(uBitmap, magicFace));
          }
          mExtraParams = magicFace.mExtraParams;
          MagicFaceExtraParams mRunTimeData = (mExtraParams != null)? mExtraParams.mRunTimeData: uBitmap;
          if (mRunTimeData != null) {
             SimpleMagicFace mId = magicFace.mId;
             if (mId == null || !mId.length()) {
                i = 1;
             }
             if (!i) {
                f tq = this.q;
                mId = magicFace.mId;
                a.o(mId, "magicFace.mId");
                MagicEmoji$MagicFace mExtraParams1 = magicFace.mExtraParams;
                if (mExtraParams1 != null) {
                   uBitmap = mExtraParams1.mRunTimeData;
                }
                a.m(uBitmap);
                tq.put(mId, uBitmap);
             }
          }
          if (!TextUtils.x(magicFace.mId)) {
             this.p.remove(magicFace.mId);
          }
       }
       return;
    }
    public final void f2(a p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "7")) {
          return;
       }
       if (p0 != null) {
          String str = p0.a();
          f uof = (str == null || !str.length())? 1: null;
          if (!uof) {
             Iterator iterator = this.s.iterator();
             while (iterator.hasNext()) {
                d uod = iterator.next();
                a reqType = p0.reqType;
                String str1 = p0.a();
                Objects.requireNonNull(uod);
                d uod1 = d.class;
                if (PatchProxy.isSupport(uod1)) {
                   Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(reqType), str1, uod, uod1, "2");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else {
                   label_005b :
                      a.p(str1, "seqId");
                      if (!uod.g(reqType)) {
                         b = false;
                      }else {
                         Object[] objArray = new Object[0];
                         a.D().w(uod.b(), "cancelRequest : "+str1, objArray);
                         b uob = uod.a.get(str1);
                         if (uob != null) {
                            uob.dispose();
                            b uob1 = uod.a.remove(str1);
                         }
                         b = true;
                      }
                   }
                }else {
                   goto label_005b ;
                }
                if (!b) {
                }
             }
          }
       }
       return;
    }
    public final MagicEmoji$MagicFace g2(){
       Object obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.d(l.i).a;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final void h2(MagicRequest p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "6")) {
          return;
       }
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          Objects.requireNonNull(uod);
          t obj = PatchProxy.applyTwoRefs(p0, p1, uod, d.class, "1");
          boolean b = false;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             a.p(p0, "magicRequest");
             a.p(p1, "requestExtra");
             if (uod.g(p0.getRequestType())) {
                obj = uod.c(p0, p1);
                if (obj != null) {
                   b uob = obj.subscribe(new a(uod, p0), new b(uod, p0), new c(uod, p0));
                   if (uob != null) {
                      String seqId = p0.getSeqId();
                      if (seqId == null || !seqId.length()) {
                         b = true;
                      }
                      if (!b) {
                         uod.a.put(p0.getSeqId(), uob);
                      }
                   }
                }
                b = true;
             }
          }
          if (b) {
             break ;
          }
       }
       return;
    }
    public final void i2(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MagicDataConveyController", "onSdkProvideInfo. 5110 request", objArray);
       MagicEmoji$MagicFace magicFace = this.g2();
       if (magicFace != null && (!TextUtils.x(magicFace.mId) && p0 != null)) {
          Object[] objArray1 = new Object[i];
          a.D().w("MagicDataConveyController", "onSdkProvideInfo. 5110 request,  runtimeData: "+p0, objArray1);
          SimpleMagicFace mId = magicFace.mId;
          a.o(mId, "magicFace.mId");
          String str = a.a.p(p0);
          a.o(str, "Gsons.KWAI_GSON.toJson\(runtimeData\)");
          this.p.put(mId, str);
       }
    label_005a :
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       super.k(p0);
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       d th = this.h;
       if (th != null) {
          j oj = th.q();
          if (oj != null) {
             oj.E0(this.n);
          }
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "camera");
       super.nb(p0);
       j oj = p0.q();
       if (oj != null) {
          oj.E0(this.n);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          iterator.next().e();
       }
       this.p.clear();
       this.q.clear();
       d th = this.h;
       if (th != null) {
          j oj = th.q();
          if (oj != null) {
             oj.L0(this.n);
          }
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       super.w1(p0);
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       if (p0 != null) {
          this.r = j0.f(p0, "relatedPhotoId");
       }
       return;
    }
}
