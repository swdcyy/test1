package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$mDiversityConfig$2;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import ln5.d;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptRerankReqEvent;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.kuaishou.eve.kit.rerank.model.Candidates;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;
import java.util.Collection;
import java.lang.StringBuilder;
import pea.b;
import iea.d;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchDataUtil;
import kotlin.jvm.internal.a;
import wkd.b;
import qea.u;
import lea.f;
import lea.b;
import com.kwai.sdk.switchconfig.a;
import nea.b;
import com.kuaishou.eve.kit.rerank.model.RerankPhoto;
import rea.e;
import ml5.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.sdk.eve.proto.PlayEvent;
import hn7.i;
import com.kwai.sdk.eve.proto.CustomEvent;
import com.kwai.sdk.eve.proto.ShowEvent;
import com.kwai.sdk.eve.proto.ClickEvent;

public final class NasaHomePrefetchCacheRerankPresenter extends PresenterV2	// class@000fd5
{
    public final String p;
    public final String q;
    public final Object r;
    public String s;
    public final List t;
    public final p u;
    public final p v;
    public b w;
    public final Runnable x;
    public static final NasaHomePrefetchCacheRerankPresenter$a y;

    static {
       NasaHomePrefetchCacheRerankPresenter.y = new NasaHomePrefetchCacheRerankPresenter$a(null);
    }
    public void NasaHomePrefetchCacheRerankPresenter(){
       super();
       this.p = "NasaPrefetchRerankInitModule";
       this.q = "LaunchSlide";
       this.r = new Object();
       this.t = new ArrayList();
       this.u = s.c(NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2.INSTANCE);
       this.v = s.c(NasaHomePrefetchCacheRerankPresenter$mDiversityConfig$2.INSTANCE);
       this.x = new NasaHomePrefetchCacheRerankPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaHomePrefetchCacheRerankPresenter.class, "3")) {
          return;
       }
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(d.class).observeOn(a).subscribe(new NasaHomePrefetchCacheRerankPresenter$c(this)));
       this.X7(f.f(NasaLaunchOptRerankReqEvent.class).observeOn(a).subscribe(new NasaHomePrefetchCacheRerankPresenter$d(this)));
       e.f(this.x, "NasaPrefetchRerankInitModule", false, true);
       return;
    }
    public void J8(){
       EveManagerWrapper e;
       NasaHomePrefetchCacheRerankPresenter nasaHomePref = NasaHomePrefetchCacheRerankPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaHomePref, "4")) {
          return;
       }
       e.c(this.x);
       if (!PatchProxy.applyVoid(objArray, this, nasaHomePref, "7")) {
          nasaHomePref = this.w;
          if (nasaHomePref != null && !nasaHomePref.isDisposed()) {
             nasaHomePref = this.w;
             if (nasaHomePref != null) {
                nasaHomePref.dispose();
             }
          }
          e = EveManagerWrapper.e;
          e.s(this.q);
          e.f(this.q);
       }
       return;
    }
    public final Candidates P8(){
       Iterator iterator1;
       QPhoto qPhoto;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaHomePrefetchCacheRerankPresenter nasaHomePref = NasaHomePrefetchCacheRerankPresenter.class;
       Object[] objArray = null;
       Candidates obj = PatchProxy.apply(objArray, this, nasaHomePref, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new Candidates();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = PatchProxy.apply(objArray, this, nasaHomePref, "6");
       if (uArrayList2 != patchProxyRe) {
       }else if(NasaLaunchOptManager.i()){
          uArrayList2 = new ArrayList();
          NasaHomePrefetchCacheRerankPresenter tt = this.t;
          _monitor_enter(tt);
          uArrayList2.addAll(this.t);
          _monitor_exit(tt);
          b.b(this.p, "getAllLocalQPhotos launchOpt:"+uArrayList2);
       }else {
          ArrayList uArrayList3 = new ArrayList();
          List list = d.a();
          String str = 1;
          if (list != null) {
             iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                qPhoto = iterator1.next();
                if (PhotoPrefetchDataUtil.a(qPhoto) == str) {
                   a.o(qPhoto, "it");
                   uArrayList3.add(qPhoto);
                }
             }
          }
          b.b(this.p, "getAllLocalQPhotos dynamicPhotoList: "+uArrayList3);
          int i = -622777217;
          List obj1 = b.a(i);
          a.o(obj1, "Singleton.get\(PrefetchDa¡­ourceManager::class.java\)");
          obj1 = obj1.n();
          if (obj1 != null) {
             Iterator iterator2 = obj1.iterator();
             while (iterator2.hasNext()) {
                f uof = iterator2.next();
                b mQPhoto = (uof != null)? uof.mQPhoto: objArray;
                if (PhotoPrefetchDataUtil.a(mQPhoto) == str && b.a(i).u(uof)) {
                   b mQPhoto1 = uof.mQPhoto;
                   a.o(mQPhoto1, "it.mQPhoto");
                   uArrayList3.add(mQPhoto1);
                }
             }
          }
          b.b(this.p, "getAllLocalQPhotos getAllPhotoInMemory: "+uArrayList3);
          b = false;
          if (a.t().d("LaunchOpt2022GetLongestQPhoto", b)) {
             long l = 0;
             iterator1 = uArrayList3.iterator();
             while (iterator1.hasNext()) {
                qPhoto = iterator1.next();
                if (qPhoto.getVideoDuration() - l > 0) {
                   l = qPhoto.getVideoDuration();
                   objArray = qPhoto.getPhotoId();
                }
             }
             if (objArray != null) {
                if (objArray.length() > 0) {
                   b = true;
                }
                if (b == str) {
                   b.b(this.p, "getAllLocalQPhotos save rerank: "+objArray);
                   uArrayList3 = new ArrayList();
                   uArrayList3.add(objArray);
                   b.b(uArrayList3);
                   uArrayList3 = new ArrayList();
                }
             }
          }
          uArrayList2 = uArrayList3;
       }
       Iterator iterator = uArrayList2.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new RerankPhoto(iterator.next()));
       }
       obj.setCurrentIndex(-1);
       obj.setRealShowPageSize(-1);
       obj.setPhotos(uArrayList);
       obj.setCurrentPhotos(uArrayList1);
       return obj;
    }
    public final e R8(){
       Object obj = PatchProxy.apply(null, this, NasaHomePrefetchCacheRerankPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final String S8(a p0){
       String obj = PatchProxy.applyOneRefs(p0, this, NasaHomePrefetchCacheRerankPresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "UNKNOWN";
       if (p0 != null) {
          GeneratedMessageLite generatedMes = p0.f();
          if (generatedMes != null) {
             if (generatedMes instanceof PlayEvent) {
                obj = i.a(generatedMes)+'_'+generatedMes.getPage();
             }else if(generatedMes instanceof CustomEvent){
                obj = i.a(generatedMes)+'_'+generatedMes.getCustomValue();
             }else if(generatedMes instanceof ShowEvent){
                obj = i.a(generatedMes)+'_'+generatedMes.getPage();
             }else if(generatedMes instanceof ClickEvent){
                obj = i.a(generatedMes)+'_'+generatedMes.getAction();
             }
          }
       }
       return obj;
    }
}
