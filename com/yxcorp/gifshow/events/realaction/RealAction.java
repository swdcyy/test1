package com.yxcorp.gifshow.events.realaction.RealAction;
import java.io.Serializable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.action.c;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import f3b.o;
import java.lang.System;

public class RealAction implements Serializable	// class@000e89
{
    public final int mActionType;
    public RealAction$ExtParams mExtParams;
    public final BaseFeed mFeed;
    public final String mPage;
    public final String mSource;
    public static final long serialVersionUID = 0x3da01944b805efd;

    public void RealAction(int p0,BaseFeed p1){
       super();
       this.mPage = this.a();
       this.mSource = c.i(2);
       this.mActionType = p0;
       this.mFeed = p1;
       this.b(RealAction$ExtParams.newInstance());
    }
    public void RealAction(int p0,BaseFeed p1,RealAction$ExtParams p2){
       super();
       this.mPage = this.a();
       this.mSource = c.i(2);
       this.mActionType = p0;
       this.mFeed = p1;
       this.b(p2);
    }
    public void RealAction(int p0,BaseFeed p1,String p2,RealAction$ExtParams p3){
       super();
       this.mPage = this.a();
       this.mActionType = p0;
       this.mFeed = p1;
       this.mSource = p2;
       this.b(p3);
    }
    public void RealAction(String p0,int p1,BaseFeed p2){
       super();
       this.mPage = p0;
       this.mSource = c.i(2);
       this.mActionType = p1;
       this.mFeed = p2;
       this.b(RealAction$ExtParams.newInstance());
    }
    public void RealAction(String p0,int p1,BaseFeed p2,RealAction$ExtParams p3){
       super();
       this.mPage = p0;
       this.mSource = c.i(2);
       this.mActionType = p1;
       this.mFeed = p2;
       this.b(p3);
    }
    public void RealAction(String p0,int p1,BaseFeed p2,String p3,RealAction$ExtParams p4){
       super();
       this.mPage = p0;
       this.mActionType = p1;
       this.mFeed = p2;
       this.mSource = p3;
       this.b(p4);
    }
    public final String a(){
       String str;
       k2 obj = PatchProxy.apply(null, this, RealAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x4b316083).f();
       obj = (obj != null)? obj.d: o.i(0);
       return obj;
    }
    public final void b(RealAction$ExtParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealAction.class, "1")) {
          return;
       }
       if (p0 == null) {
          p0 = RealAction$ExtParams.newInstance();
       }
       p0.mTimestamp = System.currentTimeMillis();
       this.mExtParams = p0;
       return;
    }
}
