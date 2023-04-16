package com.yxcorp.gifshow.growth.interest.InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.interest.InterestTagBasePresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import aoa.a$a;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import io.reactivex.subjects.PublishSubject;
import yna.g;
import com.yxcorp.gifshow.growth.interest.InterestChangeEvent;
import java.lang.Throwable;
import qrd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.growth.model.InterestTagResponse;
import lnc.a1;
import zsd.u;
import e17.i;
import yna.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.Pair;
import qrd.r0;
import k2b.e0;

public final class InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1 extends Lambda implements p	// class@0013bd
{
    public final InterestTagBasePresenter this$0;

    public void InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1(InterestTagBasePresenter p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.intValue());
       return l1.a;
    }
    public final void invoke(String p0,int p1){
       boolean b;
       Object obj = this;
       a$a obj1 = p0;
       int i = p1;
       InterestTagBasePresenter interestTagB = InterestTagBasePresenter.class;
       if (PatchProxy.isSupport2(InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(obj1, Integer.valueOf(p1), obj, InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1.class, "1")) {
          return;
       }
       a.p(obj1, "id");
       String str = "mCallerContext";
       int i1 = 2;
       if (i != i1) {
          if (i == 3) {
             obj1 = obj.this$0.Z8(obj1);
             if (obj1 != null) {
                obj.this$0.s.remove(obj1);
                obj.this$0.h9(obj1, obj.this$0.P8(obj1));
                InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1 this$0 = obj.this$0;
                Objects.requireNonNull(this$0);
                if (!PatchProxy.applyVoidOneRefs(obj1, this$0, interestTagB, "16")) {
                   InterestTagBasePresenter q = this$0.q;
                   if (q == null) {
                      a.S(str);
                   }
                   q.c().onNext(new InterestChangeEvent(5, String.valueOf(obj1.b())));
                   Result.constructor-impl(l1.a);
                }
             }
          }
       }else if(!TextUtils.x(obj.this$0.X8())){
          a$a uoa = obj.this$0.Z8(obj1);
          if (uoa != null) {
             if (uoa.a()) {
                obj.this$0.k9(uoa);
             }else {
                InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1 this$01 = obj.this$0;
                Objects.requireNonNull(this$01);
                Object[] objArray = null;
                InterestTagResponse obj2 = PatchProxy.apply(objArray, this$01, interestTagB, "20");
                if (obj2 != PatchProxyResult.class) {
                   b = obj2.booleanValue();
                }else {
                   interestTagB = this$01.q;
                   if (interestTagB == null) {
                      a.S(str);
                   }
                   obj2 = interestTagB.d();
                   if (obj2 != null) {
                      obj2 = obj2.mUserTagList;
                      if (obj2 != null) {
                         InterestTagBasePresenter q1 = this$01.q;
                         if (q1 == null) {
                            a.S(str);
                         }
                         if (q1.e() <= obj2.size()) {
                            b = true;
                         }else {
                            objArray = l1.a;
                         }
                      }
                   }
                   Result.constructor-impl(objArray);
                   b = false;
                }
                if (b) {
                   String str1 = a1.p(R.string.arg_RES_7f1016e9);
                   a.o(str1, "str");
                   String str2 = u.g2(str1, "**", String.valueOf(obj.this$0.W8()), false, 4, null);
                   i.e(R.style.arg_RES_7f11066a, str2, 1);
                   Pair[] pairArray = new Pair[i1];
                   pairArray[0] = r0.a("text", str2);
                   pairArray[1] = r0.a("source", obj.this$0.S8().g());
                   f.a.b(obj.this$0.S8().a(), "TAG_SETTINGS_TIPS_POPUP", pairArray);
                }else {
                   obj.this$0.k9(uoa);
                }
             }
          }
       }
       PatchProxy.onMethodExit(InterestTagBasePresenter$initTagList$$inlined$runCatching$lambda$1.class, "1");
       return;
    }
}
