package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$a;
import nsd.u;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$mEmptyView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$mCloseConfig$2;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$mPageListObserver$2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$g;
import qvb.q;
import qvb.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.profile.model.ProfileEmptyUserGuideInfo;
import java.util.Collection;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$e;
import android.view.View;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$c;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$d;
import t2b.b;
import i4c.q;
import t2b.a$a;
import t2b.b$d;
import i4c.r;
import y8c.g;
import t2b.b$e;
import t2b.b$c;
import g9c.a;
import qrd.l1;
import lnc.a1;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import n7c.c;
import android.content.res.Resources;
import android.widget.TextView;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s1c.o;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.util.Objects;
import u3c.c;
import java.lang.Long;
import java.lang.Number;
import java.lang.System;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import x3c.c;
import l3c.a0;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewParent;
import i4c.s;
import lkd.b;
import i4c.t;
import com.yxcorp.gifshow.profile.http.l;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$modifyGuideList$hasPostedFeed$2;
import z5c.l3;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$h;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import v2c.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import yqb.a;
import y8c.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$i;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class MyProfileEmptyGuideTipPresenter extends PresenterV2	// class@001415
{
    public RecyclerView A;
    public int B;
    public final p C;
    public final p D;
    public final p E;
    public l p;
    public t q;
    public ProfileParam r;
    public c s;
    public BaseFragment t;
    public RxPageBus u;
    public RecyclerFragment v;
    public List w;
    public b x;
    public TextView y;
    public View z;
    public static final Map F;
    public static final MyProfileEmptyGuideTipPresenter$a G;

    static {
       MyProfileEmptyGuideTipPresenter.G = new MyProfileEmptyGuideTipPresenter$a(null);
       HashMap hashMap = new HashMap(6);
       hashMap.put("CONTACT", Integer.valueOf(1));
       hashMap.put("AVATAR", Integer.valueOf(2));
       hashMap.put("NICKNAME", Integer.valueOf(3));
       hashMap.put("BIO", Integer.valueOf(4));
       hashMap.put("FRIEND", Integer.valueOf(5));
       hashMap.put("POST", Integer.valueOf(6));
       MyProfileEmptyGuideTipPresenter.F = hashMap;
    }
    public void MyProfileEmptyGuideTipPresenter(){
       super();
       this.B = 2;
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       this.C = s.b(nONE, new MyProfileEmptyGuideTipPresenter$mEmptyView$2(this));
       this.D = s.b(nONE, MyProfileEmptyGuideTipPresenter$mCloseConfig$2.INSTANCE);
       this.E = s.b(nONE, new MyProfileEmptyGuideTipPresenter$mPageListObserver$2(this));
    }
    public void E8(){
       MyProfileEmptyGuideTipPresenter tu;
       if (PatchProxy.applyVoid(null, this, MyProfileEmptyGuideTipPresenter.class, "19")) {
          return;
       }
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       String str = "MyProfileEmptyGuideTipPresenter";
       if (e.f()) {
          e.i(str, "isUserInfoCardHoldByPostCard");
          tu = this.u;
          if (tu == null) {
             a.S("mRxPageBus");
          }
          this.X7(tu.g("PROFILE_POST_CARD_SHOW_USER_INFO_CARD", RxPageBus$ThreadMode.MAIN, true).subscribe(new MyProfileEmptyGuideTipPresenter$f(this), Functions.d()));
       }else {
          e.i(str, "directly listen event");
          tu = this.s;
          if (tu == null) {
             a.S("mLoadState");
          }
          this.X7(tu.d().subscribe(new MyProfileEmptyGuideTipPresenter$g(this), Functions.d()));
          tu = this.p;
          if (tu == null) {
             a.S("mPageList");
          }
          tu.h(this.Z8());
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyProfileEmptyGuideTipPresenter.class, "20")) {
          return;
       }
       MyProfileEmptyGuideTipPresenter tp = this.p;
       if (tp == null) {
          a.S("mPageList");
       }
       tp.f(this.Z8());
       return;
    }
    public final void P8(List p0){
       MyProfileEmptyGuideTipPresenter myProfileEmp = MyProfileEmptyGuideTipPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, myProfileEmp, "28")) {
          return;
       }
       if (a.g(p0, this.w)) {
          return;
       }
       this.R8(p0);
       this.j9(p0);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 1;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          MyProfileEmptyGuideTipPresenter tw = this.w;
          if (tw == null || !tw.contains(obj1)) {
             i = 1;
          }
          if (i) {
             uArrayList.add(obj);
          }
       }
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          this.X7(iterator1.next().observable().subscribe(new MyProfileEmptyGuideTipPresenter$e(this, p0), Functions.d()));
       }
       MyProfileEmptyGuideTipPresenter tz = this.z;
       MyProfileEmptyGuideTipPresenter$d uod = null;
       if (tz != null) {
          if (!(tz.hasOnClickListeners() ^ i1)) {
             tz = uod;
          }
          if (tz != null) {
             tz.post(new MyProfileEmptyGuideTipPresenter$b(this));
             tz.setOnClickListener(new MyProfileEmptyGuideTipPresenter$c(this));
          }
       }
       tz = this.A;
       if (tz != null) {
          if (tz.getAdapter() == null) {
             uod = new MyProfileEmptyGuideTipPresenter$d(this, p0);
             if (!PatchProxy.applyVoidTwoRefs(tz, uod, this, myProfileEmp, "34")) {
                b uob = new b(new q(this));
                this.x = uob;
                uob.d(tz, new b$d(), new r(uod));
             }
             myProfileEmp = this.x;
             if (myProfileEmp != null) {
                myProfileEmp.b();
             }
             uod.W0(p0);
             tz.setAdapter(uod);
             tz.addItemDecoration(new e(i, a1.e(12.00f), a1.e(19.00f), a1.e(19.00f)));
          }else {
             myProfileEmp = this.x;
             if (myProfileEmp != null) {
                myProfileEmp.c(i1);
             }
             myProfileEmp = this.x;
             if (myProfileEmp != null) {
                myProfileEmp.b();
             }
             RecyclerView$Adapter adapter = tz.getAdapter();
             if (adapter instanceof g) {
                uod = adapter;
             }
             if (uod != null) {
                uod.W0(p0);
                uod.k0();
             }
          }
       }
       this.w = p0;
       return;
    }
    public final void R8(List p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileEmptyGuideTipPresenter.class, "33")) {
          return;
       }
       int i = (c.c())? 0x7f101660: 0x7f104fdd;
       MyProfileEmptyGuideTipPresenter ty = this.y;
       if (ty != null) {
          Resources resources = ty.getResources();
          Object[] objArray = new Object[2];
          if (p0 instanceof Collection && p0.isEmpty()) {
             i1 = 0;
          }else {
             Iterator iterator = p0.iterator();
             i1 = 0;
             while (iterator.hasNext()) {
                boolean b = (iterator.next().mStatus == 1)? true: false;
                if (b) {
                   i1 = i1 + 1;
                   if (i1 < 0) {
                      CollectionsKt__CollectionsKt.V();
                   }
                }
             }
          }
          objArray[0] = Integer.valueOf(i1);
          objArray[1] = Integer.valueOf(p0.size());
          ty.setText(resources.getString(i, objArray));
       }
       return;
    }
    public final boolean S8(){
       SharedPreferences a;
       boolean b;
       boolean b1;
       MyProfileEmptyGuideTipPresenter v;
       List list;
       long l1;
       Iterator iterator;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MyProfileEmptyGuideTipPresenter myProfileEmp = MyProfileEmptyGuideTipPresenter.class;
       Object[] objArray = null;
       MyProfileEmptyGuideTipPresenter obj1 = PatchProxy.apply(objArray, obj, myProfileEmp, "22");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = obj.p;
       if (obj1 == null) {
          a.S("mPageList");
       }
       int count = obj1.getCount();
       int i = o.i();
       a = o.a;
       String str = "user";
       long l = 0;
       long longx = a.getLong(b.d(str)+"profile_empty_user_guide_last_shown_time", l);
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       b = false;
       if (e.d()) {
          Objects.requireNonNull(e);
          MyProfileEmptyGuideTipPresenter obj2 = PatchProxy.apply(objArray, e, ProfilePostEmptyCardUtils.class, "14");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          label_00c5 :
             if (count > 3 || b1) {
                if (!longx || (System.currentTimeMillis() - longx) - (this.V8().mAlertLimitedSeconds * (long)1000) >= 0) {
                   obj.c9(true);
                }else {
                   obj.c9(b);
                }
                v = obj.v;
                if (v == null) {
                   a.S("mFragment");
                }
                v.ia().l1(this.W8());
                return b;
             }else {
                v = obj.r;
                if (v == null) {
                   a.S("mParam");
                }
                ProfileParam mUserProfile = v.mUserProfileResponse;
                if (mUserProfile != null) {
                   list = c.a(mUserProfile);
                   if (list != null && (list.isEmpty() ^ 1)) {
                   label_00eb :
                      obj2 = obj.q;
                      if (obj2 == null) {
                         a.S("mTipsHelper");
                      }
                      if (obj2 instanceof a0) {
                         objArray = obj2;
                      }
                      if (objArray != null) {
                         if (list != null) {
                            obj.b9(list);
                            if (!list.isEmpty()) {
                               iterator = list.iterator();
                               while (true) {
                                  if (iterator.hasNext()) {
                                     boolean b2 = (iterator.next().mStatus == 1)? true: false;
                                     if (!b2) {
                                        l1 = 0;
                                        break ;
                                     }
                                  }
                               }
                               if (!l1) {
                                  if (!count) {
                                     obj.c9(b);
                                     obj1 = obj.v;
                                     if (obj1 == null) {
                                        a.S("mFragment");
                                     }
                                     obj1.ia().l1(this.W8());
                                     if (!PatchProxy.applyVoidTwoRefs(list, objArray, obj, myProfileEmp, "25")) {
                                        if (this.W8().getParent() == null) {
                                           objArray.D(new s(obj));
                                           objArray.i();
                                           this.W8().setVisibility(b);
                                        }
                                        obj.P8(list);
                                     }
                                     return true;
                                  }else if(!ProfilePostEmptyCardUtils.e.d()){
                                     objArray.g();
                                     obj.c9(b);
                                     if (!PatchProxy.applyVoidTwoRefs(list, objArray, obj, myProfileEmp, "26")) {
                                        myProfileEmp = obj.v;
                                        if (myProfileEmp == null) {
                                           a.S("mFragment");
                                        }
                                        if (!myProfileEmp.ia().T0(this.W8())) {
                                           objArray.B = new t(obj);
                                           myProfileEmp = obj.v;
                                           if (myProfileEmp == null) {
                                              a.S("mFragment");
                                           }
                                           myProfileEmp.ia().L0(this.W8());
                                           this.W8().setVisibility(b);
                                        }
                                        obj.P8(list);
                                     }
                                     b = true;
                                  }else {
                                     this.d9();
                                  }
                                  return b;
                               }
                            }
                            l1 = 1;
                            goto label_0126 ;
                         }
                         if (!longx || (System.currentTimeMillis() - longx) - (this.V8().mAlertLimitedSeconds * (long)1000) >= 0) {
                            obj.c9(true);
                         }else {
                            obj.c9(b);
                         }
                         this.d9();
                      }
                      return b;
                   }
                }
                list = objArray;
                goto label_00eb ;
             }
          }else if(a.getBoolean(b.d(str)+"is_user_closed_empty_profile_user_info_card", b)){
             if (e.g()) {
                e.i("isClosedUserInfoCard", "user is closed UserInfoCard");
             label_008d :
                b1 = true;
                goto label_00c5 ;
             }else {
                o.u(b);
             }
          }
       }else if(this.V8().mDisableTimes > i){
          Long longx1 = Long.valueOf(longx);
          l1 = longx1.longValue();
          iterator = (!l1 - l || (System.currentTimeMillis() - l1) - (this.V8().mIntervalSeconds * (long)1000) >= 0)? 1: 0;
          if (!iterator) {
             longx1 = objArray;
          }
          if (longx1 == null) {
             goto label_008d ;
          }
       }else {
          goto label_008d ;
       }
       b1 = false;
       goto label_00c5 ;
    }
    public final c V8(){
       Object obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
    public final View W8(){
       Object obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public final RecyclerFragment X8(){
       MyProfileEmptyGuideTipPresenter obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj;
    }
    public final l Y8(){
       MyProfileEmptyGuideTipPresenter obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPageList");
       }
       return obj;
    }
    public final q Z8(){
       Object obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.getValue();
    }
    public final ProfileParam a9(){
       MyProfileEmptyGuideTipPresenter obj = PatchProxy.apply(null, this, MyProfileEmptyGuideTipPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mParam");
       }
       return obj;
    }
    public final void b9(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileEmptyGuideTipPresenter.class, "29")) {
          return;
       }
       p op = s.b(LazyThreadSafetyMode.NONE, new MyProfileEmptyGuideTipPresenter$modifyGuideList$hasPostedFeed$2(this));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ProfileEmptyUserGuideInfo profileEmpty = iterator.next();
          if (a.g(profileEmpty.mType, "POST")) {
             int i = 1;
             if (profileEmpty.mStatus != i && op.getValue().booleanValue()) {
                profileEmpty.mStatus = i;
             }
          }
       }
       return;
    }
    public final void c9(boolean p0){
       MyProfileEmptyGuideTipPresenter myProfileEmp = MyProfileEmptyGuideTipPresenter.class;
       if (PatchProxy.isSupport(myProfileEmp) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, myProfileEmp, "23")) {
          return;
       }
       myProfileEmp = this.u;
       if (myProfileEmp == null) {
          a.S("mRxPageBus");
       }
       myProfileEmp.e("PROFILE_CAN_SHOW_EDIT_DIALOG", "MAIN_KEY", Boolean.valueOf(p0));
       return;
    }
    public final void d9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MyProfileEmptyGuideTipPresenter.class, "24")) {
          return;
       }
       MyProfileEmptyGuideTipPresenter tv = this.v;
       if (tv == null) {
          a.S("mFragment");
       }
       tv.ia().l1(this.W8());
       tv = this.p;
       if (tv == null) {
          a.S("mPageList");
       }
       if (!tv.getCount()) {
          tv = this.q;
          if (tv == null) {
             a.S("mTipsHelper");
          }
          if (tv instanceof a0) {
             objArray = tv;
          }
          if (objArray != null) {
             this.h9(objArray);
          }
       }
       return;
    }
    public final void e9(l3 p0){
       MyProfileEmptyGuideTipPresenter tu;
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileEmptyGuideTipPresenter.class, "32")) {
          return;
       }
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       if (e.e()) {
          tu = this.u;
          if (tu == null) {
             a.S("mRxPageBus");
          }
          tu.b("PROFILE_USER_INFO_CARD_SHOW_POST_CARD", "MAIN_KEY", p0);
       }else if(e.d()){
          tu = this.u;
          if (tu == null) {
             a.S("mRxPageBus");
          }
          tu.b("PROFILE_POST_DEFAULT_CARD_SHOW", "MAIN_KEY", p0);
       }
       return;
    }
    public final void h9(a0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileEmptyGuideTipPresenter.class, "27")) {
          return;
       }
       p0.D(MyProfileEmptyGuideTipPresenter$h.a);
       p0.i();
       g.e(KsLogProfileTag.PHOTO_EMPTY_VIEW_GUIDE.appendTag("MyProfileEmptyGuideTip"), "no guide info ");
       RxBus.f.b(new a(false));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfileEmptyGuideTipPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(AccessIds.PAGE_LIST\)");
       this.p = obj;
       obj = this.q8(t.class);
       a.o(obj, "inject\(TipsHelper::class.java\)");
       this.q = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.r = obj;
       obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.s = obj;
       obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.t = obj;
       obj = this.r8("PROFILE_PAGE_RXBUS");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_PAGE_RXBUS\)");
       this.u = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.v = obj;
       return;
    }
    public final void j9(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileEmptyGuideTipPresenter.class, "31")) {
          return;
       }
       CollectionsKt___CollectionsKt.f5(p0, MyProfileEmptyGuideTipPresenter$i.b);
       return;
    }
    public final boolean k9(UserProfileResponse p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, MyProfileEmptyGuideTipPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.W8().getParent() != null) {
          List list = c.a(p0);
          if (list != null) {
             this.b9(list);
             if (!list.isEmpty()) {
                if (!list.isEmpty()) {
                   Iterator iterator = list.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         boolean b1 = (iterator.next().mStatus == 1)? true: false;
                         if (!b1) {
                            iterator = 0;
                            break ;
                         }
                      }
                   }
                   if (!i) {
                      i = 0;
                   label_0057 :
                      if (!i) {
                      label_005b :
                         if (list == null) {
                            this.d9();
                         }else {
                            this.P8(list);
                            b = true;
                         }
                      }
                   }
                }
                i = 1;
                goto label_0051 ;
             }
             i = 1;
             goto label_0057 ;
          }
          list = null;
          goto label_005b ;
       }
       return b;
    }
}
