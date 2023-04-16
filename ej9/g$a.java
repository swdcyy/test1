package ej9.g$a;
import ej9.g;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.util.cdnresource.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import brd.t;
import ej9.e;
import erd.o;
import ej9.f;
import t45.d;
import brd.z;
import ej9.d;
import ej9.c;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;

public class g$a	// class@002167
{
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final k e;
    public final g f;
    public final boolean g;
    public boolean h;
    public int i;

    public void g$a(g p0,String p1,String p2,String p3,int p4,boolean p5){
       super();
       this.e = new k();
       this.i = 0;
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.g = p5;
       this.d = p4;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "2")) {
          return;
       }
       this.e.d(false);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       if (this.e.b()) {
          return;
       }
       this.i = 1;
       this.e.d(1);
       Log.d("FeedResourceManagerImpl", "startTask : task = "+this);
       t.just(this.b).flatMap(new e(this)).map(new f(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new d(this), new c(this));
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ResourceTask{mResourceId=\'"+this.a+'''+", mResourceUrl=\'"+this.b+'''+", mKsOrderId=\'"+this.c+'''+", mLikeBubblesDisplayType="+this.d+", mInQueue="+this.g+", mStatus="+this.i+'}';
    }
}
