package abc.c;
import erd.g;
import com.yxcorp.gifshow.relation.intimate.dialog.c$a;
import java.lang.Object;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import cbc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.e0;
import java.lang.System;
import com.yxcorp.gifshow.relation.intimate.IntimateRouterActivity;

public final class c implements g	// class@0000c9
{
    public final c$a b;

    public void c(c$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       p0 = tb.c;
       IntimateRelationDialogParams mTargetId = p0.i.mTargetId;
       e g = p0.g;
       if (PatchProxy.applyVoidTwoRefs(mTargetId, g, null, b.class, "26")) {
       }else {
          b.h(mTargetId, QCurrentUser.me().getId(), 1, "AGREE", true, g);
       }
       tb.c.c(10);
       tb.c.i.setStyle(3);
       p0 = tb.c.i;
       p0.isFromAgree = true;
       p0.setStartTime(System.currentTimeMillis());
       IntimateRouterActivity.w3(tb.c.i, false);
       return;
    }
}
