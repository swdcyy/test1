package com.kuaishou.krn.title.AbsTopBar;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kuaishou.krn.title.ButtonParams$PositionId;

public abstract class AbsTopBar extends RelativeLayout	// class@000916
{

    public void AbsTopBar(Context p0){
       super(p0);
    }
    public void AbsTopBar(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void AbsTopBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public abstract void a(View p0);
    public abstract void b(ButtonParams$PositionId p0,View p1);
    public abstract void setTitle(View p0);
}
