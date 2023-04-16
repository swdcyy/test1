package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveUserRightsCenterView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.Boolean;
import java.lang.CharSequence;

public class LiveUserRightsCenterView extends FrameLayout	// class@00122e
{
    public View b;
    public TextView c;

    public void LiveUserRightsCenterView(Context p0){
       super(p0, null);
    }
    public void LiveUserRightsCenterView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveUserRightsCenterView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(this.getContext(), R.layout.arg_RES_7f0d0b2a, this);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveUserRightsCenterView.class, "3")) {
       }else {
          this.b = this.findViewById(0x7f0a1d84);
          this.c = this.findViewById(0x7f0a1d85);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveUserRightsCenterView.class, "4")) {
          this.c.setIncludeFontPadding(false);
       }
       return;
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(LiveUserRightsCenterView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveUserRightsCenterView.class, "2")) {
          return;
       }
       if (p0) {
          this.b.setVisibility(0);
       }else {
          this.b.setVisibility(4);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUserRightsCenterView.class, "1")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
}
