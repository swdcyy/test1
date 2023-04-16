package e12.l;
import com.kuaishou.live.basic.liveslide.datasource.b;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam;
import java.util.Collection;
import ekd.q;
import java.lang.Object;
import java.util.Objects;
import java.util.List;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.live.basic.liveslide.datasource.LiveSlideResponse;
import brd.t;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import e12.h;
import io.reactivex.g;
import za2.w;
import o02.e;
import d61.a0;
import cjd.e;
import erd.o;
import e12.j;
import e12.i;
import erd.g;
import t45.d;
import brd.z;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e12.k;
import ok.o;
import e12.l$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import xa2.k;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class l extends b	// class@002601
{
    public String h;
    public String i;
    public LiveSlidePlayFeedFlowParam j;
    public LiveBizParam k;

    public void l(){
       super();
    }
    public void l(LiveBizParam p0){
       super();
       this.k = p0;
       p0 = p0.mSlidePlayFeedFlowParam;
       this.j = p0;
       if (p0 != null) {
          this.h = p0.mPcursor;
          this.i = p0.mLiveStreamId;
          if (!q.f(p0.mLiveStreamFeedList)) {
             LiveSlidePlayFeedFlowParam mLiveStreamF = this.j.mLiveStreamFeedList;
             Objects.requireNonNull(mLiveStreamF);
             this.b(mLiveStreamF);
          }
       }
       this.d = true;
       return;
    }
    public static void v(l p0,Throwable p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, l.class, "5")) {
       }else {
          ExceptionHandler.handleException(a.B, p1);
       }
       return;
    }
    public final t A(boolean p0,LiveSlideResponse p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ol, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0 && (this.getDataList().isEmpty() && d.a(-1638991736).SW(this.x(p1), Boolean.FALSE))) {
          b.Z(LiveLogTag.LIVE_TVC_AD, "onLoadComplete need call TVC");
          return t.create(new h(this, p1));
       }else {
          return t.just(p1);
       }
    }
    public t c(boolean p0){
       List obj;
       String str2;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ol, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       String str1 = "/rest/n/live/feed/slide/more";
       if (this.j == null) {
          b.S(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag(this.f()), "[createRequest]", "requestUrl", str1);
          w ow = e.m();
          str2 = this.w(p0);
          ol = this.k;
          if (ol != null) {
             str = a0.a(a0.b(ol.mLiveSourceType));
          }
          return ow.c("/rest/n/live/feed/slide/more", str2, 0, null, null, str, null).map(new e()).concatMap(new j(this, p0)).doOnError(new i(this)).subscribeOn(d.b).observeOn(d.a);
       }else {
          obj = LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag(this.f());
          String str3 = (TextUtils.x(this.j.mPath))? str1: this.j.mPath;
          b.S(obj, "[createRequest]", "requestUrl", str3);
          w ow1 = e.m();
          if (!TextUtils.x(this.j.mPath)) {
             str1 = this.j.mPath;
          }
          str2 = str1;
          String str4 = this.w(p0);
          ol = this.j;
          LiveSlidePlayFeedFlowParam mLiveSlidePl = ol.mLiveSlidePlaySource;
          LiveSlidePlayFeedFlowParam mConstantLiv = (!TextUtils.x(ol.mConstantLiveStreamId))? this.j.mConstantLiveStreamId: this.i;
          LiveSlidePlayFeedFlowParam liveSlidePla = mConstantLiv;
          LiveSlidePlayFeedFlowParam mRecoStreamI = this.j.mRecoStreamId;
          ol = this.k;
          if (ol != null) {
             str = a0.a(a0.b(ol.mLiveSourceType));
          }
          return ow1.c(str2, str4, mLiveSlidePl, liveSlidePla, mRecoStreamI, str, this.j.mExtraInfo).map(new e()).concatMap(new k(this, p0)).doOnError(new i(this)).subscribeOn(d.b).observeOn(d.a);
       }
    }
    public String f(){
       return "LiveSlideDetailPageModel";
    }
    public boolean h(Object p0){
       return this.y(p0);
    }
    public List m(boolean p0,Object p1){
       return this.z(p0, p1);
    }
    public o o(){
       l$a obj = PatchProxy.apply(null, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new l$a(this);
       return super.o();
    }
    public void release(){
    }
    public final String w(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ol, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (!TextUtils.x(this.h)) {
             return this.h;
          }else if(this.g() != null && !TextUtils.x(this.g().getCursor())){
             return this.g().getCursor();
          }
       }
       return null;
    }
    public final LiveStreamFeed x(LiveSlideResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0.mFeedItems)) {
          return null;
       }
       return p0.mFeedItems.get(0);
    }
    public boolean y(LiveSlideResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.hasMore();
    }
    public List z(boolean p0,LiveSlideResponse p1){
       LiveSlideResponse obj;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ol, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.h = null;
       this.i = null;
       obj = p1.mFeedItems;
       if (PatchProxy.isSupport(ol) && (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), obj, this, ol, "4") && !p0)) {
          l tk = this.k;
          if (tk != null) {
             LiveBizParam mLiveAudienc = tk.mLiveAudienceParam;
             if (mLiveAudienc != null && (mLiveAudienc.mPhoto == null && !q.f(obj))) {
                int i = 0;
                if (k.b(obj.get(i)) && TextUtils.n(r1.n1(obj.get(i)), this.k.mLiveAudienceParam.mLiveStreamId)) {
                   this.k.mLiveAudienceParam.mPhoto = obj.get(i);
                }
             }
          }
       }
       List slideDataLis = p1.getSlideDataList();
       d.a(-1638991736).processFeedsListAsync(slideDataLis);
       return slideDataLis;
    }
}
