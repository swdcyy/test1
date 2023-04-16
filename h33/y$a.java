package h33.y$a;
import erd.g;
import h33.y;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import oe6.e;
import ok.h;
import com.kwai.framework.model.user.QCurrentUser;

public class y$a implements g	// class@002c34
{
    public final y b;

    public void y$a(y p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$a.class, "1")) {
       }else {
          e.q0(System.currentTimeMillis());
          p0 = this.b.c;
          if (p0 != null) {
             p0.apply(null);
          }else {
             QCurrentUser.ME.setNotRecommendToContacts(true).commitChanges();
          }
       }
       return;
    }
}
