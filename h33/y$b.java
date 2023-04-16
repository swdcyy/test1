package h33.y$b;
import sfc.a;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import oe6.e;
import ok.h;
import com.kwai.framework.model.user.QCurrentUser;

public class y$b extends a	// class@002c35
{
    public final SlipSwitchButton c;
    public final y d;

    public void y$b(y p0,SlipSwitchButton p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$b.class, "1")) {
          return;
       }
       if (!this.d.e()) {
          super.b(p0);
          this.d.f(this.c);
       }else {
          e.q0(System.currentTimeMillis());
          y c = this.d.c;
          if (c != null) {
             c.apply(null);
          }else {
             QCurrentUser.ME.setNotRecommendToContacts(true).commitChanges();
          }
       }
       return;
    }
}
