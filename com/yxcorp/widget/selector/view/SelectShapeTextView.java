package com.yxcorp.widget.selector.view.SelectShapeTextView;
import ald.b;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeTextView extends AppCompatTextView implements b	// class@0009fa
{
    public d f;

    public void SelectShapeTextView(Context p0){
       super(p0);
       this.p();
    }
    public void SelectShapeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.p();
       e.c(p0, p1, this);
    }
    public void SelectShapeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p();
       e.c(p0, p1, this);
    }
    public d getSelectShapeDelegate(){
       return this.f;
    }
    public final void p(){
       this.f = new d(this);
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
