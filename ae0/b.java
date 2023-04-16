package ae0.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import dd0.b;
import ld0.d;
import mf0.b;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM;
import mf0.a;
import id0.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import ae0.a;
import android.content.Context;
import java.lang.Runnable;
import qf0.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class b extends m	// class@000064
{
    public final TaskParamsV2 c;

    public void b(TaskParamsV2 p0){
       a.p(p0, "mTaskParamV2");
       super();
       this.c = p0;
    }
    public void a(View p0){
       boolean b;
       String mTaskComplet;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       Activity uActivity = n.d(p0);
       int i = 1;
       if (!this.b() && (!d.a().JF() && b.o(this.c))) {
          Activity uActivity1 = n.d(p0);
          if (uActivity1 instanceof FragmentActivity) {
             a.b(uActivity1).pendant2DoubleReport(i);
             return;
          }
       }
       b = false;
       if (b.m(this.c)) {
          Activity uActivity2 = n.d(p0);
          if (uActivity2 instanceof FragmentActivity) {
             d.b().b(this.c, b);
             a.b(uActivity2).pendant2NormalReport(this.c.getMWidgetStatus());
          }
          return;
       }else {
          a.o(uActivity, "context");
          if (!PatchProxy.applyVoidOneRefs(uActivity, this, b.class, "2")) {
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = null;
             Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
             uBooleanRef.element = i;
             if (this.b()) {
                mTaskComplet = this.c.getMTaskCompleteUrl();
                b uob = (mTaskComplet == null || !mTaskComplet.length())? 1: null;
                if (!uob) {
                   objectRef.element = this.c.getMTaskCompleteUrl();
                }
             }
             if (!this.b()) {
                mTaskComplet = this.c.getMTaskInProgressUrl();
                if (mTaskComplet != null && mTaskComplet.length()) {
                   i = 0;
                }
                if (!i) {
                   objectRef.element = this.c.getMTaskInProgressUrl();
                }
             }
             Ref$ObjectRef element = objectRef.element;
             if (element != null) {
                b.n(uActivity, element, new a(uActivity, objectRef, uBooleanRef));
             }
             d.b().b(this.c, uBooleanRef.element);
          }
          return;
       }
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.s(this.c);
    }
}
