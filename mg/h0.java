package mg.h0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.feature.post.api.feature.bridge.JsPostBubbleParam;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import o07.o;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwai.feature.post.api.flywheel.widget.a;

public final class h0 implements PopupInterface$h	// class@002604
{
    public final JsPostBubbleParam b;

    public void h0(JsPostBubbleParam p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       a.p(p0, "popup");
       o.e(this, p0);
       View view = p0.z();
       if (view instanceof ViewGroup) {
          view = view.findViewById(R.id.text);
          if (view instanceof TextView) {
             a.b(view, this.b.mText);
          }
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
