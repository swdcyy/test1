package com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import com.facebook.drawee.view.SimpleDraweeView;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public class LiveHourlyRankPendantView extends LinearLayout	// class@000bf4
{
    public TextView b;
    public TextView c;
    public KwaiCDNImageView d;
    public View$OnClickListener e;

    public void LiveHourlyRankPendantView(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankPendantView.class, "3")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0ce1, this);
          this.d = this.findViewById(0x7f0a2030);
          this.b = this.findViewById(0x7f0a202f);
          this.c = this.findViewById(0x7f0a2035);
          this.setBackground(b.a());
          this.d.setImageResource(R.drawable.arg_RES_7f08144b);
          this.setGravity(16);
          this.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, a1.d(R.dimen.arg_RES_7f0708a3)));
       }
       return;
    }
    public CharSequence getContentText(){
       Object obj = PatchProxy.apply(null, this, LiveHourlyRankPendantView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getText();
    }
    public View$OnClickListener getPendantViewClickListener(){
       return this.e;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveHourlyRankPendantView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveHourlyRankPendantView.class, "1")) {
          return;
       }
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(a1.d(R.dimen.arg_RES_7f0708a3), 0x40000000));
       return;
    }
    public void setContentText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankPendantView.class, "6")) {
          return;
       }
       this.b.setText(p0);
       return;
    }
    public void setIconRes(int p0){
       if (PatchProxy.isSupport(LiveHourlyRankPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveHourlyRankPendantView.class, "2")) {
          return;
       }
       LiveHourlyRankPendantView td = this.d;
       if (td != null) {
          td.o0(p0, 2);
       }
       return;
    }
    public void setPendantViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankPendantView.class, "4")) {
          return;
       }
       this.e = p0;
       this.setOnClickListener(p0);
       return;
    }
    public void setShrinkContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankPendantView.class, "8")) {
          return;
       }
       this.c.setText(p0);
       return;
    }
}
