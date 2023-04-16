package com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment;
import k3c.v1;
import hka.l;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$a;
import nsd.u;
import crd.a;
import s1c.r0;
import hka.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import kotlin.jvm.internal.a;
import crd.b;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import hw9.a;
import hw9.a$a;
import q87.c;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.core.view.ViewKt;
import wkd.b;
import jw9.a;
import w46.b;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$b;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$c;
import erd.g;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$f;
import java.lang.Runnable;
import java.util.HashMap;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$e;
import android.view.View$OnClickListener;
import s1c.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$d;
import java.lang.Integer;
import u2c.d;

public final class ProfileCreationTabFragment extends LazyInitSupportedFragment implements v1, l	// class@0012cb
{
    public final a A;
    public b B;
    public HashMap C;
    public boolean s;
    public View t;
    public KwaiEmptyStateView u;
    public View v;
    public View w;
    public View x;
    public r0 y;
    public CreationTabResponse z;
    public static final ProfileCreationTabFragment$a D;

    static {
       ProfileCreationTabFragment.D = new ProfileCreationTabFragment$a(null);
    }
    public void ProfileCreationTabFragment(){
       super();
       this.A = new a();
    }
    public void Fc(r0 p0){
       this.y = p0;
    }
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return j.b(this);
    }
    public boolean Xg(){
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationTabFragment.class, "9")) {
          return;
       }
       this.nh();
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileCreationTabFragment.class, "8");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0504, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­tainer,\n      false\n    \)");
       return view;
    }
    public void ga(boolean p0){
       this.s = p0;
    }
    public boolean h9(){
       return this.s;
    }
    public boolean i0(){
       return j.c(this);
    }
    public final void mh(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationTabFragment.class, "11")) {
          return;
       }
       ProfileCreationTabFragment tB = this.B;
       if (tB != null && (tB != null && !tB.isDisposed())) {
          tB = this.B;
          if (tB != null) {
             tB.dispose();
          }
       }
       return;
    }
    public boolean n5(){
       return j.e(this);
    }
    public final void nh(){
       String id;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileCreationTabFragment.class, "4")) {
          return;
       }
       ProfileCreationTabFragment ty = this.y;
       if (ty != null) {
          r0 b = ty.b;
          if (b != null) {
             id = b.getId();
          label_001a :
             String str = 1;
             a$a uoa = (id == null || !id.length())? 1: null;
             if (uoa) {
                this.x4();
                return;
             }else {
                uoa = a.c;
                Object[] objArray1 = new Object[0];
                uoa.a().s("ProfileCreationTabFragment", "init subtab start", objArray1);
                c childFragmen = this.getChildFragmentManager();
                Fragment uFragment = (childFragmen != null)? childFragmen.findFragmentByTag("SUB_FRAGMENT_TAG"): objArray;
                if (uFragment == null && !PatchProxy.applyVoid(objArray, this, ProfileCreationTabFragment.class, "7")) {
                   ProfileCreationTabFragment tt = this.t;
                   if (tt != null) {
                      ViewKt.g(tt, 0);
                   }
                   tt = this.v;
                   if (tt != null) {
                      ViewKt.g(tt, str);
                   }
                   this.oh();
                }
                a uoa1 = b.a(0x263459e4);
                if (uoa1 == null) {
                   this.x4();
                   objArray = new Object[0];
                   uoa.a().t("ProfileCreationTabFragment", "init subtab failed: service is null", objArray);
                   return;
                }else {
                   this.mh();
                   this.B = uoa1.b(id).subscribeOn(a.c()).subscribe(new ProfileCreationTabFragment$b(this), new ProfileCreationTabFragment$c(this));
                   return;
                }
             }
          }
       }
       id = objArray;
       goto label_001a ;
    }
    public final void oh(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationTabFragment.class, "2")) {
          return;
       }
       ProfileCreationTabFragment tt = this.t;
       int i = 0;
       ProfileCreationTabFragment$f uof = 1;
       if (tt != null) {
          tt = (!tt.getVisibility())? 1: null;
          if (tt != uof) {
          label_001d :
             tt = this.v;
             if (tt != null) {
                if (!tt.getVisibility()) {
                   i = 1;
                }
                if (i == uof) {
                label_002a :
                   tt = this.x;
                   if (tt != null) {
                      if (!tt.getHeight()) {
                         this.ph(tt.getHeight());
                      }else {
                         ProfileCreationTabFragment tx = this.x;
                         if (tx != null) {
                            tx.post(new ProfileCreationTabFragment$f(this, tt));
                         }
                      }
                   }
                }
             }
          }else {
             goto label_002a ;
          }
       }else {
          goto label_001d ;
       }
    label_0049 :
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationTabFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       this.A.d();
       this.mh();
       if (!PatchProxy.applyVoid(null, this, ProfileCreationTabFragment.class, "13")) {
          ProfileCreationTabFragment tC = this.C;
          if (tC != null) {
             tC.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileCreationTabFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.t = p0.findViewById(0x7f0a0d29);
       KwaiEmptyStateView kwaiEmptySta = p0.findViewById(R.id.empty_state_tips_view);
       this.u = kwaiEmptySta;
       if (kwaiEmptySta != null) {
          kwaiEmptySta.p(new ProfileCreationTabFragment$e(this));
       }
       this.v = p0.findViewById(0x7f0a291b);
       this.w = p0.findViewById(0x7f0a3983);
       this.x = p0.findViewById(0x7f0a0a1c);
       this.nh();
       ProfileCreationTabFragment ty = this.y;
       if (ty != null) {
          r0 e = ty.e;
          if (e != null) {
             a d = e.d;
             if (d != null) {
                this.A.c(d.f("PROFILE_TAB_CHANGE").subscribe(new ProfileCreationTabFragment$d(this)));
             }
          }
       }
       return;
    }
    public final void ph(int p0){
       if (PatchProxy.isSupport(ProfileCreationTabFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProfileCreationTabFragment.class, "3")) {
          return;
       }
       if (p0 <= 0) {
          return;
       }
       ProfileCreationTabFragment ty = this.y;
       if (ty != null) {
          r0 e = ty.e;
          if (e != null) {
             a d = e.d;
             if (d != null) {
                d.b("PROFILE_SCROLL_SIZE", "MAIN_KEY", new d(this.hashCode(), p0));
             }
          }
       }
       return;
    }
    public boolean u2(){
       return j.f(this);
    }
    public boolean x0(){
       return j.a(this);
    }
    public final void x4(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationTabFragment.class, "6")) {
          return;
       }
       ProfileCreationTabFragment tt = this.t;
       if (tt != null) {
          ViewKt.g(tt, true);
       }
       tt = this.v;
       if (tt != null) {
          ViewKt.g(tt, false);
       }
       this.oh();
       return;
    }
}
