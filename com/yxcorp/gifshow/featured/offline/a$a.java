package com.yxcorp.gifshow.featured.offline.a$a;
import com.yxcorp.gifshow.featured.offline.c$b;
import com.yxcorp.gifshow.featured.offline.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xea.b;
import lea.b;
import java.lang.System;
import jda.b;
import wkd.b;
import yea.f;

public class a$a implements c$b	// class@000fda
{
    public final QPhoto a;
    public final boolean b;
    public final a c;

    public void a$a(a p0,QPhoto p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onResult(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       b uob = new b();
       uob.coverPath = p0;
       uob.mQPhoto = this.a;
       uob.mUpdateTimestamp = System.currentTimeMillis();
       uob.canForceCacheInMobileNet = this.b;
       uob.downloadStatus = 4;
       uob.mQPhoto.setCacheType(3);
       uob.mUpdateTimestamp = System.currentTimeMillis();
       b.a(0x60e4a25a).b(uob);
       return;
    }
}
