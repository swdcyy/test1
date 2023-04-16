package com.kwai.library.widget.compatimageview.CompatImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import yb.a;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import android.net.Uri;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.kwai.library.widget.compatimageview.CompatImageView$a;
import java.security.InvalidParameterException;
import java.lang.String;
import xb.t$b;
import yb.b;
import android.content.res.Resources;
import com.facebook.drawee.generic.RoundingParams;

public class CompatImageView extends SimpleDraweeView	// class@000911
{
    public a j;

    public void CompatImageView(Context p0){
       super(p0);
       this.v();
    }
    public void CompatImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v();
    }
    public void CompatImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.v();
    }
    public void setCompatImageDrawable(Drawable p0){
       CompatImageView tj = this.j;
       if (tj != null) {
          tj.f(p0, 100.00f, true);
          this.setController(this.getController());
       }
       return;
    }
    public void setCompatImageResource(int p0){
       this.setCompatImageDrawable(ContextCompat.getDrawable(this.getContext(), p0));
    }
    public void setCompatImageUri(Uri p0){
       this.setImageURI(p0);
    }
    public void setCompatScaleType(ImageView$ScaleType p0){
       t$b g;
       a hierarchy = this.getHierarchy();
       switch (CompatImageView$a.a[p0.ordinal()]){
           case 1:
             g = t$b.g;
             break;
           case 2:
             g = t$b.i;
             break;
           case 3:
             g = t$b.h;
             break;
           case 4:
             g = t$b.a;
             break;
           case 5:
             g = t$b.f;
             break;
           case 6:
             g = t$b.d;
             break;
           case 7:
             g = t$b.e;
             break;
           case 8:
             g = t$b.j;
             break;
           default:
             throw new InvalidParameterException("Scale type is not support");
       }
       hierarchy.u(g);
       return;
    }
    public final void v(){
       a uoa = new b(this.getResources()).a();
       this.j = uoa;
       this.setHierarchy(uoa);
    }
    public void w(float p0,float p1,float p2,float p3){
       this.getHierarchy().L(RoundingParams.b(p0, p1, p3, p2));
    }
}
