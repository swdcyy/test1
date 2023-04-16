package a1d.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1d.v;
import erd.r;
import brd.t;
import a1d.u;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public class w extends PresenterV2	// class@00005c
{
    public f p;
    public PublishSubject q;
    public f r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;

    public void w(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       this.X7(this.q.filter(v.b).subscribe(new u(this), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0226);
       this.t = m1.f(p0, 0x7f0a0227);
       this.u = m1.f(p0, 0x7f0a2fee);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.p = this.x8("AUTH_INFO_RESPONSE");
       this.q = this.r8("EVENT_PUBLISH_SUBJECT");
       this.r = this.x8("CURRENT_SHOW_SCOPE");
       return;
    }
}
