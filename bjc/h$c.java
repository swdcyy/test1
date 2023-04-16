package bjc.h$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bjc.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import bjc.j;
import android.view.View$OnClickListener;
import ekd.m1;
import bjc.i;
import com.yxcorp.gifshow.widget.SectorProgressView;
import android.widget.TextView;
import uo7.k;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.share.widget.d$e;

public class h$c extends PresenterV2	// class@000489
{
    public k p;
    public QPhoto q;
    public PublishSubject r;
    public d$e s;
    public SectorProgressView t;
    public TextView u;
    public View v;

    public void h$c(){
       super();
    }
    public void h$c(h$a p0){
       super();
    }
    public void E8(){
       h$c uoc = h$c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          m1.a(this.m8(), new j(this), R.id.share_video_area);
          m1.a(this.m8(), new i(this), R.id.share_image_to_wechat_moment_area);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0c1a);
       this.u = m1.f(p0, 0x7f0a391b);
       this.v = m1.f(p0, 0x7f0a391c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h$c.class, "2")) {
          return;
       }
       this.p = this.q8(k.class);
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(PublishSubject.class);
       this.s = this.r8("DOWNLOAD_DIALOG_RETRY_SUBJECT");
       return;
    }
}
