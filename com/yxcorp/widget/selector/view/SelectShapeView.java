package com.yxcorp.widget.selector.view.SelectShapeView;
import ald.b;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeView extends AppCompatImageView implements b	// class@0009fc
{
    public d d;

    public void SelectShapeView(Context p0){
       super(p0);
       this.a();
    }
    public void SelectShapeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
       e.c(p0, p1, this);
    }
    public void SelectShapeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
       e.c(p0, p1, this);
    }
    public final void a(){
       this.d = new d(this);
    }
    public d getSelectShapeDelegate(){
       return this.d;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
