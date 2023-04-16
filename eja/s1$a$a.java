package eja.s1$a$a;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import eja.s1$a;
import java.lang.Object;
import yw5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.nearby.plugin.locallife.model.CommentDataInfo;
import eja.s1;
import wh5.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import xw5.c;
import kotlin.jvm.internal.a;
import lr3.f;

public final class s1$a$a implements g	// class@0026f4
{
    public final QPhoto b;
    public final s1$a c;

    public void s1$a$a(QPhoto p0,s1$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s1$a$a.class, "1")) {
       }else if(p0 != null){
          p0 = p0.a();
          if (p0 != null && (p0.b() && (this.c.b.R8() && (!a.f() && !this.c.b.P8())))) {
             p0 = p0.a();
             if (p0 != null) {
                Context context = this.c.b.getContext();
                if (context != null) {
                   a.o(context, "context");
                   d.a(0x1e777b83).gd(context, p0);
                   f.a("PoiPublishCommentPresent", p0, "openCommentPanel");
                   d.a(0x1e777b83).CI(this.b, 2);
                }
             }
          }
       }
       PatchProxy.onMethodExit(s1$a$a.class, "1");
       return;
    }
}
