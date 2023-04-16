package com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import ald.b;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeFrameLayout extends FrameLayout implements b	// class@0009f1
{
    public d b;

    public void SelectShapeFrameLayout(Context p0){
       super(p0);
       this.a();
    }
    public void SelectShapeFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
       e.c(p0, p1, this);
    }
    public void SelectShapeFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
       e.c(p0, p1, this);
    }
    public final void a(){
       this.b = new d(this);
    }
    public d getSelectShapeDelegate(){
       return this.b;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
