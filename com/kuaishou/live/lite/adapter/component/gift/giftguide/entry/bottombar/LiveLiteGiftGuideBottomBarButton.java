package com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.bottombar.LiveLiteGiftGuideBottomBarButton;
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

public class LiveLiteGiftGuideBottomBarButton extends FrameLayout	// class@001ddd
{

    public void LiveLiteGiftGuideBottomBarButton(Context p0){
       super(p0, null);
    }
    public void LiveLiteGiftGuideBottomBarButton(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLiteGiftGuideBottomBarButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftGuideBottomBarButton.class, "1")) {
       }else {
          this.setClipChildren(false);
          this.setClipToPadding(false);
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c5c, this);
       }
       return;
    }
}
