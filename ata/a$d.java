package ata.a$d;
import ub.a;
import ata.a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Animatable;
import bd.f;

public final class a$d extends a	// class@0002f3
{
    public final a b;
    public final CDNUrl[] c;

    public void a$d(a p0,CDNUrl[] p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$d.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       Object[] objArray = new Object[0];
       b.C().w("TabIconViewHelper", "bind tab image from network by file error:"+this.c, objArray);
       a c = this.b.c;
       if (c == null) {
          a.S("iconView");
       }
       c.b0(this.c, this.b.k, 0, 0);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$d.class, "2")) {
       }else {
          this.b.i(p1);
       }
       return;
    }
    public void onIntermediateImageSet(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$d.class, "1")) {
       }else {
          this.b.i(p1);
       }
       return;
    }
}
