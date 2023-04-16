package com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer$a;

public abstract class BaseCollapsedContainer extends FrameLayout	// class@00191d
{
    public final int b;
    public final int c;
    public final int d;

    public void BaseCollapsedContainer(Context p0){
       super(p0);
       this.b = 0;
       this.c = 1;
       this.d = 5;
    }
    public void BaseCollapsedContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.c = 1;
       this.d = 5;
    }
    public void BaseCollapsedContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = 1;
       this.d = 5;
    }
    public abstract void a(BaseCollapsedContainer$a p0);
    public abstract boolean b();
    public abstract void c();
    public abstract void d();
    public abstract void e();
    public abstract void setCollapseSupport(boolean p0);
}
