package dlc.x0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.x0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import df5.b;
import hf5.b;
import dlc.w0;
import erd.g;
import crd.b;
import brd.t;
import sy6.a;
import brd.y;
import tkc.f;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public class x0 extends PresenterV2	// class@00227a
{
    public a p;
    public b q;
    public y r;
    public f s;
    public f t;
    public PublishSubject u;
    public PublishSubject v;
    public int w;
    public final b x;

    public void x0(){
       super();
       this.x = new x0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "3")) {
          return;
       }
       this.q.De(this.x);
       this.X7(this.v.subscribe(new w0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "4")) {
          return;
       }
       this.q.c3(this.x);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.r = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVER");
       this.s = this.r8("TRENDING_FEED_PAGE_LIST");
       this.t = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       this.u = this.r8("CURRENT_PLAY_FEED_INDEX_IN_TRENDING_INFO");
       this.q = this.q8(b.class);
       this.v = this.r8("FIRST_SHOW_FEED_INDEX_ON_LOAD_FINISH");
       return;
    }
}
