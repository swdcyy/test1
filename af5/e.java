package af5.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import af5.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import im8.f;
import java.lang.Boolean;
import android.content.Context;
import o56.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.PatchProxyResult;
import a95.a;
import az6.a;
import vy6.a;
import java.util.List;
import p1a.a;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import w85.a;
import a95.b;
import com.kwai.component.detail.launcher.api.model.detail.DetailParamCreator;

public class e extends PresenterV2	// class@000094
{
    public QPhoto p;
    public f q;
    public PhotoDetailParam r;
    public f s;
    public BaseFragment t;
    public List u;
    public a v;
    public boolean w;
    public final boolean x;
    public SlidePlayViewModel y;
    public final a z;

    public void e(){
       super();
       this.z = new e$a(this);
       this.x = true;
    }
    public void e(boolean p0){
       super();
       this.z = new e$a(this);
       this.x = p0;
    }
    public void E8(){
       boolean b1;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          return;
       }
       this.y = SlidePlayViewModel.S0(this.t.getParentFragment());
       e ts = this.s;
       int i = 1;
       boolean b = (ts != null && (!ts.get().booleanValue() && !f.b(this.getContext())))? true: false;
       this.w = b;
       if (!TextUtils.isEmpty(this.p.getKsOrderId())) {
          a obj = PatchProxy.apply(objArray, this, uoe, "4");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(!f.b(this.getContext())){
             uoe = this.v;
             if (uoe.c != null) {
                obj = uoe.a;
             }else {
                obj = uoe.e.mSource;
                obj = (obj == 9 || obj == 16)? 1: null;
             }
             if (obj == null) {
                i = 0;
             }
          }
          b1 = i;
          if (b1) {
             uoe = this.y;
             if (uoe != null) {
                uoe.r0(this.t, this.z);
             }else {
                uoe = this.u;
                if (uoe != null) {
                   uoe.add(this.z);
                }
             }
          }
       }
    label_0095 :
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       String str = "FLOW_OPERATE_LOC";
       a$a uoa = a$a.t(str, str);
       uoa.k(this.p.getKsOrderId());
       this.q.get().b(uoa);
       if (this.x != null) {
          a$a uoa1 = a$a.c(str, str);
          uoa1.k(this.p.getKsOrderId());
          uoa1.r(true);
          this.q.get().a(uoa1);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.x8("LOG_LISTENER");
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.w8("DETAIL_FROM_SLIDE");
       this.t = this.r8("DETAIL_FRAGMENT");
       this.u = this.t8("DETAIL_ATTACH_LISTENERS");
       a uoa = this.s8(a.class);
       this.v = (uoa == null)? DetailParamCreator.b(false, this.r).b(): uoa.j();
       return;
    }
}
