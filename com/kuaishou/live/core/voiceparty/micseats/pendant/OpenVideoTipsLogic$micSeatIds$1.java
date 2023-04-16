package com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsLogic$micSeatIds$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsLogic;
import java.lang.Object;
import java.util.List;
import java.util.Set;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.lang.reflect.Type;
import wg3.a;
import kotlin.Pair;
import java.lang.Number;
import trd.d1;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.Iterable;
import ts2.d;
import ts2.j;
import ts2.j$a;
import com.kwai.framework.model.user.UserInfo;
import trd.c1;
import com.kwai.framework.model.user.QCurrentUser;

public final class OpenVideoTipsLogic$micSeatIds$1 extends Lambda implements q	// class@001729
{
    public final OpenVideoTipsLogic this$0;

    public void OpenVideoTipsLogic$micSeatIds$1(OpenVideoTipsLogic p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return this.invoke(p0, p1, p2);
    }
    public final Set invoke(List p0,Set p1,Boolean p2){
       boolean b;
       Set set;
       Object[] objArray1;
       Object[] obj2;
       Object[] objArray2;
       Object[] objArray3;
       OpenVideoTipsLogic openVideoTip = OpenVideoTipsLogic.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       OpenVideoTipsLogic$micSeatIds$1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, OpenVideoTipsLogic$micSeatIds$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       a.p(p1, "openVideoUserIds");
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       OpenVideoTipsLogic obj1 = PatchProxy.apply(objArray, obj, openVideoTip, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          LiveVoicePartyCommonConfig liveVoicePar = a.M(LiveVoicePartyCommonConfig.class);
          liveVoicePar = (liveVoicePar != null)? liveVoicePar.mEnableGuestVideo: null;
       }
       if (b != null) {
          obj1 = this.this$0.b;
          a.o(obj1, "hasShownGuide");
          if (!obj1.booleanValue()) {
             a.o(p2, "bubbleGuideDismissed");
             if (!p2.booleanValue()) {
                OpenVideoTipsLogic f = this.this$0.f;
                if (f != null) {
                   int i = f.component1().intValue();
                   String str = f.component2();
                   if (p1.contains(str)) {
                      set = d1.k();
                   }else {
                      Integer integer = Integer.valueOf(i);
                      Iterator iterator1 = p0.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            objArray2 = iterator1.next();
                            int id = objArray2.getId();
                            Object obj3 = (integer != null && id == integer.intValue())? 1: null;
                            if (!obj3) {
                               continue ;
                            }
                         }else {
                            objArray2 = objArray;
                         }
                         j state2 = (objArray2 != null)? objArray2.getState(): objArray;
                         UserInfo userInfo2 = (state2 instanceof j$a)? state2.a(): objArray;
                         userInfo2 = (userInfo2 != null)? userInfo2.mId: objArray;
                         if (a.g(userInfo2, str)) {
                            set = c1.f(Integer.valueOf(i));
                         }else {
                            set = d1.k();
                         }
                      }
                   }
                   if (set != null) {
                      objArray = set;
                   }else {
                   label_00de :
                      OpenVideoTipsLogic$micSeatIds$1 tthis$0 = this.this$0;
                      Objects.requireNonNull(tthis$0);
                      Pair pair = PatchProxy.applyTwoRefs(p0, p1, tthis$0, openVideoTip, "3");
                      if (pair != patchProxyRe) {
                      }else {
                         QCurrentUser qCurrentUser = QCurrentUser.me();
                         a.o(qCurrentUser, "QCurrentUser.me\(\)");
                         str = qCurrentUser.getId();
                         Iterator iterator = p0.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               objArray1 = iterator.next();
                               j state = objArray1.getState();
                               UserInfo userInfo = (state instanceof j$a)? state.a(): objArray;
                               if (userInfo != null) {
                                  i = a.g(userInfo.mId, str) ^ 1;
                                  if (i && !p1.contains(userInfo.mId)) {
                                     obj2 = 1;
                                  label_0133 :
                                     if (!obj2) {
                                        continue ;
                                     }
                                  }
                               }
                               obj2 = null;
                               goto label_0133 ;
                            }else {
                               objArray1 = objArray;
                            }
                            if (objArray1 != null) {
                               j state1 = objArray1.getState();
                               UserInfo userInfo1 = (state1 instanceof j$a)? state1.a(): objArray;
                               if (userInfo1 != null) {
                                  pair = new Pair(Integer.valueOf(objArray1.getId()), userInfo1.mId);
                               }
                            }
                            pair = objArray;
                         }
                      }
                      if (pair != null) {
                         p0.f = pair;
                         objArray = c1.f(pair.getFirst());
                      }
                   }
                }else {
                   goto label_00de ;
                }
                if (objArray == null) {
                   objArray = d1.k();
                }
                return objArray;
             }
          }
       }
       return d1.k();
    }
}
