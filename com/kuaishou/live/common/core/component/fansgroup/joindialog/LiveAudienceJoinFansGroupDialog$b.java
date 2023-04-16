package com.kuaishou.live.common.core.component.fansgroup.joindialog.LiveAudienceJoinFansGroupDialog$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.fansgroup.joindialog.LiveAudienceJoinFansGroupDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.c;
import com.kwai.framework.model.user.User;
import lg1.a;

public class LiveAudienceJoinFansGroupDialog$b extends m	// class@0010f7
{
    public final LiveAudienceJoinFansGroupDialog c;

    public void LiveAudienceJoinFansGroupDialog$b(LiveAudienceJoinFansGroupDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       LiveAudienceJoinFansGroupDialog c;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceJoinFansGroupDialog$b.class, "1")) {
          return;
       }
       LiveAudienceJoinFansGroupDialog$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, LiveAudienceJoinFansGroupDialog.class, "10") && FansGroupKswitchUtil.b()) {
          b uob = new b(true, "JoinDialog", "CLICK");
          uob.g(tc.B);
          c.a(uob);
       }
       tc = this.c;
       c = tc.C;
       if (c != null) {
          c.a(tc.D);
       }
       return;
    }
}
