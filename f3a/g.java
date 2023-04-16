package f3a.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import f3a.g$a;
import android.view.View$OnClickListener;
import java.lang.Integer;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import java.lang.Boolean;
import java.util.Map;
import android.content.Context;
import ekd.r;
import ekd.m1;
import java.lang.Number;

public final class g extends PresenterV2	// class@002281
{
    public TextView p;
    public String q;
    public View r;
    public ObservableMap s;
    public int t;
    public String u;

    public void g(){
       super();
       this.u = "";
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       g tp = this.p;
       if (tp == null) {
          a.S("mText");
       }
       tp.setText(this.q);
       this.m8().setOnClickListener(new g$a(this));
       tp = this.s;
       if (tp == null) {
          a.S("mChooseText");
       }
       this.P8(tp.containsKey(Integer.valueOf(this.t)));
       return;
    }
    public final void P8(boolean p0){
       g tr;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "4")) {
          return;
       }
       String str = "mChooseText";
       if (p0) {
          tr = this.r;
          if (tr != null) {
             tr.setVisibility(0);
          }
          tr = this.s;
          if (tr == null) {
             a.S(str);
          }
          if (!tr.containsKey(Integer.valueOf(this.t))) {
             tr = this.s;
             if (tr == null) {
                a.S(str);
             }
             tr.put(Integer.valueOf(this.t), this.q);
          }
          this.m8().setBackgroundColor(r.b(this.getContext(), R.color.arg_RES_7f061bf4));
       }else {
          tr = this.r;
          if (tr != null) {
             tr.setVisibility(4);
          }
          tr = this.s;
          if (tr == null) {
             a.S(str);
          }
          tr.remove(Integer.valueOf(this.t));
          this.m8().setBackgroundColor(r.b(this.getContext(), R.color.arg_RES_7f061994));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.ocr_item_text);
       a.o(view, "ViewBindUtils.bindWidget¡­View, R.id.ocr_item_text\)");
       this.p = view;
       this.r = m1.f(p0, 0x7f0a2e95);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.q8(String.class);
       Object obj = this.r8("OCR_SELECTED_ITEMS");
       a.o(obj, "inject\(AccessIds.OCR_SELECTED_ITEMS\)");
       this.s = obj;
       obj = this.r8("ADAPTER_POSITION");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION\)");
       this.t = obj.intValue();
       return;
    }
}
