package o81.a;
import android.view.View$OnClickListener;
import o81.b;
import android.view.View;
import h81.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h81.b;

public final class a implements View$OnClickListener	// class@0034a6
{
    public final b b;
    public final View c;
    public final e d;

    public void a(b p0,View p1,e p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       b b = tb.b;
       if (PatchProxy.applyVoidThreeRefs(tc, td, b, tb, b.class, "2")) {
       }else {
          td.a(tc, b);
       }
       return;
    }
}
