package com.yxcorp.gifshow.ad.tachikoma.a$g;
import erd.g;
import com.yxcorp.gifshow.ad.tachikoma.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public final class a$g implements g	// class@001808
{
    public final a b;
    public final PhotoAdvertisement$TkTemplateInfo c;
    public final q d;

    public void a$g(a p0,PhotoAdvertisement$TkTemplateInfo p1,q p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          this.b.h(" render timeout exception "+p0);
          this.b.l(this.c, this.d);
       }
       return;
    }
}
