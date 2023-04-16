package com.kuaishou.live.common.core.component.comments.mock.c;
import lf1.q;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lf1.p;
import java.util.HashMap;
import n81.e;
import p91.m;
import java.util.Collection;
import z1.a;
import lf1.m;
import lf1.l;

public class c extends PresenterV2 implements q, g	// class@0010b3
{
    public e p;
    public m q;
    public q r;
    public static String sLivePresenterClassName = "LiveMockMessagePresenter";

    public void c(){
       super();
       this.r = this;
    }
    public final void P8(QLiveMessage p0,LiveRichTextUserState p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       if (this.R8(p0) && p1 != null) {
          QLiveMessage mLiveAudienc = p0.mLiveAudienceState;
          if (mLiveAudienc == null) {
             mLiveAudienc = new LiveAudienceState();
          }
          mLiveAudienc.userStateSegment = p1.userStateSegment;
          int backgroundGr = p0.getBackgroundGroupType();
          if (backgroundGr) {
             p1 = p1.feedBackground;
             LiveFeedBackground liveFeedBack = (p1 != null)? p1.get(Integer.valueOf(backgroundGr)): null;
             mLiveAudienc.feedBackground = liveFeedBack;
          }
          p0.mLiveAudienceState = mLiveAudienc;
       }
       return;
    }
    public final boolean R8(QLiveMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       UserInfo user = (p0 != null)? p0.getUser(): null;
       boolean b = (user != null && TextUtils.n(user.mId, QCurrentUser.me().getId()))? true: false;
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new p());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(e.class);
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
    public void k5(Collection p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       this.p.m7(new m(this, p0, p1));
       return;
    }
    public void m1(QLiveMessage p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "2")) {
          return;
       }
       this.p.m7(new l(this, p0, p1, p2));
       return;
    }
}
