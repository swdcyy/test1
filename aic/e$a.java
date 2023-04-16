package aic.e$a;
import erd.g;
import aic.e;
import java.lang.Object;
import com.yxcorp.gifshow.share.module.SimilarPhotoResponse;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kzc.d;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import aic.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class e$a implements g	// class@00012a
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       GuideShareMoreDialog guideShareMo = GuideShareMoreDialog.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else if(p0.mPhotos.size() < 3){
          this.b.c();
       }else {
          this.b.a = new GuideShareMoreDialog();
          e a = this.b.a;
          a.m(a);
          e c = this.b.c;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(c, a, guideShareMo, "2")) {
             a.p(c, "<set-?>");
             a.b = c;
          }
          a = this.b.a;
          a.m(a);
          GifshowActivity gifshowActiv = this.b.a();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(gifshowActiv, a, guideShareMo, "4")) {
             a.p(gifshowActiv, "<set-?>");
             a.c = gifshowActiv;
          }
          a = this.b.a;
          a.m(a);
          a.o(p0, "similarPhotos");
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(p0, a, guideShareMo, "6")) {
             a.p(p0, "<set-?>");
             a.d = p0;
          }
          p0 = new d(this.b.a());
          p0.A(false);
          p0.w(new ColorDrawable(Color.parseColor("#66000000")));
          e a1 = this.b.a;
          a.m(a1);
          p0.L(a1);
          p0.Y(new d(this));
       }
       return;
    }
}
