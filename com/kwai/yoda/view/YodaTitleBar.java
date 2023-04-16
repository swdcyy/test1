package com.kwai.yoda.view.YodaTitleBar;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.yoda.model.ButtonParams$PositionId;
import android.view.View;

public abstract class YodaTitleBar extends RelativeLayout	// class@0012fa
{

    public void YodaTitleBar(Context p0){
       super(p0);
    }
    public void YodaTitleBar(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void YodaTitleBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public abstract void a(ButtonParams$PositionId p0,View p1);
    public abstract void b(View p0);
    public abstract void setPageTitle(View p0);
}
