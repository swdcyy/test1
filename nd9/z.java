package nd9.z;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import nd9.z$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.camera.record.base.d;
import hd9.n;
import j8c.a;
import q87.c;
import ce9.l;
import ee9.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import zb9.p0;
import zb9.p0$a;
import hf9.b;
import hf9.b$a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.video.CameraFragment;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import android.view.View;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import nd9.y;
import fw8.r$a;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import qxc.b;
import nd9.b0;
import java.lang.Runnable;
import vf9.f0;
import nd9.z$b;
import erd.g;
import crd.b;
import java.lang.Integer;
import e4b.a;
import e4b.c;
import w3b.l;
import android.os.Build$VERSION;
import brd.t;
import t45.d;
import brd.z;
import nd9.z$c;
import nd9.z$d;
import com.yxcorp.gifshow.magic.data.repo.response.MusicRecommendMagicInfo;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import android.app.Activity;
import nd9.x;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import nd9.v;
import android.animation.Animator$AnimatorListener;
import nd9.w;
import nd9.u;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import nd9.y$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.os.Handler;
import nd9.c0;
import fw8.r;

public final class z extends d0	// class@003167
{
    public final String o;
    public Integer p;
    public y q;
    public View r;
    public View s;
    public ArrayList t;
    public String u;
    public int[] v;
    public boolean w;
    public b x;
    public MusicRecommendMagicInfo y;
    public r$a z;

    public void z(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.o = "MusicMagicPopupController";
       this.t = new ArrayList();
       this.z = new z$a(this);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       a0.i(this);
       this.h2();
       return;
    }
    public final boolean g2(){
       boolean b;
       Object[] objArray;
       d obj = PatchProxy.apply(null, this, z.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = "enableMusicMagicReco";
       if (a.a().c()) {
          b = (!g.b1())? f.a(str): g.b1();
       }else {
          b = f.a(str);
       }
       if (!b && this.d.d(n.j).h == null) {
          objArray = new Object[0];
          a.D().w(this.o, "ab disable and not lipSynch, don\'t show", objArray);
          return 0;
       }else if(this.d.d(l.i).a != null || this.d.d(a.g).a()){
          objArray = new Object[0];
          a.D().w(this.o, "has magic, don\'t show", objArray);
          return 0;
       }else {
          obj = this.d;
          String str1 = "mCallerContext";
          a.o(obj, str1);
          BaseFragment uBaseFragmen = obj.f();
          a.o(uBaseFragmen, "mCallerContext.fragment");
          if (!uBaseFragmen.isResumed()) {
             objArray = new Object[0];
             a.D().w(this.o, "not resumed,don\'t show", objArray);
             return 0;
          }else if(this.d.d(p0.j.a()).c() || this.d.d(b.c.a()).a()){
             objArray = new Object[0];
             a.D().w(this.o, "in intelligent identify mode, don\'t show", objArray);
             return 0;
          }else {
             obj = this.d;
             a.o(obj, str1);
             uBaseFragmen = obj.f();
             Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.video.CameraFragment");
             c uoc = uBaseFragmen.V7();
             if (uoc != null) {
                a uoa = uoc.h();
                if (uoa != null) {
                   a.o(uoa, "it");
                   if (uoa.d() != RecordBubbleItem.AUTO_DOWNLOAD_PANEL && uoa.d() != RecordBubbleItem.RECO_COLLECT_MUSIC) {
                      objArray = new Object[0];
                      a.D().w(this.o, "has bubble, don\'t show", objArray);
                      return 0;
                   }
                }
             }
             z ts = this.s;
             if (ts == null || ts.getVisibility()) {
                objArray = new Object[0];
                a.D().w(this.o, "no anchor, don\'t show", objArray);
                return 0;
             }else if(CameraLogger.d(this.d)){
                objArray = new Object[0];
                a.D().w(this.o, "has panel, don\'t show", objArray);
                return 0;
             }else if(!this.f2()){
                objArray = new Object[0];
                a.D().w(this.o, "not video mode, don\'t show", objArray);
                return 0;
             }else {
                return true;
             }
          }
       }
    }
    public final void h2(){
       if (PatchProxy.applyVoid(null, this, z.class, "10")) {
          return;
       }
       z tq = this.q;
       if (tq != null) {
          tq.a();
       }
       this.q = null;
       return;
    }
    public final r$a i2(){
       return this.z;
    }
    public void k(View p0){
       z oz = z.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oz, "1")) {
          return;
       }
       super.k(p0);
       d td = this.d;
       a.o(td, "mCallerContext");
       BaseFragment uBaseFragmen = td.f();
       Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.bottombar.IRecordBottomBarOwner");
       this.r = b.a(uBaseFragmen.zb().D(), p0, 0x7f0a0622);
       td = this.d;
       a.o(td, "mCallerContext");
       uBaseFragmen = td.f();
       Objects.requireNonNull(uBaseFragmen, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.bottombar.IRecordBottomBarOwner");
       this.s = b.a(uBaseFragmen.zb().D(), p0, 0x7f0a0620);
       if (this.r != null && !PatchProxy.applyVoid(null, this, oz, "12")) {
          this.b2(new b0(this));
       }
       this.d.l(f0.class, new z$b(this));
       return;
    }
    public final void k2(String p0,int p1){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oz, "7")) {
          return;
       }
       this.Y1(c.a().l(p0, p1, l.e(), Build$VERSION.SDK_INT).subscribeOn(d.c).observeOn(d.a).subscribe(new z$c(this), new z$d(this)));
       return;
    }
    public final void l2(MusicRecommendMagicInfo p0){
       a$c uoc;
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "11")) {
          return;
       }
       MagicEmoji$MagicFace magicFace = new MagicEmoji$MagicFace();
       magicFace.mId = String.valueOf(p0.magicFaceId);
       magicFace.mImages = p0.iconUrls;
       magicFace.mName = p0.name;
       d te = this.e;
       a.o(te, "mActivity");
       d td = this.d;
       a.o(td, "mCallerContext");
       y oy = new y(te, magicFace, this.u, td);
       this.q = oy;
       z tv = this.v;
       int i = 0;
       if (tv != null) {
          p0 = null;
          this.y = p0;
          a.m(oy);
          int i1 = tv[i];
          int i2 = tv[1];
          y oy1 = y.class;
          if (!PatchProxy.isSupport(oy1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), Integer.valueOf(i2), oy, oy1, "4")) {
             BubbleInterface$Position m = y.m;
             y i3 = oy.i;
             int n = y.n;
             if (PatchProxy.isSupport(x.class)) {
                Object[] objArray = new Object[]{m,Integer.valueOf(i1),Integer.valueOf(i2),i3,Integer.valueOf(0x7f0d1017),Integer.valueOf(n),p0};
                uoc = PatchProxy.apply(objArray, oy, x.class, "3");
                if (uoc != PatchProxyResult.class) {
                label_00fb :
                   oy.g = uoc.Y(new y$e(oy));
                   oy.h.removeCallbacksAndMessages(p0);
                   oy.h.sendEmptyMessageDelayed(1, 5000);
                }
             }
             a.p(m, "position");
             a.p(i3, "activity");
             uoc = new a$c(i3);
             uoc.n0(i1, i2);
             uoc.v0(n);
             uoc.D0(m);
             uoc.A(1);
             uoc.P(1);
             v ov = PatchProxy.applyOneRefs(p0, oy, x.class, "1");
             if (ov != PatchProxyResult.class) {
             }else {
                ov = new v(oy, p0);
             }
             uoc.F(ov);
             w ow = PatchProxy.apply(p0, oy, x.class, "2");
             if (ow != PatchProxyResult.class) {
             }else {
                ow = new w(oy);
             }
             uoc.N(ow);
             uoc.L(new u(oy, R.layout.arg_RES_7f0d1017));
             uoc.D(PopupInterface$Excluded.NOT_AGAINST);
             a.o(uoc, "Bubble.Builder\(activity\)¡­ace.Excluded.NOT_AGAINST\)");
             goto label_00fb ;
          }
          this.d.m(new c0());
       }else {
          this.y = p0;
          Object[] objArray1 = new Object[i];
          a.D().w(this.o, "wait anchor postion calculated", objArray1);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, z.class, "5")) {
          return;
       }
       super.onDestroy();
       this.z = null;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       super.onDestroyView();
       if (this.z != null) {
          r.c().g(this.z);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       super.onPause();
       this.h2();
       return;
    }
}
