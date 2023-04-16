package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankSuffixCheckImageView;
import com.kuaishou.live.widget.ShootMarqueeView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.d;
import android.view.View$OnClickListener;
import fa2.l;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$FoldMessage;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import android.widget.TextView;
import java.lang.Integer;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import com.yxcorp.utility.TextUtils;
import va1.l0;
import ekd.k1;
import android.view.ViewTreeObserver;
import fa2.n;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import fa2.m;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView$a;

public class LiveHourlyRankStrengthNoticeNarrowItemView extends LiveHourlyRankStrengthNoticeBaseFlipperItemView	// class@000c34
{
    public LiveHourlyRankSuffixCheckImageView b;
    public ShootMarqueeView c;
    public boolean d;
    public int e;
    public LiveHourlyRankStrengthNoticeNarrowItemView$a f;
    public String g;
    public static final int h;

    static {
       LiveHourlyRankStrengthNoticeNarrowItemView.h = a1.d(0x7f070344);
    }
    public void LiveHourlyRankStrengthNoticeNarrowItemView(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankStrengthNoticeNarrowItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankStrengthNoticeNarrowItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = LiveHourlyRankStrengthNoticeNarrowItemView.h;
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "5")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c33, this);
          this.b = this.findViewById(0x7f0a2043);
          this.c = this.findViewById(0x7f0a2044);
          this.setOnClickListener(new d(this));
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "3")) {
          return;
       }
       this.g();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "2")) {
          return;
       }
       this.f();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "4")) {
          return;
       }
       this.g();
       return;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "1")) {
       }else if(p0.a() != null){
          LiveDistrictRankFinalBattle$FoldMessage uFoldMessage = p0.a();
          if (!PatchProxy.applyVoidOneRefs(uFoldMessage, this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "6")) {
             if (!j.h(uFoldMessage.iconUrl)) {
                this.b.U(e0.i(uFoldMessage.iconUrl));
             }
             int h = LiveHourlyRankStrengthNoticeNarrowItemView.h;
             this.e = h;
             this.c.setMaxWidth(h);
             uFoldMessage = uFoldMessage.contentWithStyle;
             LiveHourlyRankStrengthNoticeNarrowItemView te = this.e;
             if (PatchProxy.isSupport(LiveHourlyRankStrengthNoticeNarrowItemView.class) && (PatchProxy.applyVoidTwoRefs(uFoldMessage, Integer.valueOf(te), this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "7") || (uFoldMessage != null && !TextUtils.n(uFoldMessage.content, this.c.getText())))) {
                this.c.setText(uFoldMessage.content);
                this.c.setTextColor(l0.j(uFoldMessage.color, 0xff000000));
                if (this.d != null) {
                   k1.n(this);
                   if (!PatchProxy.isSupport(LiveHourlyRankStrengthNoticeNarrowItemView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(te), this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "11")) {
                      this.c.getViewTreeObserver().addOnGlobalLayoutListener(new n(this, te));
                   }
                }
             }
          }
       }
    label_00ac :
       this.g = p0.d;
       return;
    }
    public void e(int p0){
       if (PatchProxy.isSupport(LiveHourlyRankStrengthNoticeNarrowItemView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "10")) {
          return;
       }
       this.c.setMarqueeDpPerSecond(40);
       this.d = true;
       this.c.w(100, p0);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "9")) {
          return;
       }
       k1.n(this);
       k1.s(new m(this), this, 600);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeNarrowItemView.class, "8")) {
          return;
       }
       this.d = false;
       this.c.y();
       k1.n(this);
       this.c.setScrollX(false);
       return;
    }
    public String getExtraInfo(){
       return this.g;
    }
    public void setClickListener(LiveHourlyRankStrengthNoticeNarrowItemView$a p0){
       this.f = p0;
    }
}
