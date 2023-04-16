package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$e;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import java.util.List;
import e17.i;
import android.widget.LinearLayout;
import java.lang.CharSequence;
import android.widget.EditText;

public class u$e extends m	// class@001a95
{
    public final View c;
    public final u d;

    public void u$e(u p0,View p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$e.class, "1")) {
          return;
       }
       if (this.d.p.mMultiSkuList.size() <= 2) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10436a);
          return;
       }else {
          this.d.p.mMultiSkuList.remove(this.c.getTag());
          this.d.z.removeView(this.c);
          u$e td = this.d;
          td.y.setText(String.valueOf(td.p.updateTotalStock()));
          return;
       }
    }
}
