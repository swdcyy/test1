package ar7.h;
import com.yxcorp.gifshow.widget.m;
import ar7.j;
import kotlin.jvm.internal.Ref$ObjectRef;
import ar7.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import u07.t$a;
import u07.f;
import lnc.a1;
import java.lang.CharSequence;
import android.text.SpannableStringBuilder;
import ar7.h$a;
import u07.u;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class h extends m	// class@00034f
{
    public final j c;
    public final Ref$ObjectRef d;
    public final l e;

    public void h(j p0,Ref$ObjectRef p1,l p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       d uod = f.e(new d(uActivityCon.e()));
       uod.V0(true);
       uod.x0(17);
       uod.X0(a1.p(R.string.arg_RES_7f100674));
       uod.z0(a1.p(R.string.arg_RES_7f100676));
       uod.T0(this.d.element);
       uod.R0(a1.p(R.string.arg_RES_7f10066a));
       uod.u0(new h$a(this));
       uod.X();
       return;
    }
}
