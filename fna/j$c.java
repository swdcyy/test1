package fna.j$c;
import fna.j;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import fna.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class j$c extends j	// class@002981
{
    public final int b;
    public final int c;
    public final b d;
    public final b e;
    public final List f;

    public void j$c(GrowthCleanerService p0,int p1,int p2,b p3,b p4,List p5){
       a.p(p3, "leftCleanSize");
       a.p(p4, "totalCleanSize");
       a.p(p5, "cleanAppList");
       super(p0, null);
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final b b(){
       return this.d;
    }
    public final b c(){
       return this.e;
    }
}
