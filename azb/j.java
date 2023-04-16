package azb.j;
import erd.g;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.util.List;
import java.lang.String;
import r26.a;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.JsonElement;
import m46.a;
import com.google.gson.Gson;
import o36.g;
import java.util.Collection;
import java.lang.Number;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import qrd.l1;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import pm6.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.p3;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.n;
import elb.d0;
import azb.e;
import w16.k;

public final class j implements g	// class@000375
{
    public final UploadInfo b;
    public final List c;
    public final String d;
    public final a e;

    public void j(UploadInfo p0,List p1,String p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       j tb;
       UploadInfo mPublishedGu1;
       Integer integer;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          p0 = a.a.c(p0.e0("data"), a.class);
          String str = "GrowthUploadEnaActionRepo";
          String str1 = null;
          int i = 0;
          if (g.a && (p0 != null && p0.c() == 1)) {
             if (p0.b() != Integer.MIN_VALUE) {
                this.b.mTaskType = p0.b();
             }else if(this.c.isEmpty() ^ 1){
                this.b.mTaskType = this.c.get(i).intValue();
             }
             List list = p0.a();
             if (list != null && (list.isEmpty() ^ 1) == 1) {
                UploadInfo mPublishedGu = this.b.mPublishedGuideCfgMap;
                if (mPublishedGu != null) {
                   mPublishedGu.clear();
                }
                tb = this.b;
                mPublishedGu1 = tb.mPublishedGuideCfgMap;
                if (mPublishedGu1 == null) {
                   mPublishedGu1 = new LinkedHashMap();
                }
                List list1 = p0.a();
                a.m(list1);
                mPublishedGu1.put(Integer.valueOf(this.b.mTaskType), list1.get(i));
                tb.mPublishedGuideCfgMap = mPublishedGu1;
             }else {
                tb = this.b;
                mPublishedGu1 = tb.mPublishedGuideCfgMap;
                GrowthGuideItemConfig growthGuideI = (mPublishedGu1 != null)? mPublishedGu1.get(Integer.valueOf(tb.mTaskType)): str1;
                mPublishedGu1 = this.b.mPublishedGuideCfgMap;
                if (mPublishedGu1 != null) {
                   mPublishedGu1.clear();
                }
                if (growthGuideI != null) {
                   j tb1 = this.b;
                   UploadInfo mPublishedGu2 = tb1.mPublishedGuideCfgMap;
                   if (mPublishedGu2 == null) {
                      mPublishedGu2 = new LinkedHashMap();
                   }
                   mPublishedGu2.put(Integer.valueOf(this.b.mTaskType), growthGuideI);
                   tb1.mPublishedGuideCfgMap = mPublishedGu2;
                }
             }
             integer = Integer.valueOf(this.b.mTaskType);
             str2 = b.i(this.b.getPhotoMetaActivityIdJson());
             if (TextUtils.n(m.c(), this.d)) {
                Object[] objArray = new Object[i];
                p3.D().w(str, "doUploadEndAction float share panel already shown", objArray);
             }else {
                RxBus.f.b(new n(this.e, p0));
             }
          }else {
             d0.b(this.e);
             integer = str1;
             str2 = integer;
          }
          e.b.a(4, Integer.valueOf(i), str1);
          Object[] objArray1 = new Object[i];
          p3.D().w(str, "doUploadEndAction end", objArray1);
          RxBus.f.b(new k(this.d, integer, str2, 1));
       }
       return;
    }
}
