package m19.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m19.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import le5.f;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import m19.d;
import erd.g;
import crd.b;
import brd.t;
import im8.f;
import java.lang.Integer;
import java.util.List;
import java.lang.Number;
import java.lang.StringBuilder;
import yx.j0;
import com.kwai.framework.model.feed.BaseFeed;
import e1a.u;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;

public class e extends PresenterV2	// class@002de2
{
    public List p;
    public PublishSubject q;
    public f r;
    public QPhoto s;
    public BaseFragment t;
    public SlidePlayViewModel u;
    public a v;
    public boolean w;
    public final a x;

    public void e(){
       super();
       this.x = new e$a(this);
    }
    public void E8(){
       boolean b;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          return;
       }
       SlidePlayViewModel obj = PatchProxy.apply(objArray, this, uoe, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.s.isVideoType() || f.i()){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return;
       }else {
          obj = SlidePlayViewModel.S0(this.t.getParentFragment());
          this.u = obj;
          if (obj != null) {
             obj.P(this.t, this.x);
          }
          this.X7(this.q.subscribe(new d(this)));
          if (this.r.get().intValue() != this.P8() && this.p.contains(this.r.get())) {
             this.V8("onbind");
          }
          this.S8();
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tu = this.u;
       if (tu != null) {
          tu.D(this.t, this.x);
       }
       return;
    }
    public final int P8(){
       e obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.u;
       if (obj != null) {
          return obj.j();
       }
       return -1;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "10")) {
          return;
       }
       StringBuilder str = p0+", photoId = ";
       e ts = this.s;
       String str1 = "null";
       ts = (ts == null)? str1: ts.getPhotoId();
       str = str+ts+" userName = ";
       ts = this.s;
       if (ts != null) {
          str1 = ts.getUserName();
       }
       Object[] objArray = new Object[0];
       j0.f("ADSlidePreload", str+str1+", index = "+this.r.get()+", currentIndex = "+this.P8()+" is ad", objArray);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.p.remove(this.r.get());
       return;
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
          return;
       }
       this.R8("start preload..."+p0);
       u.a(this.s.getEntity());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_PENGING_PRELOAD_LIST");
       this.q = this.r8("DETAIL_PRELOAD_EVENT");
       this.r = this.x8("DETAIL_PHOTO_INDEX");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       this.v = this.q8(a.class);
       return;
    }
}
