package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribePendantSwitchItemView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.widget.TextView;

public class LiveSubscribePendantSwitchItemView extends SelectShapeRelativeLayout	// class@001103
{
    public SlipSwitchButton c;
    public TextView d;
    public TextView e;

    public void LiveSubscribePendantSwitchItemView(Context p0){
       super(p0, null);
    }
    public void LiveSubscribePendantSwitchItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSubscribePendantSwitchItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveSubscribePendantSwitchItemView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoidOneRefs(this, this, LiveSubscribePendantSwitchItemView.class, "2")) {
          this.c = m1.f(this, 0x7f0a263f);
          this.d = m1.f(this, 0x7f0a2641);
          this.e = m1.f(this, 0x7f0a2642);
       }
       return;
    }
}
