package com.yxcorp.widget.selector.view.SelectShapeRecyclerView;
import ald.b;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ald.e;
import ald.d;
import com.kuaishou.ax2c.IAttrHost;
import ald.a;

public class SelectShapeRecyclerView extends RecyclerView implements b	// class@0009f7
{
    public d b;

    public void SelectShapeRecyclerView(Context p0){
       super(p0);
       this.x();
    }
    public void SelectShapeRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x();
       e.c(p0, p1, this);
    }
    public void SelectShapeRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x();
       e.c(p0, p1, this);
    }
    public d getSelectShapeDelegate(){
       return this.b;
    }
    public void setAttrs(IAttrHost[] p0){
       a.a(this, p0);
    }
    public final void x(){
       this.b = new d(this);
    }
}
