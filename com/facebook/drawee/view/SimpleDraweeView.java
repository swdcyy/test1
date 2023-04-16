package com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.drawee.view.GenericDraweeView;
import android.content.Context;
import android.util.AttributeSet;
import kd.b;
import java.lang.String;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.view.DraweeView;
import java.lang.Object;
import ab.e;
import ab.h;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ll8.c$b;
import android.content.res.TypedArray;
import android.net.Uri;
import ib.c;
import com.facebook.imagepipeline.request.ImageRequest;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.d;

public class SimpleDraweeView extends GenericDraweeView	// class@00045d
{
    public AbstractDraweeControllerBuilder h;
    public static h i;

    public void SimpleDraweeView(Context p0){
       super(p0);
       this.r(p0, null);
    }
    public void SimpleDraweeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.r(p0, p1);
    }
    public void SimpleDraweeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r(p0, p1);
    }
    private void r(Context p0,AttributeSet p1){
       if (b.d()) {
          b.a("SimpleDraweeView#init");
       }
       if (this.isInEditMode()) {
          this.getTopLevelDrawable().setVisible(true, false);
          this.getTopLevelDrawable().invalidateSelf();
       }else {
          e.e(SimpleDraweeView.i, "SimpleDraweeView was not initialized!");
          this.h = SimpleDraweeView.i.get();
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d5);
          int i = 2;
          if (typedArray.hasValue(i)) {
             this.t(Uri.parse(typedArray.getString(i)), null);
          }else if(typedArray.hasValue(false)){
             i = -1;
             int resourceId = typedArray.getResourceId(false, i);
             if (resourceId != i) {
                if (this.isInEditMode()) {
                   this.setImageResource(resourceId);
                }else {
                   this.setActualImageResource(resourceId);
                }
             }
          }
          typedArray.recycle();
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
    public static void s(h p0){
       SimpleDraweeView.i = p0;
    }
    public AbstractDraweeControllerBuilder getControllerBuilder(){
       return this.h;
    }
    public void setActualImageResource(int p0){
       this.t(c.e(p0), null);
    }
    public void setImageRequest(ImageRequest p0){
       SimpleDraweeView th = this.h;
       th.w(p0);
       th.y(this.getController());
       this.setController(th.e());
    }
    public void setImageResource(int p0){
       super.setImageResource(p0);
    }
    public void setImageURI(Uri p0){
       this.t(p0, null);
    }
    public void setImageURI(String p0){
       this.u(p0, null);
    }
    public void t(Uri p0,Object p1){
       this.setController(this.h.r(p1).c(p0).d(this.getController()).build());
    }
    public void u(String p0,Object p1){
       Uri uri = (p0 != null)? Uri.parse(p0): null;
       this.t(uri, p1);
       return;
    }
}
