package com.yxcorp.gifshow.detail.fragments.milano.profile.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import r7a.i;
import com.yxcorp.gifshow.detail.fragments.milano.profile.o$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.o$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import hf5.h;
import rf5.u;
import z0a.w0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import jta.d;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class o extends PresenterV2	// class@00155f
{
    public h p;
    public SlidePlayViewModel q;
    public BaseFragment r;
    public u s;
    public t t;
    public View u;
    public Float v;
    public boolean w;
    public boolean x;
    public final d y;
    public final ViewPager$i z;
    public static final int A;

    static {
       o.A = i.a();
    }
    public void o(){
       super();
       this.y = new o$a(this);
       this.z = new o$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       this.q = SlidePlayViewModel.B0(this.r);
       this.p.b(this.z, true);
       this.s.z = true;
       this.X7(this.t.subscribe(new w0(this), Functions.e));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "5")) {
          return;
       }
       this.s.G(objArray);
       this.p.g(this.z);
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "4")) {
          return;
       }
       boolean b = (this.w != null && this.x != null)? true: false;
       o ts = this.s;
       if (b) {
          objArray = this.y;
       }
       ts.G(objArray);
       Log.g("MilanoProfileSwipeP", "trySetProfileFeedEnabled\(\) called. enableProfileFeed="+b);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a32a8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.q8(u.class);
       this.t = this.r8("MILANO_ENABLE_PROFILE_SIDE_ON_CURRENT_PHOTO");
       this.p = this.r8("MILANO_SLIDE_PLAY_VM_PROTOCOL");
       return;
    }
}
