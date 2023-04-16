package bbc.b;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import cbc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;

public final class b implements PopupInterface$d	// class@000428
{
    public final GifshowActivity a;

    public void b(GifshowActivity p0){
       this.a = p0;
    }
    public final void a(c p0,int p1){
       b ta = this.a;
       if (PatchProxy.applyVoidOneRefs(ta, null, b.class, "14")) {
       }else {
          b.l("CANCEL", ta);
       }
       return;
    }
}
