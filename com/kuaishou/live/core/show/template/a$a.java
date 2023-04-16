package com.kuaishou.live.core.show.template.a$a;
import dr5.a;
import com.kuaishou.live.core.show.template.a;
import java.lang.Object;
import com.kwai.feature.api.live.floatingscreen.magicface.LiveFloatingScreenMagicFaceEnterRoomBaseData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.activitty.LiveFloatingScreenActivityMagicFaceEnterRoomData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveActivityEnterRoomTip;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$ActivityEnterRoomHint;

public class a$a implements a	// class@001179
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(LiveFloatingScreenMagicFaceEnterRoomBaseData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          String str = "LiveActivityEnterRoomEffectPresenter";
          if (p0.mEnterRoomTip != null) {
             LiveLogTag lIVE_ENTER_R = LiveLogTag.LIVE_ENTER_ROOM_EFFECT;
             lIVE_ENTER_R.appendTag(str);
             b.P(lIVE_ENTER_R, "ILiveFloatingScreenMagicFaceBackLogic back by mEnterRoomTip");
             a$a ta = this.a;
             LiveFloatingScreenActivityMagicFaceEnterRoomData mEnterRoomTi = p0.mEnterRoomTip;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(mEnterRoomTi, ta, a.class, "4")) {
                b.P(lIVE_ENTER_R.appendTag(str), "activityMagicFaceEnterRoomBackByMsg");
                mEnterRoomTi.displayType = 2;
                ta.S8(mEnterRoomTi);
             }
          }else if(p0.mActivityEnterRoomHint != null){
             b.P(LiveLogTag.LIVE_ENTER_ROOM_EFFECT.appendTag(str), "ILiveFloatingScreenMagicFaceBackLogic back by mActivityEnterRoomHint");
             this.a.P8(p0.mActivityEnterRoomHint);
          }
       }
       return;
    }
}
