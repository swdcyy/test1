package cl9.a2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ekd.m1;
import android.widget.TextView;
import android.text.TextPaint;
import nx9.c;
import android.content.Context;
import hl9.t;
import lnc.a1;

public final class a2 extends PresenterV2	// class@000605
{

    public void a2(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a2.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       TextView textView = m1.f(p0, R.id.folded_comment_header_title);
       if (textView != null) {
          TextPaint paint = textView.getPaint();
          if (paint != null) {
             paint.setFakeBoldText((c.c() ^ 0x01));
          }
       }
       if (c.c() || c.d()) {
          if (textView != null) {
             textView.setTextColor(a1.a(t.R8(this.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb)));
          }
       }else if(textView != null){
          textView.setTextColor(a1.a(t.R8(this.getContext(), R.color.arg_RES_7f0607d6, 0x7f0601b9)));
       }
       return;
    }
}
