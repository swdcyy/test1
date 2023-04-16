package b56.i0;
import sc6.e;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.content.Context;
import android.view.View;
import i2b.a;
import android.view.View$OnClickListener;

public class i0 implements e	// class@000406
{
    public ViewGroup b;
    public View c;
    public View$OnClickListener d;
    public View$OnClickListener e;
    public View$OnClickListener f;
    public KwaiPlayerFailedStateView g;
    public boolean h;
    public boolean i;

    public void i0(ViewGroup p0){
       super();
       this.b = p0;
    }
    public void a(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "5")) {
          return;
       }
       if (this.c == null) {
          View view = a.d(this.b.getContext(), R.layout.arg_RES_7f0d1719, this.b, false);
          this.c = view;
          this.b.addView(view);
       }
       oi0 = this.c;
       if (oi0 != null) {
          if (p0) {
             oi0.setVisibility(false);
          }else {
             oi0.setVisibility(8);
          }
          this.c.setOnClickListener(this.e);
       }
       return;
    }
}
