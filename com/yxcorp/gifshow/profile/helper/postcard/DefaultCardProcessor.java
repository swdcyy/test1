package com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor;
import n3c.b;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$a;
import nsd.u;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$Companion$defaultCardRandom$2;
import msd.a;
import qrd.p;
import qrd.s;
import l3c.a0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$b;
import lkd.b;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import crd.b;
import lnc.b9;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import z5c.l3;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo;
import x3c.c;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import o56.f;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import lnc.a1;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.utility.n;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.util.Collection;
import java.util.Objects;
import ssd.e;
import java.lang.Math;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$d;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$e;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor$f;

public final class DefaultCardProcessor extends b	// class@00134a
{
    public List e;
    public b f;
    public ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo[] g;
    public View h;
    public boolean i;
    public ViewTreeObserver$OnGlobalLayoutListener j;
    public static final p k;
    public static final DefaultCardProcessor$a l;

    static {
       DefaultCardProcessor.l = new DefaultCardProcessor$a(null);
       DefaultCardProcessor.k = s.c(DefaultCardProcessor$Companion$defaultCardRandom$2.INSTANCE);
    }
    public void DefaultCardProcessor(a0 p0,RecyclerFragment p1,BaseFragment p2,RxPageBus p3){
       a.p(p0, "tipsHelper");
       a.p(p1, "fragment");
       a.p(p2, "baseFragment");
       a.p(p3, "rxPageBus");
       super(p0, p1, p2, p3);
    }
    public void a(){
       DefaultCardProcessor uDefaultCard = DefaultCardProcessor.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDefaultCard, "6")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uDefaultCard, "5");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): this.g(this.h);
       if (b) {
          return;
       }else {
          this.d().D(new DefaultCardProcessor$b(this));
          this.d().i();
          return;
       }
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, DefaultCardProcessor.class, "2")) {
          return;
       }
       ProfilePostEmptyCardUtils.e.i("DefaultPostCard", "hideGuide");
       b9.a(this.f);
       this.j(this.h, this.j);
       this.j = null;
       this.g = null;
       this.i(this.h);
       this.h = null;
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, DefaultCardProcessor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.g(this.h);
    }
    public boolean h(l3 p0){
       ProfileEmptyPhotoGuideInfo profileEmpty;
       boolean b;
       DefaultCardProcessor obj = PatchProxy.applyOneRefs(p0, this, DefaultCardProcessor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = this.g;
       if (obj != null) {
          UserProfileResponse userProfileR = p0.b();
          if (userProfileR != null) {
             profileEmpty = c.b(userProfileR);
             if (profileEmpty != null) {
                profileEmpty = profileEmpty.mDegradePostGuideInfos;
             label_002c :
                if (obj == profileEmpty && this.h != null) {
                   b = true;
                label_0035 :
                   return b;
                }
             }
          }
          profileEmpty = null;
          goto label_002c ;
       }
    label_0034 :
       b = false;
       goto label_0035 ;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, DefaultCardProcessor.class, "4")) {
          return;
       }
       DefaultCardProcessor th = this.h;
       if (th != null) {
          th.setVisibility(4);
       }
       return;
    }
    public boolean n(l3 p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DefaultCardProcessor uDefaultCard = DefaultCardProcessor.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, uDefaultCard, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = new ArrayList();
       UserProfileResponse userProfileR = p0.b();
       if (userProfileR != null) {
          ProfileEmptyPhotoGuideInfo profileEmpty = c.b(userProfileR);
          if (profileEmpty != null) {
             profileEmpty = profileEmpty.mDegradePostGuideInfos;
             if (profileEmpty != null) {
                int len = profileEmpty.length;
                int i = 0;
                while (i < len) {
                   object oobject = profileEmpty[i];
                   ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo obj1 = PatchProxy.applyOneRefs(oobject, this, uDefaultCard, "10");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(oobject == null){
                      obj1 = oobject.mScheme;
                      obj1 = (obj1 == null || !obj1.length())? 1: null;
                      if (!obj1) {
                         obj1 = oobject.mActionBtnTitle;
                         obj1 = (obj1 == null || !obj1.length())? 1: null;
                         if (!obj1) {
                            obj1 = oobject.mSubTitle;
                            obj1 = (obj1 == null || !obj1.length())? 1: null;
                            if (!obj1) {
                               obj1 = oobject.mTitle;
                               b = (obj1 == null || !obj1.length())? 1: 0;
                               if (!b) {
                                  b = true;
                               }
                            }
                         }
                      }
                   }
                label_0089 :
                   b = false;
                   if (b) {
                      obj.add(oobject);
                   }
                   i = i + 1;
                }
             }
          }
       }
       UserProfileResponse userProfileR1 = p0.b();
       if (userProfileR1 != null) {
          ProfileEmptyPhotoGuideInfo profileEmpty1 = c.b(userProfileR1);
          if (profileEmpty1 != null) {
             profileEmpty1 = profileEmpty1.mDegradePostGuideInfos;
          label_00a2 :
             this.g = profileEmpty1;
             this.e = obj;
             this.p(true);
             this.d().i();
             b9.a(this.f);
             FragmentActivity activity = this.b().getActivity();
             if (activity != null && f.b(activity)) {
                this.f = this.c.Vg().j().observeOn(d.a).subscribe(new DefaultCardProcessor$c(this), Functions.d());
             }
             ProfilePostEmptyCardUtils.e.i("DefaultPostCard", "showGuide");
             return true;
          }
       }
       ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo[] uDegradePost = null;
       goto label_00a2 ;
    }
    public final ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo o(){
       ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo obj = PatchProxy.apply(null, this, DefaultCardProcessor.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo();
       obj.mScheme = "kwai://post?isPotentialAuthorStatus=true";
       obj.mTitle = a1.p(0x7f100d2b);
       obj.mSubTitle = a1.p(0x7f100d2a);
       obj.mActionBtnTitle = a1.p(0x7f100d29);
       return obj;
    }
    public final void p(boolean p0){
       DefaultCardProcessor uDefaultCard = DefaultCardProcessor.class;
       if (PatchProxy.isSupport(uDefaultCard) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDefaultCard, "7")) {
          return;
       }
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = n.G(this.b().getContext(), 0x7f0d1271);
       DefaultCardProcessor te = this.e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProfileEmptyPhotoGuideInfo$DegradePostGuideInfo uDegradePost = PatchProxy.applyOneRefs(te, this, uDefaultCard, "8");
       if (uDegradePost != patchProxyRe) {
       }else if(te == null || te.isEmpty()){
          uDegradePost = 1;
       }else {
          uDegradePost = null;
       }
       if (uDegradePost) {
          uDegradePost = this.o();
       }else {
          DefaultCardProcessor$a l = DefaultCardProcessor.l;
          Objects.requireNonNull(l);
          e uoe = PatchProxy.apply(null, l, DefaultCardProcessor$a.class, "1");
          if (uoe == patchProxyRe) {
             uoe = DefaultCardProcessor.k.getValue();
          }
          uDegradePost = CollectionsKt___CollectionsKt.F2(te, (Math.abs(uoe.k()) % te.size()));
          if (uDegradePost == null) {
             uDegradePost = this.o();
          }
       }
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.k(R.drawable.arg_RES_7f082325);
       uoa.i(uDegradePost.mTitle);
       uoa.n(uDegradePost.mSubTitle);
       uoa.f(uDegradePost.mActionBtnTitle);
       uoa.p(new DefaultCardProcessor$d(this, uDegradePost));
       KwaiEmptyStateView kwaiEmptySta = uoa.a(objectRef.element);
       objectRef.element = kwaiEmptySta;
       kwaiEmptySta.setBackgroundColor(0);
       Ref$ObjectRef element = objectRef.element;
       a.o(element, "defaultCardView");
       this.l(element);
       this.d().D(new DefaultCardProcessor$e(objectRef));
       this.j(this.h, this.j);
       this.j = null;
       objectRef = objectRef.element;
       this.h = objectRef;
       if (p0) {
          DefaultCardProcessor$f uof = new DefaultCardProcessor$f(this, uDegradePost);
          this.j = uof;
          this.k(objectRef, uof);
       }
       return;
    }
}
