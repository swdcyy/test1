package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment;
import com.yxcorp.gifshow.designercreation.model.CreationTab;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.designercreation.logger.CreationReporter;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import qrd.l1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class ProfileCreationContainerFragment$b implements View$OnClickListener	// class@0012cd
{
    public final ProfileCreationContainerFragment b;
    public final CreationTab c;

    public void ProfileCreationContainerFragment$b(ProfileCreationContainerFragment p0,CreationTab p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCreationContainerFragment$b.class, "1")) {
          return;
       }
       CreationReporter b = CreationReporter.b;
       ProfileCreationContainerFragment$b tb = this.b;
       ProfileCreationContainerFragment$b tc = this.c;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(tb, tc, b, CreationReporter.class, "2")) {
          a.p(tb, "page");
          a.p(tc, "tab");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CREATION_SWITCH_TAB";
          HashMap hashMap = new HashMap();
          String str = (tc.isTemplate())? "template": "magic";
          hashMap.put("switch_to", str);
          uElementPack.params = b.a(hashMap);
          u1.M("", tb, 1, uElementPack, null, null);
       }
       return;
    }
}
