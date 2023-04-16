package com.yxcorp.gifshow.loadmore.LoadMoreEventLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import r1b.b;
import com.yxcorp.gifshow.loadmore.LoadMoreEventLogger$LoadMoreResultDetail;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.loadmore.LoadMoreEventLogger$a;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;
import p1b.c;
import java.lang.Runnable;
import t45.c;

public final class LoadMoreEventLogger	// class@001a9f
{

    public void LoadMoreEventLogger(){
       super();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LoadMoreEventLogger.class, "6")) {
          return;
       }
       Log.g("LoadMoreDecision", p0);
       return;
    }
    public static LoadMoreEventLogger$LoadMoreResultDetail b(b p0){
       b obj = null;
       LoadMoreEventLogger$LoadMoreResultDetail obj1 = PatchProxy.applyOneRefs(p0, obj, LoadMoreEventLogger.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new LoadMoreEventLogger$LoadMoreResultDetail(obj);
       obj = p0.a;
       b b = p0.b;
       if (obj == null) {
          obj = p0.c;
          b = p0.d;
       }
       if (obj != null) {
          obj1.mVideoWatchTimestamps = obj;
          obj1.mAvgVideoWatchTime = Long.valueOf(b);
       }
       obj1.mRecoRemainTime = p0.e;
       obj1.mRecoPLeave = p0.f;
       obj1.mRealLastCount = p0.g;
       obj1.mApiRequestTimestamps = p0.j;
       obj1.mAvgApiRequestTime = Long.valueOf(p0.k);
       obj1.mPolicyResult = p0.i;
       obj1.mDecisionPolicy = p0.l;
       String str = (p0.m != null)? "default": "map";
       obj1.mReason = str;
       str = (TextUtils.isEmpty(p0.h))? "unknown": p0.h;
       obj1.mDecisionReason = str;
       String str1 = (TextUtils.isEmpty(p0.n))? "null": p0.n;
       obj1.mExtraMsg = str1;
       return obj1;
    }
    public static void c(b p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LoadMoreEventLogger.class, "3")) {
          return;
       }
       c.a(new c(p1, p0));
       return;
    }
    public static void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LoadMoreEventLogger.class, "1")) {
          return;
       }
       LoadMoreEventLogger.c(p0, "LOAD_MORE_DECISION_WORK");
       return;
    }
}
