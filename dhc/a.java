package dhc.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ehc.f;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;

public final class a extends PresenterV2	// class@0021c9
{
    public TextView p;
    public f q;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tp = this.p;
       if (tp == null) {
          a.S("title");
       }
       a tq = this.q;
       if (tq == null) {
          a.S("item");
       }
       tp.setText(tq.getTitle());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.group_title);
       a.o(p0, "ViewBindUtils.bindWidget¡­otView, R.id.group_title\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       Object obj = this.q8(f.class);
       a.o(obj, "inject\(SettingGroupTitleItem::class.java\)");
       this.q = obj;
       return;
    }
}
