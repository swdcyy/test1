package com.kwai.emotionsdk.widget.SquareFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class SquareFrameLayout extends FrameLayout	// class@000dc6
{

    public void SquareFrameLayout(Context p0){
       super(p0);
    }
    public void SquareFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SquareFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(SquareFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SquareFrameLayout.class, "1")) {
          return;
       }
       super.onMeasure(p0, p0);
       return;
    }
}