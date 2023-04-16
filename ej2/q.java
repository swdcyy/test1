package ej2.q;
import com.yxcorp.gifshow.widget.m;
import ej2.o;
import com.kuaishou.livestream.message.nano.LiveActivityPopup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.r1;
import t02.a0;
import ej2.w;

public class q extends m	// class@002738
{
    public final LiveActivityPopup c;
    public final o d;

    public void q(o p0,LiveActivityPopup p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       w.a(this.c, this.d.getContext(), null, this.d.r);
       return;
    }
}
