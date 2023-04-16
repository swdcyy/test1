package com.kwai.sharelib.a$h;
import erd.g;
import com.kwai.sharelib.a;
import java.lang.String;
import uo7.h0;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import uo7.k;
import uo7.d0;
import kotlin.jvm.internal.a;

public final class a$h implements g	// class@0016ab
{
    public final a b;
    public final String c;
    public final h0 d;

    public void a$h(a p0,String p1,h0 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          a g = this.b.g;
          ShareAnyResponse mShareAnyDat = p0.mShareAnyData;
          ShareAnyResponse$ShareAnyData shareAnyData = null;
          ShareAnyResponse$ShareAnyData mShareMethod = (mShareAnyDat != null)? mShareAnyDat.mShareMethod: shareAnyData;
          g.I(mShareMethod);
          g = this.b.g;
          mShareAnyDat = p0.mShareAnyData;
          if (mShareAnyDat != null) {
             shareAnyData = mShareAnyDat.mShareMode;
          }
          g.J(shareAnyData);
          this.b.g.H(p0);
          p0 = this.b;
          p0.g.G(p0.a.b(this.c));
          if (a.g(this.b.g.s(), "PICTURE")) {
             if (a.g(this.b.g.t(), "PICTURE_TOKEN")) {
                p0 = this.b;
                p0.g.F(p0.e(this.d));
             }else if(a.g(this.b.g.t(), "QR_CODE")){
                p0 = this.b;
                p0.g.F(p0.d(this.d));
             }
          }
       }
       return;
    }
}
