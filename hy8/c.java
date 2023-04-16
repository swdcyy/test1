package hy8.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import hy8.a;
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
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationRule;
import hy8.c$a;
import android.view.View$OnClickListener;
import hy8.c$b;
import android.widget.ImageView;
import o07.n;

public final class c implements PopupInterface$f	// class@0025f2
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "inflater");
       a.p(p2, "container");
       View view = a.c(p1, R.layout.arg_RES_7f0d0067, p2, false);
       this.b.a(view.findViewById(R.id.ad_neo_navigation_pendant_bg), this.b.c.cover);
       view.setOnClickListener(new c$a(this, p2));
       KwaiImageView kwaiImageVie = view.findViewById(R.id.ad_neo_navigation_pendant_close);
       this.b.a(kwaiImageVie, "https://static.yximgs.com/udata/pkg/ad-res/navigation_cover_close.a0da02f56d216c3d.png");
       kwaiImageVie.setOnClickListener(new c$b(this, p2));
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
