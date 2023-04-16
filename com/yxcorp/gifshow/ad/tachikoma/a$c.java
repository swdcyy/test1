package com.yxcorp.gifshow.ad.tachikoma.a$c;
import msd.a;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;

public final class a$c implements a	// class@001804
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public Object invoke(){
       String str = PatchProxy.apply(null, this, a$c.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a e = this.b.e;
          if (e != null) {
             str = e.getId();
             if (str == null) {
             }
          }else {
          }
       }
       return str;
    }
}
