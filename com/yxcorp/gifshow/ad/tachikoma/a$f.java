package com.yxcorp.gifshow.ad.tachikoma.a$f;
import erd.g;
import com.yxcorp.gifshow.ad.tachikoma.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import java.lang.Object;
import sx4.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$f implements g	// class@001807
{
    public final a b;
    public final PhotoAdvertisement$TkTemplateInfo c;
    public final q d;

    public void a$f(a p0,PhotoAdvertisement$TkTemplateInfo p1,q p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          this.b.k("form render\(\) method v8SoLoadEvent callback");
          boolean b = false;
          if (this.b.g(b)) {
             this.b.m(this.c, b, this.d);
          }else {
             this.b.l(this.c, this.d);
          }
       }
       return;
    }
}
