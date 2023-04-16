package com.kuaishou.house.live.lottery.view.HouseLotteryPendantView;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import com.kuaishou.house.live.lottery.view.HouseLotteryPendantView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.os.CountDownTimer;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class HouseLotteryPendantView extends SelectShapeFrameLayout	// class@00078e
{
    public TextView c;
    public KwaiImageView d;
    public CountDownTimer e;
    public HashMap f;
    public static final HouseLotteryPendantView$a g;

    static {
       HouseLotteryPendantView.g = new HouseLotteryPendantView$a(null);
    }
    public void HouseLotteryPendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void HouseLotteryPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void HouseLotteryPendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d060e, this);
       View view = this.findViewById(R.id.tv_title);
       a.o(view, "findViewById\(R.id.tv_title\)");
       this.c = view;
       view = this.findViewById(R.id.iv_background);
       a.o(view, "findViewById\(R.id.iv_background\)");
       this.d = view;
    }
    public void HouseLotteryPendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static void d(HouseLotteryPendantView p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       p0.c(p1, p2);
       return;
    }
    public final boolean b(long p0){
       boolean b = (p0 > 0 && p0 - (long)0x36ee80 < 0)? true: false;
       return b;
    }
    public final void c(String p0,boolean p1){
       if (PatchProxy.isSupport(HouseLotteryPendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, HouseLotteryPendantView.class, "5")) {
          return;
       }
       this.c.setText(p0);
       if (p1) {
          this.c.setTextSize(1, 9.00f);
       }else {
          this.c.setTextSize(1, 8.00f);
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, HouseLotteryPendantView.class, "4")) {
          return;
       }
       HouseLotteryPendantView te = this.e;
       if (te != null) {
          te.cancel();
       }
       return;
    }
    public final void setBackgroundUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HouseLotteryPendantView.class, "1")) {
          return;
       }
       this.d.L(p0);
       return;
    }
}
