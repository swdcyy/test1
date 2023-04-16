package com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import kotlin.Pair;
import java.lang.Integer;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper$mLastSelectTab$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper$mAllFilterBoxes$2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.util.Map;
import lga.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.follow.model.FilterOption;
import com.yxcorp.gifshow.follow.model.FilterBox;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Iterable;

public final class FollowFilterHelper	// class@001087
{
    public static Pair a;
    public static String b;
    public static final p c;
    public static final p d;
    public static final FollowFilterHelper e;

    static {
       FollowFilterHelper.e = new FollowFilterHelper();
       FollowFilterHelper.a = new Pair(Integer.valueOf(0), Integer.valueOf(0));
       FollowFilterHelper.b = "default";
       FollowFilterHelper.c = s.c(FollowFilterHelper$mLastSelectTab$2.INSTANCE);
       FollowFilterHelper.d = s.c(FollowFilterHelper$mAllFilterBoxes$2.INSTANCE);
    }
    public void FollowFilterHelper(){
       super();
    }
    public static final boolean a(){
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, objArray, FollowFilterHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new HashMap();
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       obj.put("isLogined", String.valueOf(qCurrentUser.isLogined()));
       obj.put("enableChildLock", String.valueOf(a.a()));
       List list = FollowFilterHelper.d();
       if (list != null) {
          objArray = list.toString();
       }
       obj.put("getCurrentUserFilterBoxes", objArray);
       obj.put("isEmpty", String.valueOf(q.f(FollowFilterHelper.d())));
       FollowFilterHelper e = FollowFilterHelper.e;
       obj.put("isValidUserFilterBox", String.valueOf(e.k(FollowFilterHelper.d())));
       c.k(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowSelectorHelper"), "canShowSelector", obj);
       QCurrentUser qCurrentUser1 = QCurrentUser.me();
       a.o(qCurrentUser1, "QCurrentUser.me\(\)");
       boolean b = (qCurrentUser1.isLogined() && (!a.a() && (FollowFilterHelper.d() != null && (!q.f(FollowFilterHelper.d()) && e.k(FollowFilterHelper.d())))))? true: false;
       return b;
    }
    public static final String b(){
       Object[] objArray = null;
       FilterOption obj = PatchProxy.apply(objArray, objArray, FollowFilterHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowFilterHelper.f();
       if (obj != null) {
          objArray = obj.mName;
       }
       return objArray;
    }
    public static final String c(){
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, objArray, FollowFilterHelper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowFilterHelper.e.g();
       if (obj != null) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          List list = obj.get(mE.getId());
          if (list != null) {
             FilterBox uFilterBox = list.get(0);
             if (uFilterBox != null) {
                objArray = uFilterBox.mName;
             }
          }
       }
       return objArray;
    }
    public static final List d(){
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, objArray, FollowFilterHelper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowFilterHelper.e.g();
       if (obj != null) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          objArray = obj.get(mE.getId());
       }
       return objArray;
    }
    public static final String e(){
       String obj = PatchProxy.apply(null, null, FollowFilterHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowFilterHelper.e.h();
       if (obj == null) {
          obj = "default";
       }
       return obj;
    }
    public static final FilterOption f(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, objArray, FollowFilterHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FollowFilterHelper.d();
       if (obj != null) {
          FilterBox uFilterBox = obj.get(FollowFilterHelper.a.getFirst().intValue());
          if (uFilterBox != null) {
             uFilterBox = uFilterBox.mOptions;
             if (uFilterBox != null) {
                objArray = uFilterBox.get(FollowFilterHelper.a.getSecond().intValue());
             }
          }
       }
       return objArray;
    }
    public static final boolean i(){
       Object[] objArray = null;
       FilterOption obj = PatchProxy.apply(objArray, objArray, FollowFilterHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = FollowFilterHelper.f();
       if (obj != null) {
          objArray = obj.mName;
       }
       return a.g("favoriteFollowing", objArray);
    }
    public static final boolean j(){
       Object[] objArray = null;
       FilterOption obj = PatchProxy.apply(objArray, objArray, FollowFilterHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = FollowFilterHelper.f();
       if (obj != null) {
          objArray = obj.mName;
       }
       return a.g("friend", objArray);
    }
    public static final void l(){
       if (PatchProxy.applyVoid(null, null, FollowFilterHelper.class, "6")) {
          return;
       }
       Pair pair = new Pair(Integer.valueOf(0), Integer.valueOf(0));
       FollowFilterHelper.a = pair;
       int i = pair.component1().intValue();
       int i1 = pair.component2().intValue();
       List list = FollowFilterHelper.d();
       if (list != null) {
          FilterBox uFilterBox = list.get(i);
          if (uFilterBox != null) {
             uFilterBox = uFilterBox.mOptions;
             if (uFilterBox != null) {
                Iterator iterator = uFilterBox.iterator();
                int i2 = 0;
                while (iterator.hasNext()) {
                   FilterOption uFilterOptio = iterator.next();
                   if (uFilterOptio != null) {
                      boolean b = (i2 == i1)? true: false;
                      uFilterOptio.mSelected = b;
                   }
                   i2 = i2 + 1;
                }
             }
          }
       }
       return;
    }
    public static final void m(Pair p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FollowFilterHelper.class, "5")) {
          return;
       }
       a.p(p0, "laseSectionId");
       FollowFilterHelper.a = p0;
       return;
    }
    public final Map g(){
       Object obj = PatchProxy.apply(null, this, FollowFilterHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowFilterHelper.d.getValue();
    }
    public final String h(){
       Object obj = PatchProxy.apply(null, this, FollowFilterHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowFilterHelper.c.getValue();
    }
    public final boolean k(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowFilterHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (q.f(p0)) {
          return false;
       }
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().mOptions == null) {
                return false;
             }
          }
       }
       return true;
    }
}
