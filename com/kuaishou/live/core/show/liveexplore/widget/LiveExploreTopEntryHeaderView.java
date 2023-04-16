package com.kuaishou.live.core.show.liveexplore.widget.LiveExploreTopEntryHeaderView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.live.core.basic.widget.LiveHourlyRankAvatarRotateView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import com.kuaishou.live.core.show.liveexplore.widget.LiveExploreTopEntryHeaderView$a;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Integer;
import ua2.j;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;

public class LiveExploreTopEntryHeaderView extends ConstraintLayout	// class@000c7d
{
    public LiveHourlyRankAvatarRotateView B;
    public KwaiImageView C;
    public View D;
    public KwaiImageView E;
    public TextView F;
    public View G;
    public j H;
    public static final int I;

    public void LiveExploreTopEntryHeaderView(Context p0){
       super(p0, null);
    }
    public void LiveExploreTopEntryHeaderView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveExploreTopEntryHeaderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.k(this, R.layout.arg_RES_7f0d0af4, true);
       if (PatchProxy.applyVoid(null, this, LiveExploreTopEntryHeaderView.class, "5")) {
       }else {
          this.B = m1.f(this, 0x7f0a1c43);
          this.C = m1.f(this, 0x7f0a1c48);
          this.D = m1.f(this, 0x7f0a1c47);
          this.E = m1.f(this, 0x7f0a1c5b);
          this.F = m1.f(this, 0x7f0a1c5d);
          this.G = m1.f(this, 0x7f0a1c5c);
       }
       return;
    }
    public final void L(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveExploreTopEntryHeaderView.class, "7")) {
          return;
       }
       if (!j.h(p0)) {
          this.C.a0(p0, new LiveExploreTopEntryHeaderView$a(this));
       }
       return;
    }
    public final void M(int p0){
       if (PatchProxy.isSupport(LiveExploreTopEntryHeaderView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveExploreTopEntryHeaderView.class, "9")) {
          return;
       }
       LiveExploreTopEntryHeaderView tH = this.H;
       if (tH != null) {
          tH.b(p0);
       }
       return;
    }
    public final void N(int p0){
       if (PatchProxy.isSupport(LiveExploreTopEntryHeaderView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveExploreTopEntryHeaderView.class, "10")) {
          return;
       }
       LiveExploreTopEntryHeaderView tH = this.H;
       if (tH != null) {
          tH.a(p0);
       }
       return;
    }
    public void O(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveExploreTopEntryHeaderView.class, "2")) {
          return;
       }
       this.B.e();
       LiveExploreTopEntryHeaderView tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, LiveHourlyRankAvatarRotateView.class, "2")) {
          tB.i = false;
          tB.g = 0;
          tB.h = 0;
          k1.m(tB.c);
          k1.r(tB.c, 1000);
       }
       return;
    }
    public void setTopEntryClickListener(j p0){
       this.H = p0;
    }
}
