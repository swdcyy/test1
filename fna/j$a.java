package fna.j$a;
import fna.j;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import fna.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class j$a extends j	// class@00297f
{
    public final int b;
    public final b c;
    public final b d;
    public final List e;

    public void j$a(GrowthCleanerService p0,int p1,b p2,b p3,List p4){
       a.p(p2, "leftCleanSize");
       a.p(p3, "totalCleanSize");
       a.p(p4, "cleanAppList");
       super(p0, null);
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final b b(){
       return this.c;
    }
    public final int c(){
       return this.b;
    }
    public final b d(){
       return this.d;
    }
}
