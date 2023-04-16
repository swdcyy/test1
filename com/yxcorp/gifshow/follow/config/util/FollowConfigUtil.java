package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mEnableFollowAutoDegrade$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mEnableFollowLivingBarShowCount$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mAutoRefreshRestoreMaxCount$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mEnableReturnFollowAutoRefreshRestore$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mEnableFollowRedDotRefreshRestore$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mEnableFollowRedPointRevise$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowCircleSubscribeTime$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mEnablePreLoadCache$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mDisableLikeWhenTimeShows$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mDisableFollowPageLike$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$ignoreFollowNotifyTimeInterval$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowRedDotRefreshDuration$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowSizerOptStrategy$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowQuickCommentStyle$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mPreCreateLowMemoryThreshold$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$nebulaMyFollowSlide$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$nebulaMyFollowNextToastConfig$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$enableNebulaFollowSlidePage$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$enablePreloadFollowPage$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowFeatureGuideConfig$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.config.model.FollowFeatureGuideConfig;
import wh5.c;
import java.util.Objects;
import java.lang.Float;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.config.model.FollowFeatureSnackBarGuideConfig;
import com.yxcorp.gifshow.model.LivePlayConfig;
import kha.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.lang.Number;
import com.yxcorp.gifshow.follow.config.model.FollowNextToastConfig;
import com.yxcorp.gifshow.follow.config.model.EnableMyfollowSlide;

public final class FollowConfigUtil	// class@0010b6
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    public static final p l;
    public static final p m;
    public static final p n;
    public static final p o;
    public static final p p;
    public static final p q;
    public static final p r;
    public static final p s;
    public static final p t;
    public static final p u;
    public static final p v;
    public static final p w;
    public static final p x;
    public static final p y;
    public static final FollowConfigUtil z;

    static {
       FollowConfigUtil.z = new FollowConfigUtil();
       FollowConfigUtil.a = s.c(FollowConfigUtil$mEnableFollowAutoDegrade$2.INSTANCE);
       FollowConfigUtil.b = s.c(FollowConfigUtil$mEnableFollowLivingBarShowCount$2.INSTANCE);
       FollowConfigUtil.c = s.c(FollowConfigUtil$mAutoRefreshRestoreMaxCount$2.INSTANCE);
       FollowConfigUtil.d = s.c(FollowConfigUtil$mEnableReturnFollowAutoRefreshRestore$2.INSTANCE);
       FollowConfigUtil.e = s.c(FollowConfigUtil$mEnableFollowRedDotRefreshRestore$2.INSTANCE);
       FollowConfigUtil.f = s.c(FollowConfigUtil$mReturnFollowAutoRefreshStrategy$2.INSTANCE);
       FollowConfigUtil.g = s.c(FollowConfigUtil$mEnableFollowPreloadShowBeforeNetwork$2.INSTANCE);
       FollowConfigUtil.h = s.c(FollowConfigUtil$mEnableFollowRedPointRevise$2.INSTANCE);
       FollowConfigUtil.i = s.c(FollowConfigUtil$mFollowCircleSubscribeTime$2.INSTANCE);
       FollowConfigUtil.j = s.c(FollowConfigUtil$mEnablePreLoadCache$2.INSTANCE);
       FollowConfigUtil.k = s.c(FollowConfigUtil$mDisableLikeWhenTimeShows$2.INSTANCE);
       FollowConfigUtil.l = s.c(FollowConfigUtil$mDisableFollowPageLike$2.INSTANCE);
       FollowConfigUtil.m = s.c(FollowConfigUtil$ignoreFollowNotifyTimeInterval$2.INSTANCE);
       FollowConfigUtil.n = s.c(FollowConfigUtil$enableFollowDeleteLiveEndPhoto$2.INSTANCE);
       FollowConfigUtil.o = s.c(FollowConfigUtil$mFollowRedDotRefreshDuration$2.INSTANCE);
       FollowConfigUtil.p = s.c(FollowConfigUtil$mFollowSizerOptStrategy$2.INSTANCE);
       FollowConfigUtil.q = s.c(FollowConfigUtil$mFollowQuickCommentStyle$2.INSTANCE);
       FollowConfigUtil.r = s.c(FollowConfigUtil$mPreCreateLowMemoryThreshold$2.INSTANCE);
       FollowConfigUtil.s = s.c(FollowConfigUtil$nebulaMyFollowSlide$2.INSTANCE);
       FollowConfigUtil.t = s.c(FollowConfigUtil$nebulaMyFollowNextToastConfig$2.INSTANCE);
       FollowConfigUtil.u = s.c(FollowConfigUtil$enableNebulaFollowSlidePage$2.INSTANCE);
       FollowConfigUtil.v = s.c(FollowConfigUtil$enablePreloadFollowPage$2.INSTANCE);
       FollowConfigUtil.w = s.c(FollowConfigUtil$mFollowFeatureGuideConfig$2.INSTANCE);
       FollowConfigUtil.x = s.c(FollowConfigUtil$mFollowFeatureSnackBarGuideConfig$2.INSTANCE);
       FollowConfigUtil.y = s.c(FollowConfigUtil$mDisableFeatureFollowGuideFrequency$2.INSTANCE);
    }
    public void FollowConfigUtil(){
       super();
    }
    public static final boolean a(){
       FollowFeatureGuideConfig obj = PatchProxy.apply(null, null, FollowConfigUtil.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z.s();
       boolean b = false;
       obj = (obj != null)? obj.mEnableFollow2SelectionLink: null;
       if (obj != null && !c.b()) {
          b = true;
       }
       return b;
    }
    public static final boolean b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "42");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, uFollowConfi, "14");
       if (uBoolean == patchProxyRe) {
          uBoolean = FollowConfigUtil.n.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final boolean c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "52");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, uFollowConfi, "5");
       if (uBoolean == patchProxyRe) {
          uBoolean = FollowConfigUtil.e.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final boolean d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "54");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, uFollowConfi, "8");
       if (uBoolean == patchProxyRe) {
          uBoolean = FollowConfigUtil.h.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final boolean e(){
       FollowFeatureGuideConfig obj = PatchProxy.apply(null, null, FollowConfigUtil.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z.s();
       boolean b = false;
       obj = (obj != null)? obj.mEnableFollowShowDialog: null;
       if (obj != null && !c.b()) {
          b = true;
       }
       return b;
    }
    public static final boolean f(){
       Object obj = PatchProxy.apply(null, null, FollowConfigUtil.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (FollowConfigUtil.z.u() == 2)? true: false;
       return b;
    }
    public static final boolean g(){
       Object obj = PatchProxy.apply(null, null, FollowConfigUtil.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (FollowConfigUtil.z.u())? true: false;
       return b;
    }
    public static final boolean h(){
       FollowFeatureGuideConfig obj = PatchProxy.apply(null, null, FollowConfigUtil.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z.s();
       boolean b = false;
       obj = (obj != null)? obj.mEnableMask: null;
       if (obj != null && !c.b()) {
          b = true;
       }
       return b;
    }
    public static final boolean i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "43");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, uFollowConfi, "21");
       if (uBoolean == patchProxyRe) {
          uBoolean = FollowConfigUtil.u.getValue();
       }
       boolean b = (uBoolean.booleanValue() && !c.j())? true: false;
       return b;
    }
    public static final boolean j(){
       boolean b;
       QCurrentUser obj = PatchProxy.apply(null, null, FollowConfigUtil.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (FollowConfigUtil.z.v().floatValue() - null > 0 && !c.b()) {
          obj = QCurrentUser.ME;
          a.o(obj, "QCurrentUser.ME");
          if (obj.isLogined()) {
             b = true;
          label_0039 :
             return b;
          }
       }
       b = false;
       goto label_0039 ;
    }
    public static final boolean k(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "30");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, uFollowConfi, "10");
       if (uBoolean == patchProxyRe) {
          uBoolean = FollowConfigUtil.j.getValue();
       }
       if (uBoolean.booleanValue()) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (mE.isLogined()) {
             b = true;
          label_0040 :
             return b;
          }
       }
       b = false;
       goto label_0040 ;
    }
    public static final boolean l(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "51");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, uFollowConfi, "4");
       if (uBoolean == patchProxyRe) {
          uBoolean = FollowConfigUtil.d.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final boolean m(){
       FollowFeatureGuideConfig obj = PatchProxy.apply(null, null, FollowConfigUtil.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z.s();
       boolean b = false;
       obj = (obj != null)? obj.mEnableSnackBar: null;
       if (obj != null && !c.b()) {
          b = true;
       }
       return b;
    }
    public static final FollowFeatureSnackBarGuideConfig n(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "62");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, uFollowConfi, "24");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = FollowConfigUtil.x.getValue();
       }
       return obj1;
    }
    public static final LivePlayConfig o(){
       Object[] objArray = null;
       LivePlayConfig obj = PatchProxy.apply(objArray, objArray, FollowConfigUtil.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LivePlayConfig.class;
       String str = a.a.getString("followLiveStreamConfig", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public static final long p(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "32");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Number number = PatchProxy.apply(null, obj, uFollowConfi, "13");
       if (number == patchProxyRe) {
          number = FollowConfigUtil.m.getValue();
       }
       return number.longValue();
    }
    public static final boolean q(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "29");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, uFollowConfi, "7");
       if (uBoolean == patchProxyRe) {
          uBoolean = FollowConfigUtil.g.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final int r(){
       Object obj = PatchProxy.apply(null, null, FollowConfigUtil.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FollowConfigUtil.z.t();
    }
    public static final FollowNextToastConfig w(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "40");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, uFollowConfi, "20");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = FollowConfigUtil.t.getValue();
       }
       return obj1;
    }
    public static final int x(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "53");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Number number = PatchProxy.apply(null, obj, uFollowConfi, "6");
       if (number == patchProxyRe) {
          number = FollowConfigUtil.f.getValue();
       }
       return number.intValue();
    }
    public static final EnableMyfollowSlide y(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
       FollowConfigUtil obj = PatchProxy.apply(null, null, uFollowConfi, "44");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FollowConfigUtil.z;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, uFollowConfi, "19");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = FollowConfigUtil.s.getValue();
       }
       return obj1;
    }
    public final FollowFeatureGuideConfig s(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowConfigUtil.w.getValue();
    }
    public final int t(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil.class, "17");
       if (obj == PatchProxyResult.class) {
          obj = FollowConfigUtil.q.getValue();
       }
       return obj.intValue();
    }
    public final int u(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil.class, "16");
       if (obj == PatchProxyResult.class) {
          obj = FollowConfigUtil.p.getValue();
       }
       return obj.intValue();
    }
    public final Float v(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowConfigUtil.r.getValue();
    }
}
