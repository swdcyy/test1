package com.yxcorp.gifshow.featured.offline.a$b;
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

public class a$b implements c$b	// class@000fdb
{
    public final QPhoto a;
    public final a b;

    public void a$b(a p0,QPhoto p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onResult(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       b uob = new b();
       uob.coverPath = p0;
       uob.mQPhoto = this.a;
       uob.mUpdateTimestamp = System.currentTimeMillis();
       uob.downloadStatus = 5;
       uob.mQPhoto.setCacheType(3);
       b.a(0x60e4a25a).b(uob);
       return;
    }
}
