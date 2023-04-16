package com.yxcorp.gifshow.detailbubble.LikeBubbleBaseView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import t9a.a;

public abstract class LikeBubbleBaseView extends FrameLayout	// class@001a8f
{

    public void LikeBubbleBaseView(Context p0){
       super(p0);
       this.setWillNotDraw(false);
    }
    public void LikeBubbleBaseView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setWillNotDraw(false);
    }
    public void LikeBubbleBaseView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setWillNotDraw(false);
    }
    public abstract boolean a();
    public abstract void b(String p0,CdnResource$ResourceKey p1,int[] p2);
    public abstract void c();
    public abstract void d(int p0,int p1,int p2,int p3,float p4);
    public abstract a getBubbleProvider();
    public abstract void setBifrostStyle(boolean p0);
}
