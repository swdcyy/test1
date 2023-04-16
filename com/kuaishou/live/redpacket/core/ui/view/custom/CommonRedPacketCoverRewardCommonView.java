package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketCoverRewardCommonView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import po3.e;
import lo3.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import jo3.a;
import bld.c;
import android.graphics.drawable.Drawable;
import java.lang.Integer;

public class CommonRedPacketCoverRewardCommonView extends LinearLayout	// class@000ef2
{
    public TextView b;
    public TextView c;
    public TextView d;
    public int e;
    public int f;
    public int g;
    public a h;

    public void CommonRedPacketCoverRewardCommonView(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketCoverRewardCommonView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketCoverRewardCommonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonRedPacketCoverRewardCommonView.class, "1")) {
       }else {
          this.e = a1.d(0x7f070da9);
          this.f = a1.d(0x7f070dab);
          this.g = a1.d(0x7f070da3);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketCoverRewardCommonView.class, "2")) {
          a.c(p0, R.layout.arg_RES_7f0d020a, this);
          this.b = this.findViewById(0x7f0a3506);
          this.c = this.findViewById(0x7f0a3507);
          this.d = this.findViewById(0x7f0a3504);
          e.a(this.b, this.getContext());
          e.a(this.d, this.getContext());
          this.b.setTextSize(0, (float)this.e);
          this.c.setTextSize(0, (float)this.f);
          this.b.setTextSize(0, (float)this.g);
       }
       this.setOrientation(0);
       return;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketCoverRewardCommonView.class, "3")) {
          return;
       }
       CommonRedPacketCoverRewardCommonView th = this.h;
       if (th == null || th.a != p0.a) {
          this.b.setTextColor(p0.a);
          this.c.setTextColor(p0.a);
       }
       th = this.h;
       int i = 1;
       if (th == null || th.b != p0.b) {
          this.b.setTextSize(i, (float)p0.b);
       }
       th = this.h;
       if (th == null || th.d != p0.d) {
          this.b.setText(String.valueOf(p0.d));
       }
       th = this.h;
       if (th == null || !TextUtils.equals(th.c, p0.c)) {
          this.c.setText(p0.c);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketCoverRewardCommonView.class, "4")) {
          th = this.h;
          if (th == null || th.e != p0.e) {
             if (p0.e == null) {
                this.d.setVisibility(8);
                this.d.setText("");
             }else {
                this.d.setVisibility(0);
                b uob = new b();
                uob.v(a1.a(R.color.arg_RES_7f061d3f));
                uob.s(DrawableCreator$Shape.Rectangle);
                uob.g(new a((float)R.dimen.arg_RES_7f070da5));
                this.d.setBackground(uob.a());
                Object[] objArray = new Object[i];
                objArray[0] = Integer.valueOf(p0.e);
                this.d.setText(String.format("x%d", objArray));
             }
          }
       }
       this.h = p0;
       return;
    }
}
