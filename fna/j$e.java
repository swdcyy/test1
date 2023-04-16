package fna.j$e;
import fna.j;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import fna.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class j$e extends j	// class@002983
{
    public final int b;
    public final b c;
    public final List d;

    public void j$e(GrowthCleanerService p0,int p1,b p2,List p3){
       a.p(p2, "appSize");
       a.p(p3, "appList");
       super(p0, null);
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final List b(){
       return this.d;
    }
    public final b c(){
       return this.c;
    }
}
