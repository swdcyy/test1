package gi9.b;
import oc9.d0;
import gi9.b$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oc9.y;
import oc9.x;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import gi9.b$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import android.content.Intent;
import elb.y;
import elb.z;
import ag9.g;
import java.util.Objects;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import bn8.a;
import android.content.SharedPreferences;
import java.lang.System;
import android.app.Activity;
import lnc.n4;
import ekd.j0;
import zc9.f;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import gi9.c;
import gi9.d;
import erd.g;
import crd.b;

public final class b extends d0	// class@0024a8
{
    public boolean o;
    public long p;
    public static final b$a q;

    static {
       b.q = new b$a(null);
    }
    public void b(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.p = a1.k();
    }
    public void Q(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       x.a(this, p0);
       Object[] objArray = new Object[0];
       a.D().w("VPController", "onCreateView cost:"+a1.o(this.p), objArray);
       this.b2(new b$b(this));
       return;
    }
    public final String g2(){
       QCurrentUser obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.me();
       a.o(obj, "QCurrentUser.me\(\)");
       String id = obj.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       return id;
    }
    public final boolean h2(){
       QCurrentUser obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.me();
       a.o(obj, "QCurrentUser.me\(\)");
       return obj.isLogined();
    }
    public void w1(Intent p0){
       boolean b;
       g a;
       int b1;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       super.w1(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("VPController", "onCreate cost:"+a1.o(this.p), objArray);
       if (this.o == null && this.h2()) {
          b = true;
          this.o = b;
          Object[] objArray1 = null;
          String str = "3";
          if (!PatchProxy.applyVoid(objArray1, this, uob, str)) {
             String str1 = this.g2();
             z oz = y.b.a();
             a = g.a;
             d te = this.e;
             a.o(te, "mActivity");
             d td = this.d;
             a.o(td, "mCallerContext");
             Objects.requireNonNull(a);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object obj = PatchProxy.applyTwoRefs(te, td, a, g.class, "2");
             if (obj != patchProxyRe) {
                i = obj.booleanValue();
             }else {
                a.p(te, "activity");
                a.p(td, "callerContext");
                Object obj1 = PatchProxy.apply(objArray1, a, g.class, str);
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(!PostExperimentUtils.R()){
                   objArray = new Object[i];
                   a.D().w("RecoCollectMusicUtils", "not in exp", objArray);
                   b1 = false;
                }else {
                   int i1 = PostExperimentUtils.w0();
                   if (i1 != b && (i1 == 3 || i1 == 4)) {
                      Object obj2 = PatchProxy.apply(objArray1, a, g.class, "4");
                      if (obj2 != patchProxyRe) {
                         b1 = obj2.booleanValue();
                      }else if(a.a.getLong("last_show_record_reco_collect_music_time", 0) - System.currentTimeMillis() > 0){
                         b1 = 1;
                      }else {
                         b1 = 0;
                      }
                      b1 = b1 ^ b;
                   }else {
                      b1 = true;
                   }
                }
                if (!b1) {
                   objArray1 = new Object[i];
                   a.D().w("RecoCollectMusicUtils", "today has show or cancel bubble", objArray1);
                }else if(n4.c(te.getIntent()) || n4.b(te.getIntent())){
                   objArray1 = new Object[i];
                   a.D().w("RecoCollectMusicUtils", "has default magicFace ", objArray1);
                }else if(j0.g(te.getIntent(), "musicId") || j0.g(te.getIntent(), "music")){
                   objArray1 = new Object[i];
                   a.D().w("RecoCollectMusicUtils", "has default music ", objArray1);
                }else if(j0.a(te.getIntent(), "showFlashPopupOnCameraPage", i)){
                   objArray1 = new Object[i];
                   a.D().w("RecoCollectMusicUtils", "has default kuaishan pop ", objArray1);
                }else if(j0.a(te.getIntent(), "show_half_album_view", i)){
                   objArray1 = new Object[i];
                   a.D().w("RecoCollectMusicUtils", "open album", objArray1);
                }else if(j0.g(te.getIntent(), "key_post_entrance_draft_params")){
                   objArray1 = new Object[i];
                   a.D().w("RecoCollectMusicUtils", "has draft info", objArray1);
                }else {
                   Objects.requireNonNull(f.c);
                   if (td.d(f.b).a != null) {
                      objArray1 = new Object[i];
                      a.D().w("RecoCollectMusicUtils", "has lead in dialog ", objArray1);
                   }else {
                      i = true;
                   }
                }
             }
             this.Y1(oz.b(i).subscribeOn(d.c).observeOn(d.a).map(new e()).subscribe(new c(this, str1), new d(this)));
          }
       }
       return;
    }
}
