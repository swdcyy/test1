package com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ju4.d;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;

public class c$a extends m	// class@000900
{
    public final c c;

    public void c$a(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       d.i(this.c.getActivity(), "mtp_submit_order_action", null);
       c$a tc = this.c;
       String str = (tc.s.getText() == null)? "": this.c.s.getText().toString();
       tc.R8(true, str);
       return;
    }
}
