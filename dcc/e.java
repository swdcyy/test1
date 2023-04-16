package dcc.e;
import dcc.c;
import android.view.View;
import com.kwai.framework.model.user.User;
import dcc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.TextView;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import brd.w;
import dcc.e$a;
import erd.o;
import dcc.e$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Boolean;
import z1.a;

public final class e extends c	// class@002170
{
    public b f;
    public boolean g;
    public final User h;
    public final b i;

    public void e(View p0,User p1,b p2){
       a.p(p0, "itemView");
       a.p(p1, "user");
       a.p(p2, "callback");
       super(p0);
       this.h = p1;
       this.i = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       b a = this.i.a;
       if (a != null) {
          a.run();
       }
       this.b.setText(R.string.arg_RES_7f1010bb);
       this.b.setVisibility(0);
       this.d.setVisibility(0);
       this.f = t.merge(t.just(this.h), this.h.observable()).distinctUntilChanged(e$a.b).subscribe(new e$b(this), Functions.d());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       boolean b = true;
       this.g = b;
       b d = this.i.d;
       if (d != null) {
          d.accept(Boolean.valueOf((b ^ this.h.mFavorited)));
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       e tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       this.f = null;
       return;
    }
}
