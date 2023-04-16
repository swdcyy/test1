package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PicturesViewBinder$d implements Observer	// class@0015ef
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$d(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.R(p0.booleanValue());
       }
       return;
    }
}
