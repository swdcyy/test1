package com.kuaishou.live.webview.context.LiveWebViewBackgroundImageParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import android.graphics.drawable.Drawable;

public class LiveWebViewBackgroundImageParam implements Serializable	// class@000ffe
{
    public int mHeight;
    public String mImageFilePath;
    public boolean mIsShowLoadingBackgroundImage;
    public Drawable mLocalResDrawable;
    public int mLocalResId;
    public float mStartX;
    public float mStartY;
    public int mWidth;

    public void LiveWebViewBackgroundImageParam(){
       super();
       this.mLocalResId = 0;
    }
    public LiveWebViewBackgroundImageParam setHeight(int p0){
       this.mHeight = p0;
       return this;
    }
    public LiveWebViewBackgroundImageParam setImageFilePath(String p0){
       this.mImageFilePath = p0;
       return this;
    }
    public LiveWebViewBackgroundImageParam setIsShowLoadingBackgroundImage(boolean p0){
       this.mIsShowLoadingBackgroundImage = p0;
       return this;
    }
    public LiveWebViewBackgroundImageParam setLocalResDrawable(Drawable p0){
       this.mLocalResDrawable = p0;
       return this;
    }
    public LiveWebViewBackgroundImageParam setLocalResId(int p0){
       this.mLocalResId = p0;
       return this;
    }
    public LiveWebViewBackgroundImageParam setStartX(float p0){
       this.mStartX = p0;
       return this;
    }
    public LiveWebViewBackgroundImageParam setStartY(float p0){
       this.mStartY = p0;
       return this;
    }
    public LiveWebViewBackgroundImageParam setWidth(int p0){
       this.mWidth = p0;
       return this;
    }
}
