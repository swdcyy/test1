package com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelPrivilegeItemViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelPrivilegeItemViewController$onCreate$viewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelPrivilegeItemViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import vx2.f;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.privilege.VoicePartyLevelPrivilegeItemViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import vx2.e;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import qrd.p;
import vx2.b;
import androidx.lifecycle.Observer;
import vx2.c;
import vx2.d;

public final class VoicePartyLevelPrivilegeItemViewController extends ViewController	// class@001ab3
{
    public final LiveData j;

    public void VoicePartyLevelPrivilegeItemViewController(LiveData p0){
       a.p(p0, "dataProvider");
       super();
       this.j = p0;
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, VoicePartyLevelPrivilegeItemViewController.class, str)) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0e5d);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       e uoe = new e(view, this);
       f value = new ViewModelLazy(m0.d(f.class), new VoicePartyLevelPrivilegeItemViewController$onCreate$$inlined$viewModels$2(new VoicePartyLevelPrivilegeItemViewController$onCreate$$inlined$viewModels$1(this)), new VoicePartyLevelPrivilegeItemViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, uoe, e.class, str)) {
          a.p(value, "model");
          value.a.observe(uoe.e, new b(uoe));
          value.b.observe(uoe.e, new c(uoe));
          value.c.observe(uoe.e, new d(uoe));
       }
       return;
    }
}
