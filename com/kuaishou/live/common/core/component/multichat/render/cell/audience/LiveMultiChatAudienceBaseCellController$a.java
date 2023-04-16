package com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import zp1.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yp1.b;
import zp1.c;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Map;
import kotlin.jvm.internal.a;
import yp1.a;
import zp1.q$f;
import zp1.q;
import zp1.q$i;

public final class LiveMultiChatAudienceBaseCellController$a implements View$OnClickListener	// class@0014dc
{
    public final LiveMultiChatAudienceBaseCellController b;
    public final m c;

    public void LiveMultiChatAudienceBaseCellController$a(LiveMultiChatAudienceBaseCellController p0,m p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       Boolean value;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController$a.class, "1")) {
          return;
       }
       LiveMultiChatAudienceBaseCellController$a tb = this.b;
       if (tb.L.k(tb.K)) {
          String str = "it1";
          if (this.b.y3()) {
             value = this.c.y0().getValue();
             if (value != null) {
                LiveMultiChatAudienceBaseCellController$a tb1 = this.b;
                a.o(value, str);
                a.d(this.b.L.d(), this.b.L.f(), tb1.L.e(tb1.K), value.booleanValue(), this.b.z3(), this.b.K);
             }
          }else {
             value = this.c.y0().getValue();
             if (value != null) {
                a.o(value, str);
                a.g(this.b.L.d(), this.b.L.f(), value.booleanValue(), this.b.z3(), this.b.K);
             }
          }
          this.c.x0(q$f.a);
       }else {
          this.c.x0(q$i.a);
       }
       return;
    }
}
