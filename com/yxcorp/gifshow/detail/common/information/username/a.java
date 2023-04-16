package com.yxcorp.gifshow.detail.common.information.username.a;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$d;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.d;
import qp7.b;
import sr7.q;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;

public final class a implements g	// class@00146f
{
    public final UserNameElement$d b;

    public void a(UserNameElement$d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0 = this.b.b.C();
          p0 = (p0 != null)? p0.p(): null;
          c.c(p0, 0, 250);
       }
       return;
    }
}
