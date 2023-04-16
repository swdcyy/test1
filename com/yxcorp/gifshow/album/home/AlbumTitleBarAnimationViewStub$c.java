package com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$c;
import erd.g;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import android.view.View;

public final class AlbumTitleBarAnimationViewStub$c implements g	// class@001a0b
{
    public final AlbumTitleBarAnimationViewStub b;

    public void AlbumTitleBarAnimationViewStub$c(AlbumTitleBarAnimationViewStub p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumTitleBarAnimationViewStub$c.class, "1")) {
       }else {
          AlbumTitleBarAnimationViewStub$c tb = this.b;
          a.h(p0, "it");
          float f = p0.floatValue();
          Objects.requireNonNull(tb);
          AlbumTitleBarAnimationViewStub uAlbumTitleB = AlbumTitleBarAnimationViewStub.class;
          if (!PatchProxy.isSupport(uAlbumTitleB) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), tb, uAlbumTitleB, "9")) {
             View view = PatchProxy.apply(null, tb, uAlbumTitleB, "5");
             if (view == PatchProxyResult.class) {
                view = tb.h.getValue();
             }
             if (view != null) {
                view.setAlpha(f);
             }
          }
       }
       return;
    }
}
