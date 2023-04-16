package com.yxcorp.gifshow.reminder.ReminderTabHostFragment;
import on5.f;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import ncc.k;
import java.lang.String;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import on5.e;
import lfc.d;
import kcc.r;
import ok.h;
import lfc.m;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import tyc.q4;
import hka.m;
import kfc.a;
import nec.d;
import android.os.Bundle;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Parcelable;
import ncc.h;
import com.yxcorp.gifshow.refresh.RefreshType;
import fr6.a;
import wq6.k;
import wq6.j;
import android.view.View;
import wkd.b;
import gfc.f;
import gfc.g;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.StringBuilder;
import k2b.d0;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import wq6.d;
import java.util.List;

public class ReminderTabHostFragment extends TabHostFragment implements f	// class@001a64
{
    public final h B;
    public String C;
    public PresenterV2 D;
    public d E;

    public void ReminderTabHostFragment(){
       super();
       this.B = new k();
    }
    public static ReminderTabHostFragment Rh(String p0,Uri p1){
       ReminderTabHostFragment obj = PatchProxy.applyTwoRefs(p0, p1, null, ReminderTabHostFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ReminderTabHostFragment();
       obj.Uh(p0, p1);
       return obj;
    }
    public boolean B7(){
       return e.f(this);
    }
    public void L8(){
       e.h(this);
    }
    public int M(){
       return 1;
    }
    public void N1(){
       e.j(this);
    }
    public final d Qh(){
       Object obj = PatchProxy.apply(null, this, ReminderTabHostFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.E == null) {
          this.E = new d(this, new r(this));
       }
       return this.E;
    }
    public final void Sh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReminderTabHostFragment.class, "12")) {
          return;
       }
       m om = this.Qh().a();
       Objects.requireNonNull(om);
       if (!PatchProxy.applyVoid(objArray, om, m.class, "4")) {
          Fragment uFragment = om.a.t();
          if (uFragment == null) {
             q4.e(om.a);
          }else if(uFragment instanceof m){
             uFragment.N1();
          }else {
             q4.e(uFragment);
          }
       }
       return;
    }
    public void Th(){
       if (PatchProxy.applyVoid(null, this, ReminderTabHostFragment.class, "13")) {
          return;
       }
       d c = this.Qh().c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs("TabHost", c, a.class, "1")) {
          c.a();
       }
       return;
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public final void Uh(String p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReminderTabHostFragment.class, "15")) {
          return;
       }
       Bundle arguments = this.getArguments();
       if (arguments == null) {
          arguments = new Bundle();
          this.setArguments(arguments);
       }
       if (!TextUtils.isEmpty(p0) && !PatchProxy.applyVoidTwoRefs(arguments, p0, null, d.class, "4")) {
          arguments.putString("KEY_INSIDE_TAB_ID", p0);
       }
       if (p1 != null && !PatchProxy.applyVoidTwoRefs(arguments, p1, null, d.class, "2")) {
          arguments.putParcelable("KEY_REMINDER_URI", p1);
       }
       return;
    }
    public void Vh(String p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReminderTabHostFragment.class, "14")) {
          return;
       }
       this.Uh(p0, p1);
       p0 = this.Qh().a().a(d.d(this, this.getArguments(), this.B.b()));
       if (p0 != null) {
          this.Ih(p0, null);
       }
       return;
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, ReminderTabHostFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getUrl();
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public void fh(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReminderTabHostFragment.class, "9")) {
          return;
       }
       this.a6();
       m om1 = this.Qh().a();
       Objects.requireNonNull(om1);
       String str = PatchProxy.apply(null, om1, om, "1");
       if (str != patchProxyRe) {
       }else {
          om1 = om1.a;
          str = d.d(om1, om1.getArguments(), TextUtils.i(om1.c(b.a(-632202392).a), om1.a.B.b()));
       }
       String str1 = this.Qh().a().a(str);
       this.C = str1;
       this.Lh(str1);
       super.fh(p0, p1);
       m om2 = this.Qh().a();
       Objects.requireNonNull(om2);
       Object obj = PatchProxy.apply(null, om2, om, "3");
       int i = (obj != patchProxyRe)? obj.intValue(): om2.a.B.i();
       this.Nh(i);
       this.Oh(this.Qh().e);
       this.t.setTabGravity(17);
       PresenterV2 presenterV2 = this.Qh().a().b(this.v);
       this.D = presenterV2;
       presenterV2.f(p0);
       Object[] objArray = new Object[]{this.Qh()};
       this.D.i(objArray);
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, ReminderTabHostFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(this.Qh().a());
       return 0x7f0d1314;
    }
    public int getPage(){
       Fragment obj = PatchProxy.apply(null, this, ReminderTabHostFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t();
       if (obj instanceof e0) {
          return obj.getPage();
       }
       return super.getPage();
    }
    public String getUrl(){
       String str;
       ReminderTabHostFragment obj = PatchProxy.apply(null, this, ReminderTabHostFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (this.u != null) {
          str = this.xh(this.ph());
       }
       StringBuilder str1 = "ks://reminder";
       str = (TextUtils.isEmpty(str))? "": "/"+str;
       return str1+str;
    }
    public String h5(){
       Fragment obj = PatchProxy.apply(null, this, ReminderTabHostFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t();
       if (obj instanceof e0) {
          return obj.h5();
       }
       return d0.g(this);
    }
    public boolean i8(){
       return e.e(this);
    }
    public boolean lh(){
       return true;
    }
    public String o(){
       Fragment obj = PatchProxy.apply(null, this, ReminderTabHostFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t();
       if (obj instanceof e0) {
          return obj.o();
       }
       return super.o();
    }
    public boolean o3(){
       Object obj = PatchProxy.apply(null, this, ReminderTabHostFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.Th();
       return false;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderTabHostFragment.class, "8")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity().getIntent() != null) {
          String str = d.e(this.getActivity().getIntent());
          if (str != null) {
             this.Uh(str, null);
          }
       }
       super.onCreate(p0);
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReminderTabHostFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       ReminderTabHostFragment tD = this.D;
       if (tD != null) {
          tD.destroy();
       }
       FragmentActivity activity = this.getActivity();
       if (!PatchProxy.applyVoidOneRefs(activity, objArray, d.class, "13") && activity != null) {
          activity.getIntent().removeExtra("key_jump_to_nasa_reminder_inner_tab");
       }
       return;
    }
    public void onRefresh(){
       if (PatchProxy.applyVoid(null, this, ReminderTabHostFragment.class, "17")) {
          return;
       }
       this.a();
       return;
    }
    public int r(){
       return e.a(this);
    }
    public d s8(){
       return j.b(this);
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public List wh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, ReminderTabHostFragment.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Qh().a();
       Objects.requireNonNull(obj);
       List list = PatchProxy.apply(objArray, obj, m.class, "2");
       if (list != patchProxyRe) {
       }else {
          m a = obj.a;
          list = a.B.c(a);
       }
       return list;
    }
    public d z5(){
       return j.c(this);
    }
}
