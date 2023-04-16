package androidx.core.view.ViewGroupKt$descendants$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import android.view.ViewGroup;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import wsd.o;
import qrd.j0;
import java.lang.IllegalStateException;
import android.view.View;
import wsd.m;
import androidx.core.view.ViewGroupKt;

public final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements p	// class@00071f
{
    public final ViewGroup $this_descendants;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    public void ViewGroupKt$descendants$1(ViewGroup p0,c p1){
       this.$this_descendants = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       ViewGroupKt$descendants$1 uodescendant = new ViewGroupKt$descendants$1(this.$this_descendants, p1);
       uodescendant.L$0 = p0;
       return uodescendant;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ViewGroupKt$descendants$1 tL$1;
       ViewGroupKt$descendants$1 tL$0;
       int i;
       c uoc;
       int i1;
       ViewGroupKt$descendants$1 uodescendant;
       int i2;
       View view;
       Object obj = b.h();
       ViewGroupKt$descendants$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel == 2) {
                tlabel = this.I$1;
                ViewGroupKt$descendants$1 tI$0 = this.I$0;
                tL$1 = this.L$1;
                tL$0 = this.L$0;
                j0.n(p0);
                i = this;
             label_0090 :
                uoc = i;
                i = tL$0;
                tL$1 = tlabel;
                tlabel = tL$1;
             label_009b :
                i1 = tI$0 + 1;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             i2 = this.I$1;
             i1 = this.I$0;
             view = this.L$2;
             tL$0 = this.L$1;
             uodescendant = this.L$0;
             j0.n(p0);
             p0 = this;
          label_0070 :
             if (view instanceof ViewGroup) {
                i.L$0 = uodescendant;
                i.L$1 = tL$0;
                i.L$2 = null;
                i.I$0 = i1;
                i.I$1 = i2;
                i.label = 2;
                if (uodescendant.f(ViewGroupKt.c(view), i) == obj) {
                   return obj;
                }else {
                   tL$1 = tL$0;
                   tL$0 = uodescendant;
                   goto label_0090 ;
                }
             }else {
                tL$1 = i2;
                tlabel = tL$0;
                uoc = i;
                i = uodescendant;
                goto label_009b ;
             }
          }
       }else {
          j0.n(p0);
          p0 = this.L$0;
          tlabel = this.$this_descendants;
          i1 = 0;
          int childCount = tlabel.getChildCount();
          uoc = this;
       }
       if (i1 < tL$1) {
          View childAt = tlabel.getChildAt(i1);
          a.o(childAt, "getChildAt\(index\)");
          uoc.L$0 = i;
          uoc.L$1 = tlabel;
          uoc.L$2 = childAt;
          uoc.I$0 = i1;
          uoc.I$1 = tL$1;
          uoc.label = 1;
          if (i.b(childAt, uoc) == obj) {
             return obj;
          }else {
             uodescendant = i;
             i = uoc;
             tL$0 = tlabel;
             i2 = tL$1;
             view = childAt;
             goto label_0070 ;
          }
       }else {
          return l1.a;
       }
    }
}
