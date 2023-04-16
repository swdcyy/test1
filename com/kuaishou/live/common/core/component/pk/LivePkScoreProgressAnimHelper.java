package com.kuaishou.live.common.core.component.pk.LivePkScoreProgressAnimHelper;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import com.kuaishou.live.common.core.component.pk.LivePkScoreProgressAnimHelper$LivePkProgressAnimType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import hw1.j;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.pk.LivePkScoreProgressAnimHelper$a;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import com.kuaishou.live.common.core.component.pk.b;

public class LivePkScoreProgressAnimHelper	// class@00172f
{
    public final LottieAnimationView a;
    public LivePkScoreProgressAnimHelper$LivePkProgressAnimType b;
    public int c;
    public LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig d;
    public j e;

    public void LivePkScoreProgressAnimHelper(LottieAnimationView p0){
       super();
       this.b = LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_LIGHT;
       this.a = p0;
    }
    public final LivePkScoreProgressAnimHelper$LivePkProgressAnimType a(int p0){
       LivePkScoreProgressAnimHelper livePkScoreP = LivePkScoreProgressAnimHelper.class;
       if (PatchProxy.isSupport(livePkScoreP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, livePkScoreP, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       LivePkScoreProgressAnimHelper$LivePkProgressAnimType livePkProgre = (!this.e.a() && this.e.b() - (long)this.d.mShowEmojiBeforePkVoteEndMs < 0)? this.b(p0): LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_LIGHT;
       return livePkProgre;
    }
    public final LivePkScoreProgressAnimHelper$LivePkProgressAnimType b(int p0){
       if (p0 < 50) {
          return LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_FAIL;
       }
       if (p0 > 50) {
          return LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_WIN;
       }
       return LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_DRAW;
    }
    public final void c(LivePkScoreProgressAnimHelper$LivePkProgressAnimType p0){
       LivePkScoreProgressAnimHelper livePkScoreP = LivePkScoreProgressAnimHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, livePkScoreP, "2")) {
          return;
       }
       b.Q(LiveLogTag.PK.appendTag("LivePkScoreProgressAnimHelper"), "playAnimation", c.j("animType", p0));
       switch (LivePkScoreProgressAnimHelper$a.a[p0.ordinal()]){
           case 1:
             if (!PatchProxy.applyVoid(null, this, livePkScoreP, "3")) {
                b.c(this.a, LivePkResource$PkSkinResource.PK_SMALL_SPARK_ORANGE);
             }
             break;
           case 2:
             if (!PatchProxy.applyVoid(null, this, livePkScoreP, "5")) {
                b.c(this.a, LivePkResource$PkSkinResource.PK_SMALL_SPARK_BLUE);
             }
             break;
           case 3:
             if (!PatchProxy.applyVoid(null, this, livePkScoreP, "4")) {
                b.c(this.a, LivePkResource$PkSkinResource.PK_BIG_SPARK_ORANGE);
             }
             break;
           case 4:
             if (!PatchProxy.applyVoid(null, this, livePkScoreP, "6")) {
                b.c(this.a, LivePkResource$PkSkinResource.PK_BIG_SPARK_BLUE);
             }
             break;
           case 5:
             if (!PatchProxy.applyVoid(null, this, livePkScoreP, "8")) {
                b.c(this.a, LivePkResource$PkSkinResource.PK_EMOJI_WIN);
             }
             break;
           case 6:
             if (!PatchProxy.applyVoid(null, this, livePkScoreP, "10")) {
                b.c(this.a, LivePkResource$PkSkinResource.PK_EMOJI_DRAW);
             }
             break;
           case 7:
             if (!PatchProxy.applyVoid(null, this, livePkScoreP, "9")) {
                b.c(this.a, LivePkResource$PkSkinResource.PK_EMOJI_FAIL);
             }
             break;
           default:
             this.d();
       }
    label_00a7 :
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LivePkScoreProgressAnimHelper.class, "7")) {
          return;
       }
       b.c(this.a, LivePkResource$PkSkinResource.PK_DIVIDERS);
       return;
    }
}
