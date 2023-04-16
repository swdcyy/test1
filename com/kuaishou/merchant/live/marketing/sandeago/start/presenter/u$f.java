package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$f;
import tyc.u4;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import android.widget.EditText;

public class u$f extends u4	// class@001a96
{
    public final u b;

    public void u$f(u p0){
       this.b = p0;
       super();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(u$f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, u$f.class, "1")) {
          return;
       }
       this.b.v.onNext(Boolean.TRUE);
       u$f tb = this.b;
       tb.y.setText(String.valueOf(tb.p.updateTotalStock()));
       return;
    }
}
