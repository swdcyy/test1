package androidx.core.view.ViewKt$allViews$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import android.view.View;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import wsd.o;
import android.view.ViewGroup;
import wsd.m;
import androidx.core.view.ViewGroupKt;

public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements p	// class@000722
{
    public final View $this_allViews;
    public Object L$0;
    public int label;

    public void ViewKt$allViews$1(View p0,c p1){
       this.$this_allViews = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       ViewKt$allViews$1 uoallViews$1 = new ViewKt$allViews$1(this.$this_allViews, p1);
       uoallViews$1.L$0 = p0;
       return uoallViews$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ViewKt$allViews$1 tlabel = this.label;
       int i = 1;
       if (tlabel != null) {
          if (tlabel != i) {
             if (tlabel == 2) {
                j0.n(p0);
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$0;
             j0.n(p0);
          label_0037 :
             p0 = this.$this_allViews;
             if (p0 instanceof ViewGroup) {
                this.L$0 = 0;
                this.label = 2;
                if (tlabel.f(ViewGroupKt.c(p0), this) == obj) {
                   return obj;
                }
             }
          }
       }else {
          j0.n(p0);
          tlabel = this.L$0;
          this.L$0 = tlabel;
          this.label = i;
          if (tlabel.b(this.$this_allViews, this) == obj) {
             return obj;
          }else {
             goto label_0037 ;
          }
       }
       return l1.a;
    }
}
