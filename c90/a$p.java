package c90.a$p;
import io.reactivex.g;
import c90.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z80.c;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import brd.g;
import java.util.ArrayList;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import a90.a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaiShanAssetTag;
import h90.e;
import a90.d;
import a90.b;
import nsd.u;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.feature.post.api.mediascene.MediaSceneAssetContent;
import h90.d;
import java.io.File;
import qkd.b;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import android.os.Build$VERSION;
import a90.f;
import java.lang.Integer;

public final class a$p implements g	// class@000cf4
{
    public final a b;

    public void a$p(a p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       String str1;
       List list;
       a b;
       String str2;
       d uod;
       String str4;
       String cityName1;
       String[] obj2;
       b uob;
       d a;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$p.class, "1")) {
          return;
       }
       a.p(obj1, "emitter");
       o1 oo1 = c.j.t();
       if (oo1 == null) {
          obj1.onError(new IllegalStateException("mKuaiShanProject is null"));
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          String str = null;
          if (obj.b.e.getReplaceableTimestamp() - str > 0) {
             str = "/";
             str1 = DateUtils.j(obj.b.e.getReplaceableTimestamp(), str);
             a.o(str1, "DateUtils.formatTimeYear¡­stamp, DEFAULT_SEPARATOR\)");
             String[] stringArray = new String[]{str};
             list = StringsKt__StringsKt.H4(str1, stringArray, false, 0, 6, null);
          }else if(obj.b.e.getReplaceableTimestamp() - str < 0){
             String str5 = DateUtils.m();
             a.o(str5, "DateUtils.getCurrentYearMonthDay\(\)");
             obj2 = new String[]{"."};
             list = StringsKt__StringsKt.H4(str5, obj2, false, 0, 6, null);
          }else {
             list = CollectionsKt__CollectionsKt.E();
          }
          boolean i = 1;
          int i1 = 0;
          if ((list.isEmpty() ^ i) && list.size() == 3) {
             b = a.b;
             KuaiShanAssetTag dATE_YEAR = KuaiShanAssetTag.DATE_YEAR;
             e uoe = b.a(dATE_YEAR.getAssetTag(), oo1);
             if (uoe != null) {
                str2 = uoe.l();
                if (str2 != null) {
                   a.o(str2, "it");
                   uod = new d(list.get(i1), str2, dATE_YEAR.getAssetTag(), null, 8, null);
                   uArrayList.add(uoe);
                }
             }
             dATE_YEAR = KuaiShanAssetTag.DATE_MONTH;
             uoe = b.a(dATE_YEAR.getAssetTag(), oo1);
             if (uoe != null) {
                str2 = uoe.l();
                if (str2 != null) {
                   a.o(str2, "it");
                   uod = new d(list.get(i), str2, dATE_YEAR.getAssetTag(), null, 8, null);
                   uArrayList.add(uoe);
                }
             }
             dATE_YEAR = KuaiShanAssetTag.DATE_DAY;
             e uoe1 = b.a(dATE_YEAR.getAssetTag(), oo1);
             if (uoe1 != null) {
                String str3 = uoe1.l();
                if (str3 != null) {
                   a.o(str3, "it");
                   d uod1 = new d(list.get(2), str3, dATE_YEAR.getAssetTag(), null, 8, null);
                   uArrayList.add(uoe1);
                }
             }
          }
       label_0121 :
          String cityName = obj.b.e.getCityName();
          a uoa = (cityName == null || !cityName.length())? 1: null;
          if (!uoa) {
             KuaiShanAssetTag lOCATION = KuaiShanAssetTag.LOCATION;
             e uoe2 = a.b.a(lOCATION.getAssetTag(), oo1);
             if (uoe2 != null) {
                str4 = uoe2.l();
                if (str4 != null) {
                   cityName1 = obj.b.e.getCityName();
                   a.m(cityName1);
                   a.o(str4, "it");
                   d uod2 = new d(cityName1, str4, lOCATION.getAssetTag(), null, 8, null);
                   uArrayList.add(uoe2);
                }
             }
          }
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          Iterator iterator = obj.b.e.getAssetContents().entrySet().iterator();
          cityName1 = 4;
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             obj2 = (uEntry.getValue().mAssetType == i || uEntry.getValue().mAssetType == cityName1)? 1: null;
             if (obj2) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          iterator = linkedHashMa.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry1 = iterator.next();
             MediaSceneAssetContent value = uEntry1.getValue();
             e uoe3 = a.b.a(uEntry1.getKey(), oo1);
             if (uoe3 != null) {
                str4 = uoe3.l();
                if (str4 != null) {
                   if (value.mAssetType == cityName1) {
                      MediaSceneAssetContent mAttrInfo = value.mAttrInfo;
                      a.o(mAttrInfo, "assetContent.mAttrInfo");
                      uob = new b(value.mEllipsis, value.mMaxLines, value.mIsFakeBold, mAttrInfo);
                   }else {
                      uob = null;
                   }
                   MediaSceneAssetContent mContent = value.mContent;
                   a.o(mContent, "assetContent.mContent");
                   a.o(str4, "it");
                   uArrayList.add(new d(mContent, str4, uEntry1.getKey(), uob));
                }
             }
             str1 = null;
          }
          a = oo1.C0().a;
          a.o(a, "curProject.template.mTemplatePath");
          if (!b.R(new File(a))) {
             KSTemplateDetailInfo kSTemplateDe = oo1.k0();
             a.o(kSTemplateDe, "curProject.templateInfo");
             a = KSDownloadHelperX.o.d(kSTemplateDe);
          }
          i = (Build$VERSION.SDK_INT >= 28)? true: false;
          obj.b.b = f.a.d(uArrayList, a, i);
          obj1.onNext(Integer.valueOf(100));
          p0.onComplete();
          return;
       }
    }
}
