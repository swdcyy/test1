package com.yxcorp.plugin.search.widget.SearchPopupBackgroundView;
import com.yxcorp.gifshow.widget.PopupBackgroundView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;

public class SearchPopupBackgroundView extends PopupBackgroundView	// class@0007de
{
    public float B;
    public int C;
    public int D;
    public int E;

    public void SearchPopupBackgroundView(Context p0){
       super(p0);
    }
    public void SearchPopupBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SearchPopupBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void c(float p0,float p1,float p2){
       if (PatchProxy.isSupport(SearchPopupBackgroundView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, SearchPopupBackgroundView.class, "2")) {
          return;
       }
       this.B = p1;
       super.c(p0, p1, p2);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 5;
       if (PatchProxy.isSupport(SearchPopupBackgroundView.class)) {
          Object[] objArray = new Object[i];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, this, SearchPopupBackgroundView.class, "1")) {
             return;
          }
       }
       float f = ((float)this.getWidth() / 2.00f) - (this.B / 2.00f);
       SearchPopupBackgroundView tC = this.C;
       if (tC == 3) {
          this.setArrowOffsetMiddle(((- f) + (float)this.D));
       }else if(tC == i){
          this.setArrowOffsetMiddle((f - (float)this.E));
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void setArrowGravity(int p0){
       this.C = p0;
    }
    public void setArrowMarginLeft(int p0){
       this.D = p0;
    }
    public void setArrowMarginRight(int p0){
       this.E = p0;
    }
}
