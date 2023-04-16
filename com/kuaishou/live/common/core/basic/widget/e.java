package com.kuaishou.live.common.core.basic.widget.e;
import erd.g;
import ya1.u;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ya1.u$a;
import ya1.n;
import android.view.View$OnClickListener;
import ya1.u$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import androidx.fragment.app.Fragment;
import crd.b;
import lnc.b9;

public final class e implements g	// class@000f3a
{
    public final u b;

    public void e(u p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (p0 == FragmentEvent.DETACH || p0 == FragmentEvent.DESTROY_VIEW) {
          b9.a(tb.a);
          tb.e.setOnClickListener(null);
          tb.e.setClickable(b);
       }else if(p0 == FragmentEvent.CREATE_VIEW && tb.c != null){
          if (!PatchProxy.applyVoid(null, tb, u.class, "7")) {
             View view = tb.e.findViewById(R.id.live_webview_wrap_close_button);
             if (tb.g.i == null) {
                b = 8;
             }
             view.setVisibility(b);
             if (tb.g.i != null) {
                view.setOnClickListener(new n(tb));
             }
          }
          tb.c.a();
          u$a b1 = tb.g.b;
          if (b1 instanceof GifshowActivity) {
             b1.F2(tb.l);
          }
       }
    label_005f :
       if (p0 != FragmentEvent.START || (!PatchProxy.applyVoid(null, tb, u.class, "8") && tb.g.l == null)) {
          p0 = tb.b;
          if (p0 != null) {
             p0 = p0.getView().findViewById(R.id.title_root);
             if (p0 != null) {
                p0.setVisibility(8);
             }
          }
       }
    label_0096 :
       return;
    }
}
