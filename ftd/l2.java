package ftd.l2;
import ftd.z1;
import asd.a;
import kotlin.coroutines.CoroutineContext$b;
import msd.l;
import ftd.c1;
import ftd.m2;
import java.util.concurrent.CancellationException;
import java.lang.IllegalStateException;
import java.lang.String;
import ftd.s;
import ftd.q;
import java.lang.Throwable;
import ftd.z1$a;
import wsd.m;
import kotlin.sequences.SequencesKt__SequencesKt;
import otd.c;
import java.lang.UnsupportedOperationException;
import asd.c;
import java.lang.Object;

public final class l2 extends a implements z1	// class@000ea6
{
    public static final l2 b;

    static {
       l2.b = new l2();
    }
    public void l2(){
       super(z1.p0);
    }
    public static void u(){
    }
    public static void v(){
    }
    public static void x(){
    }
    public static void y(){
    }
    public boolean E(){
       return true;
    }
    public c1 L(boolean p0,boolean p1,l p2){
       return m2.b;
    }
    public CancellationException O(){
       throw new IllegalStateException("This job is always active");
    }
    public q Q(s p0){
       return m2.b;
    }
    public c1 S(l p0){
       return m2.b;
    }
    public boolean a(Throwable p0){
       return false;
    }
    public void b(CancellationException p0){
    }
    public boolean c(){
       return false;
    }
    public void cancel(){
       z1$a.a(this);
    }
    public m getChildren(){
       return SequencesKt__SequencesKt.j();
    }
    public boolean isCancelled(){
       return false;
    }
    public c o(){
       throw new UnsupportedOperationException("This job is always active");
    }
    public Object p(c p0){
       throw new UnsupportedOperationException("This job is always active");
    }
    public boolean start(){
       return false;
    }
    public String toString(){
       return "NonCancellable";
    }
    public z1 z(z1 p0){
       return z1$a.h(this, p0);
    }
}
