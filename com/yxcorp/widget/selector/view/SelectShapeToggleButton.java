package com.yxcorp.widget.selector.view.SelectShapeToggleButton;
import ald.b;
import androidx.appcompat.widget.AppCompatToggleButton;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeToggleButton extends AppCompatToggleButton implements b	// class@0009fb
{
    public d c;

    public void SelectShapeToggleButton(Context p0){
       super(p0);
       this.a();
    }
    public void SelectShapeToggleButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
       e.c(p0, p1, this);
    }
    public void SelectShapeToggleButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
       e.c(p0, p1, this);
    }
    public final void a(){
       this.c = new d(this);
    }
    public d getSelectShapeDelegate(){
       return this.c;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
