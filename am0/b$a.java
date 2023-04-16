package am0.b$a;
import ml8.d;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;

public final class b$a implements d	// class@0000d3
{
    public ViewGroup b;
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;
    public View h;

    public void b$a(View p0){
       a.p(p0, "view");
       super();
       this.doBindView(p0);
    }
    public final ViewGroup a(){
       b$a obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mContent");
       }
       return obj;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "15")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.bell_card_icon);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.bell_card_icon\)");
       this.c = view;
       view = m1.f(p0, R.id.bell_card_title);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.bell_card_title\)");
       this.d = view;
       view = m1.f(p0, R.id.bell_card_arrow);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.bell_card_arrow\)");
       this.g = view;
       view = m1.f(p0, R.id.bell_card_content);
       a.o(view, "ViewBindUtils.bindWidget¡­, R.id.bell_card_content\)");
       this.b = view;
       view = m1.f(p0, R.id.bell_card_close);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.bell_card_close\)");
       this.h = view;
       view = m1.f(p0, R.id.bell_card_subtitle);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.bell_card_subtitle\)");
       this.e = view;
       p0 = m1.f(p0, R.id.bell_click_text);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew, R.id.bell_click_text\)");
       this.f = p0;
       return;
    }
}
