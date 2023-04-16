package e19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g59.q;
import e19.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import g59.q$a;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@00211b
{
    public PublishSubject p;
    public QPhoto q;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       q oq = new q(this.q, new a$a(this));
       if (oq.c()) {
          oq.a();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_PHOTO_UPDATED_EVENT");
       this.q = this.q8(QPhoto.class);
       return;
    }
}
