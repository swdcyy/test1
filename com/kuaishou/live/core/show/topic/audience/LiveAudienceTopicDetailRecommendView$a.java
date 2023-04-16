package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$a;
import y8c.g;
import ql2.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.kwai.framework.model.user.UserInfo;
import android.view.ViewGroup;
import y8c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.topic.audience.t;
import com.kuaishou.live.core.show.topic.audience.s;
import ml8.c;

public class LiveAudienceTopicDetailRecommendView$a extends g	// class@0011f2
{

    public void LiveAudienceTopicDetailRecommendView$a(){
       super();
    }
    public void LiveAudienceTopicDetailRecommendView$a(w p0){
       super();
    }
    public void Z0(){
    }
    public int f0(int p0){
       LiveAudienceTopicDetailRecommendView$a uoa = LiveAudienceTopicDetailRecommendView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       UserInfo userInfo = this.N0(p0);
       userInfo = (userInfo != null && userInfo.isLiving())? 1: 2;
       return userInfo;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       LiveAudienceTopicDetailRecommendView$a uoa = LiveAudienceTopicDetailRecommendView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (p1 != 1) {
          view = a.i(p0, R.layout.arg_RES_7f0d0a5f);
          obj.U7(new t());
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d0a5e);
          obj.U7(new s());
       }
       return new f(view, obj);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceTopicDetailRecommendView$a.class, "3")) {
          return;
       }
       super.Z0();
       return;
    }
}
