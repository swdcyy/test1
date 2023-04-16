package com.kuaishou.live.core.show.coverandbackground.cover.b$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.kuaishou.live.core.show.coverandbackground.cover.b;
import java.io.File;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import s62.b;
import io.reactivex.g;
import t45.d;
import brd.z;
import s62.d;
import bp6.a;
import erd.g;
import crd.b;
import m0d.l;

public class b$a implements ImageCallback	// class@000ae1
{
    public final File b;
    public final File c;
    public final b d;

    public void b$a(b p0,File p1,File p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          Bitmap bitmap = p0.getBitmap();
          b$a td = this.d;
          String absolutePath = this.b.getAbsolutePath();
          Objects.requireNonNull(td);
          t ot = PatchProxy.applyTwoRefs(bitmap, absolutePath, td, b.class, "10");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.create(new b(absolutePath, bitmap)).subscribeOn(d.c).observeOn(d.a);
          }
          ot.subscribe(new d(this, this.c, this.b), new a());
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
    }
}
