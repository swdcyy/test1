package com.kuaishou.live.redpacket.core.ui.view.pendant.RedPacketPendantBottomView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.basic.widget.LiveTextView;

public class RedPacketPendantBottomView extends FrameLayout	// class@000f34
{
    public LiveTextView b;
    public View c;

    public void RedPacketPendantBottomView(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketPendantBottomView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketPendantBottomView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketPendantBottomView.class, "1")) {
          return;
       }
       a.k(this, R.layout.arg_RES_7f0d0d9b, true);
       this.c = this.findViewById(0x7f0a046c);
       this.b = this.findViewById(0x7f0a250b);
       return;
    }
    public View getBottomAreaRootView(){
       return this.c;
    }
    public LiveTextView getCountDownTextView(){
       return this.b;
    }
}
