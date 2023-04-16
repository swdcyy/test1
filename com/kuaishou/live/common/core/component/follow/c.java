package com.kuaishou.live.common.core.component.follow.c;
import pg1.e;
import com.kwai.framework.model.user.User;
import ok.x;
import android.app.Activity;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Object;
import z1.a;
import va1.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.follow.b;
import com.kwai.framework.model.feed.BaseFeed;
import jga.c;
import wca.b;
import y41.i$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import y41.i;
import n3d.a;
import lnc.a1;
import tkd.b;
import tkd.d;
import ou5.b;
import va1.d0;
import pg1.f;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.d;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;

public class c implements e	// class@001101
{
    public final User b;
    public final x c;
    public final LiveStreamFeedWrapper d;
    public final Activity e;
    public final String f;
    public a g;

    public void c(User p0,x p1,Activity p2,String p3,LiveStreamFeedWrapper p4){
       super();
       this.g = a.a();
       this.b = p0;
       this.c = p1;
       this.e = p2;
       this.f = p3;
       this.d = p4;
    }
    public void E7(LiveStreamFeed p0,String p1,int p2,boolean p3,g p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             return;
          }
       }
       b a = b.a;
       i$a uoa = new i$a(this.e, this.c.get()).p(p1);
       uoa.m(this.f);
       uoa.n(p2);
       uoa.f(b.c(p0));
       uoa.r(1);
       if (!p3) {
          a = null;
       }
       uoa.e(a);
       if (p2 == 121 || p2 == 225) {
          uoa.k(290);
       }
       if (p4 != null) {
          uoa.j(p4);
       }
       c tb = this.b;
       if (tb != null && TextUtils.n(p1, tb.getId())) {
          uoa.o(this.b);
       }
       this.g.accept(uoa);
       uoa.a().c();
       return;
    }
    public void U8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       String str = a1.p(R.string.arg_RES_7f103077);
       b uob = d.a(-1712118428);
       c te = this.e;
       String str1 = d0.a(this.d);
       c td = this.d;
       LiveStreamFeedWrapper mEntity = (td != null)? td.mEntity: 0;
       uob.ne(te, str1, "LiveFollowDelegateServiceImpl", 40, str, mEntity, null, null, new f(p0)).h();
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public boolean getFollowStatus(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isFollowingOrFollowRequesting();
    }
    public void l7(LiveStreamFeed p0,String p1,int p2,boolean p3,g p4,g p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             return;
          }
       }
       i$a uoa = new i$a(this.e, this.c.get()).p(p1);
       uoa.f(b.c(p0));
       uoa.m(this.f);
       uoa.n(p2);
       uoa.r(1);
       if (p4 != null) {
          uoa.j(p4);
       }
       if (p5 != null) {
          uoa.i(p5);
       }
       c tb = this.b;
       if (tb != null && TextUtils.n(p1, tb.getId())) {
          uoa.o(this.b);
       }
       this.g.accept(uoa);
       uoa.a().c();
       return;
    }
    public void lm(LiveStreamFeed p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, c.class, "3")) {
          return;
       }
       this.E7(p0, p1, p2, p3, null);
       return;
    }
    public boolean oa(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return QCurrentUser.me().isLogined();
    }
}
