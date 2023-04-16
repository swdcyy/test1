package gg9.u;
import erd.g;
import com.yxcorp.gifshow.camera.record.permission.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import android.app.Activity;
import java.lang.String;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class u implements g	// class@002487
{
    public final c b;
    public final boolean c;
    public final boolean d;

    public void u(c p0,boolean p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       u tb = this.b;
       u tc = this.c;
       u td = this.d;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          boolean b = PermissionUtils.l(tb.l, "android.permission.CAMERA");
          boolean b1 = PermissionUtils.l(tb.l, "android.permission.RECORD_AUDIO");
          if (tc == null || (td == null && (!b || !b1))) {
             String[] stringArray = new String[]{"android.permission.CAMERA","android.permission.RECORD_AUDIO"};
             PermissionUtils.n(tb.l, stringArray);
          }
       }
       tb.d(false, false);
       return;
    }
}
