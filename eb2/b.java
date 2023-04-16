package eb2.b;
import tq5.a;
import eb2.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pm8.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import lnc.a1;
import cb2.w;
import java.lang.System;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import eb2.a;

public final class b implements a	// class@0026d6
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final int onBackPressed(){
       boolean b;
       b ta = this.a;
       Objects.requireNonNull(ta);
       d uod = d.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, ta, uod, "7");
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!DateUtils.H(a.a.getLong("liveWatchBottomGuideLastShownTimeMs", 0)) && ta.P8()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          if (!PatchProxy.applyVoid(objArray, ta, uod, "4")) {
             uod = ta.p;
             if (uod != null) {
                uod.d(5000, a1.p(R.string.arg_RES_7f102c88));
                a.H1(System.currentTimeMillis());
                a.a(ta.r.a(), 2, "BOTTOM_GUIDE");
             }
          }
       }else {
          i = 0;
       }
       return i;
    }
}
