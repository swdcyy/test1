package com.yxcorp.gifshow.ad.widget.BaseAdProgressView;
import com.yxcorp.gifshow.ad.widget.RoundCornerLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.CharSequence;
import java.lang.String;

public abstract class BaseAdProgressView extends RoundCornerLayout	// class@00191b
{

    public void BaseAdProgressView(Context p0){
       super(p0);
    }
    public void BaseAdProgressView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void BaseAdProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public abstract void c(CharSequence p0,boolean p1);
    public abstract void d();
    public abstract void e(String p0,long p1,long p2,long p3);
    public abstract void f();
    public abstract void setProgress(float p0);
}
