package com.yxcorp.gifshow.detail.fragments.milano.profile.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import com.yxcorp.gifshow.detail.fragments.milano.profile.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import ef5.a;
import android.view.View;
import java.lang.Integer;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ef5.c;
import c95.c;
import brd.y;

public class g extends PresenterV2	// class@00154d
{
    public final b A;
    public View p;
    public KwaiImageView q;
    public TextView r;
    public QPhoto s;
    public c t;
    public c u;
    public SlidePlayViewModel v;
    public BaseFragment w;
    public y x;
    public String y;
    public GifshowActivity$AnchorPoint z;

    public void g(){
       super();
       this.y = "avatar";
       this.z = GifshowActivity$AnchorPoint.AVATAR;
       this.A = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.v = SlidePlayViewModel.B0(this.w);
       this.t.a(this.A);
       return;
    }
    public void P8(View p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "6")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(p1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3279);
       this.p = m1.f(p0, 0x7f0a327a);
       this.r = m1.f(p0, 0x7f0a3280);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.w = this.r8("FRAGMENT");
       this.t = this.r8("MILANO_ATTACH_LISTENER");
       this.u = this.q8(c.class);
       this.x = this.r8("MILANO_PROFILE_AVATAR_CLICK_OBSERVER");
       return;
    }
}
