package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$d;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import crd.b;
import lnc.b9;
import qp7.d;
import qp7.b;
import sr7.q;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;
import uw9.o;
import q87.c;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.common.information.username.a;

public final class UserNameElement$d implements g	// class@001463
{
    public final UserNameElement b;

    public void UserNameElement$d(UserNameElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       UserNameElement$d uod = UserNameElement$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uod, "1")) {
          b9.a(this.b.x);
          if (b) {
             b = this.b.C();
             b = (b != null)? b.p(): null;
             c.c(b, 8, 250);
             Object[] objArray = new Object[0];
             o.C().w("MerchantCommentShow", "MerchantCommentShow hide username", objArray);
          }else {
             b.x = t.timer(500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a(this));
             b = this.b;
             UserNameElement x = b.x;
             if (x != null) {
                b.j(x);
             }
          }
       }
       return;
    }
}
