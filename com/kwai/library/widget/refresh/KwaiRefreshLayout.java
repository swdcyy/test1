package com.kwai.library.widget.refresh.KwaiRefreshLayout;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.View;
import android.view.ViewGroup;

public class KwaiRefreshLayout extends CustomRefreshLayout	// class@0009c0
{

    public void KwaiRefreshLayout(Context p0){
       super(p0);
    }
    public void KwaiRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public int getOverScrollYOffset(){
       return this.getTouchSlop();
    }
    public boolean h(){
       return (this.u() ^ 0x01);
    }
    public boolean m(){
       return this.d;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       boolean b = (this.isEnabled() && (p2 & 0x02))? true: false;
       return b;
    }
}
