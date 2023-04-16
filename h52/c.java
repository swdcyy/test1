package h52.c;
import y8c.g;
import t02.a0;
import m52.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Object;
import e52.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import h52.j;
import android.view.ViewGroup;
import y8c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.closepage.audience.feed.recommand.a;
import h52.b;
import ml8.c;

public class c extends g	// class@002c4f
{

    public void c(a0 p0,a p1,BaseFragment p2){
       super();
       this.n1("LIVE_PLAY_CALLER_CONTEXT", p0);
       this.n1("LIVE_PLAY_CLOSED_V2_CALLBACK", p1);
       this.n1("ADAPTER", this);
       this.n1("LIVE_PLAY_CLOSED_V2_AUTO_PLAY_SERVICE", new a());
       this.n1("LIVE_PLAY_CLOSED_FRAGMENT", p2);
    }
    public int f0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.N0(p0).a;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (!p1) {
          view = a.i(p0, R.layout.arg_RES_7f0d0d11);
          obj.U7(new a());
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d0d10);
          obj.U7(new b());
       }
       return new f(view, obj);
    }
}
