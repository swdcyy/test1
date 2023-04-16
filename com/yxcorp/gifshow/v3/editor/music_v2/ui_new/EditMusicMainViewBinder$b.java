package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$b;
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
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MuteVoiceAction;
import urc.k;
import xvc.b;
import urc.j;
import e17.i;
import lsc.g0;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class EditMusicMainViewBinder$b implements View$OnClickListener	// class@0010f5
{
    public final EditMusicMainViewBinder b;

    public void EditMusicMainViewBinder$b(EditMusicMainViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditMusicMainViewBinder$b.class, "1")) {
          return;
       }
       EditMusicMainViewBinder$b tb = this.b;
       EditMusicMainViewBinder e = tb.e;
       a.o(e, "voiceCheckbox");
       int i = e.isChecked() ^ 0x01;
       Objects.requireNonNull(tb);
       EditMusicMainViewBinder uEditMusicMa = EditMusicMainViewBinder.class;
       if (!PatchProxy.isSupport(uEditMusicMa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), tb, uEditMusicMa, "8")) {
          e uoe = tb.j.o0();
          tb.j.t0(new MuteVoiceAction(i, uoe.v().d()));
          int b = uoe.u().d();
          int i1 = 0x7f11066a;
          if (i) {
             b = (b)? 0x7f100b36: 0x7f100b34;
             i.a(i1, b);
          }else if(b){
             b = 0x7f100b3c;
          }else {
             b = 0x7f100b3b;
          }
          i.a(i1, b);
          b = i ^ 0x01;
          g0 og0 = g0.class;
          if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, og0, "18")) {
             JsonObject jsonObject = new JsonObject();
             jsonObject.H("is_check", Boolean.valueOf(b));
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLOSE_ORIGINAL_MUSIC";
             uElementPack.params = jsonObject.toString();
             u1.u(6, uElementPack, null);
          }
       }
       return;
    }
}
