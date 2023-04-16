package gna.b$d;
import gna.b$a;
import java.lang.String;
import android.graphics.drawable.Drawable;
import msd.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import gna.d$b;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderKt;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gna.b;

public final class b$d extends b$a	// class@002b2a
{
    public final int q;

    public void b$d(String p0,String p1,String p2,Drawable p3,l p4){
       a.p(p0, "title");
       super(p0, p1, p2, p3, p4);
       this.q = GrowthCleanerViewHolderKt.b(m0.d(d$b.class));
    }
    public int c(){
       return this.q;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof b$d && a.g(p0.i(), this.i()))? true: false;
       return b;
    }
}
