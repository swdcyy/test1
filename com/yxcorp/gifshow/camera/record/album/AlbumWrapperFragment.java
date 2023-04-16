package com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment;
import mm6.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment$a;
import com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment$b;
import com.yxcorp.gifshow.camera.record.album.AlbumWrapperFragment$c;
import mm6.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import android.view.View;
import sm6.b;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.trello.rxlifecycle3.components.support.RxFragment;
import k2b.u1;
import ga9.a;
import mm6.a;
import android.os.Bundle;
import sb9.a0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.moved.utility.AlbumEnv;
import i2b.a;
import com.yxcorp.gifshow.util.r0;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import android.view.KeyEvent;
import hka.d;
import hka.c;
import lnc.a1;
import android.content.Intent;
import com.yxcorp.utility.n;
import xnc.a;
import ekd.j0;
import android.os.SystemClock;
import w69.b$a;
import w69.b;
import w69.f$a;
import sb9.b0;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import uxb.o;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import android.content.res.Resources;
import cw9.c;
import w69.k$a;
import w69.k;
import ga9.c;
import w69.i$a;
import w69.d;
import w69.d$b;
import w69.e0;
import w69.d0;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import j79.a$a;
import j79.a;
import w69.i;
import x79.e;
import dc7.e;
import com.yxcorp.gifshow.album.IAlbumMainFragment$g;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import brd.t;
import sb9.d0;
import com.yxcorp.gifshow.camera.record.album.q;
import erd.g;
import crd.b;

public class AlbumWrapperFragment extends BaseFragment implements c	// class@001caa
{
    public boolean j;
    public IAlbumMainFragment k;
    public a0 l;
    public b m;
    public int n;
    public int o;
    public String p;
    public final k0 q;
    public final IAlbumMainFragment$g r;
    public final IAlbumMainFragment$b s;
    public static final int t;

    public void AlbumWrapperFragment(){
       super();
       this.p = "";
       this.q = new AlbumWrapperFragment$a(this);
       this.r = new AlbumWrapperFragment$b(this);
       this.s = new AlbumWrapperFragment$c(this);
    }
    public int Ff(){
       return b.c(this);
    }
    public int M(){
       return 4;
    }
    public int S5(){
       return b.d(this);
    }
    public String Xa(){
       return b.e(this);
    }
    public boolean a4(){
       return b.b(this);
    }
    public void ch(boolean p0){
       int i1;
       if (PatchProxy.isSupport(AlbumWrapperFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AlbumWrapperFragment.class, "14")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "AlbumWrapperFragment";
       a.D().w(str, "refreshBottomView "+p0, objArray);
       AlbumWrapperFragment obj = PatchProxy.apply(null, this, AlbumWrapperFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          i1 = obj.intValue();
       }else {
          obj = this.k;
          i1 = (obj != null)? obj.o5(): 0;
          Object[] objArray1 = new Object[i];
          a.D().w(str, "getSelectedItemCnt:"+i1, objArray1);
       }
       AlbumWrapperFragment uAlbumWrappe = (p0 || (this.j == null && !i1))? 1: null;
       int i2 = (uAlbumWrappe)? 0: 4;
       if (PatchProxy.isSupport(AlbumWrapperFragment.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), this, AlbumWrapperFragment.class, "13") && (this.getActivity() != null && this.getActivity() instanceof CameraActivity))) {
          this.getActivity().V0(i2, i);
       }
    label_00ac :
       AlbumWrapperFragment tk = this.k;
       if (tk != null) {
          View view = tk.B3();
          if (view != null) {
             if (uAlbumWrappe) {
                i = 4;
             }
             view.setVisibility(i);
          }
          View view1 = this.k.Sg();
          obj = (i1 > 0)? this.o: this.n;
          b.v(view1, obj);
       }
       return;
    }
    public void dg(Activity p0){
       b.a(this, p0);
    }
    public boolean f9(){
       return b.f(this);
    }
    public int getPage(){
       return 313;
    }
    public String getPageParams(){
       Object[] obj = PatchProxy.apply(null, this, AlbumWrapperFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this.p,"click_photo_picker"};
       return String.format("task_id=%s&entrance_type=%s", obj);
    }
    public String getUrl(){
       return "ks://camera/normal/album_or_photo_record";
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return false;
    }
    public String o(){
       return "MULTI_PHOTO_PICKER";
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumWrapperFragment.class, "1")) {
          return;
       }
       super.onAttach(p0);
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onAttach", objArray);
       this.p = u1.f();
       Object[] objArray1 = new Object[0];
       a.D().w("AlbumWrapperFragment", "onAttach TaskId:"+this.p+"/ extra:"+this.p, objArray1);
       return;
    }
    public boolean onBackPressed(){
       AlbumWrapperFragment obj = PatchProxy.apply(null, this, AlbumWrapperFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AlbumWrapperFragment", "onBackPressed", objArray);
       obj = this.k;
       if (obj != null && (obj.onBackPressed() && this.j != null)) {
          return true;
       }
       FragmentActivity activity = this.getActivity();
       if (activity == null) {
          return i;
       }
       AlbumWrapperFragment tk = this.k;
       if (tk != null) {
          tk.y8();
       }
       this.ch(true);
       if (activity instanceof a) {
          activity.A0();
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumWrapperFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          this.l = new a0(activity);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AlbumWrapperFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumWrapperFragment", "onCreateView", objArray);
       AlbumEnv.b(2);
       return a.h(p0, 0x7f0d04ac, p1, 0, 2);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AlbumWrapperFragment.class, "8")) {
          return;
       }
       super.onDestroy();
       AlbumWrapperFragment tl = this.l;
       if (tl != null) {
          tl.i();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AlbumWrapperFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       AlbumEnv.b(0);
       AlbumWrapperFragment tk = this.k;
       if (tk != null) {
          tk.d7();
          this.getChildFragmentManager().beginTransaction().u(this.k.b()).m();
          this.k = null;
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AlbumWrapperFragment.class, "6")) {
          return;
       }
       super.onPause();
       AlbumWrapperFragment tl = this.l;
       if (tl != null) {
          tl.j();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AlbumWrapperFragment.class, "5")) {
          return;
       }
       super.onResume();
       AlbumWrapperFragment tl = this.l;
       if (tl != null) {
          tl.k();
       }
       this.ch(false);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumWrapperFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "AlbumWrapperFragment";
       a.D().w(str, "onViewCreated", objArray);
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          int i1 = b.p(activity, p0);
          p0.setBackgroundColor(a1.a(R.color.arg_RES_7f060a46));
          p0.setPadding(i, i1, i, i);
          int i2 = n.j(activity) - i1;
          activity.getIntent().putExtra("key_enter_default_height", i2);
          objArray = null;
          AlbumBaseFragment uAlbumBaseFr = PatchProxy.apply(objArray, this, AlbumWrapperFragment.class, "11");
          if (uAlbumBaseFr != PatchProxyResult.class) {
          }else {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "createFragment", objArray1);
             Intent intent = new Intent();
             FragmentActivity activity1 = this.getActivity();
             if (activity1 != null) {
                Intent intent1 = this.getActivity().getIntent();
                if (a.b(intent1, intent, "fromCameraToAlbum")) {
                   intent.putExtra("record_mode", j0.b(intent1, "record_mode", i));
                   intent.putExtra("album_des_str", " ");
                   intent.putExtra("start_activity_time", SystemClock.uptimeMillis());
                   intent.putExtra("albumEnablePreviewNextStep", 1);
                   a.a(intent1, intent, i);
                }
             }
             Bundle extras = intent.getExtras();
             b$a uoa = new b$a();
             uoa.b(extras);
             b uob = uoa.a();
             f$a uoa1 = b0.a(this.p, objArray, "click_photo_picker");
             int[] ointArray = new int[]{1};
             uoa1.g(ointArray);
             f uof = uoa1.a();
             AlbumLimitOption$Builder uBuilder = o.a();
             uBuilder.p(i);
             AlbumLimitOption uAlbumLimitO = uBuilder.d();
             int i3 = c.b(activity1.getResources(), 0x7f07013b) + b.j(activity1);
             k$a uoa2 = b0.c(objArray);
             uoa2.O = i3;
             uoa2.M = i3;
             uoa2.y = 0x7f080fc3;
             uoa2.s(0);
             k ok = uoa2.b();
             c uoc = b0.d(extras, 1);
             b0.b(uoc);
             i$a uoa3 = new i$a();
             if (extras != null) {
                d uod = d.h.b(extras);
                if (uod.b() == null && (uod.a() != null || uod.e() != null)) {
                   uoa3 = uoa3.c(uod);
                }
             }
             if (PostExperimentUtils.f()) {
                a$a uoa4 = new a$a();
                uoa4.d(1);
                uoa3.g(uoa4.a());
             }
             IAlbumMainFragment iAlbumMainFr = e.f().d(uoa3.a(uob).d(uof).n(uoc).m(ok).f(uAlbumLimitO).b());
             this.k = iAlbumMainFr;
             iAlbumMainFr.I3(this.q);
             this.k.u3(this.r);
             this.k.v5(this.s);
             uAlbumBaseFr = this.k.b();
          }
          this.m = uAlbumBaseFr.m().subscribe(new d0(this, activity), q.b);
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.v(R.id.content_fragment, uAlbumBaseFr);
          uoe.m();
       }
       return;
    }
    public boolean re(){
       return b.g(this);
    }
    public boolean x2(){
       return true;
    }
}
