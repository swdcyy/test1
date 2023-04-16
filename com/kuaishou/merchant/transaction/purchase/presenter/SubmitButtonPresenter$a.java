package com.kuaishou.merchant.transaction.purchase.presenter.SubmitButtonPresenter$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.purchase.presenter.SubmitButtonPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.purchase.presenter.r$h;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$f;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;

public class SubmitButtonPresenter$a extends m	// class@00095b
{
    public final SubmitButtonPresenter c;

    public void SubmitButtonPresenter$a(SubmitButtonPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubmitButtonPresenter$a.class, "1")) {
          return;
       }
       this.c.q.submit();
       this.c.r.d();
       SubmitButtonPresenter$a tc = this.c;
       String str = (tc.w.getText() == null)? "": this.c.w.getText().toString();
       tc.P8(true, str);
       return;
    }
}
