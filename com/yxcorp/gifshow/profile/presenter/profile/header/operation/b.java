package com.yxcorp.gifshow.profile.presenter.profile.header.operation.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import xl8.b;
import s4c.h;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.a;
import erd.r;
import s4c.f;
import z5c.l0;
import j5c.c;
import s4c.e;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import com.kwai.framework.model.user.UserProfile;
import z5c.y1;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import k2b.f3;
import k2b.e0;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import u3c.h;
import v2c.g;
import com.kwai.robust.PatchProxyResult;
import z5c.c0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.model.UserProfileMeta;
import u3c.i;
import com.kwai.sdk.switchconfig.a;
import v3c.a;
import java.lang.reflect.Type;
import java.lang.System;
import s1c.o;
import km8.b;
import android.content.SharedPreferences;
import z5c.l2;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.util.Collections;
import java.lang.Long;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.b$a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.b$b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import s4c.g;
import lnc.i3;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import ekd.m1;
import android.view.ViewStub;
import java.lang.Integer;

public class b extends PresenterV2	// class@0014fe
{
    public Set A;
    public a B;
    public ViewStub p;
    public View q;
    public SizeAdjustableTextView r;
    public View s;
    public boolean t;
    public ProfileParam u;
    public c v;
    public User w;
    public BaseFragment x;
    public int y;
    public b z;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.X7(this.z.observable().subscribe(new h(this)));
       this.X7(this.x.Vg().j().filter(a.b).subscribe(new f(this), l0.b));
       this.X7(this.v.e().skip(1).subscribe(new e(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       u.c(this.B);
       this.B = null;
       return;
    }
    public final void P8(UserProfile p0){
       b x;
       String str1;
       boolean b3;
       boolean b = this;
       View obj = p0;
       y1 oy1 = y1.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, b.class, "5")) {
          return;
       }
       if (b.q == null) {
          return;
       }
       String obj1 = null;
       boolean b1 = false;
       if (b.u.getIsFirstEnterSelfProfile()) {
          x = b.x;
          if (!PatchProxy.applyVoidOneRefs(x, obj1, oy1, "24")) {
             f3 uof31 = f3.i(1273);
             uof31.d("SHOW_DATE_ASSISTANT_ENTRANCE");
             uof31.h(x);
          }
          b.u.setIsFirstEnterSelfProfile(b1);
       }
       KsLogProfileTag cREATOR_CENT = KsLogProfileTag.CREATOR_CENTER;
       String str = "MyProfileCreatorCenterPresenterV2";
       cREATOR_CENT.appendTag(str);
       g.e(cREATOR_CENT, "showEntrance: "+h.p(p0));
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj2 = PatchProxy.applyOneRefs(obj, obj1, c0.class, "1");
       boolean b2 = true;
       if (obj2 != patchProxyRe) {
          b2 = obj2.booleanValue();
       }else {
          obj1 = PatchProxy.applyOneRefs(obj, obj1, h.class, "7");
          if (obj1 != patchProxyRe) {
             b3 = obj1.booleanValue();
          }else {
             a.p(obj, "profile");
             UserProfileMeta userProfileM = i.c(p0);
             b3 = (userProfileM != null && userProfileM.mShowCreatorCenterRedDot == b2)? true: false;
          }
          obj1 = "ProfileCreatorCenterUtils";
          if (!b3) {
             cREATOR_CENT.appendTag(obj1);
             g.e(cREATOR_CENT, "no show red dot from server");
          }else {
             a value = a.t().getValue("ProfileCreatorCenterRedDotConfig", a.class, new a());
             if (value.mShowTimes != null && (value.mDurationInHours != null && (value.mDurationInDays == null || value.mRedDotValidDuration == null))) {
                str1 = str;
                cREATOR_CENT.appendTag(obj1);
                g.e(cREATOR_CENT, "invalid config info");
             label_00a7 :
                b2 = false;
             label_01f7 :
                b.t = b2;
                g.e(KsLogProfileTag.CREATOR_CENTER.appendTag(str1), "mIsRedDotShow: "+b.t);
                b.r.setOnClickListener(new b$a(b));
                obj = b.q.findViewById(R.id.profile_creator_center_notify);
                b.s = obj;
                if (b.t == null) {
                   b1 = 8;
                }
                obj.setVisibility(b1);
                b.X7(RxBus.f.g(b$b.class, RxBus$ThreadMode.MAIN).subscribe(new g(b)));
                b x1 = b.x;
                b w = b.w;
                b t = b.t;
                if (!PatchProxy.isSupport(oy1) || !PatchProxy.applyVoidThreeRefs(x1, w, Boolean.valueOf(t), null, y1.class, "86")) {
                   i3 oi3 = i3.f();
                   String str2 = (t != null)? "TRUE": "FALSE";
                   oi3.d("has_redpoint", str2);
                   f3 uof3 = f3.j("AUTHOR_CENTER_BUTTON");
                   uof3.b(b0.a(w.getId()));
                   uof3.m(oi3.e());
                   uof3.a("PERSONAL_INFO_FUNC");
                   uof3.h(x1);
                }
             }else {
                long l = System.currentTimeMillis();
                long l1 = 0;
                long longx = o.a.getLong(b.d("user")+"profile_creator_center_red_dot_forbidden_time", l1);
                Map map = o.f(l2.M);
                if (map != null) {
                   if (longx - l1 > 0) {
                      if ((l - longx) - ((long)value.mDurationInDays * 0x5265c00) > 0) {
                         c0.a();
                         c0.b(l, b1);
                      }else {
                         cREATOR_CENT.appendTag(obj1);
                         g.e(cREATOR_CENT, "in forbidden time, no show red dot");
                      }
                   }else if(map.size() >= value.mShowTimes){
                      Iterator iterator = map.entrySet().iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            if (iterator.next().getValue().booleanValue()) {
                               c0.a();
                               c0.b(l, b1);
                               g.e(KsLogProfileTag.CREATOR_CENTER.appendTag(obj1), "no click red dot in several times");
                            }
                         }else {
                            o.y(l);
                            g.e(KsLogProfileTag.CREATOR_CENTER.appendTag(obj1), "forbidden begin...");
                         }
                      }
                      return;
                   }else if(map.isEmpty()){
                      c0.a();
                      c0.b(l, b1);
                   }else {
                      longx = Collections.max(map.keySet()).longValue();
                      l1 = l - longx;
                      str1 = str;
                      if (l1 - ((long)value.mRedDotValidDuration * 0x36ee80) < 0 && !map.get(Long.valueOf(longx)).booleanValue()) {
                         cREATOR_CENT.appendTag(obj1);
                         g.e(cREATOR_CENT, "red dot in valid period,no show");
                         b1 = 0;
                      }else if((l - Collections.min(map.keySet()).longValue()) - ((long)value.mDurationInDays * 0x5265c00) > 0){
                         c0.a();
                         b1 = false;
                         c0.b(l, b1);
                         cREATOR_CENT.appendTag(obj1);
                         g.e(cREATOR_CENT, "more than x months");
                      }else {
                         b1 = false;
                         if (l1 - ((long)value.mDurationInHours * 0x36ee80) > 0) {
                            c0.b(l, b1);
                         }else {
                            goto label_00a7 ;
                         }
                      }
                      b2 = true;
                      goto label_01f7 ;
                   }
                }
             }
          }
          str1 = str;
          goto label_00a7 ;
       }
       str1 = str;
       goto label_01f7 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3273);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.u = this.q8(ProfileParam.class);
       this.v = this.r8("PROFILE_LOAD_STATE");
       this.w = this.q8(User.class);
       this.z = this.r8("PROFILE_MY_OPERATION_BUTTONS");
       this.x = this.r8("PROFILE_FRAGMENT");
       this.A = this.r8("PROFILE_BUBBLE_SHOW_TASK_LIST");
       this.y = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
