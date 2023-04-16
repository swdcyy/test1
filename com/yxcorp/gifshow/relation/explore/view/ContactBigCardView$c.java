package com.yxcorp.gifshow.relation.explore.view.ContactBigCardView$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView;
import android.widget.TextView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ja;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import fac.b;
import io.reactivex.subjects.PublishSubject;

public class ContactBigCardView$c extends m	// class@001885
{
    public final TextView c;
    public final ContactBigCardView d;

    public void ContactBigCardView$c(ContactBigCardView p0,TextView p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactBigCardView$c.class, "1")) {
          return;
       }
       this.d.e("next");
       ja.a();
       ContactBigCardView$c td = this.d;
       td.d.g.onNext(td.c);
       this.c.setText(R.string.arg_RES_7f10256e);
       return;
    }
}
