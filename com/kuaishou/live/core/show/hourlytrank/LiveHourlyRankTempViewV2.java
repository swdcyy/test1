package com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankTempViewV2;
import ka2.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.ImageView;
import android.widget.TextView;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiteTextNotice;
import ekd.k1;
import android.animation.Animator;
import z12.x;
import ka2.a$a;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankTempViewV2$a;

public class LiveHourlyRankTempViewV2 extends FrameLayout implements a	// class@000bf6
{
    public LiveCommonNoticeMessages$LiteTextNotice b;
    public ImageView c;
    public TextView d;
    public View e;
    public TextView f;
    public TextView g;
    public TextView h;
    public ObjectAnimator i;
    public LiveHourlyRankTempViewV2$a j;
    public a$a k;
    public static final int l;

    public void LiveHourlyRankTempViewV2(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankTempViewV2(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankTempViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankTempViewV2.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c36, this);
          this.c = this.findViewById(0x7f0a221a);
          this.d = this.findViewById(0x7f0a204d);
          this.e = this.findViewById(0x7f0a2049);
          this.f = this.findViewById(0x7f0a204a);
          this.g = this.findViewById(0x7f0a204b);
          this.h = this.findViewById(0x7f0a204c);
       }
       return;
    }
    public LiveCommonNoticeMessages$LiteTextNotice getCurrentNotice(){
       return this.b;
    }
    public View getView(){
       return this;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankTempViewV2.class, "6")) {
          return;
       }
       k1.n(this);
       this.clearAnimation();
       x.I(this.i);
       return;
    }
    public void setDismissListener(a$a p0){
       this.k = p0;
    }
    public void setHourlyTankTempDelegate(LiveHourlyRankTempViewV2$a p0){
       this.j = p0;
    }
    public final void setPreIcon(LiveCommonNoticeMessages$LiteTextNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankTempViewV2.class, "5")) {
          return;
       }
       p0 = p0.bizType;
       int i = 0x7f08144a;
       if (p0 != 1 && p0 != 2) {
          if (p0 != 3) {
             if (p0 != 4) {
                int i1 = 6;
             }else {
                i = 0x7f081456;
             }
          }else {
             i = 0x7f08144d;
          }
       }
       this.c.setImageResource(i);
       return;
    }
}
