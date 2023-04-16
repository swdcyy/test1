package com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class LiveAudienceJoinFansGroupDialog$a extends m	// class@000a6c
{
    public final LiveAudienceJoinFansGroupDialog c;

    public void LiveAudienceJoinFansGroupDialog$a(LiveAudienceJoinFansGroupDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceJoinFansGroupDialog$a.class, "1")) {
          return;
       }
       this.c.dismissAllowingStateLoss();
       return;
    }
}
