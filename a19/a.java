package a19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a19.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tkd.b;
import tkd.d;
import ju5.g;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@00001b
{
    public QPhoto p;
    public String q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public List t;
    public final a u;

    public void a(){
       super();
       this.u = new a$a(this);
    }
    public void E8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       a tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = tp.mEntity;
       if (mEntity != null) {
          PhotoAdvertisement photoAdverti = mEntity.get("AD");
          photoAdverti = (photoAdverti != null)? photoAdverti.mScheme: objArray;
          if (d.a(0x6ea0c3d0).rM(photoAdverti)) {
             this.q = photoAdverti;
             tp = this.s;
             String str = "mFragment";
             if (tp == null) {
                tp = this.r;
                if (tp == null) {
                   a.S(str);
                }
                SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
             }
             this.s = tp;
             if (tp != null) {
                a tr = this.r;
                if (tr == null) {
                   a.S(str);
                }
                tp.P(tr, this.u);
             }else {
                tp = this.t;
                if (tp != null) {
                   tp.add(this.u);
                }
             }
          }else {
             this.q = objArray;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       tq = (tq == null || !tq.length())? 1: null;
       if (!tq) {
          tq = this.s;
          if (tq != null) {
             a tr = this.r;
             if (tr == null) {
                a.S("mFragment");
             }
             tq.D(tr, this.u);
          }else {
             tq = this.t;
             if (tq != null) {
                tq.remove(this.u);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       this.t = this.t8("DETAIL_ATTACH_LISTENERS");
       return;
    }
}
