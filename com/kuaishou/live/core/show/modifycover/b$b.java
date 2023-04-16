package com.kuaishou.live.core.show.modifycover.b$b;
import com.kuaishou.live.core.show.modifycover.a$a;
import com.kuaishou.live.core.show.modifycover.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lc2.l;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import brd.t;
import com.kuaishou.live.core.show.modifycover.b$c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.modifycover.LiveTitleFloatEditorFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import lc2.i;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;

public class b$b implements a$a	// class@000d1a
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$b.class, "4")) {
          return;
       }
       b g = this.a.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoid(objArray, g, l.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 4;
          uElementPack.action = 1327;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 199;
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.elementPackage = uElementPack;
          u1.z0(urlPackage, showEvent);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       b$b ta = this.a;
       ta.i = ta.a().subscribe(new b$c(this.a), Functions.d());
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       b$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "12")) {
          BaseEditorFragment$Arguments uArguments = new BaseEditorFragment$Arguments().setEnableAtFriends(false).setEnableEmoji(false).setMonitorTextChange(true).setMonitorId(ta.hashCode()).setFinishButtonText(a.a().a().getString(R.string.arg_RES_7f100f6b)).setHintText(p0).setCancelWhileKeyboardHidden(true);
          if (!TextUtils.x(ta.b)) {
             uArguments.setText(ta.b);
          }
          LiveTitleFloatEditorFragment liveTitleFlo = new LiveTitleFloatEditorFragment();
          liveTitleFlo.setArguments(uArguments.build());
          liveTitleFlo.ai(new i(ta));
          liveTitleFlo.Cb(ta.f.getSupportFragmentManager(), b.class.getName());
       }
       return;
    }
    public void d(){
       String str = "3";
       if (PatchProxy.applyVoid(null, this, b$b.class, str)) {
          return;
       }
       b g = this.a.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoid(null, g, l.class, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 4;
          uElementPack.action = 1330;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 199;
          u1.A(urlPackage, null, 1, uElementPack, null);
       }
       return;
    }
}
