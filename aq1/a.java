package aq1.a;
import aq1.g;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import zp1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import zp1.m;
import aq1.a$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.lang.Boolean;
import aq1.a$b;
import java.lang.Runnable;
import ekd.k1;
import zp1.c;
import java.util.Map;
import mrd.a;
import oe3.h;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import s0d.f;
import android.net.Uri;
import fq1.d;
import s0d.a;
import aq1.a$d;
import jd.c;
import s0d.e;
import aq1.a$c;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import yh3.a;
import android.graphics.Rect;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import com.yxcorp.gifshow.model.CDNUrl;
import aq1.d;
import aq1.c;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public abstract class a extends g	// class@00027e
{
    public ViewGroup M;
    public KwaiImageView N;
    public LiveLottieAnimationView O;
    public ViewGroup P;
    public KwaiImageView Q;
    public final a R;
    public final String S;
    public final b T;

    public void a(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.S = p0;
       this.T = p1;
       this.R = new a();
    }
    public void F3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "viewModel");
       super.F3(p0);
       p0.A0().observe(this, new a$a(this));
       return;
    }
    public void I3(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       k1.o(new a$b(this, p0));
       return;
    }
    public void J2(){
       a uoa;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "9")) {
          return;
       }
       super.J2();
       Map map = this.T.a();
       if (map != null) {
          uoa = map.get(this.S);
          if (uoa != null) {
             uoa.onNext(new h(objArray));
          }
       }
       this.R.dispose();
       this.I3(false);
       k1.n(this);
       uoa = this.M;
       if (uoa == null) {
          a.S("audioAvatarContainer");
       }
       uoa.setVisibility(8);
       return;
    }
    public abstract void J3();
    public final void K3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "8")) {
          return;
       }
       e[] uoeArray = f.x().s(d.d(R.drawable.detail_avatar_secret)).o(HeadImageSize.MIDDLE.getSize(), HeadImageSize.MIDDLE.getSize()).l(new a$d(30)).w();
       a tQ = this.Q;
       if (tQ == null) {
          a.S("audioBackgroundImageBg");
       }
       d uod = tQ.g0(new a$c(this), objArray, uoeArray);
       tQ = this.Q;
       if (tQ == null) {
          a.S("audioBackgroundImageBg");
       }
       if (uod != null) {
          objArray = uod.e();
       }
       tQ.setController(objArray);
       return;
    }
    public void V2(a p0){
       this.F3(p0);
    }
    public void d3(float p0,Rect p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "10")) {
          return;
       }
       a.p(p1, "cellRect");
       super.d3(p0, p1);
       a tN = this.N;
       String str = "chatAudioAvatarImageView";
       if (tN == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tN.getLayoutParams();
       double d = 0x3fdae147ae147ae1;
       if (layoutParams != null) {
          layoutParams.width = (int)((double)p1.width() * d);
       }
       tN = this.N;
       if (tN == null) {
          a.S(str);
       }
       layoutParams = tN.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.height = (int)((double)p1.width() * d);
       }
       tN = this.O;
       if (tN == null) {
          a.S("avatarAnimView");
       }
       layoutParams = tN.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.width = (int)((double)p1.width() * 0x3fee3d70a3d70a3d);
       }
       tN = this.O;
       if (tN == null) {
          a.S("avatarAnimView");
       }
       layoutParams = tN.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.height = (int)((double)p1.width() * 0x3fee3d70a3d70a3d);
       }
       return;
    }
    public void f3(m p0){
       this.F3(p0);
    }
    public void x3(View p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          return;
       }
       a.p(p0, "chatCellView");
       View view = p0.findViewById(R.id.live_multi_chat_audio_avatar_container);
       a.o(view, "chatCellView.findViewByI¡­t_audio_avatar_container\)");
       this.M = view;
       if (view == null) {
          a.S("audioAvatarContainer");
       }
       int i = 0;
       view.setVisibility(i);
       view = p0.findViewById(R.id.live_chat_audio_container);
       a.o(view, "chatCellView.findViewByI¡­ive_chat_audio_container\)");
       this.P = view;
       view = p0.findViewById(R.id.live_chat_audio_cell_background_image_bg);
       a.o(view, "chatCellView.findViewByI¡­cell_background_image_bg\)");
       this.Q = view;
       view = p0.findViewById(R.id.live_chat_audio_avatar);
       a.o(view, "chatCellView.findViewByI¡­d.live_chat_audio_avatar\)");
       this.N = view;
       p0 = p0.findViewById(R.id.live_chat_audio_avatar_anim);
       a.o(p0, "chatCellView.findViewByI¡­e_chat_audio_avatar_anim\)");
       this.O = p0;
       UserInfo userInfo = this.T.c(this.S);
       if (!PatchProxy.applyVoidOneRefs(userInfo, this, uoa, "6")) {
          b uob = null;
          UserInfo mHeadUrls = (userInfo != null)? userInfo.mHeadUrls: uob;
          if (mHeadUrls != null) {
             mHeadUrls = userInfo.mHeadUrls;
             a.o(mHeadUrls, "userInfo.mHeadUrls");
             if (!mHeadUrls.length) {
                i = 1;
             }
             if (!i) {
                if (!PatchProxy.applyVoidOneRefs(userInfo, this, uoa, "7")) {
                   uoa = this.N;
                   if (uoa == null) {
                      a.S("chatAudioAvatarImageView");
                   }
                   g.e(uoa, userInfo, HeadImageSize.BIG, uob, uob);
                   int size = HeadImageSize.MIDDLE.getSize();
                   f uof = f.x().r(userInfo.mHeadUrls).t(userInfo.mHeadUrl);
                   uof.g(size);
                   uof = uof.o(size, size);
                   e[] uoeArray = uof.l(new d(30)).w();
                   a.o(uoeArray, "KwaiImageRequestGroupBui¡­}\)\n      .buildRequests\(\)");
                   uoa = this.Q;
                   if (uoa == null) {
                      a.S("audioBackgroundImageBg");
                   }
                   d uod = uoa.g0(new c(this), uob, uoeArray);
                   uoa = this.Q;
                   if (uoa == null) {
                      a.S("audioBackgroundImageBg");
                   }
                   if (uod != null) {
                      uob = uod.e();
                   }
                   uoa.setController(uob);
                }
             }
          }
          b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "mHeadUrls is empty");
          this.K3();
       }
       return;
    }
    public boolean z3(){
       return false;
    }
}
