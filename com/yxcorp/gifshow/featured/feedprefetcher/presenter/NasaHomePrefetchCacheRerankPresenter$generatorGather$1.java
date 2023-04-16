package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$generatorGather$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import sm7.i;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.DataBundle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import java.util.List;
import trd.t;
import java.util.Map;
import com.kuaishou.eve.kit.rerank.model.EveCommonFeature;
import com.kuaishou.eve.kit.rerank.processor.GatherKt;
import java.util.Objects;
import java.lang.Long;
import com.kuaishou.eve.kit.rerank.model.Candidates;
import java.util.Collection;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import rea.e;
import java.lang.Boolean;
import qrd.p;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.eve.kit.rerank.model.RerankPhoto;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.sdk.eve.internal.inference.DataBundle$TRANSFER;
import com.kwai.sdk.eve.AbortException;

public final class NasaHomePrefetchCacheRerankPresenter$generatorGather$1 extends Lambda implements p	// class@000fd2
{
    public final NasaHomePrefetchCacheRerankPresenter this$0;

    public void NasaHomePrefetchCacheRerankPresenter$generatorGather$1(NasaHomePrefetchCacheRerankPresenter p0){
       this.this$0 = p0;
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       String str1;
       NasaHomePrefetchCacheRerankPresenter nasaHomePref = NasaHomePrefetchCacheRerankPresenter.class;
       EveManagerWrapper obj = PatchProxy.applyTwoRefs(p0, p1, this, NasaHomePrefetchCacheRerankPresenter$generatorGather$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       String str = "event";
       a.p(p1, str);
       obj = EveManagerWrapper.e;
       EveCommonFeature uEveCommonFe = GatherKt.e(obj.h("APP", t.k("c_netspeed")));
       List obj1 = obj.g("APP", "launch_time");
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Long");
       long l = obj1.longValue();
       obj1 = this.this$0.P8().getPhotos();
       DataBundle uDataBundle = (obj1 == null || obj1.isEmpty())? 1: null;
       if (!uDataBundle) {
          uDataBundle = new DataBundle();
          uDataBundle.a(str, p1);
          uDataBundle.a("rankType", Integer.valueOf(203));
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          str = mE.getId();
          a.o(str, "QCurrentUser.ME.id");
          uDataBundle.a("userId", str);
          uDataBundle.a("launchTime", Long.valueOf(l));
          uDataBundle.a("userFeatureCount", Integer.valueOf(this.this$0.R8().mUserFeatureCount));
          uDataBundle.a("startRerankCnt", Integer.valueOf(this.this$0.R8().mStartRerankCnt));
          uDataBundle.a("enableSort", Boolean.valueOf(this.this$0.R8().mEnableSort));
          uDataBundle.a("enableDiverse", Boolean.valueOf(this.this$0.R8().mEnableDiverse));
          NasaHomePrefetchCacheRerankPresenter$generatorGather$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          p1 = PatchProxy.apply(null, tthis$0, nasaHomePref, "2");
          if (p1 != PatchProxyResult.class) {
          }else {
             str1 = tthis$0.v.getValue();
          }
          if (p1 == null) {
             str1 = "";
          }
          uDataBundle.a("diversityConfig", p1);
          tthis$0 = this.this$0;
          Candidates uCandidates = tthis$0.P8();
          Objects.requireNonNull(tthis$0);
          HashMap hashMap = PatchProxy.applyOneRefs(uCandidates, tthis$0, nasaHomePref, "11");
          if (hashMap != PatchProxyResult.class) {
          }else {
             hashMap = new HashMap();
             List photos = uCandidates.getPhotos();
             ArrayList uArrayList = PatchProxy.applyOneRefs(photos, tthis$0, nasaHomePref, "12");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                uArrayList = new ArrayList();
                Iterator iterator = photos.iterator();
                while (iterator.hasNext()) {
                   RerankPhoto rerankPhoto = iterator.next();
                   LinkedHashMap linkedHashMa = PatchProxy.applyOneRefs(rerankPhoto, tthis$0, nasaHomePref, "13");
                   if (linkedHashMa != PatchProxyResult.class) {
                   }else {
                      linkedHashMa = new LinkedHashMap();
                      linkedHashMa.put("photoId", rerankPhoto.getPhotoId());
                      linkedHashMa.put("expTag", rerankPhoto.getExpTag());
                      linkedHashMa.put("llsid", rerankPhoto.getLlsid());
                      linkedHashMa.put("duration", t.k(Long.valueOf(rerankPhoto.getDuration())));
                      linkedHashMa.put("index", t.k(Integer.valueOf(rerankPhoto.getIndex())));
                      linkedHashMa.put("hetu1", rerankPhoto.getHetu1());
                      linkedHashMa.put("hetu2", rerankPhoto.getHetu2());
                      linkedHashMa.put("hetu3", rerankPhoto.getHetu3());
                      Iterator iterator1 = rerankPhoto.getFeatures().entrySet().iterator();
                      while (iterator1.hasNext()) {
                         Map$Entry uEntry = iterator1.next();
                         Object key = uEntry.getKey();
                         linkedHashMa.put(key, uEntry.getValue());
                      }
                   }
                   uArrayList.add(linkedHashMa);
                }
             }
             hashMap.put("sortItems", uArrayList);
             hashMap.put("currentItems", new ArrayList());
             hashMap.put("currentIndex", Integer.valueOf(uCandidates.getCurrentIndex()));
             hashMap.put("realShowPageSize", Integer.valueOf(uCandidates.getRealShowPageSize()));
          }
          uDataBundle.a("candidates", hashMap);
          uDataBundle.a("commonFeatures", uEveCommonFe);
          uDataBundle.b(DataBundle$TRANSFER.REF);
          return uDataBundle;
       }else {
          throw new AbortException("sortList is empty");
       }
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
