package com.yxcorp.gifshow.follow.init.plugin.live.a;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.i;
import com.yxcorp.gifshow.model.LivePlayConfig;
import oha.a;
import com.yxcorp.gifshow.follow.init.plugin.live.a$a;
import java.util.Objects;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Integer;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.ViewStub;
import android.view.View;
import android.widget.ImageView;
import crd.b;
import lnc.b9;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t99.w;

public class a extends HomeLiveAutoPlayPresenter	// class@0010e3
{
    public LiveCoverAnnexHelper a1;
    public final CardStyle b1;
    public CommonMeta c1;

    public void a(CardStyle p0){
       super(p0);
       this.b1 = p0;
    }
    public void E8(){
       boolean b;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, uoa, str)) {
          return;
       }
       super.E8();
       a ta1 = this.a1;
       HomeLiveAutoPlayPresenter tr = this.r;
       LiveCoverAnnexHelper obj = PatchProxy.apply(objArray, this, uoa, "4");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.p == 1){
          if (i.e() != 2) {
          label_0031 :
             b = true;
          }
       }else {
          HomeLiveAutoPlayPresenter tq = this.q;
          if (tq != null && tq.mEnableCommentBullet != null) {
             goto label_0031 ;
          }
       }
       b = false;
       HomeLiveAutoPlayPresenter tp = this.p;
       a uoa1 = new a(this);
       a$a uoa2 = new a$a(this);
       Objects.requireNonNull(ta1);
       if (PatchProxy.isSupport(LiveCoverAnnexHelper.class)) {
          Object[] objArray1 = new Object[]{tr,Boolean.valueOf(b),Integer.valueOf(tp),uoa1,uoa2};
          if (PatchProxy.applyVoid(objArray1, ta1, LiveCoverAnnexHelper.class, str)) {
          label_00a3 :
             return;
          }
       }
       ta1.c = tr;
       if (tr != null) {
          objArray = tr.getCommonMeta();
       }
       ta1.F = objArray;
       ta1.e = b;
       ta1.f = tp;
       obj = ta1.c;
       if (obj != null) {
          ta1.s = r1.j2(obj.mEntity);
       }
       if (tp != 1) {
          if (tp != 3) {
             if (tp == 5) {
                ta1.g = 2;
             }
          }else {
             ta1.g = 3;
          }
       }else {
          ta1.g = 1;
       }
       ta1.q = uoa1;
       ta1.r = uoa2;
       ta1.m();
       goto label_00a3 ;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.F8();
       this.a1 = new LiveCoverAnnexHelper(this.t, this.u, this.b1);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a ta1 = this.a1;
       boolean b = (this.v.getVisibility() != 4)? true: false;
       ta1.H = b;
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       this.a1.b();
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       this.a1.b();
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.a1.g();
       return;
    }
    public void e9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "12")) {
          return;
       }
       a ta1 = this.a1;
       Objects.requireNonNull(ta1);
       if (!PatchProxy.applyVoid(objArray, ta1, LiveCoverAnnexHelper.class, "34")) {
          b9.a(ta1.h);
          ta1.o();
          LiveCoverAnnexHelper c = ta1.c;
          if (c != null) {
             objArray = c.getPhotoId();
          }
          Log.b("LiveCoverAnnex", a.C(objArray, ": onLiveVideoEnd resetRepeatRequestStatus"));
       }
       return;
    }
    public void h9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "13")) {
          return;
       }
       a ta1 = this.a1;
       Objects.requireNonNull(ta1);
       if (!PatchProxy.applyVoid(objArray, ta1, LiveCoverAnnexHelper.class, "33")) {
          b9.a(ta1.h);
          LiveCoverAnnexHelper c = ta1.c;
          if (c != null) {
             objArray = c.getPhotoId();
          }
          Log.b("LiveCoverAnnex", a.C(objArray, ": onLiveVideoInterrupted resetRepeatRequestStatus"));
          ta1.o();
          ta1.t();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.c1 = this.q8(CommonMeta.class);
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.a1.g();
       return;
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       this.a1.b();
       return;
    }
    public void l9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          return;
       }
       a ta1 = this.a1;
       Objects.requireNonNull(ta1);
       if (!PatchProxy.applyVoid(objArray, ta1, LiveCoverAnnexHelper.class, "32")) {
          ta1.u();
       }
       return;
    }
    public void m9(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       this.a1.i = w.a(this.v.getMeasuredWidth(), this.v.getMeasuredHeight());
       return;
    }
}
