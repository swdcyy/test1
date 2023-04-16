package tk7.i;
import erd.g;
import java.lang.Object;
import l97.b;
import tk7.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import wk7.f;
import com.kwai.privacykit.config.PrivacyConfig;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.kwai.privacykit.config.PrivacyPolicy;
import com.kwai.privacykit.config.PrivacyPolicy$Frequency;
import java.lang.System;
import uk7.b;

public final class i implements g	// class@00254d
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, oj, "10")) {
       }else {
          f.a("PrivacyManager", "dispatchAppLifeEvent: "+p0.a());
          if ((p0.a()).equals("ON_START")) {
             if (!PatchProxy.applyVoid(null, null, oj, "39")) {
                p0 = j.d;
                if (p0.h() != null) {
                   p0 = p0.h();
                   Objects.requireNonNull(p0);
                   if (!PatchProxy.applyVoid(null, p0, PrivacyConfig.class, "3")) {
                      p0 = p0.mPrivacyPolicies;
                      if (p0 != null) {
                         p0 = p0.iterator();
                         while (p0.hasNext()) {
                            PrivacyPolicy privacyPolic = p0.next();
                            if (privacyPolic == null || PatchProxy.applyVoid(null, privacyPolic, PrivacyPolicy.class, "8")) {
                               continue ;
                            }else {
                               PrivacyPolicy mFrequency = privacyPolic.mFrequency;
                               if (mFrequency != null && ("launch").equals(mFrequency.mUnit)) {
                                  b.e(privacyPolic.mPermission, System.currentTimeMillis());
                                  b.g(privacyPolic.mPermission, 0);
                               }
                            }
                         }
                      }
                   }
                }
             }
             j.o(true);
          }else if((p0.a()).equals("ON_STOP")){
             j.o(0);
          }
       }
       return;
    }
}
