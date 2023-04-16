package com.yxcorp.gifshow.ad.webview.jshandler.b$a;
import erd.g;
import android.app.Activity;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Object;
import java.lang.ref.WeakReference;
import os5.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import com.kuaishou.android.live.model.LiveFloatingWindowType;
import wp5.c;
import wp5.a;
import java.util.Collection;

public class b$a implements g	// class@0018f5
{
    public final WeakReference b;
    public final LiveStreamFeed c;

    public void b$a(Activity p0,LiveStreamFeed p1){
       super();
       this.b = new WeakReference(p0);
       this.c = p1;
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       Object obj = this.b.get();
       if (obj != null) {
          HashSet hashSet = new HashSet();
          hashSet.add("AdYodaActivity");
          hashSet.add("AdYodaActivity2");
          p0.k1(obj, this.c, "commercial_float_window", a.n(LiveFloatingWindowType.AD), hashSet);
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
