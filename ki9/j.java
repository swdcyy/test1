package ki9.j;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import android.graphics.Bitmap;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ag6.a;
import com.kwai.library.widget.compatimageview.CompatImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import xm6.a;
import lnc.a1;
import qrd.l1;
import o07.n;

public final class j implements PopupInterface$f	// class@002c97
{
    public final Bitmap b;

    public void j(Bitmap p0){
       this.b = p0;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, j.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "inflater");
       View view = a.c(p1, R.layout.arg_RES_7f0d1109, p2, false);
       CompatImageView uCompatImage = view.findViewById(R.id.icon);
       a.o(uCompatImage, "this");
       ViewGroup$LayoutParams layoutParams = uCompatImage.getLayoutParams();
       int i = (int)a.a.a((float)a1.e(88.00f));
       layoutParams.width = i;
       layoutParams.height = (i * this.b.getHeight()) / this.b.getWidth();
       uCompatImage.setLayoutParams(layoutParams);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
