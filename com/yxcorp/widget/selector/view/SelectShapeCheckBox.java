package com.yxcorp.widget.selector.view.SelectShapeCheckBox;
import ald.b;
import androidx.appcompat.widget.AppCompatCheckBox;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeCheckBox extends AppCompatCheckBox implements b	// class@0009ed
{
    public d e;

    public void SelectShapeCheckBox(Context p0){
       super(p0);
       this.b();
    }
    public void SelectShapeCheckBox(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b();
       e.c(p0, p1, this);
    }
    public void SelectShapeCheckBox(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b();
       e.c(p0, p1, this);
    }
    public final void b(){
       this.e = new d(this);
    }
    public d getSelectShapeDelegate(){
       return this.e;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
