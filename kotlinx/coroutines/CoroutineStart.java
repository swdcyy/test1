package kotlinx.coroutines.CoroutineStart;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import msd.l;
import asd.c;
import ftd.m0;
import kotlin.NoWhenBranchMatchedException;
import mtd.b;
import asd.e;
import mtd.a;
import msd.p;

public final class CoroutineStart extends Enum	// class@001cd3
{
    public static final CoroutineStart[] $VALUES;
    public static final CoroutineStart ATOMIC;
    public static final CoroutineStart DEFAULT;
    public static final CoroutineStart LAZY;
    public static final CoroutineStart UNDISPATCHED;

    static {
       CoroutineStart uCoroutineSt1;
       CoroutineStart[] uCoroutineSt = new CoroutineStart[]{uCoroutineSt1,uCoroutineSt1,uCoroutineSt1,uCoroutineSt1};
       uCoroutineSt1 = new CoroutineStart("DEFAULT", 0);
       CoroutineStart.DEFAULT = uCoroutineSt1;
       uCoroutineSt1 = new CoroutineStart("LAZY", 1);
       CoroutineStart.LAZY = uCoroutineSt1;
       uCoroutineSt1 = new CoroutineStart("ATOMIC", 2);
       CoroutineStart.ATOMIC = uCoroutineSt1;
       uCoroutineSt1 = new CoroutineStart("UNDISPATCHED", 3);
       CoroutineStart.UNDISPATCHED = uCoroutineSt1;
       CoroutineStart.$VALUES = uCoroutineSt;
    }
    public void CoroutineStart(String p0,int p1){
       super(p0, p1);
    }
    public static void isLazy$annotations(){
    }
    public static CoroutineStart valueOf(String p0){
       return Enum.valueOf(CoroutineStart.class, p0);
    }
    public static CoroutineStart[] values(){
       return CoroutineStart.$VALUES.clone();
    }
    public final void invoke(l p0,c p1){
       int i = m0.a[this.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   throw new NoWhenBranchMatchedException();
                }
             }else {
                b.a(p0, p1);
             }
          }else {
             e.h(p0, p1);
          }
       }else {
          a.c(p0, p1);
       }
       return;
    }
    public final void invoke(p p0,Object p1,c p2){
       int i = m0.b[this.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   throw new NoWhenBranchMatchedException();
                }
             }else {
                b.b(p0, p1, p2);
             }
          }else {
             e.i(p0, p1, p2);
          }
       }else {
          a.d(p0, p1, p2);
       }
       return;
    }
    public final boolean isLazy(){
       boolean b = (this == CoroutineStart.LAZY)? true: false;
       return b;
    }
}
