package com.yxcorp.gifshow.v3.EditorActivity$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.EditorActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rwc.j;
import com.yxcorp.gifshow.v3.EditorActivity$h;
import ooc.g1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.feature.post.funnel.PostCommonFunnel;

public class EditorActivity$b extends m	// class@000d12
{
    public final EditorActivity c;

    public void EditorActivity$b(EditorActivity p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorActivity$b.class, "1")) {
          return;
       }
       boolean b = true;
       if (this.c.O.getValue() instanceof EditorActivity$h) {
          this.c.O.getValue().ra(b);
       }
       if (!PatchProxy.applyVoid(null, null, g1.class, "30")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_BACK_BUTTON";
          u1.u(b, uElementPack, new ClientContent$ContentPackage());
       }
       PostCommonFunnel.b.b(p0, "edit_close_btn");
       return;
    }
}
