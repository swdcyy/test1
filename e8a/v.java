package e8a.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e8a.v$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import m9a.k;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import de5.a;

public final class v extends PresenterV2	// class@0020df
{
    public final a A;
    public KwaiImageView p;
    public View q;
    public TextView r;
    public boolean s;
    public QPhoto t;
    public BaseFragment u;
    public PhotoDetailParam v;
    public SlidePlayViewModel w;
    public g x;
    public k0 y;
    public a z;

    public void v(){
       super();
       this.A = new v$a(this);
    }
    public void E8(){
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "2") && this.p == null) {
          View view = k.a(this.getActivity(), this.u, R.id.slide_global_edit_layout);
          View view1 = view.findViewById(R.id.profile_side_forward_icon);
          a.o(view1, "view.findViewById\(R.id.profile_side_forward_icon\)");
          this.p = view1;
          view1 = view.findViewById(R.id.profile_side_forward_button);
          a.o(view1, "view.findViewById\(R.id.p¡­file_side_forward_button\)");
          this.q = view1;
          if (view1 == null) {
             a.S("mForwardButton");
          }
          view1.setVisibility(0);
          view = view.findViewById(R.id.profile_side_forward_count);
          a.o(view, "view.findViewById\(R.id.profile_side_forward_count\)");
          this.r = view;
       }
       ov = this.u;
       a.m(ov);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(ov.getParentFragment());
       this.w = slidePlayVie;
       if (slidePlayVie != null) {
          v tu = this.u;
          a.m(tu);
          slidePlayVie.P(tu, this.A);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       this.y = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       this.u = this.r8("DETAIL_FRAGMENT");
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.v = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.z = obj;
       return;
    }
}
