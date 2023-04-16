package com.yxcorp.widget.selector.view.SelectShapeCheckedTextView;
import ald.b;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeCheckedTextView extends AppCompatCheckedTextView implements b	// class@0009ee
{
    public d d;

    public void SelectShapeCheckedTextView(Context p0){
       super(p0);
       this.a();
    }
    public void SelectShapeCheckedTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
       e.c(p0, p1, this);
    }
    public void SelectShapeCheckedTextView(Context p0,AttributeSet p1,int p2){
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
