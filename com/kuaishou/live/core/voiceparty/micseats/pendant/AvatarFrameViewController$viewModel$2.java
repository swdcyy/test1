package com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFrameViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFramePendantViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AvatarFrameViewController$viewModel$2 extends Lambda implements a	// class@0015cd
{
    public final t $avatarFrameInfoListObservable;
    public final a $isNormalRoom;
    public final boolean $isSupportedGiftLevel;
    public final LiveData $micSeatId;
    public final f $micSeatStateService;

    public void AvatarFrameViewController$viewModel$2(f p0,t p1,a p2,boolean p3,LiveData p4){
       this.$micSeatStateService = p0;
       this.$avatarFrameInfoListObservable = p1;
       this.$isNormalRoom = p2;
       this.$isSupportedGiftLevel = p3;
       this.$micSeatId = p4;
       super(0);
    }
    public final AvatarFramePendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, AvatarFrameViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AvatarFramePendantViewModel uAvatarFrame = new AvatarFramePendantViewModel(this.$micSeatStateService, this.$avatarFrameInfoListObservable, this.$isNormalRoom, this.$isSupportedGiftLevel, this.$micSeatId);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
