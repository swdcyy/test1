package com.yxcorp.gifshow.debug.PreviewDebugView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import xv9.b;

public class PreviewDebugView extends View	// class@0012a5
{

    public void PreviewDebugView(Context p0){
       super(p0);
    }
    public void PreviewDebugView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PreviewDebugView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       this.getWidth();
       this.getHeight();
    }
}
