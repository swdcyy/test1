package bbc.x;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cbc.b;
import lnc.i3;
import java.util.Arrays;
import k2b.f3;
import k2b.e0;
import o07.o;

public class x implements PopupInterface$h	// class@00043e
{
    public final GifshowActivity b;

    public void x(GifshowActivity p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       x tb = this.b;
       if (!PatchProxy.applyVoidOneRefs(tb, null, b.class, "16")) {
          String[] stringArray = new String[]{"CANCEL","NOT_SHOWN_IN_PUBLIC","UNFRIEND"};
          i3 oi3 = i3.f();
          oi3.d("button_list", Arrays.toString(stringArray));
          f3 uof3 = f3.j("MORE_POPUP");
          uof3.m(oi3.e());
          uof3.h(tb);
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
