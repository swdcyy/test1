package ee9.l;
import hc9.e$a;
import ui9.b;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import hc9.e;
import com.yxcorp.gifshow.camera.record.base.d;
import j4b.n;
import ee9.e;
import java.lang.Class;
import erd.g;
import crd.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import j8c.a;
import q87.c;
import oc9.w;
import java.util.List;
import java.util.Iterator;
import oc9.t;
import com.yxcorp.gifshow.camera.record.video.w;
import com.yxcorp.gifshow.camera.record.magic.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import w46.b;
import android.view.View;
import ee9.g;
import com.yxcorp.gifshow.camerasdk.q;
import ke9.a;
import android.content.Intent;
import java.lang.Integer;
import ce9.l;
import ee9.m;
import ee9.i;
import android.os.Handler;
import hc9.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import e17.i;
import ee9.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import z3b.a0;
import z3b.f;
import ee9.k;
import w3b.l;
import java.lang.Exception;
import i4b.g;
import le9.e;
import le9.e$a;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.fragment.ObservableBox;
import ee9.f;
import ee9.d;

public class l extends e0 implements e$a, b	// class@00212d
{
    public e q;
    public ProgressFragment r;
    public Runnable s;
    public Handler t;

    public void l(CameraPageType p0,b p1,e p2){
       super(p0, p1);
       this.q = p2;
       this.d.l(n.class, new e(this));
       this.q.j(true);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       super.I7();
       this.q.c(null, 2);
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, l.class, "4")) {
          return;
       }
       this.h2();
       return;
    }
    public final void g2(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "16")) {
          return;
       }
       if (MagicEmoji$MagicFace.isImmerseMagicFace(p0) && !this.d.d(a.d.a()).c()) {
          Object[] objArray = new Object[0];
          a.D().w("MagicDownloadBoxController", "not support immerseMagic", objArray);
          this.q.c(null, 0);
          return;
       }else {
          Iterator iterator = this.d.b().za().iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             if (ot instanceof w) {
                ot.r2(p0);
             }
          }
          this.q.c(null, 0);
          return;
       }
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, l.class, "18")) {
          return;
       }
       l tr = this.r;
       if (tr != null && tr.isAdded()) {
          Object[] objArray = new Object[0];
          a.D().s("MagicDownloadBoxController", "hide ProgressFragment", objArray);
          this.r.dismissAllowingStateLoss();
          this.r = null;
       }
       return;
    }
    public final boolean i2(MagicEmoji$MagicFace p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && !TextUtils.x(p0.mId)) {
          return 0;
       }
       Object[] objArray = new Object[0];
       a.D().t("MagicDownloadBoxController", p1+", magicface is invalid", objArray);
       this.q.c(null, 0);
       return true;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.k(p0);
       this.q.b(this);
       this.s = new g(this);
       return;
    }
    public final boolean k2(){
       d obj = PatchProxy.apply(null, this, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       boolean b = (obj != null && (obj.M() && (this.h.isRecording() || (this.a2() && this.d.d(a.b).a == null))))? true: false;
       return b;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       Object[] objArray;
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, l.class, "8")) {
          return;
       }
       super.onActivityCallback(p0, p1, p2);
       if (p2 == null) {
          return;
       }
       l a = this.d.d(l.i).a;
       p1 = 0;
       if (a != null && !TextUtils.x(a.mId)) {
          objArray = new Object[p1];
          a.D().w("MagicDownloadBoxController", "currentMagicFace is not null", objArray);
          return;
       }else {
          m om = m.E(p2);
          if (om != null) {
             objArray = new Object[p1];
             a.D().w("MagicDownloadBoxController", "onActivityCallback downloadOption is not null", objArray);
             i oi = new i(this, om);
             if (!PatchProxy.applyVoidOneRefs(oi, this, l.class, "9")) {
                d th = this.h;
                if (th != null && th.M()) {
                   oi.run();
                }else {
                   this.s = oi;
                }
             }
          }
          return;
       }
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       super.onDestroyView();
       this.s = null;
       this.q.c(null, 1);
       this.q.i(this);
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onStateChanged(int p0){
       MagicEmoji$MagicFace magicFace;
       long l;
       String str2;
       Object[] objArray;
       Object[] objArray2;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "5")) {
          return;
       }
       int i = 1;
       SimpleMagicFace obj = null;
       if (p0 != i) {
          String str = "MagicDownloadBoxController";
          if (p0 != 2) {
             String str1 = "downloadMagicFace";
             if (p0 != 3) {
                if (p0 != 5) {
                   if (p0 == 7) {
                      this.h2();
                      l tt = this.t;
                      if (tt != null) {
                         tt.removeCallbacksAndMessages(obj);
                      }
                   }
                }else if(PatchProxy.applyVoid(obj, this, ol, "15")){
                   magicFace = this.q.f();
                   if (!this.i2(magicFace, str1)) {
                      if (this.q.a().b() - null > 0) {
                         l = this.q.a().b();
                         this.q.d(6, magicFace);
                         if (this.t == null) {
                            this.t = new Handler();
                         }
                         obj = (!TextUtils.x(magicFace.mName))? magicFace.mName: "";
                         int i1 = (PostExperimentUtils.p())? 0x7f10315a: 0x7f103159;
                         i.e(R.style.arg_RES_7f11066a, a1.r(i1, obj), (int)l);
                         this.t.postDelayed(new j(this, magicFace), l);
                         this.q.a().v(0);
                      }else {
                         this.g2(magicFace);
                      }
                   }
                }
             }else if(PatchProxy.applyVoid(obj, this, ol, "14")){
                magicFace = this.q.f();
                if (!this.i2(magicFace, str1)) {
                   if (!PatchProxy.applyVoid(obj, this, ol, "17")) {
                      if (!this.d.f().isResumed()) {
                         objArray = new Object[0];
                         a.D().s(str, "Fragment is not Resumed!", objArray);
                      }else {
                         ol = this.r;
                         if (ol == null || !ol.isAdded()) {
                            objArray = new Object[0];
                            a.D().s(str, "show ProgressFragment", objArray);
                            ProgressFragment progressFrag = new ProgressFragment();
                            this.r = progressFrag;
                            progressFrag.Ih(R.string.loading);
                            this.r.show(this.f.getChildFragmentManager(), str);
                         }else {
                            objArray = new Object[0];
                            a.D().s(str, "ProgressFragment is showing", objArray);
                         }
                      }
                   }
                   f[] uofArray = new f[i];
                   uofArray[0] = new k(this);
                   a0.o().a("record", "taken_in_resource", magicFace, uofArray);
                }
             }
          }else if(PatchProxy.applyVoid(obj, this, ol, "12")){
             Object[] objArray1 = new Object[0];
             a.D().s(str, "checkDefaultMagicFace", objArray1);
             magicFace = this.q.f();
             if (!this.i2(magicFace, "checkMagicFace")) {
                if (!l.q(magicFace)) {
                   objArray1 = new Object[0];
                   a.D().s(str, "checkDefaultMagicFace is not support", objArray1);
                   l.o(l.k(magicFace));
                   this.q.c(obj, 0);
                }else if(this.k2()){
                   objArray2 = new Object[0];
                   a.D().w(str, "checkMagicFace magic env is not ready", objArray2);
                   this.q.c(obj, 0);
                }else if(magicFace == null || TextUtils.x(magicFace.mId)){
                   objArray2 = new Object[0];
                   a.D().w(str, "final checkMagicFace is null", objArray2);
                   this.q.c(obj, 0);
                }else if(MagicEmoji$MagicFace.isImmerseMagicFace(magicFace) && !this.d.d(a.d.a()).c()){
                   objArray2 = new Object[0];
                   a.D().w(str, "not support immerseMagic", objArray2);
                   this.q.c(obj, 0);
                }else {
                   objArray = new Object[0];
                   a.D().s(str, "checkDefaultMagicFace  isMagicFaceExistedAndSupport is support", objArray);
                   if (!PatchProxy.applyVoidOneRefs(magicFace, this, ol, "13") && !this.i2(magicFace, "checkIsNeedDownloadMagicFace")) {
                      if (g.y(magicFace)) {
                         this.q.d(3, magicFace);
                      }else {
                         this.q.d(5, magicFace);
                      }
                   }
                }
             }
          }
       }else if(PatchProxy.applyVoid(obj, this, ol, "10")){
          magicFace = this.q.f();
          if (!this.i2(magicFace, "obtainMagicFace")) {
             this.Y1(ObservableBox.a(l.n(magicFace, MagicBusinessId.VIDEO, this.d.d(e.c.a()).a()).observeOn(d.a)).subscribe(new f(this), new d(this)));
          }
       }
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       super.w();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("MagicDownloadBoxController", "onCameraOpened", objArray);
       if (this.s != null && !this.k2()) {
          Object[] objArray1 = new Object[i];
          a.D().w("MagicDownloadBoxController", "onCameraOpened env ready", objArray1);
          l ts = this.s;
          this.s = null;
          ts.run();
       }
       return;
    }
}
