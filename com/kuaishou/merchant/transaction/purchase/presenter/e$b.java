package com.kuaishou.merchant.transaction.purchase.presenter.e$b;
import android.text.style.ClickableSpan;
import com.kuaishou.merchant.transaction.purchase.presenter.e;
import com.kuaishou.merchant.transaction.purchase.model.Agreement;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.basic.util.f;
import android.text.TextPaint;

public class e$b extends ClickableSpan	// class@000970
{
    public final Agreement b;
    public final e c;

    public void e$b(e p0,Agreement p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       Activity activity = this.c.getActivity();
       if (activity != null) {
          f.e(activity, this.b.mUrl);
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "2")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       return;
    }
}
