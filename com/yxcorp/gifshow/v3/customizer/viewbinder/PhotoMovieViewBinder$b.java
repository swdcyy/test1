package com.yxcorp.gifshow.v3.customizer.viewbinder.PhotoMovieViewBinder$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.customizer.viewbinder.PhotoMovieViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import uoc.g;

public final class PhotoMovieViewBinder$b implements Runnable	// class@000d72
{
    public final PhotoMovieViewBinder b;

    public void PhotoMovieViewBinder$b(PhotoMovieViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PhotoMovieViewBinder$b.class, "1")) {
          return;
       }
       PhotoMovieViewBinder i = this.b.I;
       a.m(i);
       PhotoMovieViewBinder$b tb = this.b;
       i.a(tb.J, tb.N());
       return;
    }
}
