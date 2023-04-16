package com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$b;
import java.lang.Object;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$a;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$b$a;
import ok.h;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class LiveSlidePlayFeedFlowParam$b	// class@001011
{
    public QPhoto a;
    public List b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public String i;

    public void LiveSlidePlayFeedFlowParam$b(){
       super();
    }
    public LiveSlidePlayFeedFlowParam a(){
       Object[] objArray = null;
       LiveSlidePlayFeedFlowParam obj = PatchProxy.apply(objArray, this, LiveSlidePlayFeedFlowParam$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveSlidePlayFeedFlowParam(objArray);
       LiveSlidePlayFeedFlowParam$b tb = this.b;
       obj.mPhotoList = tb;
       if (!q.f(tb)) {
          obj.mLiveStreamFeedList = m.s(this.b).F(new LiveSlidePlayFeedFlowParam$b$a(this)).B();
       }
       obj.mPcursor = this.c;
       obj.mPath = this.d;
       obj.mLiveStreamId = this.e;
       obj.mRecoStreamId = this.f;
       obj.mLiveSlidePlaySource = this.g;
       obj.mConstantLiveStreamId = this.h;
       obj.mExtraInfo = this.i;
       return obj;
    }
    public LiveSlidePlayFeedFlowParam$b b(String p0){
       this.i = p0;
       return this;
    }
    public LiveSlidePlayFeedFlowParam$b c(int p0){
       this.g = p0;
       return this;
    }
    public LiveSlidePlayFeedFlowParam$b d(String p0){
       this.e = p0;
       return this;
    }
    public LiveSlidePlayFeedFlowParam$b e(String p0){
       this.d = p0;
       return this;
    }
    public LiveSlidePlayFeedFlowParam$b f(List p0){
       this.b = p0;
       return this;
    }
    public LiveSlidePlayFeedFlowParam$b g(String p0){
       this.f = p0;
       return this;
    }
}
