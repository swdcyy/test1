package com.yxcorp.widget.selector.view.SelectShapeEditText;
import ald.b;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeEditText extends AppCompatEditText implements b	// class@0009f0
{
    public d e;

    public void SelectShapeEditText(Context p0){
       super(p0, null);
       this.a();
    }
    public void SelectShapeEditText(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04031d);
       this.a();
    }
    public void SelectShapeEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
       e.c(p0, p1, this);
    }
    public final void a(){
       this.e = new d(this);
    }
    public d getSelectShapeDelegate(){
       return this.e;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
}
