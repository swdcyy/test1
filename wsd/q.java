package wsd.q;
import java.lang.Object;
import msd.p;
import java.util.Iterator;
import wsd.m;
import wsd.q$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import wsd.n;
import asd.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import wsd.q$b;

public class q	// class@002943
{

    public void q(){
       super();
    }
    public static void a(){
    }
    public static final Iterator b(p p0){
       return q.d(p0);
    }
    public static final m c(p p0){
       return new q$a(p0);
    }
    public static final Iterator d(p p0){
       a.p(p0, "block");
       n on = new n();
       on.j(IntrinsicsKt__IntrinsicsJvmKt.c(p0, on, on));
       return on;
    }
    public static final m e(p p0){
       a.p(p0, "block");
       return new q$b(p0);
    }
}
