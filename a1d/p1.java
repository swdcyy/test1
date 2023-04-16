package a1d.p1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import w0d.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1d.o1;
import erd.r;
import brd.t;
import a1d.n1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import mrd.c;

public class p1 extends PresenterV2	// class@000048
{
    public PublishSubject p;
    public f q;
    public f r;
    public g s;
    public c t;
    public RecyclerView u;
    public p1$a v;

    public void p1(g p0){
       super();
       this.s = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p1.class, "3")) {
          return;
       }
       this.X7(this.p.filter(o1.b).subscribe(new n1(this), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3166);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p1.class, "1")) {
          return;
       }
       this.q = this.x8("AUTH_INFO_RESPONSE");
       this.p = this.r8("EVENT_PUBLISH_SUBJECT");
       this.r = this.x8("CURRENT_SHOW_SCOPE");
       this.t = this.t8("PROTOCOL_BUBBLE_SUBJECT");
       return;
    }
}
