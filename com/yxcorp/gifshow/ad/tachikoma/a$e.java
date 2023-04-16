package com.yxcorp.gifshow.ad.tachikoma.a$e;
import erd.a;
import com.yxcorp.gifshow.ad.tachikoma.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$e implements a	// class@001806
{
    public final a b;
    public final PhotoAdvertisement$TkTemplateInfo c;
    public final q d;

    public void a$e(a p0,PhotoAdvertisement$TkTemplateInfo p1,q p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "1")) {
          return;
       }
       this.b.l(this.c, this.d);
       return;
    }
}
