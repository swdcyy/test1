package afd.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import afd.b;
import afd.c$a;
import android.view.View$OnClickListener;
import android.view.View;
import afd.c$b;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.yxcorp.plugin.search.utils.k;
import com.yxcorp.plugin.search.utils.p;
import jfd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import ddd.i;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.SearchParams;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import nfd.q2$a;
import nfd.c3;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.yxcorp.plugin.search.entity.result.SearchLiveGoodPopup;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.kbox.KBoxExtParam;
import nfd.q2;
import tkd.b;
import tkd.d;
import os5.l;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.yxcorp.utility.Log;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import w99.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import n3d.a;
import afd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import xed.c;
import e7d.h;
import ekd.m1;
import jfd.d;
import java.lang.Integer;

public class c extends PresenterV2	// class@000021
{
    public LiveAutoPlayModule A;
    public a B;
    public String C;
    public View D;
    public View E;
    public BaseFragment p;
    public d q;
    public TemplateBaseFeed r;
    public SearchItem s;
    public KBoxItem t;
    public int u;
    public h v;
    public f w;
    public c x;
    public h y;
    public String z;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tw = this.w;
       if (tw != null) {
          tw.set(this.x);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.x = new b(this);
       this.D.setOnClickListener(new c$a(this));
       c tE = this.E;
       if (tE != null) {
          tE.setOnClickListener(new c$b(this));
       }
       return;
    }
    public void P8(){
       SearchItem mKBoxItem;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       TemplateBaseFeed mCoverExtInf = this.r.mCoverExtInfo;
       if (mCoverExtInf != null && !TextUtils.x(mCoverExtInf.mLinkUrl)) {
          k.c(this.getActivity(), this.r.mCoverExtInfo.mLinkUrl);
       }else {
          p op = p.class;
          if (!PatchProxy.applyVoid(objArray, this, uoc, "6") && this.q.i()) {
             c obj = this.q.c();
             int i = 2;
             i.u(k.B(obj), i);
             q2$a uoa = c3.d(obj, this.s, SearchParams.getSearchParams(obj.mEntity), this.D, this.p);
             int i1 = 0;
             if (this.s.mKBoxItem.mType == 13) {
                TemplateBaseFeed mExtInfo = this.r.mExtInfo;
                if (mExtInfo != null) {
                   ExtInfo mSearchLiveG = mExtInfo.mSearchLiveGoodPopup;
                   if (mSearchLiveG != null && !TextUtils.x(mSearchLiveG.mJsonInfo)) {
                      c ts = this.s;
                      c tp = this.p;
                      SearchLiveGoodPopup mJsonInfo = this.r.mExtInfo.mSearchLiveGoodPopup.mJsonInfo;
                      int i2 = 0;
                      if (PatchProxy.isSupport(op)) {
                         Object[] objArray1 = new Object[]{obj,ts,tp,mJsonInfo,Boolean.FALSE};
                         if (!PatchProxy.applyVoid(objArray1, objArray, op, "28")) {
                         }
                      }else {
                      }
                   }else if(obj.isLiveStream()){
                      mKBoxItem = this.s.mKBoxItem;
                      if (mKBoxItem != null) {
                         KBoxItem mExtParam = mKBoxItem.mExtParam;
                         if (mExtParam != null && mExtParam.mEnableHotResume != null) {
                            q2 oq2 = uoa.a();
                            if (!PatchProxy.applyVoidTwoRefs(obj, oq2, this, uoc, "7")) {
                               if (this.s.mKBoxItem.mExtParam.isEnableKboxSlide != null) {
                                  this.D.setTag(R.id.photo_id, obj.getPhotoId());
                                  p.g(this.s, this.p, this.D, i1);
                               }else if(PatchProxy.applyVoidOneRefs(oq2, objArray, op, "21")){
                                  p.p(oq2, i1, i1);
                               }
                            }
                         }
                      }
                   }
                   l ol = d.a(-1492894991);
                   if (obj.isLiveStream() && (ol.Hy() || ol.yM())) {
                      if (ol.yM()) {
                         obj = this.A;
                         if (obj != null && obj.i0()) {
                            i1 = 1;
                         }
                      }
                      obj = this.z;
                      if (i1) {
                         this.A.P(3);
                         Log.g("BigLiveCardClickPresenter", "search result live player reuse.");
                      }else {
                         mKBoxItem = this.s.mLivePhoto;
                         if (mKBoxItem != null && mKBoxItem.mEntity instanceof LiveStreamFeed) {
                            LiveBizParam liveBizParam = new LiveBizParam();
                            ol.Fv(liveBizParam, this.s.mLivePhoto.mEntity);
                            liveBizParam = liveBizParam.mPlayerReuseToken;
                            uoa.k = true;
                         }
                      }
                      uoa.j = obj;
                   }
                   p.q(uoa.a());
                }else {
                   goto label_00b7 ;
                }
             }else {
                goto label_00b7 ;
             }
             this.v.b(1);
             GifshowActivity activity = this.getActivity();
             uoc = PatchProxy.apply(objArray, this, uoc, "8");
             if (uoc != PatchProxyResult.class) {
             }else if(this.B == null){
                this.B = new a(this);
             }
             uoc = this.B;
             activity.e(uoc);
             if (this.getActivity() != null) {
                RxBus.f.b(new c(this.getActivity().hashCode(), this.u, this.t));
             }
          }
       }
       uoc = this.y;
       if (this.q.i()) {
          objArray = this.q.c();
       }
       uoc.P(objArray, this.s, 3);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a30d8);
       this.E = m1.f(p0, 0x7f0a08d7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("SEARCH_PLAY_PHOTO_WRAPPER");
       this.r = this.r8("SEARCH_PLAY_KBOX_FEED");
       this.s = this.q8(SearchItem.class);
       this.t = this.q8(KBoxItem.class);
       this.u = this.r8("ADAPTER_POSITION").intValue();
       this.v = this.r8("HOST_PLAY_BACK_FROM_DETAIL");
       this.y = this.r8("SEARCH_FRAGMENT_DELEGATE");
       this.w = this.w8("SEARCH_FLOW_CARD_OPEN_DETAIL_LISTENER");
       this.z = this.t8("PLAYER_REUSE_SESSION_ID");
       this.A = this.t8("SEARCH_PLAY_LIVE_PLAY_MODULE");
       return;
    }
}
