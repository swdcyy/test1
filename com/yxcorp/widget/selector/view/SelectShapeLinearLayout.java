package com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import ald.b;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeLinearLayout extends LinearLayout implements b	// class@0009f4
{
    public d b;

    public void SelectShapeLinearLayout(Context p0){
       super(p0);
       this.h();
    }
    public void SelectShapeLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h();
       e.c(p0, p1, this);
    }
    public void SelectShapeLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h();
       e.c(p0, p1, this);
    }
    public d getSelectShapeDelegate(){
       return this.b;
    }
    public final void h(){
       this.b = new d(this);
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
