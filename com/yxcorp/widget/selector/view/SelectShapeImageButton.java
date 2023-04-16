package com.yxcorp.widget.selector.view.SelectShapeImageButton;
import ald.b;
import androidx.appcompat.widget.AppCompatImageButton;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeImageButton extends AppCompatImageButton implements b	// class@0009f2
{
    public d d;

    public void SelectShapeImageButton(Context p0){
       super(p0);
       this.a();
    }
    public void SelectShapeImageButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
       e.c(p0, p1, this);
    }
    public void SelectShapeImageButton(Context p0,AttributeSet p1,int p2){
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
