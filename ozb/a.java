package ozb.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ozb.a$a;
import nsd.u;
import an6.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import a0c.g;
import java.lang.StringBuilder;
import an6.l;
import an6.o;
import q87.c;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import an6.m;

public abstract class a extends PresenterV2	// class@003ad7
{
    public HomePostBubbleManager p;
    public l q;
    public final k r;
    public final int s;
    public static final a$a t;

    static {
       a.t = new a$a(null);
    }
    public void a(k p0,int p1){
       a.p(p0, "pageStateDelegate");
       super();
       this.r = p0;
       this.s = p1;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       g.C().w("home_entrance_bubble", "BaseBubblePresenter canShowBubble, item "+this.V8().hashCode()+' '+"priority "+this.V8().getPriority(), objArray);
       if (!this.V8().h()) {
          i = true;
       }
       return i;
    }
    public abstract l R8();
    public final HomePostBubbleManager S8(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("bubbleManager");
       }
       return obj;
    }
    public l V8(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("homePostBubble");
       }
       return obj;
    }
    public final k W8(){
       return this.r;
    }
    public final int X8(){
       return this.s;
    }
    public final boolean Y8(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.V8().h())? true: false;
       return b;
    }
    public final boolean Z8(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.V8().h() == 3)? true: false;
       return b;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       g.C().w("home_entrance_bubble", "BaseBubblePresenter triggerBubbleTask, item "+this.V8().hashCode()+' '+"priority "+this.V8().getPriority(), objArray);
       if (!this.P8()) {
          Object[] objArray1 = new Object[i];
          g.C().w("home_entrance_bubble", "BaseBubblePresenter triggerBubbleTask can not show now", objArray1);
          return;
       }else {
          a tp = this.p;
          if (tp == null) {
             a.S("bubbleManager");
          }
          if (tp.j(this.V8())) {
             l ol = this.V8();
             a tp1 = this.p;
             if (tp1 == null) {
                a.S("bubbleManager");
             }
             ol.l(tp1);
          }
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       Object obj = this.q8(HomePostBubbleManager.class);
       a.o(obj, "inject<HomePostBubbleMan¡­ubbleManager::class.java\)");
       this.p = obj;
       return;
    }
}
