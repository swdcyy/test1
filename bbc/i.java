package bbc.i;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import cbc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;

public final class i implements PopupInterface$d	// class@00042f
{
    public final boolean a;
    public final GifshowActivity b;

    public void i(boolean p0,GifshowActivity p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(c p0,int p1){
       i tb = this.b;
       if (this.a != null) {
          if (!PatchProxy.applyVoidOneRefs(tb, null, b.class, "20")) {
             b.f(0, 2, tb);
          }
       }else if(PatchProxy.applyVoidOneRefs(tb, null, b.class, "18")){
          b.f(0, 1, tb);
       }
       return;
    }
}
