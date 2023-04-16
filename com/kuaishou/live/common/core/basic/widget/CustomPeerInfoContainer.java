package com.kuaishou.live.common.core.basic.widget.CustomPeerInfoContainer;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Integer;

public class CustomPeerInfoContainer extends RelativeLayout	// class@000f05
{
    public int b;

    public void CustomPeerInfoContainer(Context p0){
       super(p0);
    }
    public void CustomPeerInfoContainer(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void CustomPeerInfoContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, CustomPeerInfoContainer.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.setPadding(this.b, 0, this.b, 0);
       return;
    }
    public void setLayoutPadding(int p0){
       if (PatchProxy.isSupport(CustomPeerInfoContainer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CustomPeerInfoContainer.class, "1")) {
          return;
       }
       this.b = p0;
       this.setPadding(p0, 0, p0, 0);
       return;
    }
}
