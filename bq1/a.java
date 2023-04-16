package bq1.a;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import zp1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import zp1.m;
import bq1.a$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.lang.Iterable;
import crd.b;
import oh3.j;
import android.view.ViewGroup;
import java.lang.Boolean;
import bq1.a$b;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import s0d.f;
import android.net.Uri;
import fq1.d;
import s0d.a;
import bq1.a$c;
import jd.c;
import s0d.e;
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
import zp1.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import com.yxcorp.gifshow.model.CDNUrl;
import bq1.c;
import bq1.b;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public abstract class a extends LiveMultiChatAudienceBaseCellController	// class@0003de
{
    public ViewGroup O;
    public KwaiImageView P;
    public LiveLottieAnimationView Q;
    public ViewGroup R;
    public KwaiImageView S;
    public final ArrayList T;
    public final String U;
    public final b V;
    public final i W;
    public final l X;

    public void a(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.U = p0;
       this.V = p1;
       this.W = p2;
       this.X = p3;
       this.T = new ArrayList();
    }
    public void F3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a.p(p0, "viewModel");
       super.F3(p0);
       p0.A0().observe(this, new a$a(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       super.J2();
       Iterator iterator = this.T.iterator();
       while (iterator.hasNext()) {
          j.a(iterator.next());
       }
       this.O3(false);
       a tO = this.O;
       if (tO == null) {
          a.S("audioAvatarContainer");
       }
       tO.setVisibility(8);
       return;
    }
    public void O3(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "8")) {
          return;
       }
       k1.o(new a$b(this, p0));
       return;
    }
    public final void P3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "11")) {
          return;
       }
       e[] uoeArray = f.x().s(d.d(R.drawable.detail_avatar_secret)).o(HeadImageSize.MIDDLE.getSize(), HeadImageSize.MIDDLE.getSize()).l(new a$c(30)).w();
       a tS = this.S;
       if (tS == null) {
          a.S("audioBackgroundImageBg");
       }
       d uod = tS.g0(objArray, objArray, uoeArray);
       tS = this.S;
       if (tS == null) {
          a.S("audioBackgroundImageBg");
       }
       if (uod != null) {
          objArray = uod.e();
       }
       tS.setController(objArray);
       return;
    }
    public void V2(a p0){
       this.F3(p0);
    }
    public void d3(float p0,Rect p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       a.p(p1, "cellRect");
       super.d3(p0, p1);
       a tP = this.P;
       String str = "chatAudioAvatarImageView";
       if (tP == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tP.getLayoutParams();
       double d = 0x3fdae147ae147ae1;
       if (layoutParams != null) {
          layoutParams.width = (int)((double)p1.width() * d);
       }
       tP = this.P;
       if (tP == null) {
          a.S(str);
       }
       layoutParams = tP.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.height = (int)((double)p1.width() * d);
       }
       tP = this.Q;
       if (tP == null) {
          a.S("avatarAnimView");
       }
       layoutParams = tP.getLayoutParams();
       if (layoutParams != null) {
          layoutParams.width = (int)((double)p1.width() * 0x3fee3d70a3d70a3d);
       }
       tP = this.Q;
       if (tP == null) {
          a.S("avatarAnimView");
       }
       layoutParams = tP.getLayoutParams();
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
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       a.p(p0, "chatCellView");
       super.x3(p0);
       View view = p0.findViewById(R.id.live_multi_chat_audio_avatar_container);
       a.o(view, "chatCellView.findViewByI¡­t_audio_avatar_container\)");
       this.O = view;
       if (view == null) {
          a.S("audioAvatarContainer");
       }
       int i = 0;
       view.setVisibility(i);
       view = this.l3().findViewById(R.id.live_chat_audio_container);
       a.o(view, "multiChatCellView.findVi¡­ive_chat_audio_container\)");
       this.R = view;
       view = this.l3().findViewById(R.id.live_chat_audio_cell_background_image_bg);
       a.o(view, "multiChatCellView.findVi¡­cell_background_image_bg\)");
       this.S = view;
       view = p0.findViewById(R.id.live_chat_audio_avatar);
       a.o(view, "chatCellView.findViewByI¡­d.live_chat_audio_avatar\)");
       this.P = view;
       p0 = p0.findViewById(R.id.live_chat_audio_avatar_anim);
       a.o(p0, "chatCellView.findViewByI¡­e_chat_audio_avatar_anim\)");
       this.Q = p0;
       UserInfo userInfo = this.V.c(this.U);
       if (!PatchProxy.applyVoidOneRefs(userInfo, this, uoa, "9")) {
          b uob = null;
          UserInfo mHeadUrls = (userInfo != null)? userInfo.mHeadUrls: uob;
          if (mHeadUrls != null) {
             mHeadUrls = userInfo.mHeadUrls;
             a.o(mHeadUrls, "userInfo.mHeadUrls");
             if (!mHeadUrls.length) {
                i = 1;
             }
             if (!i) {
                if (!PatchProxy.applyVoidOneRefs(userInfo, this, uoa, "10")) {
                   uoa = this.P;
                   if (uoa == null) {
                      a.S("chatAudioAvatarImageView");
                   }
                   g.e(uoa, userInfo, HeadImageSize.BIG, uob, uob);
                   int size = HeadImageSize.MIDDLE.getSize();
                   f uof = f.x().r(userInfo.mHeadUrls).t(userInfo.mHeadUrl);
                   uof.g(size);
                   uof = uof.o(size, size);
                   e[] uoeArray = uof.l(new c(30)).w();
                   a.o(uoeArray, "KwaiImageRequestGroupBui¡­}\)\n      .buildRequests\(\)");
                   uoa = this.S;
                   if (uoa == null) {
                      a.S("audioBackgroundImageBg");
                   }
                   d uod = uoa.g0(new b(this), uob, uoeArray);
                   uoa = this.S;
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
          this.P3();
       }
       return;
    }
    public boolean z3(){
       return false;
    }
}
