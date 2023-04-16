package com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.widget.GuideShareMoreDialog$a;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import qrd.l1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;

public final class GuideShareMoreDialog$b implements View$OnClickListener	// class@001d03
{
    public final GuideShareMoreDialog b;
    public final c c;

    public void GuideShareMoreDialog$b(GuideShareMoreDialog p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, GuideShareMoreDialog$b.class, str)) {
          return;
       }
       GuideShareMoreDialog$a f = GuideShareMoreDialog.f;
       GuideShareMoreDialog$b tb = this.b;
       Objects.requireNonNull(tb);
       GuideShareMoreDialog guideShareMo = PatchProxy.apply(null, tb, GuideShareMoreDialog.class, str);
       if (guideShareMo != PatchProxyResult.class) {
       }else {
          guideShareMo = tb.b;
          if (guideShareMo == null) {
             a.S("feed");
          }
       }
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoidOneRefs(guideShareMo, f, GuideShareMoreDialog$a.class, "5")) {
          a.p(guideShareMo, "feed");
          ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
          uAreaPackage.name = "SHARE_TIP_POPUP";
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_POPUP";
          u1.B(new ClickMetaData().setAreaPackage(uAreaPackage).setElementPackage(uElementPack).setFeedLogCtx(r1.O0(guideShareMo)));
       }
       this.c.q(4);
       return;
    }
}
