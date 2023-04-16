package fb2.c;
import fb2.i;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vw5.a;
import tw5.b;
import java.lang.System;
import fb2.h;
import android.net.Uri;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class c implements i	// class@002921
{
    public final NearbyGuideParam c;

    public void c(NearbyGuideParam p0){
       super();
       this.c = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       d.a(-680793205).T00().h(System.currentTimeMillis());
       return;
    }
    public long b(){
       return h.a(this);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       int i = -680793205;
       if (this.c.getUri() != null) {
          d.a(i).E8(this.c.getUri());
       }else if(this.c.getGuideType() != null){
          d.a(i).tx(this.c.getGuideType());
          d.a(i).T00().e();
       }
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c.getGuideType() == null) {
          return this.c.isLocalForceShowGuide();
       }
       boolean b = (this.c.isLocalForceShowGuide() && 2 == this.c.getLiveStreamSlidePolicy())? true: false;
       return b;
    }
    public String e(){
       return h.c(this);
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.c.getGuideType() != null && (this.c.isLocalForceShowGuide() && 1 == this.c.getLiveStreamSlidePolicy())) {
          b = true;
       }
    label_002f :
       return b;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       d.a(-680793205).T00().e();
       return;
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getGuideText();
    }
    public long i(){
       return h.b(this);
    }
}
