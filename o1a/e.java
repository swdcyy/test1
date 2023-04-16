package o1a.e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import o1a.f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k1a.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import o07.o;

public class e implements PopupInterface$h	// class@00326e
{
    public final f b;

    public void e(f p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       f t = this.b.t;
       if (!PatchProxy.applyVoidOneRefs(t, null, b.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UNBLOCK_KEYWORDS_DIALLOG";
          b.c(t, uElementPack);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
