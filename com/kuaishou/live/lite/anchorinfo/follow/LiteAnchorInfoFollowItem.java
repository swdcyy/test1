package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$b;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$a;
import nsd.u;
import lnc.a1;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.user.User;
import xp5.i;
import java.lang.String;
import pg1.e;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$FollowAnimation;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ha1.b;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$c;
import q83.g;
import android.view.View$OnClickListener;
import o83.j;
import com.airbnb.lottie.LottieAnimationView;
import q83.f;
import java.lang.Enum;
import q83.h;
import android.animation.Animator$AnimatorListener;
import q83.i;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import java.lang.Runnable;
import android.widget.LinearLayout;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import v83.x;

public final class LiteAnchorInfoFollowItem implements LiveLiteAnchorInfoAreaService$b	// class@001e5c
{
    public boolean a;
    public View b;
    public LiteAnchorInfoFollowItem$c c;
    public final LiveStreamFeed d;
    public final User e;
    public final i f;
    public final int g;
    public final String h;
    public final e i;
    public final LiteAnchorInfoFollowItem$FollowAnimation j;
    public final LiteAnchorInfoFollowItem$b k;
    public static final int[] l;
    public static final float[] m;
    public static final LiteAnchorInfoFollowItem$a n;

    static {
       LiteAnchorInfoFollowItem.n = new LiteAnchorInfoFollowItem$a(null);
       int[] ointArray = new int[]{0,a1.a(0x7f061be3),a1.a(0x7f060620),a1.a(0x7f061be3),0};
       LiteAnchorInfoFollowItem.l = ointArray;
       LiteAnchorInfoFollowItem.m = new float[5]{0x3e99999a,0x3ecccccd,0x3f000000,0x3f19999a,0x3f333333};
    }
    public void LiteAnchorInfoFollowItem(LiveStreamFeed p0,User p1,i p2,int p3,String p4,e p5,LiteAnchorInfoFollowItem$FollowAnimation p6,LiteAnchorInfoFollowItem$b p7){
       a.p(p0, "feed");
       a.p(p1, "user");
       a.p(p2, "logPackageProvider");
       a.p(p4, "followPosition");
       a.p(p5, "followManager");
       a.p(p6, "initialAnim");
       a.p(p7, "followCallback");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.j = p6;
       this.k = p7;
    }
    public View a(Context p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiteAnchorInfoFollowItem liteAnchorIn = LiteAnchorInfoFollowItem.class;
       LiteAnchorInfoFollowItem obj = PatchProxy.applyOneRefs(p0, this, liteAnchorIn, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "context");
       obj = this.b;
       if (obj == null) {
          obj = PatchProxy.applyOneRefs(p0, this, liteAnchorIn, "4");
          if (obj != patchProxyRe) {
          }else {
             View view = b.b(p0, R.layout.arg_RES_7f0d0970);
             a.o(view, "LiteLayoutInflater.infla¡­nchor_info_follow_button\)");
             View view1 = view;
          }
          LiteAnchorInfoFollowItem$c uoc = PatchProxy.applyOneRefs(obj, this, liteAnchorIn, "5");
          if (uoc != patchProxyRe) {
          }else {
             uoc = new LiteAnchorInfoFollowItem$c(obj);
             this.c = uoc;
             uoc.c.setOnClickListener(new g(this, uoc));
          }
          this.e(uoc, this.j);
          this.b = obj;
       }
       return obj;
    }
    public int b(){
       return j.a(this);
    }
    public final boolean c(){
       return this.a;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiteAnchorInfoFollowItem.class, "3")) {
          return;
       }
       LiteAnchorInfoFollowItem tc = this.c;
       if (tc != null) {
          this.e(tc, LiteAnchorInfoFollowItem$FollowAnimation.EmptyAnim);
       }
       return;
    }
    public final void e(LiteAnchorInfoFollowItem$c p0,LiteAnchorInfoFollowItem$FollowAnimation p1){
       LiteAnchorInfoFollowItem liteAnchorIn = LiteAnchorInfoFollowItem.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, liteAnchorIn, "6")) {
          return;
       }
       LottieAnimationView lottieAnimat = p0.a();
       LiteAnchorInfoFollowItem$c a = p0.a;
       int i = f.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             p0.a().f();
             p0.a().setProgress(0);
          }else if(PatchProxy.applyVoidOneRefs(lottieAnimat, this, liteAnchorIn, "7")){
             this.a = true;
             lottieAnimat.setRepeatCount(0);
             lottieAnimat.s();
             lottieAnimat.t();
             lottieAnimat.a(new h(this));
          }
       }else if(PatchProxy.applyVoidTwoRefs(lottieAnimat, a, this, liteAnchorIn, "8")){
          a.postDelayed(new i(lottieAnimat, a), 100);
       }
       return;
    }
    public LiveLiteAnchorInfoAreaService$a getBizId(){
       return LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.Follow;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, LiteAnchorInfoFollowItem.class, "2")) {
          return;
       }
       j.b(this);
       x.b(this.f.a(), this.h);
       return;
    }
    public void onDetach(){
       j.c(this);
    }
}
