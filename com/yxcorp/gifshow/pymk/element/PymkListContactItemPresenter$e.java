package com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$e;
import erd.g;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UsersResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import android.widget.TextView;
import n7c.e;

public final class PymkListContactItemPresenter$e implements g	// class@0016b8
{
    public final PymkListContactItemPresenter b;

    public void PymkListContactItemPresenter$e(PymkListContactItemPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkListContactItemPresenter$e.class, "1")) {
       }else {
          a.p(p0, "usersResponse");
          PymkListContactItemPresenter$e tb = this.b;
          int i = (p0.getItems() == null)? 0: p0.getItems().size();
          tb.q = i;
          i = this.b;
          PymkListContactItemPresenter q = i.q;
          i = i.v;
          if (i == null) {
             a.S("mNameTV");
          }
          PymkListContactItemPresenter w = this.b.w;
          if (w == null) {
             a.S("mDescTV");
          }
          e.d(q, i, w);
       }
       return;
    }
}
