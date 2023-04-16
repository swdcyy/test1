package com.kuaishou.live.ad.social.s;
import zl9.b;
import com.kwai.framework.model.feed.BaseFeed;
import zl0.a1;
import java.lang.Object;
import java.lang.String;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import zl0.j1;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import cm0.f;
import zl0.z0;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import erd.g;
import com.kuaishou.live.ad.social.NonAdLogHelper;
import mxb.j0;
import mxb.i0;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import java.util.List;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Exception;
import zl9.a;

public class s implements b	// class@000a21
{
    public BaseFeed a;
    public a1 b;

    public void s(BaseFeed p0,a1 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void e(String p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "1")) {
          return;
       }
       int i = -1;
       try{
          if (this.a == null || this.b == null) {
             p1.onError(i, "native BaseFeed or LiveAdConversionTask is null");
             return;
          }else {
             j1 oj1 = new Gson().h(p0, j1.class);
             NonAdLogHelper.a(oj1.mActionType, f.a(this.b), this.a, new z0(oj1));
             if (this.b.k != null) {
                i0.a().k(oj1.mActionType, this.b.k.mTracks);
             }
             p1.onSuccess(null);
          }
       }catch(java.lang.Exception e6){
          b.B(LiveLogTag.AD, "native conversion task log failed");
          p1.onError(i, e6.getMessage());
       }
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "log";
    }
    public void onDestroy(){
       a.a(this);
    }
}
