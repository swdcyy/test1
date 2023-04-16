package n7a.a;
import vy6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo;
import nm6.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import o7a.d;

public abstract class a extends PresenterV2 implements a	// class@0030f1
{
    public QPhoto p;
    public BaseFragment q;
    public boolean r;
    public boolean s;
    public SlidePlayViewModel t;
    public d u;

    public void a(){
       super();
    }
    public void B0(){
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       TagStickerInfo tagStickerIn = e.a(this.p);
       if (tagStickerIn == null) {
          return;
       }
       if (tagStickerIn.mTopLeft == null || (tagStickerIn.mTopRight == null || (tagStickerIn.mBottomLeft != null && tagStickerIn.mBottomRight != null))) {
          boolean b = (this.q.getPage() == 0x7d42)? true: false;
          this.s = b;
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.q.getParentFragment());
          this.t = slidePlayVie;
          if (slidePlayVie == null) {
             return;
          }else {
             slidePlayVie.P(this.q, this);
             this.P8();
          }
       }
    label_004c :
       return;
    }
    public void F1(){
       this.r = false;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tt = this.t;
       if (tt != null) {
          tt.D(this.q, this);
       }
       tt = this.u;
       if (tt != null) {
          tt.a();
       }
       return;
    }
    public void P8(){
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tu = this.u;
       if (tu != null) {
          tu.f();
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.r = true;
       a tu = this.u;
       if (tu == null) {
          return;
       }
       tu.setEnabled(false);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       return;
    }
    public void k1(){
    }
}
