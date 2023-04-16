package fqa.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.player.helper.b;
import p5a.e;
import de5.a;
import fqa.a;
import com.kwai.framework.player.core.b;
import com.kwai.framework.player.helper.b$b;
import wkd.b;
import lpa.h;
import lqa.d;
import com.kwai.framework.model.feed.BaseFeed;
import lpa.a;
import lnc.u1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import m56.f;
import m56.g;

public class b extends PresenterV2	// class@0029bd
{
    public boolean p;
    public a q;
    public BaseFeed r;
    public boolean s;
    public Activity t;
    public BaseFragment u;
    public QPhoto v;
    public PublishSubject w;
    public SlidePlayViewModel x;
    public b y;

    public void b(){
       super();
       this.p = false;
    }
    public void b(boolean p0){
       super();
       this.p = false;
       this.p = p0;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       b uob1 = new b(this.q.getPlayer(), new a(this));
       this.y = uob1;
       if (uob1.c()) {
          b.a(0x104d75c3).d(true);
          b.a(-1197629247).d(true, this.r);
       }
       if (b.a(0x76955bf0).a()) {
          u1.a(this);
          if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
             if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
                SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.u.getParentFragment());
                this.x = slidePlayVie;
                if (slidePlayVie != null) {
                   this.s = (slidePlayVie.G0(slidePlayVie.j()) == 12)? true: false;
                }
             }
             if (this.s != null) {
                b.a(0x104d75c3).d(true);
             }
          }
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, b.class, "2");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b ty = this.y;
       if (ty != null) {
          ty.e();
       }
       u1.b(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.r = this.r8("feed");
       this.u = this.r8("DETAIL_FRAGMENT");
       this.v = this.q8(QPhoto.class);
       this.w = this.t8("SLIDE_PLAY_SHOW_COMMENT_DIALOG");
       return;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       if (this.s != null) {
          b.a(0x104d75c3).d(false);
       }
       return;
    }
    public void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       if (this.s != null) {
          b.a(0x104d75c3).d(true);
       }
       return;
    }
}
