package com.kuaishou.live.core.show.hourlytrank.strengthnotice.f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeViewFlipper;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f$a;
import java.lang.Object;
import java.util.LinkedList;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.widget.ViewFlipper;
import java.util.List;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import android.view.animation.Animation;

public class f	// class@000c49
{
    public final LiveHourlyRankStrengthNoticeViewFlipper a;
    public final List b;
    public final f$a c;

    public void f(LiveHourlyRankStrengthNoticeViewFlipper p0,f$a p1){
       super();
       this.b = new LinkedList();
       this.a = p0;
       this.c = p1;
    }
    public LiveHourlyRankStrengthNoticeBaseFlipperItemView a(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.getCurrentView() instanceof LiveHourlyRankStrengthNoticeBaseFlipperItemView) {
          return this.a.getCurrentView();
       }
       return null;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       int i = 0;
       while (i < this.a.getChildCount()) {
          View childAt = this.a.getChildAt(i);
          if (childAt instanceof LiveHourlyRankStrengthNoticeBaseFlipperItemView) {
             childAt.c();
          }
          i = i + 1;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       if (this.b.size() > 1) {
          this.a.startFlipping();
       }else {
          this.d();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.a.stopFlipping();
       return;
    }
    public void e(List p0,boolean p1){
       int i4;
       f uof = f.class;
       String str = "1";
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, str)) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uof, "7")) {
          int i1 = this.b.size();
          int i2 = p0.size();
          if (i2 > i1) {
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), Integer.valueOf(i2), this, uof, "8")) {
                int i3 = 0;
                i4 = i2 - i1;
                while (i3 < i4) {
                   LiveHourlyRankStrengthNoticeBaseFlipperItemView liveHourlyRa = this.c.a();
                   this.b.add(liveHourlyRa);
                   this.a.addView(liveHourlyRa);
                   i3 = i3 + 1;
                }
             }
          }else if(i2 >= i1 || (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), Integer.valueOf(i2), this, uof, "9"))){
             i4 = 0;
             int i5 = i1 - i2;
             while (i4 < i5) {
                f tb = this.b;
                int i6 = tb.size() - 1;
                LiveHourlyRankStrengthNoticeBaseFlipperItemView liveHourlyRa1 = tb.remove(i6);
                if (liveHourlyRa1 != null) {
                   f ta = this.a;
                   Objects.requireNonNull(ta);
                   if (!PatchProxy.applyVoid(null, ta, LiveHourlyRankStrengthNoticeViewFlipper.class, str)) {
                      ta.setInAnimation(null);
                      ta.setOutAnimation(null);
                   }
                   this.a.removeView(liveHourlyRa1);
                   liveHourlyRa1.c();
                }
                i4 = i4 + 1;
             }
             if (this.a.getCurrentView() instanceof LiveHourlyRankStrengthNoticeBaseFlipperItemView) {
                this.a.getCurrentView().b();
             }
          }
       }
       while (i < this.b.size()) {
          if (p0.get(i) != null) {
             this.b.get(i).d(p0.get(i));
          }
          i = i + 1;
       }
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, uof, "6")) {
          if (this.a.isFlipping() && this.b.size() <= 1) {
             this.a.stopFlipping();
          }
          if (!this.a.isFlipping() && (this.b.size() > 1 && p1)) {
             this.a.startFlipping();
          }
       }
    label_011f :
       return;
    }
}
