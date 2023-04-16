package com.kwaishou.merchant.daccore.mount.anim.DynamicTopRightPendantView;
import com.kwaishou.merchant.daccore.mount.anim.BaseTopRightPendantView;
import android.content.Context;
import android.view.View;

public final class DynamicTopRightPendantView extends BaseTopRightPendantView	// class@001326
{
    public View I;
    public View J;
    public HashMap K;

    public void DynamicTopRightPendantView(Context p0,View p1,View p2){
       super(p0);
       this.I = p1;
       this.J = p2;
    }
    public View L(){
       return this.J;
    }
    public View M(){
       return this.I;
    }
}
