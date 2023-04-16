package cra.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.framework.kgi.sdk.Kgi;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigExtraItem;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;

public final class q	// class@00238a
{

    public static final boolean a(int p0){
       boolean b;
       Object obj3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Object obj = null;
       if (PatchProxy.isSupport(oq)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, oq, "2");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       Kgi kgi = Kgi.class;
       if (PatchProxy.isSupport(kgi)) {
          KgiConfig obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(2), Integer.valueOf(p0), obj, kgi, "9");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else {
          label_003f :
             obj2 = KgiConfig.class;
             if (PatchProxy.isSupport(obj2)) {
                obj3 = PatchProxy.applyTwoRefs(Integer.valueOf(2), Integer.valueOf(p0), obj, obj2, "18");
                if (obj3 != patchProxyRe) {
                   b = obj3.booleanValue();
                }
             }
             KgiConfig g = KgiConfig.g;
             if (g.f(2)) {
                KgiConfigItem kgiConfigIte = g.d();
                if (kgiConfigIte != null) {
                   kgiConfigIte = kgiConfigIte.channelConfigs;
                   if (kgiConfigIte != null) {
                      Iterator iterator = kgiConfigIte.iterator();
                      while (iterator.hasNext()) {
                         obj3 = iterator.next();
                         Object obj4 = obj3;
                         obj4 = (obj4 != null && obj4.channelId == 2)? 1: null;
                         if (obj4) {
                            obj = obj3;
                            break ;
                         }
                      }
                      if (obj != null) {
                         KgiChannelConfigItem extra = obj.extra;
                         if (extra != null) {
                            KgiChannelConfigExtraItem subChannels = extra.subChannels;
                            if (subChannels != null) {
                               String[] stringArray = new String[]{","};
                               List list = StringsKt__StringsKt.H4(subChannels, stringArray, false, 0, 6, null);
                               if (list != null && list.contains(String.valueOf(p0)) == true) {
                                  b = true;
                               }
                            }
                         }
                      }
                   }
                }
             }
          label_00b9 :
             b = false;
          }
       }else {
          goto label_003f ;
       }
       return b;
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return q.a(2);
    }
}
