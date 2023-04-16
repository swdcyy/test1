package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketTagLabel;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class CommonRedPacketTagLabel extends FrameLayout	// class@000efb
{
    public TextView b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public GradientDrawable h;

    public void CommonRedPacketTagLabel(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketTagLabel(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketTagLabel(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (!PatchProxy.isSupport(CommonRedPacketTagLabel.class) || (!PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), this, CommonRedPacketTagLabel.class, "2") && p1 != null)) {
          this.f = a1.e(0x3f800000);
       }
       if (!PatchProxy.applyVoid(null, this, CommonRedPacketTagLabel.class, "3")) {
          a.c(this.getContext(), R.layout.arg_RES_7f0d020d, this);
          TextView textView = this.findViewById(R.id.red_packet_tag_label);
          this.b = textView;
          this.h = textView.getBackground();
       }
       return;
    }
}
