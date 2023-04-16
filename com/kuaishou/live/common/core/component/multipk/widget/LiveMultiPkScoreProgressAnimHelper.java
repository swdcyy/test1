package com.kuaishou.live.common.core.component.multipk.widget.LiveMultiPkScoreProgressAnimHelper;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig;
import hw1.j;
import ht1.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multipk.widget.LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.widget.LiveMultiPkScoreProgressAnimHelper$a;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkLottieResourceTypes;
import java.lang.Float;
import d61.v;
import android.widget.ImageView;
import lnc.a1;

public class LiveMultiPkScoreProgressAnimHelper	// class@0016a8
{
    public final LottieAnimationView a;
    public LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType b;
    public int c;
    public LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig d;
    public j e;
    public a f;

    public void LiveMultiPkScoreProgressAnimHelper(LottieAnimationView p0,LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig p1,j p2,a p3){
       super();
       this.b = LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_LIGHT;
       this.a = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
    }
    public final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType a(int p0){
       LiveMultiPkScoreProgressAnimHelper liveMultiPkS = LiveMultiPkScoreProgressAnimHelper.class;
       if (PatchProxy.isSupport(liveMultiPkS)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveMultiPkS, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre = (!this.e.a() && this.e.b() - (long)this.d.mShowEmojiBeforePkVoteEndMs < 0)? this.b(p0): LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_LIGHT;
       return livePkProgre;
    }
    public final LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType b(int p0){
       if (p0 < 50) {
          return LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_FAIL;
       }
       if (p0 > 50) {
          return LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_WIN;
       }
       return LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_DRAW;
    }
    public final void c(LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType p0){
       LiveMultiPkScoreProgressAnimHelper liveMultiPkS = LiveMultiPkScoreProgressAnimHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMultiPkS, "2")) {
          return;
       }
       Object[] objArray = null;
       switch (LiveMultiPkScoreProgressAnimHelper$a.a[p0.ordinal()]){
           case 1:
             if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "3")) {
                this.f.b(this.a, LiveMultiPkLottieResourceTypes.PK_SMALL_SPARK_ORANGE);
             }
             break;
           case 2:
             if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "5")) {
                this.f.b(this.a, LiveMultiPkLottieResourceTypes.PK_SMALL_SPARK_BLUE);
             }
             break;
           case 3:
             if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "4")) {
                this.f.b(this.a, LiveMultiPkLottieResourceTypes.PK_BIG_SPARK_ORANGE);
             }
             break;
           case 4:
             if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "6")) {
                this.f.b(this.a, LiveMultiPkLottieResourceTypes.PK_BIG_SPARK_BLUE);
             }
             break;
           case 5:
             if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "8")) {
                this.f.b(this.a, LiveMultiPkLottieResourceTypes.PK_EMOJI_WIN);
             }
             break;
           case 6:
             if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "10")) {
                this.f.e(this.a, LiveMultiPkLottieResourceTypes.PK_EMOJI_DRAW, true);
             }
             break;
           case 7:
             if (!PatchProxy.applyVoid(objArray, this, liveMultiPkS, "9")) {
                this.f.b(this.a, LiveMultiPkLottieResourceTypes.PK_EMOJI_FAIL);
             }
             break;
           default:
             this.d();
       }
    label_00a4 :
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkScoreProgressAnimHelper.class, "7")) {
          return;
       }
       this.f.e(this.a, LiveMultiPkLottieResourceTypes.PK_DIVIDERS, true);
       return;
    }
    public void e(int p0){
       LiveMultiPkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre;
       LiveMultiPkScoreProgressAnimHelper liveMultiPkS = LiveMultiPkScoreProgressAnimHelper.class;
       if (PatchProxy.isSupport(liveMultiPkS) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveMultiPkS, "16")) {
          return;
       }
       if (this.e.c()) {
          livePkProgre = this.b(p0);
          this.b = livePkProgre;
          this.c = 0;
          this.c(livePkProgre);
          return;
       }else {
          livePkProgre = this.a(p0);
          this.b = livePkProgre;
          this.c = 0;
          this.c(livePkProgre);
          return;
       }
    }
    public void f(float p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveMultiPkScoreProgressAnimHelper.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, LiveMultiPkScoreProgressAnimHelper.class, "11")) {
          return;
       }
       int i = v.b((int)((p0 / 100.00f) * (float)p1), p2, (p1 - p2));
       p1 = LiveMultiPkScoreProgressAnimHelper$a.a[this.b.ordinal()];
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 != 4) {
                   p1 = this.a.getWidth() / 2;
                }
             }else {
             label_0051 :
                p1 = a1.e(81.00f);
             }
          }
          p1 = a1.e(9.00f);
       }else {
          goto label_0051 ;
       }
       this.a.setTranslationX((float)(i - p1));
       return;
    }
}
