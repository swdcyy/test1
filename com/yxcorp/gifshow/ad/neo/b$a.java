package com.yxcorp.gifshow.ad.neo.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.ad.neo.b;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nx8.f;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.neo.a;
import erd.g;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import java.lang.System;
import java.lang.Long;
import java.util.Map;
import mxb.j;
import w29.b;

public class b$a extends m	// class@001790
{
    public final Activity c;
    public final AdDataWrapper d;
    public final PhotoApkDownloadTaskInfo e;
    public final int f;
    public final b g;

    public void b$a(b p0,Activity p1,AdDataWrapper p2,PhotoApkDownloadTaskInfo p3,int p4){
       this.g = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (f.d(this.c, this.d)) {
          i0.a().e(37, this.e.mPhoto.mEntity).d(a.b).a();
          this.g.a.put(this.e.mPkgName, Long.valueOf(System.currentTimeMillis()));
       }
       i0.a().p(141, this.d.getAdLogWrapper()).d(new b(this.f)).a();
       return;
    }
}
