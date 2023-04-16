package com.kuaishou.live.basic.resourcemanager.b;
import gb7.c;
import com.kuaishou.live.basic.resourcemanager.c;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.resourcemanager.c$a;
import brd.g;
import java.lang.Throwable;
import java.lang.StringBuilder;

public class b implements c	// class@000cfa
{
    public final MaterialDetailInfo a;
    public final v b;
    public final c c;

    public void b(c p0,MaterialDetailInfo p1,v p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       b.S(LiveLogTag.LIVE_RESOURCE.appendTag("LiveCommonResourceManager"), "dealMaterialInfo, file.download onCancel", "id:", this.a.getMaterialId());
       this.b.onNext(new c$a(this.a.getMaterialId(), ""));
       this.b.onComplete();
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
          return;
       }
       LiveLogTag lIVE_RESOURC = LiveLogTag.LIVE_RESOURCE;
       lIVE_RESOURC.appendTag("LiveCommonResourceManager");
       LiveLogTag liveLogTag = lIVE_RESOURC;
       b.T(liveLogTag, "dealMaterialInfo, file.download onCompleted", "id:", this.a.getMaterialId(), "path:", p1);
       this.b.onNext(new c$a(this.a.getMaterialId(), p1));
       this.b.onComplete();
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "3")) {
          return;
       }
       b.y(LiveLogTag.LIVE_RESOURCE.appendTag("LiveCommonResourceManager"), "dealMaterialInfo, file.download onFailed, id:"+this.a.getMaterialId(), p1);
       this.b.onNext(new c$a(this.a.getMaterialId(), ""));
       this.b.onComplete();
       return;
    }
    public void onProgress(String p0,long p1,long p2){
    }
}
