package com.kwai.sharelib.ui.poster.ShortPicPoster$showPosterView$2$onPreDraw$1;
import msd.s;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.widget.ImageView;
import android.view.ViewGroup;
import java.lang.Number;
import android.graphics.Bitmap;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;

public final class ShortPicPoster$showPosterView$2$onPreDraw$1 extends Lambda implements s	// class@001724
{
    public static final ShortPicPoster$showPosterView$2$onPreDraw$1 INSTANCE;

    static {
       ShortPicPoster$showPosterView$2$onPreDraw$1.INSTANCE = new ShortPicPoster$showPosterView$2$onPreDraw$1();
    }
    public void ShortPicPoster$showPosterView$2$onPreDraw$1(){
       super(5);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4){
       this.invoke(p0, p1, p2.intValue(), p3.intValue(), p4);
       return l1.a;
    }
    public final void invoke(ImageView p0,ViewGroup p1,int p2,int p3,Bitmap p4){
       if (PatchProxy.isSupport(ShortPicPoster$showPosterView$2$onPreDraw$1.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, ShortPicPoster$showPosterView$2$onPreDraw$1.class, "1")) {
             return;
          }
       }
       a.p(p0, "imageView");
       a.p(p1, "<anonymous parameter 1>");
       a.p(p4, "bitmap");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = p4.getWidth();
       layoutParams.height = p4.getHeight();
       p0.setLayoutParams(layoutParams);
       return;
    }
}
