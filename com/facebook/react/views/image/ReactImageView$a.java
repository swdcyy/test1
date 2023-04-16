package com.facebook.react.views.image.ReactImageView$a;
import ub.a;
import com.facebook.react.views.image.ReactImageView;
import df.c;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pf.b;
import android.widget.ImageView;
import df.b;
import android.graphics.drawable.Animatable;
import bd.f;
import qf.a;

public class ReactImageView$a extends a	// class@0013bd
{
    public final c b;
    public final ReactImageView c;

    public void ReactImageView$a(ReactImageView p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageView$a.class, "3")) {
          return;
       }
       b uob = new b(this.c.getId(), 1, null, 0, 0, p1.getMessage());
       this.b.c(v7);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactImageView$a.class, "2")) {
       }else if(p1 != null){
          b uob = new b(this.c.getId(), 2, this.c.k.b(), p1.getWidth(), p1.getHeight());
          this.b.c(p2);
          this.b.c(new b(this.c.getId(), 3));
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageView$a.class, "1")) {
          return;
       }
       this.b.c(new b(this.c.getId(), 4));
       return;
    }
}
