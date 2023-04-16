package ag3.a;
import e12.c;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vf3.b;
import vf3.a;
import qvb.n0;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.List;
import java.lang.Boolean;
import ub2.j;
import qvb.a;
import la6.b;
import qvb.j;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse$ChainBottomConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Iterator;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.response.CursorResponse;

public class a extends f implements c	// class@0000bc
{
    public long p;
    public String q;
    public QPhoto r;
    public j s;
    public String t;
    public LiveMerchantChainPhotoFeedResponse$ChainBottomConfig u;
    public String v;

    public void a(){
       super();
    }
    public t I1(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       a tq = this.q;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().mCursor;
       }
       return obj.f(tq, objArray, 10).map(new e()).subscribeOn(d.b).observeOn(d.a);
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       ExceptionHandler.handleCaughtException(p0);
       return;
    }
    public void M1(Object p0,List p1){
       this.l2(p0, p1);
    }
    public boolean Y(List p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj != null) {
          obj.b(p0);
       }
       return this.d(p0);
    }
    public void d2(b p0,List p1){
       this.l2(p0, p1);
    }
    public j g0(){
       return this.c;
    }
    public LiveMerchantChainPhotoFeedResponse$ChainBottomConfig h2(){
       return this.u;
    }
    public boolean i0(QPhoto p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj != null) {
          obj.a(p0);
       }
       return this.remove(p0);
    }
    public QPhoto i2(){
       return this.r;
    }
    public String j2(){
       return this.t;
    }
    public String k2(){
       return this.v;
    }
    public void l1(j p0){
       this.s = p0;
    }
    public void l2(LiveMerchantChainPhotoFeedResponse p0,List p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
          return;
       }
       if (p0 != null) {
          this.t = p0.mLinkedLiveTopUrl;
          this.u = p0.mChainBottomConfig;
          this.v = p0.mLivesEmptyTips;
          LiveMerchantChainPhotoFeedResponse mTimeStampMs = p0.mTimeStampMs;
          if (mTimeStampMs) {
             this.p = mTimeStampMs;
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
             LiveMerchantChainPhotoFeedResponse mQPhotos = p0.mQPhotos;
             if (mQPhotos != null) {
                Iterator iterator = mQPhotos.iterator();
                while (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   if (qPhoto == null || qPhoto.getLivePlayConfig() == null) {
                      iterator.remove();
                      b.B(LiveLogTag.MERCHANT, "photo is null or photo.getLivePlayConfig\(\) is null");
                   }
                }
             }
          }
       }
       super.d2(p0, p1);
       return;
    }
    public void m2(String p0){
       this.q = p0;
    }
    public List n0(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getItems();
    }
    public CursorResponse v0(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L0();
    }
    public void z(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
       }else {
          this.S1(p0);
       }
       return;
    }
}
