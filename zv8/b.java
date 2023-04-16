package zv8.b;
import zv8.n;
import java.lang.Object;
import com.yxcorp.gifshow.action.startup.FeedRealActionsBizConfig;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageConfig;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.action.config.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.action.c;
import ekd.j;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import aw.a$c;
import aw.a$b;
import com.yxcorp.gifshow.action.model.RealActionFeed$RealActionExtParams;
import com.yxcorp.utility.TextUtils;
import ekd.q;
import java.util.Collection;
import aw.a$d;
import java.lang.CharSequence;
import zv8.m;

public abstract class b implements n	// class@0043ca
{
    public Map a;

    public void b(){
       super();
    }
    public FeedRealActionsPageConfig[] a(FeedRealActionsBizConfig p0){
       return null;
    }
    public List actionFilters(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(a.a);
       return obj;
    }
    public Map availableActionConfig(){
       c obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a = new ConcurrentHashMap();
       obj = c.class;
       _monitor_enter(obj);
       FeedRealActionsBizConfig a = c.a;
       _monitor_exit(obj);
       if (a != null) {
          FeedRealActionsPageConfig[] uFeedRealAct = this.a(a);
          if (j.h(uFeedRealAct)) {
             return this.a;
          }else {
             int len = uFeedRealAct.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = uFeedRealAct[i];
                this.a.put(oobject.mPage, oobject);
             }
          }
       }
       return this.a;
    }
    public final void b(RealActionFeed p0,a$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a$b uob = new a$b();
       RealActionFeed mActionType = p0.mActionType;
       uob.a = mActionType;
       RealActionFeed mExtParams = p0.mExtParams;
       if (mExtParams != null) {
          if (mActionType != 1 && mActionType != 2) {
             if (mActionType != 5) {
                if (mActionType != 7) {
                   if (mActionType != 9) {
                      if (mActionType == 10) {
                         uob.d = TextUtils.k(mExtParams.mShareId);
                      }
                   }else {
                      uob.f = TextUtils.k(p0.mPage);
                      uob.e = p0.mExtParams.mNegativeType;
                   }
                }else {
                   uob.c = mExtParams.mActualPlayDuration;
                }
             }else {
                uob.b = mExtParams.mCommentStayDuration;
             }
          }else {
             uob.g = TextUtils.k(mExtParams.mClientExpTag);
          }
          uob.h = p0.mExtParams.mTimestamp;
       }
       this.c(uob, p0, p1);
       ArrayList uArrayList = new ArrayList(q.a(p1.d));
       uArrayList.add(uob);
       a$b[] uobArray = new a$b[uArrayList.size()];
       p1.d = uobArray;
       uArrayList.toArray(uobArray);
       return;
    }
    public a$d buildRealActionPage(List p0){
       a$d obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
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
             while (true) {
                if (i2 >= 0) {
                   if (TextUtils.n(uArrayList.get(i2).a, mFeedId)) {
                      this.b(realActionFe, uArrayList.get(i2));
                   label_005b :
                      if (!i1) {
                         a$c uoc = new a$c();
                         uoc.a = TextUtils.k(mFeedId);
                         uoc.b = realActionFe.mFeedType;
                         uoc.c = realActionFe.mAuthorId;
                         uoc.e = TextUtils.k(realActionFe.mLlsid);
                         uoc.f = realActionFe.mFeedStreamType;
                         uArrayList.add(uoc);
                         this.b(realActionFe, uoc);
                      }
                   }else {
                      i2 = i2 - 1;
                   }
                }else {
                   i1 = 0;
                   goto label_005b ;
                }
             }
          }
          i = i + 1;
       }
       a$c[] uocArray = new a$c[uArrayList.size()];
       obj.a = uocArray;
       uArrayList.toArray(uocArray);
       return obj;
    }
    public void c(a$b p0,RealActionFeed p1,a$c p2){
    }
    public boolean disableSourceFilter(){
       return m.a(this);
    }
    public int maxActions(){
       return 100;
    }
}
