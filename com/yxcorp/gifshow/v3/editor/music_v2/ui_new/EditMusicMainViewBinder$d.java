package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.CheckBox;
import java.util.Objects;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import urc.e;
import lsc.f0;
import java.lang.CharSequence;
import e17.i;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import lsc.g0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.music_v2.action.ToggleBeatSyncAction;
import urc.f;
import urc.i;
import com.kuaishou.android.model.music.Music;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class EditMusicMainViewBinder$d implements View$OnClickListener	// class@0010f8
{
    public final EditMusicMainViewBinder b;

    public void EditMusicMainViewBinder$d(EditMusicMainViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       EditMusicMainViewBinder f1;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditMusicMainViewBinder$d.class, "1")) {
          return;
       }
       EditMusicMainViewBinder$d tb = this.b;
       EditMusicMainViewBinder f = tb.f;
       String str = "beatSyncCheckbox";
       a.o(f, str);
       boolean b = f.isChecked();
       Objects.requireNonNull(tb);
       EditMusicMainViewBinder uEditMusicMa = EditMusicMainViewBinder.class;
       if (!PatchProxy.isSupport(uEditMusicMa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uEditMusicMa, "10")) {
          e uoe = f0.e(tb.u);
          boolean b1 = false;
          if (!uoe.l()) {
             f1 = tb.f;
             a.o(f1, str);
             f1.setChecked(b1);
             i.d(R.style.arg_RES_7f11066a, uoe.e());
          }else {
             Object[] objArray = new Object[b1];
             a.D().w("EditMusicMainViewBinder", "clicked beatSyncCheckbox, checked="+b, objArray);
             g0 og0 = g0.class;
             Music music = null;
             if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), music, og0, "11")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MUSIC_PANEL_MUSIC_POINT";
                i3 oi3 = i3.f();
                String str1 = (b)? "on": "off";
                oi3.d("status", str1);
                uElementPack.params = oi3.e();
                u1.u(1, uElementPack, music);
             }
             f1 = tb.j;
             i oi = uoe.s().i();
             if (oi != null) {
                music = oi.g();
             }
             f1.t0(new ToggleBeatSyncAction(b, music));
             if (b) {
                i.a(R.style.arg_RES_7f11066a, 0x7f100b4b);
             }else {
                i.a(R.style.arg_RES_7f11066a, 0x7f100b46);
             }
          }
       }
       return;
    }
}
