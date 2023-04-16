package k3a.b;
import j3a.b;
import java.lang.Object;
import k3a.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.a;
import j3a.a;
import qrd.l1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import k3a.b$a;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import j3a.b$a;
import i2b.a;

public final class b implements b	// class@002bc4
{
    public View a;
    public TextView b;
    public ImageView c;

    public void b(){
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       a.p(p0, "element");
       a uoa = p0.d();
       if (uoa != null) {
          l1 ol1 = uoa.invoke();
       }
       b tb = this.b;
       String str = "text";
       if (tb == null) {
          a.S(str);
       }
       tb.setText(p0.g);
       tb = this.b;
       if (tb == null) {
          a.S(str);
       }
       tb.setSelected(p0.g());
       tb = this.b;
       if (tb == null) {
          a.S(str);
       }
       tb.setEnabled(p0.b());
       tb = this.c;
       str = "icon";
       if (tb == null) {
          a.S(str);
       }
       tb.setImageDrawable(p0.h);
       tb = this.c;
       if (tb == null) {
          a.S(str);
       }
       tb.setSelected(p0.g());
       tb = this.c;
       if (tb == null) {
          a.S(str);
       }
       tb.setEnabled(p0.b());
       tb = this.a;
       if (tb == null) {
          a.S("container");
       }
       b$a uoa1 = new b$a(this, p0, false, 500);
       tb.setOnClickListener(str);
       return;
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return b$a.a(this, p0);
    }
    public void c(a p0){
       this.a(p0);
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d1162);
       a.o(view, "KwaiLayoutInflater.infla¡­yer_panel_element_action\)");
       return view;
    }
    public void k(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.p(p0, "view");
       this.a = p0;
       view = p0.findViewById(R.id.text);
       a.o(view, "view.findViewById\(R.id.text\)");
       this.b = view;
       p0 = p0.findViewById(R.id.icon);
       a.o(p0, "view.findViewById\(R.id.icon\)");
       this.c = p0;
       return;
    }
}
