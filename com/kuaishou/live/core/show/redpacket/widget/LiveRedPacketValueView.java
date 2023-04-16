package com.kuaishou.live.core.show.redpacket.widget.LiveRedPacketValueView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import java.lang.CharSequence;
import d61.f0;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;

public class LiveRedPacketValueView extends LinearLayout implements d	// class@000fc2
{
    public TextView b;
    public TextView c;
    public TextView d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;

    public void LiveRedPacketValueView(Context p0){
       super(p0, null);
    }
    public void LiveRedPacketValueView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRedPacketValueView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.L2, p2, 0);
       this.e = typedArray.getDimensionPixelSize(4, 16);
       this.f = typedArray.getDimensionPixelSize(0, 14);
       this.i = typedArray.getColor(2, a1.a(0x7f061c32));
       this.h = typedArray.getBoolean(1, 0);
       this.g = typedArray.getDimensionPixelOffset(3, 0);
       typedArray.recycle();
       a.c(p0, R.layout.arg_RES_7f0d0d92, this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketValueView.class, "2")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a24e3);
       this.c = m1.f(p0, 0x7f0a24e5);
       this.d = m1.f(p0, 0x7f0a24e4);
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRedPacketValueView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       if (!PatchProxy.applyVoid(objArray, this, LiveRedPacketValueView.class, "5")) {
          this.b.setText(a1.p(R.string.arg_RES_7f102ba6));
          this.b.setTextSize(0, (float)this.f);
          this.b.setTextColor(this.i);
          LiveRedPacketValueView tb = this.b;
          int i = (this.h != null)? 0: 4;
          tb.setVisibility(i);
          this.d.setTextColor(this.i);
          this.d.setTextSize(0, (float)this.f);
          this.d.setText(a1.p(R.string.arg_RES_7f101c07));
          this.c.setTextSize(0, (float)this.e);
          this.c.setTextColor(this.i);
          TextView[] textViewArra = new TextView[]{this.d,this.b};
          f0.h("sans-serif", textViewArra);
       }
       this.c.setPadding(this.g, 0, this.g, 0);
       return;
    }
    public void setHasPrefix(boolean p0){
       if (PatchProxy.isSupport(LiveRedPacketValueView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRedPacketValueView.class, "4")) {
          return;
       }
       this.h = p0;
       LiveRedPacketValueView tb = this.b;
       int i = (p0)? 0: 4;
       tb.setVisibility(i);
       return;
    }
    public void setSuffixTextViewText(String p0){
       if (!TextUtils.x(p0)) {
          this.d.setText(p0);
       }
       return;
    }
    public void setValueText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketValueView.class, "3")) {
          return;
       }
       this.c.setText(TextUtils.k(p0));
       return;
    }
}
