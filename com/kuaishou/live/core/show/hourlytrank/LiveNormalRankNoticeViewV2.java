package com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2;
import ka2.a;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import ba2.w0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.widget.ImageView;
import android.animation.Animator;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import ba2.v0;
import android.view.View$OnClickListener;
import ka2.a$a;
import com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2$a;

public class LiveNormalRankNoticeViewV2 extends RelativeLayout implements a	// class@000bf8
{
    public final Runnable b;
    public a$a c;
    public TextView d;
    public View e;
    public ImageView f;
    public Animation g;
    public Animator h;
    public LiveNormalRankNoticeViewV2$a i;
    public static final float[] j;

    static {
       LiveNormalRankNoticeViewV2.j = new float[2]{0,0x3f800000};
    }
    public void LiveNormalRankNoticeViewV2(Context p0){
       super(p0, null);
    }
    public void LiveNormalRankNoticeViewV2(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveNormalRankNoticeViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new w0(this);
       if (PatchProxy.applyVoid(null, this, LiveNormalRankNoticeViewV2.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0ce8, this);
          this.d = this.findViewById(0x7f0a2217);
          this.e = this.findViewById(0x7f0a2218);
          this.f = this.findViewById(0x7f0a221a);
          this.setClipChildren(false);
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRankNoticeViewV2.class, "4")) {
          return;
       }
       LiveNormalRankNoticeViewV2 th = this.h;
       if (th != null && th.isRunning()) {
          this.h.cancel();
          this.h = null;
       }
       this.clearAnimation();
       this.g = null;
       k1.m(this.b);
       return;
    }
    public final void b(TopDistrictRank p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNormalRankNoticeViewV2.class, "3")) {
          return;
       }
       if (p0.actionType == 1) {
          this.e.setOnClickListener(new v0(this, p0));
       }else {
          this.setOnClickListener(null);
       }
       return;
    }
    public View getView(){
       return this;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveNormalRankNoticeViewV2.class, "6")) {
          return;
       }
       this.a();
       return;
    }
    public void setDismissListener(a$a p0){
       this.c = p0;
    }
    public void setNormalRankNoticeDelegate(LiveNormalRankNoticeViewV2$a p0){
       this.i = p0;
    }
}
