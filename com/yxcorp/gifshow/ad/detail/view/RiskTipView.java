package com.yxcorp.gifshow.ad.detail.view.RiskTipView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public final class RiskTipView extends RelativeLayout	// class@0016f4
{
    public TextView b;
    public View c;
    public HashMap d;

    public void RiskTipView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void RiskTipView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void RiskTipView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       View.inflate(p0, R.layout.arg_RES_7f0d0052, this);
       View view = this.findViewById(R.id.tv_risk_tip);
       a.o(view, "findViewById\(R.id.tv_risk_tip\)");
       this.b = view;
       view = this.findViewById(R.id.iv_close);
       a.o(view, "findViewById\(R.id.iv_close\)");
       this.c = view;
    }
    public void RiskTipView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RiskTipView.class, "3")) {
          return;
       }
       this.setVisibility(8);
       return;
    }
    public final View getIvClose(){
       return this.c;
    }
    public final void setIvClose(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RiskTipView.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void setRiskTipText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RiskTipView.class, "2")) {
          return;
       }
       a.p(p0, "text");
       this.b.setText(p0);
       return;
    }
}
