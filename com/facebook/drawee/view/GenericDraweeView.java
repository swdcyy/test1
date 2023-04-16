package com.facebook.drawee.view.GenericDraweeView;
import com.facebook.drawee.view.DraweeView;
import android.content.Context;
import android.util.AttributeSet;
import yb.a;
import ac.b;
import kd.b;
import java.lang.String;
import yb.b;
import yb.c;

public class GenericDraweeView extends DraweeView	// class@00045c
{

    public void GenericDraweeView(Context p0){
       super(p0);
       this.q(p0, null);
    }
    public void GenericDraweeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.q(p0, p1);
    }
    public void GenericDraweeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.q(p0, p1);
    }
    public void GenericDraweeView(Context p0,a p1){
       super(p0);
       this.setHierarchy(p1);
    }
    public void q(Context p0,AttributeSet p1){
       if (b.d()) {
          b.a("GenericDraweeView#inflateHierarchy");
       }
       b uob = c.d(p0, p1);
       this.setAspectRatio(uob.b());
       this.setHierarchy(uob.a());
       if (b.d()) {
          b.b();
       }
       return;
    }
}
