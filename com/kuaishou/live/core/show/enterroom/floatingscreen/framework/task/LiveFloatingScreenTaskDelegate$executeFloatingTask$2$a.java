package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a;
import w72.a$a;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import s72.b;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import s72.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import t72.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a implements a$a	// class@000b10
{
    public final LiveFloatingScreenTaskDelegate$executeFloatingTask$2 a;

    public void LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a(LiveFloatingScreenTaskDelegate$executeFloatingTask$2 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1){
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2 b;
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a uoexecuteFlo = LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a.class;
       if (PatchProxy.isSupport(uoexecuteFlo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoexecuteFlo, "1")) {
          return;
       }
       if (this.a.b.f.h().getBizType() == p1) {
          LiveLogTag lIVE_ENTER_R = LiveLogTag.LIVE_ENTER_ROOM_EFFECT;
          String str = "LiveFloatingScreenTaskDelegate";
          lIVE_ENTER_R.appendTag(str);
          b.T(lIVE_ENTER_R, "onContentVisibilityChanged", "visible", Boolean.valueOf(p0), "floatingScreenBizType", Integer.valueOf(p1));
          this.a.b.i(p0);
          b = this.a.b;
          Objects.requireNonNull(b);
          b uob = b.class;
          if (PatchProxy.isSupport(uob) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), b, uob, "10") && b.f())) {
             int i = (p0 == true)? 0: 8;
             b h = b.h;
             if (h != null) {
                a uoa = a.class;
                if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), h, uoa, "5")) {
                   KwaiImageView kwaiImageVie = h.g();
                   if (kwaiImageVie != null) {
                      kwaiImageVie.setVisibility(i);
                   }
                }
             }
             lIVE_ENTER_R.appendTag(str);
             b.S(lIVE_ENTER_R, "updateMountVisibility", "visible", Boolean.valueOf(p0));
          }
       }
       return;
    }
}
