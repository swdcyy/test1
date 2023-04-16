package rv4.g;
import rv4.a;
import com.kuaishou.romid.inlet.OaidHelper;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.System;
import l30.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import l30.y;

public class g implements a	// class@0023c9
{
    public final OaidHelper a;

    public void g(OaidHelper p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       String str = "KWE";
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       l.a("get oaid "+p0+" cost: "+(System.currentTimeMillis() - this.a.S_TIME));
       if (!TextUtils.isEmpty(p0)) {
          OaidHelper.OAID = p0;
       }
       this.a.releaseCountDownLatch();
       if (!TextUtils.isEmpty(OaidHelper.OAID) && !(OaidHelper.OAID).startsWith(str)) {
          OaidHelper mPre = this.a.mPre;
          mPre.m(OaidHelper.OAID);
       }
    label_0073 :
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.a.releaseCountDownLatch();
       if (!TextUtils.isEmpty(p0)) {
          l.c(p0);
       }
       return;
    }
}
