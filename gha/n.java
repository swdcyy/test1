package gha.n;
import gha.p$a;
import com.yxcorp.gifshow.model.FollowTabNotify;
import pr6.d;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gha.p;
import com.kwai.robust.PatchProxyResult;
import uh5.e;
import on5.b;
import co5.i$b;
import co5.i;
import com.kwai.kcube.TabIdentifier;
import ro5.c0;
import com.yxcorp.gifshow.util.rx.RxBus;
import lha.a;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;

public class n implements p$a	// class@002ade
{
    public final FollowTabNotify a;
    public final d b;

    public void n(FollowTabNotify p0,d p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(Bitmap p0){
       i$b uob;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       n ta = this.a;
       int[] ointArray = PatchProxy.applyOneRefs(ta, null, p.class, "5");
       if (ointArray != PatchProxyResult.class) {
       }else {
          ointArray = new int[2];
          uob = -9;
          if (e.f()) {
             if (ta.mType == 1) {
                ointArray[0] = -10;
                ointArray[1] = -1;
             }else {
                ointArray[0] = uob;
             }
          }else if(ta.mType == 1){
             i = -5;
             ointArray[0] = i;
             ointArray[1] = i;
          }else {
             ointArray[0] = uob;
          }
       }
       uob = i.a();
       uob.b = ointArray;
       uob.a = p0;
       c0.I(this.b, b.c, uob);
       RxBus.f.b(a.b);
       c.i(KsLogFollowTag.FOLLOW_NOTIFY.appendTag("FollowTabNotify"), "set trans bitmap");
       return;
    }
    public void b(){
    }
}
