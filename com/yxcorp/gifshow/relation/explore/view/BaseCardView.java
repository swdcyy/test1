package com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.Object;
import fac.b;

public abstract class BaseCardView extends RelativeLayout	// class@001881
{
    public ViewGroup b;
    public Object c;
    public b d;

    public void BaseCardView(Context p0){
       super(p0);
    }
    public void BaseCardView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void BaseCardView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public abstract void a();
    public abstract void b(TextView p0,TextView p1);
    public abstract void c();
    public void d(){
    }
    public void setData(Object p0){
       this.c = p0;
    }
    public void setParams(b p0){
       this.d = p0;
    }
}
