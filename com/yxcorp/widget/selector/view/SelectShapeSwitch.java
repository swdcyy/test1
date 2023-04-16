package com.yxcorp.widget.selector.view.SelectShapeSwitch;
import ald.b;
import android.widget.Switch;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeSwitch extends Switch implements b	// class@0009f9
{
    public d b;

    public void SelectShapeSwitch(Context p0){
       super(p0);
       this.a();
    }
    public void SelectShapeSwitch(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
       e.c(p0, p1, this);
    }
    public void SelectShapeSwitch(Context p0,AttributeSet p1,int p2){
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
