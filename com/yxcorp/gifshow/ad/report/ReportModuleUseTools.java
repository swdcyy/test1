package com.yxcorp.gifshow.ad.report.ReportModuleUseTools;
import com.yxcorp.gifshow.ad.report.ReportModuleUseTools$mRuleMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.util.Set;
import lnc.y0;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.yxcorp.gifshow.ad.report.UtilzationSampleRule;
import f3b.s;
import java.util.HashSet;
import java.lang.StringBuilder;
import tkd.b;
import tkd.d;
import nl9.u;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import q35.c$a;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import q35.c;
import yx.j0;

public final class ReportModuleUseTools	// class@0017ab
{
    public static final p a;
    public static final ReportModuleUseTools b;

    static {
       ReportModuleUseTools.b = new ReportModuleUseTools();
       ReportModuleUseTools.a = s.c(ReportModuleUseTools$mRuleMap$2.INSTANCE);
    }
    public void ReportModuleUseTools(){
       super();
    }
    public static final void a(String p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ReportModuleUseTools.class, "5")) {
          return;
       }
       ReportModuleUseTools.c(p0, p1, null, false, null, 28, null);
       return;
    }
    public static final void b(String p0,QPhoto p1,Fragment p2,boolean p3,String p4){
       Fragment parentFragme;
       c$a uoa;
       ReportModuleUseTools reportModule = ReportModuleUseTools.class;
       Fragment uFragment = null;
       if (PatchProxy.isSupport(reportModule)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, uFragment, reportModule, "2")) {
             return;
          }
       }
       a.p(p0, "featureId");
       PhotoAdvertisement photoAdverti = k.B(p1);
       if (photoAdverti != null) {
          PhotoAdvertisement mModuleUseRa = photoAdverti.mModuleUseRateSet;
          Boolean uBoolean = (mModuleUseRa != null)? Boolean.valueOf(mModuleUseRa.contains(p0)): uFragment;
          if (!y0.p(uBoolean)) {
             ReportModuleUseTools b = ReportModuleUseTools.b;
             Objects.requireNonNull(b);
             Map map = PatchProxy.apply(uFragment, b, reportModule, "1");
             if (map == PatchProxyResult.class) {
                map = ReportModuleUseTools.a.getValue();
             }
             UtilzationSampleRule utilzationSa = map.get(p0);
             if (utilzationSa == null || (utilzationSa.getMSampleRatio() - null > 0 && s.c(utilzationSa.getMSampleRatio()))) {
                if (photoAdverti.mModuleUseRateSet == null) {
                   photoAdverti.mModuleUseRateSet = new HashSet();
                }
                photoAdverti.mModuleUseRateSet.add(p0);
                p0 = (p2 != null)? p2.getClass().getName(): "";
                if (p2 != null) {
                   uFragment = p2.getParentFragment();
                }
                if (uFragment != null) {
                   parentFragme = p2.getParentFragment();
                   a.m(parentFragme);
                   parentFragme = p0+"_"+parentFragme.getClass().getName();
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("feature_id", utilzationSa.getMName());
                jsonObject.a0("creative_id", Long.valueOf(photoAdverti.mCreativeId));
                jsonObject.a0("page_id", Long.valueOf(photoAdverti.mPageId));
                jsonObject.a0("sub_page_id", Long.valueOf(photoAdverti.mSubPageId));
                jsonObject.a0("source_type", Integer.valueOf(photoAdverti.mSourceType));
                jsonObject.a0("is_groot", Integer.valueOf(d.a(-1694791652).yq(p2)));
                jsonObject.a0("count", Integer.valueOf((int)((float)1 / utilzationSa.getMSampleRatio())));
                jsonObject.c0("feature_page", parentFragme);
                jsonObject.c0("ext_data", p4);
                if (p3) {
                   uoa = c$a.c();
                   uoa.e("ks_ad_module_utilization_rate_realtime");
                }else {
                   uoa = c$a.b();
                   uoa.e("ks_ad_module_utilization_rate");
                }
                uoa.d(BusinessType.OTHER);
                uoa.h("module_utilization_rate");
                uoa.f(jsonObject);
                j0.g(uoa.a());
             }
          }
       }
    label_0165 :
       return;
    }
    public static void c(String p0,QPhoto p1,Fragment p2,boolean p3,String p4,int p5,Object p6){
       if (p5 & 0x04) {
          p2 = null;
       }
       if (p5 & 0x08) {
          p3 = false;
       }
       ReportModuleUseTools.b(p0, p1, p2, p3, null);
       return;
    }
}
