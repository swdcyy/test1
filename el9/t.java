package el9.t;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.presenter.global.f;
import java.lang.Object;
import android.view.View;
import com.kwai.library.widget.popup.common.c;

public final class t implements View$OnClickListener	// class@002201
{
    public final f b;

    public void t(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       t tb = this.b;
       f v = tb.v;
       if (v != null) {
          v.o();
          tb.v = null;
       }
       return;
    }
}
