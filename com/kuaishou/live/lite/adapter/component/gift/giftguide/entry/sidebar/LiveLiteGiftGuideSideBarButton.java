package com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.LiveLiteGiftGuideSideBarButton;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import ec3.f;
import android.view.ViewGroup;
import android.view.View;
import ha1.b;
import i2b.a;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeView;
import android.widget.TextView;

public class LiveLiteGiftGuideSideBarButton extends FrameLayout	// class@001ddf
{
    public SelectShapeView b;
    public TextView c;
    public boolean d;

    public void LiveLiteGiftGuideSideBarButton(Context p0,boolean p1){
       int i = 0;
       super(p0, null, i);
       if (!PatchProxy.isSupport(LiveLiteGiftGuideSideBarButton.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, LiveLiteGiftGuideSideBarButton.class, "1")) {
          this.setClipChildren(i);
          this.setClipToPadding(i);
          int i1 = 0x7f0d0c5d;
          if (f.b()) {
             if (!p1) {
                i1 = 0x7f0d0c5e;
             }
             b.d(this, i1, true);
          }else {
             p0 = this.getContext();
             if (!p1) {
                i1 = 0x7f0d0c5e;
             }
             a.c(p0, i1, this);
          }
          this.b = m1.f(this, 0x7f0a2570);
          this.c = m1.f(this, 0x7f0a2574);
       }
       this.d = p1;
       return;
    }
}
