package fya.a;
import android.text.style.ClickableSpan;
import fya.b;
import com.kuaishou.android.model.mix.CashTag;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fya.b$b;
import cya.d;

public class a extends ClickableSpan	// class@002a54
{
    public final CashTag b;
    public final String c;
    public final b d;

    public void a(b p0,CashTag p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       b h = this.d.h;
       if (h != null && h.a(this.b, p0)) {
          this.d.h.b(this.b, p0);
          return;
       }else {
          d uod = new d(this.b.mLink, this.c);
          boolean b = true;
          uod.m(b);
          a td = this.d;
          uod.e(td.d, td.e);
          td = this.d;
          uod.d(td.f, td.g);
          if (this.b.mType == b) {
             uod.j(b);
          }
          uod.a(p0);
          h = this.d.h;
          if (h != null) {
             h.b(this.b, p0);
          }
          return;
       }
    }
}
