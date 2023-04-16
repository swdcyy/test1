package com.yxcorp.gifshow.v3.widget.OffsetCaliper;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.widget.OffsetCaliperBaseLine;
import axc.n;
import android.view.View$OnClickListener;
import axc.m;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.widget.OffsetCaliper$a;

public class OffsetCaliper extends RelativeLayout implements d	// class@001655
{
    public ImageView b;
    public ImageView c;
    public OffsetCaliperBaseLine d;
    public OffsetCaliper$a e;
    public static final int f;

    public void OffsetCaliper(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OffsetCaliper.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a1641);
       this.d = m1.f(p0, 0x7f0a1640);
       this.b = m1.f(p0, 0x7f0a163f);
       m1.a(p0, new n(this), R.id.ktv_edit_offset_forward);
       m1.a(p0, new m(this), R.id.ktv_edit_offset_backward);
       return;
    }
    public int getCurrentOffset(){
       Object obj = PatchProxy.apply(null, this, OffsetCaliper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.getCurrentOffset();
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, OffsetCaliper.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void setCurrentOffset(int p0){
       if (PatchProxy.isSupport(OffsetCaliper.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, OffsetCaliper.class, "4")) {
          return;
       }
       OffsetCaliper td = this.d;
       if (td != null) {
          td.setCurrentOffset(p0);
       }
       return;
    }
    public void setOffsetChangeListener(OffsetCaliper$a p0){
       this.e = p0;
    }
}
