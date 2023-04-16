package pb6.b;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.network.keyconfig.degrade.DegradeConfig;
import com.kwai.framework.network.keyconfig.TimeRange;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import pb6.l;
import pb6.c;
import yb6.d;
import java.util.Objects;
import java.util.List;
import com.kwai.framework.network.keyconfig.degrade.ApiDegradePolicyWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Enum;

public final class b	// class@00218c
{
    public final ConcurrentHashMap a;
    public BaseConfig b;

    public void b(BaseConfig p0){
       a.p(p0, "baseConfig");
       super();
       this.b = p0;
       this.a = new ConcurrentHashMap();
    }
    public final boolean a(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.b.c().a().a(p0);
    }
    public final l b(String p0,RequestTiming p1){
       c uoc1;
       String str1;
       Object obj = this;
       Object obj1 = p0;
       c obj2 = p1;
       c uoc = c.class;
       l obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, b.class, "2");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       a.p(obj1, "path");
       a.p(obj2, "timing");
       obj3 = new l(false, "");
       long l = d.a();
       if (!obj.a(l)) {
          return obj3;
       }
       DegradeConfig uDegradeConf = obj.b.c();
       a.o(uDegradeConf, "baseConfig.degradeConfig");
       Objects.requireNonNull(uDegradeConf);
       Object[] objArray = null;
       String str = "1";
       ApiDegradePolicyWrapper uApiDegradeP = PatchProxy.apply(objArray, uDegradeConf, DegradeConfig.class, str);
       if (uApiDegradeP != PatchProxyResult.class) {
       }else if(uDegradeConf.mApiDegradePolicy == null){
          uDegradeConf.mApiDegradePolicy = new ApiDegradePolicyWrapper();
       }
       DegradeConfig mApiDegradeP = uDegradeConf.mApiDegradePolicy;
       if (mApiDegradeP.mAndroid == null) {
          mApiDegradeP.mAndroid = new ArrayList();
       }
       uApiDegradeP = uDegradeConf.mApiDegradePolicy.mAndroid;
       Iterator iterator = uApiDegradeP.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return obj3;
          }
          uoc1 = iterator.next();
          a.o(uoc1, "policy");
          Objects.requireNonNull(uoc1);
          c uoc2 = PatchProxy.apply(objArray, uoc1, uoc, str);
          if (uoc2 != PatchProxyResult.class) {
          }else if(uoc1.mPathList == null){
             uoc1.mPathList = new ArrayList();
          }
          uoc2 = uoc1.mPathList;
          if (uoc2.contains(obj1)) {
             uoc2 = PatchProxy.apply(objArray, uoc1, uoc, "2");
             if (uoc2 != PatchProxyResult.class) {
             }else if(uoc1.mTiming == null){
                uoc1.mTiming = new ArrayList();
             }
             uoc2 = uoc1.mTiming;
             if (uoc2.contains(p1.name())) {
                uoc2 = PatchProxy.apply(objArray, uoc1, uoc, "3");
                if (uoc2 != PatchProxyResult.class) {
                   str1 = str;
                }else if(uoc1.mApiDegradeTime == null){
                   str1 = str;
                   uoc1.mApiDegradeTime = new TimeRange(0, Long.MAX_VALUE);
                }else {
                   str1 = str;
                }
                uoc2 = uoc1.mApiDegradeTime;
                if (uoc2.a(l)) {
                   if (uoc1.mUserHint == null) {
                      uoc1.mUserHint = "";
                      break ;
                   }
                   break ;
                }else {
                label_0102 :
                   obj1 = p0;
                   str = str1;
                   objArray = null;
                }
             }
          }
          str1 = str;
          goto label_0102 ;
       }
       obj2 = uoc1.mUserHint;
       a.o(obj2, "policy.userHint");
       return new l(true, obj2);
    }
}
