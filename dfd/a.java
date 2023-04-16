package dfd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import nfd.o3;
import java.lang.Integer;
import android.view.ViewStub;
import android.widget.ImageView;
import ekd.m1;

public class a extends PresenterV2	// class@000cba
{
    public QPhoto p;
    public ViewStub q;
    public ImageView r;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.p.isChorus()) {
          this.P8(R.drawable.arg_RES_7f08099c);
       }else if(this.p.isKtv()){
          this.P8(R.drawable.arg_RES_7f08099d);
       }else if(this.p.isVideoType()){
          o3.H(this.r, 8);
       }else {
          o3.H(this.r, 8);
       }
       return;
    }
    public final void P8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (this.r == null) {
          this.r = this.q.inflate();
       }
       o3.H(this.r, 0);
       this.r.setImageResource(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0f54);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("SEARCH_AUTO_PLAY_PHOTO");
       return;
    }
}
