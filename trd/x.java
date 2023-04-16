package trd.x;
import trd.w;
import java.util.List;
import java.lang.Object;
import java.util.Collections;
import java.util.Random;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Comparator;
import kotlin.NotImplementedError;
import nsd.u;
import msd.p;

public class x extends w	// class@00258f
{

    public void x(){
       super();
    }
    public static final void j0(List p0,Object p1){
       Collections.fill(p0, p1);
    }
    public static final void k0(List p0){
       Collections.shuffle(p0);
    }
    public static final void l0(List p0,Random p1){
       Collections.shuffle(p0, p1);
    }
    public static final void m0(List p0){
       a.p(p0, "$this$sort");
       if (p0.size() > 1) {
          Collections.sort(p0);
       }
       return;
    }
    public static final void n0(List p0,Comparator p1){
       throw new NotImplementedError(null, 1, null);
    }
    public static final void o0(List p0,p p1){
       throw new NotImplementedError(null, 1, null);
    }
    public static final void p0(List p0,Comparator p1){
       a.p(p0, "$this$sortWith");
       a.p(p1, "comparator");
       if (p0.size() > 1) {
          Collections.sort(p0, p1);
       }
       return;
    }
}
