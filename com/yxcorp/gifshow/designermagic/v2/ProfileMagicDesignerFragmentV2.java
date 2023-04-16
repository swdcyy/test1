package com.yxcorp.gifshow.designermagic.v2.ProfileMagicDesignerFragmentV2;
import com.yxcorp.gifshow.profile.fragment.ProfileTabItemFragment;
import io.reactivex.subjects.PublishSubject;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y2c.o;
import com.yxcorp.gifshow.designermagic.v2.a;
import y8c.t;
import com.yxcorp.gifshow.designermagic.v2.c;
import s1c.r0;
import java.util.List;
import tw9.i;
import java.util.Map;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import tw9.e;
import erd.g;
import crd.b;
import lnc.b9;
import androidx.recyclerview.widget.RecyclerView;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import lnc.a1;
import sw9.b;
import java.lang.Math;
import java.lang.Boolean;
import tw9.f;
import java.lang.Runnable;
import ekd.k1;
import s1c.a;
import qvb.i;
import j5c.b;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import y8c.g;
import tw9.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import android.content.Context;
import com.yxcorp.gifshow.designermagic.v2.ProfileMagicDesignerFragmentV2$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.GridLayoutManager;
import com.yxcorp.gifshow.designermagic.c;
import com.kwai.framework.model.user.User;

public class ProfileMagicDesignerFragmentV2 extends ProfileTabItemFragment	// class@00132b
{
    public r0 F;
    public PublishSubject G;
    public FragmentCompositeLifecycleState H;
    public b I;

    public void ProfileMagicDesignerFragmentV2(){
       super();
       this.G = PublishSubject.g();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileMagicDesignerFragmentV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new o());
       obj.U7(new a());
       PatchProxy.onMethodExit(ProfileMagicDesignerFragmentV2.class, "6");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, ProfileMagicDesignerFragmentV2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public void Fc(r0 p0){
       this.F = p0;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, ProfileMagicDesignerFragmentV2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this);
       obj.add(this.F);
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileMagicDesignerFragmentV2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ProfileMagicDesignerFragmentV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ProfileMagicDesignerFragmentV2.class, new i());
       }else {
          obj.put(ProfileMagicDesignerFragmentV2.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileMagicDesignerFragmentV2.class, "9")) {
          return;
       }
       super.onCreate(p0);
       FragmentCompositeLifecycleState uFragmentCom = new FragmentCompositeLifecycleState(this);
       this.H = uFragmentCom;
       this.I = uFragmentCom.j().subscribe(new e(this));
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProfileMagicDesignerFragmentV2.class, "10")) {
          return;
       }
       super.onDestroy();
       b9.a(this.I);
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, ProfileMagicDesignerFragmentV2.class, "3")) {
          return;
       }
       super.th();
       this.h0().setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f060961));
       this.h0().setPadding(Math.round(((float)a1.e(15.00f) * b.a)), Math.round(((float)a1.e(15.00f) * b.a)), Math.round(((float)a1.e(15.00f) * b.a)), Math.round(((float)a1.e(15.00f) * b.a)));
       this.h0().setClipChildren(false);
       this.h0().setClipToPadding(false);
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ProfileMagicDesignerFragmentV2.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ProfileMagicDesignerFragmentV2.class, "5")) {
          return;
       }
       super.v2(p0, p1);
       if (this.H.c()) {
          k1.r(new f(this), 1);
       }
       ProfileMagicDesignerFragmentV2 tF = this.F;
       if (tF != null) {
          r0 e = tF.e;
          if (e != null) {
             a d = e.d;
             if (d != null) {
                d.b("PROFILE_FEED_LOAD", "MAIN_KEY", b.a(tF.c, this.q().hasMore(), this.q().getCount()));
             }
          }
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, ProfileMagicDesignerFragmentV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public boolean x0(){
       return false;
    }
    public RecyclerView$LayoutManager xh(){
       NpaGridLayoutManager obj = PatchProxy.apply(null, this, ProfileMagicDesignerFragmentV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NpaGridLayoutManager(this.getContext(), 3);
       obj.m1(new ProfileMagicDesignerFragmentV2$a(this));
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, ProfileMagicDesignerFragmentV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.F.b.getId());
    }
}
