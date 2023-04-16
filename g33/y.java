package g33.y;
import os5.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import os5.l;
import tkd.b;
import tkd.d;
import os5.c;
import os5.e;
import os5.h;
import fs5.a;
import nl9.b0;
import os5.q;
import os5.d;
import oq3.a;
import i33.d;
import r33.d;
import os5.k;
import q33.a;
import fs3.g;
import gs4.i;
import bu4.a;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public class y implements p	// class@002a63
{

    public void y(){
       super();
    }
    public Object IP(Class p0){
       b uob;
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == l.class) {
          uob = d.a(-1492894991);
       }else if(p0 == c.class){
          uob = d.a(0x4fb7d1af);
       }else if(p0 == e.class){
          uob = d.a(-1835681758);
       }else if(p0 == h.class){
          uob = d.a(0x2cb5d4a8);
       }else if(p0 == a.class){
          uob = d.a(-1397441499);
       }else if(p0 == b0.class){
          uob = d.a(0x37593069);
       }else if(p0 == q.class){
          uob = d.a(-905363791);
       }else if(p0 == d.class){
          uob = d.a(-2004767397);
       }else if(p0 == a.class){
          uob = d.a(0x7b1b2208);
       }else if(p0 == d.class){
          uob = d.a(-402785480);
       }else if(p0 == d.class){
          uob = d.a(-300042430);
       }else if(p0 == k.class){
          uob = d.a(-129360148);
       }else if(p0 == a.class){
          uob = d.a(0x4fc10e66);
       }else if(p0 == g.class){
          uob = d.a(-1695065466);
       }else if(p0 == i.class){
          uob = d.a(0x330ddec);
       }else if(p0 == a.class){
          uob = d.a(0x13be0446);
       }else {
          throw new RuntimeException("not a support plugin: "+p0);
       }
       return uob;
    }
    public boolean isAvailable(){
       return true;
    }
}
