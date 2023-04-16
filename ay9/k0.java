package ay9.k0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import gw8.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.y1;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import k2b.u1;

public class k0	// class@0002ff
{

    public void k0(){
       super();
    }
    public static void a(QPhoto p0,List p1,Map p2,BaseFragment p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, k0.class, "1")) {
          return;
       }
       if (!q.f(p1)) {
          ClientContent$ContentPackage uContentPack = w1.h(p0.mEntity);
          ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
          uContentPack.tagShowPackage = tagShowPacka;
          ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[p1.size()];
          tagShowPacka.tagPackage = p1.toArray(tagPackageAr);
          StringBuilder str = PatchProxy.applyOneRefs(p1, null, k0.class, "2");
          if (str != PatchProxyResult.class) {
          }else {
             str = "";
             int i = 0;
             while (i < p1.size()) {
                ActivityInfo uActivityInf = a.a(p1.get(i).name);
                if (uActivityInf != null && !TextUtils.x(uActivityInf.mKsOrderId)) {
                   if (str.length() > 0) {
                      str = str+",";
                   }
                   str = str+uActivityInf.mKsOrderId;
                }
                i = i + 1;
             }
             str = str;
          }
          if (!TextUtils.x(str) && p3.getPage() == 0x75d8) {
             ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
             ksOrderInfoP.ksOrderId = str;
             uContentPack.ksOrderInfoPackage = ksOrderInfoP;
          }
          ClientEvent$ElementPackage uElementPack = y1.a("showTag", 900, 12);
          if (!q.h(p2)) {
             i3 oi3 = i3.f();
             Iterator iterator = p2.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                oi3.d(key, uEntry.getValue());
             }
             uElementPack.params = oi3.e();
          }
          ShowMetaData showMetaData = new ShowMetaData().setType(3).setContentPackage(uContentPack).setElementPackage(uElementPack).setFeedLogCtx(p0.getFeedLogCtx());
          if (p3 != null) {
             showMetaData.setLogPage(p3);
          }
          u1.B0(showMetaData);
       }
       return;
    }
}
