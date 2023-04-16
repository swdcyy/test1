package k19.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageView;
import lnc.a1;
import ekd.p1;
import k19.q;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;

public class r extends PresenterV2	// class@002a8e
{
    public PublishSubject p;

    public void r(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       ImageView imageView = m1.f(p0, R.id.iv_ecommerce_close);
       p1.c(imageView, a1.e(10.00f), 0, 0, a1.e(10.00f));
       imageView.setOnClickListener(new q(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.r8("AD_MERCHANDISE_SUBJECT");
       return;
    }
}
