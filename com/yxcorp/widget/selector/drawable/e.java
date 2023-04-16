package com.yxcorp.widget.selector.drawable.e;
import com.yxcorp.widget.selector.drawable.d;
import com.kuaishou.ax2c.IAttrHost;
import java.lang.Object;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.widget.selector.drawable.a;
import android.graphics.drawable.GradientDrawable;

public class e implements d	// class@0009e5
{
    public IAttrHost a;
    public IAttrHost b;
    public IAttrHost c;
    public IAttrHost d;

    public void e(IAttrHost p0,IAttrHost p1,IAttrHost p2,IAttrHost p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(IAttrHost p0,IAttrHost p1,StateListDrawable p2,int p3,int p4){
       int color;
       Drawable drawable;
       int i = 0;
       try{
          color = p1.getColor(p3, i);
          drawable = (!color)? p1.getDrawable(p3): null;
       }catch(java.lang.Exception e0){
          color = 0;
          drawable = p1.getDrawable(p3);
       }
       if (drawable == null && color) {
          Drawable uDrawable = a.a(p0, this.c, this.d, e0);
          if (uDrawable instanceof GradientDrawable) {
             uDrawable.setColor(color);
             int[] ointArray = new int[]{p4};
             p2.addState(ointArray, uDrawable);
          }
       }else {
          int[] ointArray1 = new int[]{p4};
          p2.addState(ointArray1, drawable);
       }
       return;
    }
    public Drawable create(){
       StateListDrawable stateListDra = new StateListDrawable();
       int i = 0;
       while (i < this.b.getIndexCount()) {
          int index = this.b.getIndex(i);
          if (index == 10) {
             this.a(this.a, this.b, stateListDra, index, -16842910);
          }else if(!index){
             this.a(this.a, this.b, stateListDra, index, 0x101009f);
          }else if(index == 8){
             this.a(this.a, this.b, stateListDra, index, -16842911);
          }else if(index == 1){
             this.a(this.a, this.b, stateListDra, index, 0x10100a0);
          }else if(index == 9){
             this.a(this.a, this.b, stateListDra, index, -16842912);
          }else if(index == 7){
             this.a(this.a, this.b, stateListDra, index, 0x10100a1);
          }else if(index == 15){
             this.a(this.a, this.b, stateListDra, index, -16842913);
          }else if(index == 6){
             this.a(this.a, this.b, stateListDra, index, 0x10100a7);
          }else if(index == 14){
             this.a(this.a, this.b, stateListDra, index, -16842919);
          }else if(index == 4){
             this.a(this.a, this.b, stateListDra, index, 0x101009c);
          }else if(index == 12){
             this.a(this.a, this.b, stateListDra, index, -16842908);
          }else if(index == 5){
             this.a(this.a, this.b, stateListDra, index, 0x1010367);
          }else if(index == 13){
             this.a(this.a, this.b, stateListDra, index, -16843623);
          }else if(index == 3){
             this.a(this.a, this.b, stateListDra, index, 0x10102fe);
          }else if(index == 11){
             this.a(this.a, this.b, stateListDra, index, -16843518);
          }else if(index == 2){
             this.a(this.a, this.b, stateListDra, index, 0x101009e);
          }
          i = i + 1;
       }
       return stateListDra;
    }
}
