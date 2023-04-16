package com.yxcorp.gifshow.reminder.friend.presenter.single.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.reminder.friend.presenter.single.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fr6.a;
import fr6.g;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.reminder.friend.presenter.single.d$b;
import erd.r;
import com.yxcorp.gifshow.reminder.friend.presenter.single.d$c;
import com.yxcorp.gifshow.reminder.friend.presenter.single.d$d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import wq6.d;
import com.kwai.robust.PatchProxyResult;
import wq6.k;
import mdc.b;
import java.lang.Boolean;
import zq6.r;
import bo5.a;
import zq6.p;
import co5.n;
import co5.m;
import zcc.l;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import j9c.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import eec.a;
import ekd.x0;
import lnc.o5;
import wkd.b;
import lnc.u5;
import k9c.e;
import ro5.a;
import sdc.a;

public final class d extends PresenterV2	// class@001ade
{
    public BaseFragment p;
    public a q;
    public final d$a r;

    public void d(){
       super();
       this.r = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       a uoa = this.R8();
       if (uoa != null) {
          uoa.b(this.r);
       }
       d tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       this.X7(tp.Vg().j().filter(d$b.b).filter(new d$c(this)).subscribe(new d$d(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       a uoa = this.R8();
       if (uoa != null) {
          uoa.e(this.r);
       }
       return;
    }
    public final d P8(){
       Object[] objArray1;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFragment");
       }
       if (!obj instanceof k) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.z5();
       }
       return objArray;
    }
    public final a R8(){
       Object[] objArray1;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFragment");
       }
       if (!obj instanceof k) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.b0();
       }
       return objArray;
    }
    public final b S8(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFragment");
       }
       if (obj instanceof b) {
          objArray = obj;
       }
       return objArray;
    }
    public final void V8(){
       boolean b;
       Uri data;
       Uri data1;
       d tp1;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "8")) {
          return;
       }
       b obj = PatchProxy.apply(objArray, this, uod, "7");
       d uod1 = null;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          tp1 = this.P8();
          if (tp1 != null) {
             r or = tp1.e0();
             if (or != null) {
                p y = a.y;
                a.o(y, "HomeTopStateId.TAB_RED_DOT_NOTIFY");
                n on = or.d(y);
                if (on == null || on.a != 1) {
                   y = a.z;
                   a.o(y, "HomeTopStateId.TAB_NUMBER_NOTIFY");
                   m om = or.d(y);
                   if (om == null || om.a != 1) {
                   label_0053 :
                      b = false;
                   }
                }
                b = true;
             }else {
                goto label_0053 ;
             }
          }else {
             goto label_0053 ;
          }
       }
       int i = 3;
       if (b) {
          obj = this.S8();
          int i1 = (l.a())? RedDotRepository.d(1): b.b(-7);
          if (i1 > 0 && obj != null) {
             d tp = this.p;
             if (tp == null) {
                a.S("mFragment");
             }
             FragmentActivity activity = tp.getActivity();
             if (activity != null) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                   data = intent.getData();
                label_008f :
                   if (a.e(data)) {
                      uod1 = this.p;
                      if (uod1 == null) {
                         a.S("mFragment");
                      }
                      FragmentActivity activity1 = uod1.getActivity();
                      if (activity1 != null) {
                         Intent intent1 = activity1.getIntent();
                         if (intent1 != null) {
                            data1 = intent1.getData();
                         label_00ae :
                            obj.E4(1, o5.b(x0.a(data1, "pushType"), i));
                         }
                      }
                      data1 = objArray;
                      goto label_00ae ;
                   }else {
                      obj.E4(uod1, uod1);
                   }
                }
             }
             data = objArray;
             goto label_008f ;
          }
          b.a(-1071465158).a(e.a());
          if (l.a() && !PatchProxy.applyVoid(objArray, this, uod, "9")) {
             uod = this.P8();
             if (uod != null) {
                a.h(uod);
                a.g(uod);
             }
          }
       }else {
          b.a(-1071465158).c();
          b uob = this.S8();
          if (uob != null) {
             tp1 = this.p;
             if (tp1 == null) {
                a.S("mFragment");
             }
             FragmentActivity activity2 = tp1.getActivity();
             if (activity2 != null) {
                Intent intent2 = activity2.getIntent();
                if (intent2 != null) {
                   objArray = intent2.getData();
                }
             }
             if (a.e(objArray)) {
                uob.mc(1, o5.b(x0.a(objArray, "pushType"), i));
             }else {
                uob.K9();
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(FriendSlideLogParamsHelper::class.java\)");
       this.q = obj;
       return;
    }
}
