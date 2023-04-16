package k3a.z;
import j3a.b;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import j3a.b$a;
import j3a.a;
import com.yxcorp.gifshow.detail.player.panel.elements.TextElement;
import msd.a;
import qrd.l1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextPaint;
import k3a.y;
import android.view.View$OnClickListener;
import i2b.a;

public final class z implements b	// class@002bdd
{
    public View a;
    public TextView b;

    public void z(){
       super();
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, z.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return b$a.a(this, p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "3")) {
       }else {
          a.p(p0, "element");
          a uoa = p0.d();
          if (uoa != null) {
             l1 ol1 = uoa.invoke();
          }
          z tb = this.b;
          String str = "mTitle";
          if (tb == null) {
             a.S(str);
          }
          tb.setText(p0.e);
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          tb.setSelected(p0.g());
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          TextPaint paint = tb.getPaint();
          a.o(paint, "mTitle.paint");
          paint.setFakeBoldText(p0.g);
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          tb.setPadding(0, p0.h, 0, p0.i);
          tb = this.a;
          if (tb == null) {
             a.S("mContainer");
          }
          tb.setOnClickListener(new y(p0, 0, 500));
       }
       return;
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d001d);
       a.o(view, "KwaiLayoutInflater.infla¡­ility_panel_element_text\)");
       return view;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.a = p0;
       p0 = p0.findViewById(R.id.item_title);
       a.o(p0, "view.findViewById\(R.id.item_title\)");
       this.b = p0;
       return;
    }
}
