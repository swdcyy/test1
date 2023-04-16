package com.kwai.library.widget.surface.SafeTextureView;
import android.view.TextureView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SafeTextureView extends TextureView	// class@000a2d
{

    public void SafeTextureView(Context p0){
       super(p0);
    }
    public void SafeTextureView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SafeTextureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
    }
}
