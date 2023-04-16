package af5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import af5.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import je5.b;
import af5.a$b;
import im8.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@00008f
{
    public f p;
    public f q;
    public QPhoto r;
    public BaseFragment s;
    public f t;
    public SlidePlayViewModel u;
    public boolean v;
    public String w;
    public final a x;

    public void a(boolean p0){
       super();
       this.x = new a$a(this);
       this.v = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.s.getParentFragment());
       this.u = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.r0(this.s, this.x);
       }
       this.w = b.a(this.r);
       this.p.set(new a$b(this));
       return;
    }
    public void P8(ClientEvent$ElementPackage p0,ClientContent$ContentPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       u1.B0(new ShowMetaData().setLogPage(this.s).setType(p0.type).setElementPackage(p0).setFeedLogCtx(this.r.getFeedLogCtx()).setContentPackage(p1));
       return;
    }
    public void R8(ClientEvent$ShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       u1.B0(new ShowMetaData().setLogPage(this.s).setFeedLogCtx(this.r.getFeedLogCtx()).setElementPackage(p0.elementPackage).setContentPackage(p0.contentPackage));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.x8("LOG_LISTENER");
       this.q = this.x8("DETAIL_FULLSCREEN");
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       this.t = this.x8("DETAIL_LOGGER");
       return;
    }
}
