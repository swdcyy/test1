package com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import ald.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeConstraintLayout extends ConstraintLayout implements b	// class@0009ef
{
    public d B;

    public void SelectShapeConstraintLayout(Context p0){
       super(p0);
       this.L();
    }
    public void SelectShapeConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.L();
       e.c(p0, p1, this);
    }
    public void SelectShapeConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.L();
       e.c(p0, p1, this);
    }
    private void L(){
       this.B = new d(this);
    }
    public d getSelectShapeDelegate(){
       return this.B;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
