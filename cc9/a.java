package cc9.a;
import cc9.c;
import java.lang.String;
import java.util.List;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class a extends c	// class@000506
{
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final boolean g;

    public void a(String p0,String p1,boolean p2,List p3,boolean p4,boolean p5,int p6,u p7){
       if (p6 & 0x04) {
          p2 = false;
       }
       if (p6 & 0x08) {
          p3 = null;
       }
       if (p6 & 0x20) {
          p5 = false;
       }
       a.p(p0, "activityId");
       a.p(p1, "pCursor");
       super(10);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       return;
    }
    public final List b(){
       return this.e;
    }
}
