package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.android.live.log.b;
import uz0.p;
import java.util.Objects;

public class a$b extends m	// class@000b45
{
    public final a c;

    public void a$b(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       a b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a$b tc = this.c;
       b.S(tc.a, "LiveAudienceGiftBoxHandleView onClick", "handleType", Integer.valueOf(tc.b));
       tc = this.c;
       b = tc.b;
       if (b != 1) {
          if (b != 2) {
             if (b == 3) {
                tc.e.d();
             }
          }else {
             tc.e.c();
          }
       }else {
          tc.e.e();
          Objects.requireNonNull(this.c.d);
       }
       return;
    }
}
