package cy2.h$a$a;
import u71.c;
import com.kuaishou.live.basic.model.CheckResolutionResponse;
import u71.d;
import java.lang.Object;
import u71.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import h02.b;
import u71.c$a;

public final class h$a$a implements c	// class@002403
{
    public final boolean a;
    public final CheckResolutionResponse b;
    public final d c;

    public void h$a$a(boolean p0,CheckResolutionResponse p1,d p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean a(){
       return b.d(this);
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, h$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(-204054297).Sq();
    }
    public boolean c(){
       return b.k(this);
    }
    public String d(){
       return b.f(this);
    }
    public c$a e(){
       return b.h(this);
    }
    public boolean f(){
       return b.a(this);
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, h$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(-204054297).tZ();
    }
    public int getFps(){
       return this.b.mFps;
    }
    public String getLiveStreamId(){
       return b.i(this);
    }
    public d getResolution(){
       return this.c;
    }
    public boolean h(){
       return b.e(this);
    }
    public boolean i(){
       return this.a;
    }
}
