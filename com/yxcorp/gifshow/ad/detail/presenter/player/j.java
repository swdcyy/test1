package com.yxcorp.gifshow.ad.detail.presenter.player.j;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;
import com.yxcorp.gifshow.ad.detail.presenter.player.j$a;
import d19.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class j extends b	// class@001684
{
    public SlidePlayViewModel A;
    public BaseFragment B;
    public List C;
    public a D;
    public boolean E;
    public final a F;
    public final IMediaPlayer$OnInfoListener G;
    public KwaiImageView x;
    public KwaiContentFrame y;
    public View z;

    public void j(){
       super();
       this.F = new j$a(this);
       this.G = new l(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       if (!this.W8()) {
          return;
       }
       j tz = this.z;
       int i = 0;
       if (tz != null) {
          tz.setVisibility(i);
       }
       this.x.setVisibility(8);
       this.E = i;
       super.E8();
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.B.getParentFragment());
       this.A = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.B, this.F);
       }else {
          this.C.add(this.F);
       }
       this.D.getPlayer().addOnInfoListener(this.G);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
          return;
       }
       if (!this.W8()) {
          return;
       }
       super.J8();
       j tA = this.A;
       if (tA != null) {
          tA.D(this.B, this.F);
       }else {
          this.C.remove(this.F);
       }
       this.D.getPlayer().removeOnInfoListener(this.G);
       return;
    }
    public KwaiImageView P8(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getCover();
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       super.S8();
       this.E = true;
       j tz = this.z;
       if (tz != null) {
          tz.setVisibility(8);
       }
       return;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.q.isVideoType();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a319f);
       this.y = m1.f(p0, 0x7f0a3120);
       this.z = m1.f(p0, 0x7f0a302f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       super.j8();
       this.B = this.r8("DETAIL_FRAGMENT");
       this.C = this.r8("DETAIL_ATTACH_LISTENERS");
       this.D = this.q8(a.class);
       return;
    }
}
