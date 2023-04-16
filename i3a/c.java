package i3a.c;
import k3a.c;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k3a.a;
import java.util.List;
import i3a.a;
import k3a.m;
import j3a.a;
import k3a.s;
import com.yxcorp.gifshow.detail.player.panel.elements.TextElement;

public final class c	// class@002773
{

    public static final void a(c p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "15")) {
          return;
       }
       a uoa = new a();
       p1.invoke(uoa);
       p0.h().add(uoa);
       return;
    }
    public static final void b(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "14")) {
          return;
       }
       m om = new m();
       p1.invoke(om);
       if (om.b()) {
          p0.a(om);
       }
       return;
    }
    public static final void c(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "13")) {
          return;
       }
       s os = new s();
       p1.invoke(os);
       if (os.b()) {
          p0.a(os);
       }
       return;
    }
    public static final void d(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "16")) {
          return;
       }
       TextElement textElement = new TextElement();
       p1.invoke(textElement);
       if (textElement.b()) {
          p0.a(textElement);
       }
       return;
    }
}
