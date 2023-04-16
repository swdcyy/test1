package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$d;
import android.text.style.ClickableSpan;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$d extends ClickableSpan	// class@000828
{
    public final SpannableStringBuilder b;
    public final i c;

    public void i$d(i p0,SpannableStringBuilder p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$d.class, "1")) {
          return;
       }
       this.c.n9(this.b);
       return;
    }
}
