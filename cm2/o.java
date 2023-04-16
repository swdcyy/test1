package cm2.o;
import erd.g;
import cm2.p;
import java.lang.Object;
import cm2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.widget.TextView;
import android.view.View;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import am2.a;

public final class o implements g	// class@000566
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       tb.C = p0;
       p0 = p.class;
       if (PatchProxy.applyVoid(null, tb, p0, "7")) {
       }else {
          p c = tb.C;
          if (c != null) {
             tb.I = c.c;
             a b = c.b;
             if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, p0, "12")) {
                p t = tb.t;
                int i = (b != null)? 0: 8;
                t.setVisibility(i);
             }
             if (tb.I != null) {
                b = tb.C.a;
                if (!PatchProxy.applyVoidOneRefs(b, tb, p0, "11")) {
                   tb.I = true;
                   tb.w.setVisibility(8);
                   tb.s.setVisibility(0);
                   tb.v.setVisibility(8);
                   tb.s.setText(a1.p(R.string.arg_RES_7f102e93));
                   tb.q.setVisibility(8);
                   tb.S8(b);
                   a.g(tb.y.a());
                }
             }else if(tb.C.d != null){
                tb.R8();
             }
             b = tb.C.a;
             if (!PatchProxy.applyVoidOneRefs(b, tb, p0, "10")) {
                tb.q.setVisibility(8);
                tb.S8(b);
             }
          }
       }
       return;
    }
}
