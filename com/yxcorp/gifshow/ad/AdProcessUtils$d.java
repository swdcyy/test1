package com.yxcorp.gifshow.ad.AdProcessUtils$d;
import erd.g;
import java.lang.String;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import ekd.x0;
import vq4.d;
import n49.s;
import com.yxcorp.gifshow.ad.AdProcessUtils;

public final class AdProcessUtils$d implements g	// class@0014ee
{
    public final String b;
    public final AdDataWrapper c;

    public void AdProcessUtils$d(String p0,AdDataWrapper p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String scheme;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcessUtils$d.class, "1")) {
       }else {
          AdProcessUtils$d tb = this.b;
          tb = (tb == null || !tb.length())? 1: null;
          if (!tb) {
             Uri uri = x0.f(this.b);
             c f = p0.F;
             if (uri != null) {
                scheme = uri.getScheme();
                if (scheme != null) {
                label_0030 :
                   f.z2 = scheme;
                   f = p0.F;
                   String scheme1 = (uri != null)? uri.getScheme(): null;
                   f.t0 = s.j(scheme1);
                   p0.F.m = this.c.getEvocationType();
                   p0.F.z3 = (this.b).length();
                   p0.n3 = AdProcessUtils.d(this.c.getPackageName());
                }
             }
             scheme = "";
             goto label_0030 ;
          }
       }
       return;
    }
}
