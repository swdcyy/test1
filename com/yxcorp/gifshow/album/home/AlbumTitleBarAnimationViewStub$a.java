package com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$a;
import erd.g;
import com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import o79.i;

public final class AlbumTitleBarAnimationViewStub$a implements g	// class@001a09
{
    public final AlbumTitleBarAnimationViewStub b;

    public void AlbumTitleBarAnimationViewStub$a(AlbumTitleBarAnimationViewStub p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumTitleBarAnimationViewStub$a.class, "1")) {
       }else {
          AlbumTitleBarAnimationViewStub$a tb = this.b;
          a.h(p0, "it");
          float f = p0.floatValue();
          Objects.requireNonNull(tb);
          AlbumTitleBarAnimationViewStub uAlbumTitleB = AlbumTitleBarAnimationViewStub.class;
          if (!PatchProxy.isSupport(uAlbumTitleB) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), tb, uAlbumTitleB, "8")) {
             ViewGroup viewGroup = tb.h();
             ViewGroup$LayoutParams layoutParams = null;
             ViewGroup$LayoutParams layoutParams1 = (viewGroup != null)? viewGroup.getLayoutParams(): layoutParams;
             if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                layoutParams = layoutParams1;
             }
             int i = i.c(R.dimen.arg_RES_7f070517);
             if (layoutParams != null) {
                layoutParams.height = (int)((float)i * f);
             }
             f = tb.h();
             if (f != null) {
                f.setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
}
