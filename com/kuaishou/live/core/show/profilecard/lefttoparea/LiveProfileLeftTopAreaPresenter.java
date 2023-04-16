package com.kuaishou.live.core.show.profilecard.lefttoparea.LiveProfileLeftTopAreaPresenter;
import a51.c;
import com.kuaishou.live.core.show.profilecard.lefttoparea.LiveProfileLeftTopAreaPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wj2.r;
import com.kuaishou.live.core.show.profilecard.lefttoparea.LiveProfileLeftTopAreaPresenter$onBind$1;
import bf2.b;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.profilecard.LiveProfileMode;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import bf2.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;

public final class LiveProfileLeftTopAreaPresenter extends c	// class@000dd8
{
    public Fragment A;
    public LiveProfileParams B;
    public LiveProfileLeftTopAreaPresenter$a C;
    public a v;
    public r w;
    public View x;
    public AppBarLayout y;
    public boolean z;
    public static String sLivePresenterClassName = "LiveProfileLeftTopAreaPresenter";

    public void LiveProfileLeftTopAreaPresenter(){
       super();
       this.C = new LiveProfileLeftTopAreaPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveProfileLeftTopAreaPresenter.class, "3")) {
          return;
       }
       super.E8();
       LiveProfileLeftTopAreaPresenter tw = this.w;
       String str = "liveProfileCallerContext";
       if (tw == null) {
          a.S(str);
       }
       r o = tw.o;
       LiveProfileLeftTopAreaPresenter tA = this.A;
       if (tA == null) {
          a.S("liveProfileFragment");
       }
       o.observe(tA, new b(new LiveProfileLeftTopAreaPresenter$onBind$1(this)));
       tw = this.w;
       if (tw == null) {
          a.S(str);
       }
       boolean b = (tw.m != LiveProfileMode.ANCHOR_VIEW_SELF)? true: false;
       this.z = b;
       if (b) {
          tw = this.y;
          if (tw != null) {
             tw.c(this.C);
          }
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveProfileLeftTopAreaPresenter.class, "5")) {
          return;
       }
       super.J8();
       LiveProfileLeftTopAreaPresenter tv = this.v;
       if (tv != null) {
          tv.release();
       }
       this.v = objArray;
       if (this.z != null) {
          tv = this.y;
          if (tv != null) {
             tv.o(this.C);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileLeftTopAreaPresenter.class, "2")) {
          return;
       }
       AppBarLayout uAppBarLayou = null;
       View view = (p0 != null)? p0.findViewById(R.id.live_profile_container): uAppBarLayou;
       this.x = view;
       if (p0 != null) {
          uAppBarLayou = p0.findViewById(0x7f0a2361);
       }
       this.y = uAppBarLayou;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveProfileLeftTopAreaPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(Fragment.class);
       a.o(obj, "inject\(Fragment::class.java\)");
       this.A = obj;
       obj = this.q8(r.class);
       a.o(obj, "inject\(LiveProfileCallerContext::class.java\)");
       this.w = obj;
       this.B = this.q8(LiveProfileParams.class);
       return;
    }
}
