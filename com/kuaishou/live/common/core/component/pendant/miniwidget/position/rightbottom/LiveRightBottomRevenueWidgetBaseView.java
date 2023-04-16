package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetBaseView;
import com.kuaishou.live.common.gzone.pendant.LiveScaleFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LiveMiniWidgetContainerView;
import android.view.View;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetBaseView$a;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetBaseView$b;

public abstract class LiveRightBottomRevenueWidgetBaseView extends LiveScaleFrameLayout	// class@001709
{
    public String d;
    public String e;
    public boolean f;
    public boolean g;

    public void LiveRightBottomRevenueWidgetBaseView(Context p0){
       super(p0);
    }
    public void LiveRightBottomRevenueWidgetBaseView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveRightBottomRevenueWidgetBaseView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public abstract void b(boolean p0);
    public abstract void c(String p0,int p1,UserInfos$PicUrl[] p2,String p3);
    public abstract int getAppointedHeight();
    public abstract LiveMiniWidgetContainerView getContentContainer();
    public abstract int getCurrentScaleState();
    public abstract View getRootContainer();
    public abstract void setScaleAreaClickListener(LiveRightBottomRevenueWidgetBaseView$a p0);
    public abstract void setScaleStateChangeListener(LiveRightBottomRevenueWidgetBaseView$b p0);
    public void setWidgetContainerShow(boolean p0){
       this.g = p0;
    }
}
