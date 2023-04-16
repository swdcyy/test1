package com.kuaishou.live.audience.component.gift.navigationbar.giftachievement.LiveAudienceGiftAchievementListAreaView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import y01.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import i2b.a;
import com.kuaishou.live.audience.component.gift.navigationbar.giftachievement.LiveAudienceGiftAchievementRecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y01.b;
import androidx.recyclerview.widget.RecyclerView$r;
import y01.c;
import androidx.recyclerview.widget.RecyclerView$q;
import android.graphics.Canvas;
import android.graphics.Path;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.graphics.RectF;
import android.view.View$OnClickListener;

public class LiveAudienceGiftAchievementListAreaView extends ConstraintLayout	// class@000b77
{
    public final a B;
    public final LinearLayoutManager C;
    public LiveAudienceGiftAchievementRecyclerView D;
    public View E;
    public View F;
    public View G;
    public View H;
    public final int I;
    public Path J;
    public boolean K;
    public View$OnClickListener L;

    public void LiveAudienceGiftAchievementListAreaView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceGiftAchievementListAreaView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceGiftAchievementListAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a uoa = new a();
       this.B = uoa;
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext(), 0, 0);
       this.C = linearLayout;
       this.I = a1.e(17.00f);
       this.K = true;
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftAchievementListAreaView.class, "4")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0a0c, this);
          this.E = this.findViewById(0x7f0a2089);
          this.F = this.findViewById(0x7f0a2524);
          this.G = this.findViewById(0x7f0a1822);
          this.H = this.findViewById(0x7f0a1824);
          LiveAudienceGiftAchievementRecyclerView liveAudience = this.findViewById(R.id.live_achievement_recycler_view);
          this.D = liveAudience;
          liveAudience.setLayoutManager(linearLayout);
          this.D.setAdapter(uoa);
          this.D.addOnScrollListener(new b(this));
          this.D.addOnItemTouchListener(new c(this));
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftAchievementListAreaView.class, "3")) {
          return;
       }
       LiveAudienceGiftAchievementListAreaView tJ = this.J;
       if (tJ != null) {
          p0.clipPath(tJ);
       }
       super.dispatchDraw(p0);
       if (this.K != null) {
          LiveAudienceGiftAchievementListAreaView tD = this.D;
          LiveAudienceGiftAchievementRecyclerView b = tD.b;
          LiveAudienceGiftAchievementRecyclerView c = tD.c;
          LiveAudienceGiftAchievementRecyclerView d = tD.d;
          if (!PatchProxy.isSupport(LiveAudienceGiftAchievementListAreaView.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Boolean.valueOf(c), Boolean.valueOf(d), this, LiveAudienceGiftAchievementListAreaView.class, "5")) {
             if (b != null) {
                this.G.setVisibility(false);
                this.H.setVisibility(false);
             }else {
                this.G.setVisibility(8);
                this.H.setVisibility(8);
             }
             if (c != null) {
                this.E.setVisibility(false);
             }else {
                this.E.setVisibility(8);
             }
             if (d != null) {
                this.F.setVisibility(false);
             }else {
                this.F.setVisibility(8);
             }
          }
          this.K = false;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       Path path;
       if (PatchProxy.isSupport(LiveAudienceGiftAchievementListAreaView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveAudienceGiftAchievementListAreaView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = this.getMeasuredWidth();
       p1 = this.getMeasuredHeight();
       LiveAudienceGiftAchievementListAreaView tI = this.I;
       if (PatchProxy.isSupport(LiveAudienceGiftAchievementListAreaView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(tI),Integer.valueOf(tI),Integer.valueOf(tI),Integer.valueOf(tI)};
          path = PatchProxy.apply(objArray, this, LiveAudienceGiftAchievementListAreaView.class, "6");
          if (path != PatchProxyResult.class) {
          label_00d0 :
             this.J = path;
             return;
          }
       }
       path = new Path();
       path.moveTo(0, (float)tI);
       if (tI != null) {
          path.arcTo(new RectF(0, 0, (float)(tI * 2), (float)(tI * 2)), -180.00f, 90.00f);
       }
       path.lineTo((float)(p0 - tI), 0);
       if (tI != null) {
          int i = tI * 2;
          path.arcTo(new RectF((float)(p0 - i), 0, (float)p0, (float)i), -90.00f, 90.00f);
       }
       float f = (float)p0;
       path.lineTo(f, (float)(p1 - tI));
       if (tI != null) {
          int i1 = tI * 2;
          path.arcTo(new RectF((float)(p0 - i1), (float)(p1 - i1), f, (float)p1), 0, 90.00f);
       }
       f = (float)p1;
       path.lineTo((float)tI, f);
       if (tI != null) {
          int i2 = tI * 2;
          path.arcTo(new RectF(0, (float)(p1 - i2), (float)i2, f), 90.00f, 90.00f);
       }
       path.close();
       goto label_00d0 ;
    }
    public void setClickListener(View$OnClickListener p0){
       this.L = p0;
    }
}
