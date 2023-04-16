package com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import ald.b;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeRelativeLayout extends RelativeLayout implements b	// class@0009f8
{
    public d b;

    public void SelectShapeRelativeLayout(Context p0){
       super(p0);
       this.b();
    }
    public void SelectShapeRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b();
       e.c(p0, p1, this);
    }
    public void SelectShapeRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b();
       e.c(p0, p1, this);
    }
    private void b(){
       this.b = new d(this);
    }
    public d getSelectShapeDelegate(){
       return this.b;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
