package aw8.e;
import zv8.b;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import aw.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aw.a$b;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.action.model.RealActionFeed$RealActionExtParams;
import java.util.ArrayList;
import java.util.List;
import ekd.q;
import java.util.Collection;
import aw.a$d;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;

public abstract class e extends b	// class@000326
{

    public void e(){
       super();
       this.f();
    }
    private void b(RealActionFeed p0,a$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       a$b uob = new a$b();
       uob.a = p0.mActionType;
       uob.f = TextUtils.k(p0.mPage);
       RealActionFeed mExtParams = p0.mExtParams;
       if (mExtParams != null) {
          uob.g = TextUtils.k(mExtParams.mClientExpTag);
          mExtParams = p0.mExtParams;
          uob.h = mExtParams.mTimestamp;
          p0 = p0.mActionType;
          if (p0 != 2) {
             if (p0 != 13) {
                if (p0 == 14) {
                   uob.i = mExtParams.mTotalSendGiftPrice;
                }
             }else {
                uob.c = mExtParams.mActualPlayDuration;
             }
          }else {
             uob.j = TextUtils.k(mExtParams.mBizExtraParam);
          }
       }
       ArrayList uArrayList = new ArrayList(q.a(p1.d));
       uArrayList.add(uob);
       a$b[] uobArray = new a$b[uArrayList.size()];
       p1.d = uobArray;
       uArrayList.toArray(uobArray);
       return;
    }
    public a$d buildRealActionPage(List p0){
       a$d obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$d();
       if (q.f(p0)) {
          return new a$d();
       }
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (i < p0.size()) {
          RealActionFeed realActionFe = p0.get(i);
          if (realActionFe != null) {
             RealActionFeed mFeedId = realActionFe.mFeedId;
             int i1 = 1;
             int i2 = uArrayList.size() - i1;
             while (i2 >= 0) {
                if (TextUtils.n(uArrayList.get(i2).a, mFeedId)) {
                   this.b(realActionFe, uArrayList.get(i2));
                   i1 = 0;
                   break ;
                }
                i2 = i2 - 1;
             }
             if (i1) {
                a$c uoc = new a$c();
                uoc.a = TextUtils.k(mFeedId);
                uoc.b = realActionFe.mFeedType;
                uoc.c = realActionFe.mAuthorId;
                uoc.e = TextUtils.k(realActionFe.mLlsid);
                uArrayList.add(uoc);
                this.b(realActionFe, uoc);
             }
          }
          i = i + 1;
       }
       a$c[] uocArray = new a$c[uArrayList.size()];
       obj.a = uocArray;
       uArrayList.toArray(uocArray);
       return obj;
    }
    public FeedRealActionsPageConfig d(){
       FeedRealActionsPageConfig obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FeedRealActionsPageConfig();
       obj.mActions = this.e();
       return obj;
    }
    public boolean disableSourceFilter(){
       return true;
    }
    public int[] e(){
       return new int[8]{15,2,3,4,9,12,13,14};
    }
    public abstract void f();
}
