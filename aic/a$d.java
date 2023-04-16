package aic.a$d;
import erd.g;
import aic.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import kzc.d;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import aic.b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class a$d implements g	// class@000124
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else if(p0.size() >= 2){
          a$d tb = this.b;
          QPhoto photo = this.b.c().getPhoto();
          a.o(photo, "param.photo");
          a.o(p0, "list");
          tb.b = new AuthorShareGuideDialog(tb.a(), photo, p0);
          p0 = new d(this.b.a());
          p0.A(false);
          p0.w(new ColorDrawable(0x66000000));
          a b = this.b.b;
          a.m(b);
          p0.L(b);
          p0.Y(new b(this));
       }else {
          p0 = this.b;
          p0.d(p0.a(), this.b.c());
       }
       return;
    }
}
