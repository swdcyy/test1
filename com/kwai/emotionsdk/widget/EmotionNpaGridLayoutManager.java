package com.kwai.emotionsdk.widget.EmotionNpaGridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;

public class EmotionNpaGridLayoutManager extends GridLayoutManager	// class@000dbf
{

    public void EmotionNpaGridLayoutManager(Context p0,int p1){
       super(p0, p1);
    }
    public void EmotionNpaGridLayoutManager(Context p0,int p1,int p2,boolean p3){
       super(p0, p1, p2, p3);
    }
    public void EmotionNpaGridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public boolean supportsPredictiveItemAnimations(){
       return false;
    }
}
