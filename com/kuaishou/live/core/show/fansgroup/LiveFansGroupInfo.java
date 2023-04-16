package com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFansGroupInfo implements Serializable	// class@000b28
{
    public LiveFansGroupAutoActivePromptDialogInfo mAutoActivePromptDialogInfo;
    public long mDelayJoinMaxDurationMs;
    public boolean mEnableFlashJoin;
    public boolean mHasFansGroupAuthority;
    public boolean mHasFansGroupV2Authority;
    public boolean mHasSuperFansGroupAuthority;
    public LiveFansGroupJoinButtonInfo mLiveFansGroupJoinButtonInfo;
    public static final long serialVersionUID = 0x3f0ab17ab5912e62;

    public void LiveFansGroupInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFansGroupInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFansGroupInfo{hasFansAuthority="+this.mHasFansGroupAuthority+", hasSuperFansAuthority="+this.mHasSuperFansGroupAuthority+", joinButtonView="+this.mLiveFansGroupJoinButtonInfo+'}';
    }
}
