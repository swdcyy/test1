package com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$a$a;
import n3d.a;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter;

public final class PymkListContactItemPresenter$a$a implements a	// class@0016b3
{
    public final PymkListContactItemPresenter$a b;

    public void PymkListContactItemPresenter$a$a(PymkListContactItemPresenter$a p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport2(PymkListContactItemPresenter$a$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PymkListContactItemPresenter$a$a.class, "1")) {
          return;
       }
       if (p2 != null) {
          p0.q = p2.getIntExtra("contactsCount", 0);
       }
       this.b.c.W8();
       this.b.c.X8();
       PatchProxy.onMethodExit(PymkListContactItemPresenter$a$a.class, "1");
       return;
    }
}
