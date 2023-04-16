package com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil;
import xl8.b;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mLiveAutoPlayDegradeConfigLevel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2;
import com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mCommonDegradeConfigLevel$2;
import com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mEnableFollowAutoDegradeToast$2;
import com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mDoubleLiveDegradeStrategy$2;
import com.yxcorp.gifshow.follow.common.degrade.FollowDegradeUtil$mDoubleLiveDegradeConfig$2;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pga.a;

public final class FollowDegradeUtil	// class@00103d
{
    public static final b a;
    public static int b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final FollowDegradeUtil i;

    static {
       FollowDegradeUtil.i = new FollowDegradeUtil();
       FollowDegradeUtil.a = new b("");
       FollowDegradeUtil.b = Integer.MIN_VALUE;
       FollowDegradeUtil.c = s.c(FollowDegradeUtil$mLiveAutoPlayDegradeConfigLevel$2.INSTANCE);
       FollowDegradeUtil.d = s.c(FollowDegradeUtil$mDoubleLiveAutoPlayDegradeConfigLevel$2.INSTANCE);
       FollowDegradeUtil.e = s.c(FollowDegradeUtil$mCommonDegradeConfigLevel$2.INSTANCE);
       FollowDegradeUtil.f = s.c(FollowDegradeUtil$mEnableFollowAutoDegradeToast$2.INSTANCE);
       FollowDegradeUtil.g = s.c(FollowDegradeUtil$mDoubleLiveDegradeStrategy$2.INSTANCE);
       FollowDegradeUtil.h = s.c(FollowDegradeUtil$mDoubleLiveDegradeConfig$2.INSTANCE);
    }
    public void FollowDegradeUtil(){
       super();
    }
    public final String a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowDegradeUtil.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "exp");
       int i = p0.hashCode();
       if (i != -266879973) {
          if (i == 0x3065e5b5 && p0.equals("bizLiveAutoPlayGrade")) {
             p0 = PatchProxy.apply(null, this, FollowDegradeUtil.class, "1");
             if (p0 == patchProxyRe) {
                p0 = FollowDegradeUtil.c.getValue();
             }
             a.o(p0, "mLiveAutoPlayDegradeConfigLevel");
          }else {
          label_0062 :
             p0 = PatchProxy.apply(null, this, FollowDegradeUtil.class, "3");
             if (p0 == patchProxyRe) {
                p0 = FollowDegradeUtil.e.getValue();
             }
             a.o(p0, "mCommonDegradeConfigLevel");
          }
       }else if(p0.equals("followDoubleLiveAutoDegradeConfig")){
          p0 = PatchProxy.apply(null, this, FollowDegradeUtil.class, "2");
          if (p0 == patchProxyRe) {
             p0 = FollowDegradeUtil.d.getValue();
          }
          a.o(p0, "mDoubleLiveAutoPlayDegradeConfigLevel");
       }else {
          goto label_0062 ;
       }
       return p0;
    }
    public final a b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowDegradeUtil uFollowDegra = FollowDegradeUtil.class;
       Object obj = PatchProxy.apply(null, this, uFollowDegra, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uFollowDegra, "5");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = FollowDegradeUtil.g.getValue();
       }
       return obj1;
    }
    public final b c(){
       return FollowDegradeUtil.a;
    }
    public final int d(){
       return FollowDegradeUtil.b;
    }
}
