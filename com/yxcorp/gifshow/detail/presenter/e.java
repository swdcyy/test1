package com.yxcorp.gifshow.detail.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.presenter.e$a;
import y4a.n;
import com.yxcorp.gifshow.detail.presenter.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import qw6.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.View;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import androidx.fragment.app.Fragment;

public class e extends PresenterV2	// class@0016d6
{
    public QPhoto p;
    public a q;
    public List r;
    public MilanoContainerEventBus s;
    public BaseFragment t;
    public SlidePlayViewModel u;
    public f v;
    public a w;
    public final IMediaPlayer$OnInfoListener x;
    public final d y;

    public void e(){
       super();
       this.w = new e$a(this);
       this.x = new n(this);
       this.y = new e$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tr = this.r;
       if (tr != null) {
          tr.add(this.y);
       }
       if (this.p.isVideoType()) {
          this.q.getPlayer().addOnInfoListener(this.x);
       }
       tr = this.u;
       if (tr != null) {
          tr.h(this.w);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.q.getPlayer().removeOnInfoListener(this.x);
       e tr = this.r;
       if (tr != null) {
          tr.remove(this.y);
       }
       tr = this.u;
       if (tr != null) {
          tr.l(this.w);
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, e.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       this.r = this.t8("SLIDE_PLAY_SLIDE_PROFILE_LIST");
       this.s = this.q8(MilanoContainerEventBus.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       this.v = this.x8("DETAIL_LOGGER");
       this.u = SlidePlayViewModel.B0(this.t.getParentFragment());
       return;
    }
}
