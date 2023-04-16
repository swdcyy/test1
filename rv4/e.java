package rv4.e;
import java.lang.Runnable;
import com.kuaishou.romid.inlet.OaidHelper;
import android.content.Context;
import rv4.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import com.kuaishou.dfp.c.d;
import l30.l;
import l30.y;
import java.lang.CharSequence;
import android.text.TextUtils;

public class e implements Runnable	// class@0023c7
{
    public final Context b;
    public final a c;
    public final OaidHelper d;

    public void e(OaidHelper p0,Context p1,a p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 29 && !(this.b.getPackageName()).equals(d.b())) {
          l.c("call initOAID in diff proc");
          return;
       }else if(!d.D(this.d.mContext)){
          OaidHelper.OAID = this.d.mPre.q();
       }
       if (!TextUtils.isEmpty(OaidHelper.OAID) && !(OaidHelper.OAID).startsWith("KWE")) {
          this.d.releaseCountDownLatch();
       }
       this.d.oaidGetterImpl(this.b, this.c);
       this.d.doGetGms(false);
       return;
    }
}
