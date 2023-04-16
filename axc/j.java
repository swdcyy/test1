package axc.j;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import o07.n;

public final class j implements PopupInterface$f	// class@0002ec
{
    public Bitmap b;
    public final String c;
    public final boolean d;

    public void j(String p0,boolean p1){
       a.p(p0, "imgeUrl");
       super();
       this.c = p0;
       this.d = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       View view;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, j.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       if (this.d != null) {
          view = a.c(p1, R.layout.arg_RES_7f0d0344, p2, false);
          a.o(view, "view");
          if (this.b != null) {
             view.findViewById(R.id.image).setImageBitmap(this.b);
          }else {
             view.findViewById(R.id.image).L(this.c);
          }
          a.o(view, "inflater.inflate\(R.layou¡­.bindUrl\(imgeUrl\)\n      }");
       }else {
          view = a.c(p1, R.layout.arg_RES_7f0d0345, p2, false);
          a.o(view, "view");
          if (this.b != null) {
             view.findViewById(R.id.image).setImageBitmap(this.b);
          }else {
             view.findViewById(R.id.image).L(this.c);
          }
          a.o(view, "inflater.inflate\(R.layou¡­.bindUrl\(imgeUrl\)\n      }");
       }
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
