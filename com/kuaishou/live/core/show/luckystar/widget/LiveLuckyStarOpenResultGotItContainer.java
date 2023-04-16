package com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarOpenResultGotItContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class LiveLuckyStarOpenResultGotItContainer extends FrameLayout	// class@000d10
{
    public float b;

    public void LiveLuckyStarOpenResultGotItContainer(Context p0){
       super(p0);
       this.b = 0x3f19999a;
    }
    public void LiveLuckyStarOpenResultGotItContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0x3f19999a;
    }
    public void LiveLuckyStarOpenResultGotItContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f19999a;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(LiveLuckyStarOpenResultGotItContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLuckyStarOpenResultGotItContainer.class, "1")) {
          return;
       }
       super.setPressed(p0);
       LiveLuckyStarOpenResultGotItContainer tb = (p0)? this.b: 0x3f800000;
       this.setAlpha(tb);
       return;
    }
    public void setPressedAlpha(float p0){
       this.b = p0;
    }
}
