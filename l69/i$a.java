package l69.i$a;
import n3d.a;
import l69.i;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.app.Activity;

public final class i$a implements a	// class@002c9b
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, i$a.class, "1")) {
          return;
       }
       String str = "QCurrentUser.me\(\)";
       if (this.b.c != null) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, str);
          if (qCurrentUser.isLogined()) {
             i$a tb = this.b;
             Intent intent = b.a(0x66dce92a).a(tb.b, w0.f(tb.d));
             if (intent != null) {
                this.b.b.startActivity(intent);
             }
          }else if(this.b.c == null){
             qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, str);
             if (!qCurrentUser.isLogined()) {
                this.b.b.finish();
             }
          }
       }else {
          goto label_0053 ;
       }
       return;
    }
}
