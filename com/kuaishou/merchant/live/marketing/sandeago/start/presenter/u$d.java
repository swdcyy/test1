package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.u$d;
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

public class u$d extends u4	// class@001a94
{
    public final u b;

    public void u$d(u p0){
       this.b = p0;
       super();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(u$d.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, u$d.class, "1")) {
          return;
       }
       this.b.v.onNext(Boolean.TRUE);
       return;
    }
}
