package com.yxcorp.gifshow.widget.t;
import ub.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import brd.c0;
import android.graphics.drawable.Drawable;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.LiveCoverIconView$g;
import android.graphics.drawable.Animatable;
import bd.f;
import com.yxcorp.gifshow.widget.LiveCoverIconView;

public class t extends a	// class@0019c8
{
    public final KwaiImageView b;
    public final int c;
    public final c0 d;
    public final boolean e;
    public final Drawable f;

    public void t(KwaiImageView p0,int p1,c0 p2,boolean p3,Drawable p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "2")) {
          return;
       }
       if (this.e != null) {
          this.d.onSuccess(new LiveCoverIconView$g(false));
       }else if(this.f == null){
          this.d.onError(new Throwable("load fail"));
       }else {
          this.d.onSuccess(new Object());
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, t.class, "1")) {
       }else if(p1 != null){
          LiveCoverIconView.M(this.b, this.c, p1.getWidth(), p1.getHeight());
       }
       this.d.onSuccess(new Object());
       return;
    }
}
