package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TTSVolumeChangeAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import tnd.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class TTSVolumeViewBinder$a extends TTSVolumeViewBinder$AutoFilterSeekBarChangeListener	// class@000b68
{
    public final TTSVolumeViewBinder e;

    public void TTSVolumeViewBinder$a(TTSVolumeViewBinder p0){
       this.e = p0;
       super();
    }
    public void c(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(TTSVolumeViewBinder$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, TTSVolumeViewBinder$a.class, "1")) {
          return;
       }
       a.p(p0, "seekBar");
       super.c(p0, p1, p2);
       Object[] objArray = new Object[0];
       a.D().s("TTSVolumeViewBinder", "handleProgressChange\(\) called with: seekBar = ["+p0+"], progress = ["+p1+"], isTrackingEnd = ["+p2+']', objArray);
       this.e.e.t0(new TTSVolumeChangeAction(p1));
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, TTSVolumeViewBinder$a.class, "2")) {
          return;
       }
       a.p(p0, "seekBar");
       super.onStopTrackingTouch(p0);
       a = a.a;
       int progress = p0.getProgress();
       Objects.requireNonNull(a);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(progress), a, uoa, "6")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TEXT_TO_VOICE_SLIDE";
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("voice_volume", Integer.valueOf(progress));
          uElementPack.params = jsonObject.toString();
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
