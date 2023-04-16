package com.yxcorp.gifshow.camera.record.album.slideup.list.b;
import ub.a;
import com.yxcorp.gifshow.camera.record.album.slideup.list.a;
import com.yxcorp.gifshow.camera.record.album.slideup.list.a$c;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bd.b;
import com.facebook.imagepipeline.image.a;
import android.graphics.Bitmap;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public class b extends a	// class@001cd5
{
    public final a$c b;
    public final a c;

    public void b(a p0,a$c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
          return;
       }
       if (p1 instanceof b && (!p1.isClosed() && (p1.g() != null && (p1.g().hasAlpha() && this.b.b.getHierarchy() != null)))) {
          this.b.b.getHierarchy().v(new ColorDrawable(-1));
       }
    label_0048 :
       return;
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       if (this.b.b.getHierarchy() != null) {
          this.b.b.getHierarchy().v(null);
       }
       return;
    }
}
