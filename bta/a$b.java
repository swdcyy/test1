package bta.a$b;
import co5.f$a;
import bta.a;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.View;
import android.view.ViewStub;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import lnc.a1;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;

public final class a$b implements f$a	// class@000463
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public KwaiImageView a(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.R8(this.a).b().findViewById(0x7f0a0f99);
    }
    public KwaiImageView b(){
       View view;
       t$b a;
       KwaiImageView obj = PatchProxy.apply(null, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (obj == null) {
          ViewStub viewStub = a.R8(this.a).b().findViewById(R.id.follow_tab_image_stub);
          a.o(viewStub, "viewStub");
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d0472);
          view = viewStub.inflate();
          Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.image.KwaiImageView");
          view.getLayoutParams().width = a1.d(0x7f0702b8);
          view.getLayoutParams().height = a1.d(0x7f0702b8);
          a = t$b.a;
          view.getHierarchy().E(R.drawable.detail_avatar_secret, a);
          a hierarchy = view.getHierarchy();
          a.o(hierarchy, "view.hierarchy");
          hierarchy.x(0);
          hierarchy = view.getHierarchy();
          a.o(hierarchy, "view.hierarchy");
          hierarchy.u(a);
          view.setVisibility(8);
       }
       return view;
    }
}
