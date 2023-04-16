package com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment$b;
import im8.g;
import java.lang.Object;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.marketing.sandeago.start.p;
import java.util.Map;
import java.util.HashMap;

public class LiveAnchorStartSandeagoFragment$b implements g	// class@001a5c
{
    public LiveMerchantBaseContext b;
    public h c;
    public i d;
    public SandeagoPublish e;
    public SandeagoPublish f;
    public LiveAnchorStartSandeagoFragment g;
    public PublishSubject h;
    public PublishSubject i;
    public PublishSubject j;
    public PublishSubject k;
    public PublishSubject l;
    public PublishSubject m;
    public PublishSubject n;
    public long o;

    public void LiveAnchorStartSandeagoFragment$b(){
       super();
       this.e = new SandeagoPublish();
       this.h = PublishSubject.g();
       this.i = PublishSubject.g();
       this.j = PublishSubject.g();
       this.k = PublishSubject.g();
       this.l = PublishSubject.g();
       this.m = PublishSubject.g();
       this.n = PublishSubject.g();
       this.o = 0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorStartSandeagoFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorStartSandeagoFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAnchorStartSandeagoFragment$b.class, new p());
       }else {
          obj.put(LiveAnchorStartSandeagoFragment$b.class, null);
       }
       return obj;
    }
}
