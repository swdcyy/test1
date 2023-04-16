package gx9.m$a;
import androidx.viewpager.widget.ViewPager$l;
import gx9.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.component.tabs.panel.h;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.Pair;
import qrd.r0;
import f9a.b;
import java.util.Map;
import trd.t0;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.e0;
import k2b.u1;

public final class m$a extends ViewPager$l	// class@0024ff
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       ClientEvent$ElementPackage uElementPack;
       Object obj = this;
       m$a uoa = m$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uoa, "1")) {
          return;
       }
       m s = obj.b.s;
       if (s == null) {
          a.S("mDetailPanelPageParamsBundles");
       }
       h oh = s.get(p0);
       Activity activity = obj.b.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = null;
       }
       if (activity != null) {
          m p = obj.b.p;
          if (p == null) {
             a.S("mPhoto");
          }
          Pair[] pairArray = new Pair[]{r0.a("card_tab", oh.g())};
          if (!PatchProxy.applyVoidFourRefs(activity, p, "AGGREGATION_AREA_CARD_TAB", pairArray, null, b.class, "16")) {
             String str = "$this$logClickEvent";
             a.p(activity, str);
             a.p(p, "photo");
             a.p("AGGREGATION_AREA_CARD_TAB", "action2");
             a.p(pairArray, "attrs");
             Map map = t0.H0(pairArray);
             b uob = b.class;
             String str1 = "attrs";
             String str2 = "action2";
             if (!PatchProxy.applyVoidFourRefs(activity, p, "AGGREGATION_AREA_CARD_TAB", map, 0, b.class, "17")) {
                a.p(activity, str);
                a.p(p, "photo");
                a.p("AGGREGATION_AREA_CARD_TAB", str2);
                a.p(map, str1);
                ClickMetaData uClickMetaDa = new ClickMetaData();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = w1.f(p.mEntity);
                uClickMetaDa.setContentPackage(uContentPack);
                if (PatchProxy.isSupport(uob)) {
                   uElementPack = PatchProxy.applyThreeRefs("AGGREGATION_AREA_CARD_TAB", Integer.valueOf(1), map, null, b.class, "1");
                   if (uElementPack != PatchProxyResult.class) {
                   label_012a :
                      uClickMetaDa.setElementPackage(uElementPack);
                      uClickMetaDa.setFeedLogCtx(p.getFeedLogCtx());
                      CommonParams uCommonParam = a.b(p);
                      if (!PatchProxy.applyVoidThreeRefsWithListener(activity, uClickMetaDa, uCommonParam, null, b.class, "20")) {
                         a.p(activity, "$this$logEvent");
                         a.p(uClickMetaDa, "clickMetaData");
                         uClickMetaDa.setContentWrapper(activity.ye());
                         uClickMetaDa.setCommonParams(uCommonParam);
                         uClickMetaDa.setLogPage(activity);
                         uClickMetaDa.setIsRealTime(false);
                         u1.B(uClickMetaDa);
                         PatchProxy.onMethodExit(uob, "20");
                      }
                   }
                }
                a.p("AGGREGATION_AREA_CARD_TAB", "name");
                a.p(map, str1);
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "AGGREGATION_AREA_CARD_TAB";
                uElementPack.type = 1;
                i3 oi3 = i3.f();
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   String value = uEntry.getValue();
                   if (value != null) {
                      value = value.toString();
                      if (value != null) {
                      label_011e :
                         oi3.d(key, value);
                      }
                   }
                   value = "";
                   goto label_011e ;
                }
                uElementPack.params = oi3.e();
                goto label_012a ;
             }
          }
       }
    label_016e :
       return;
    }
}
