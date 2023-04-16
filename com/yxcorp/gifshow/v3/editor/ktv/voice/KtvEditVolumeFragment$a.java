package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$a;
import axc.y;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import mwc.p;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Karaoke$b;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.KaraokeGeneral$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import xvc.l;

public class KtvEditVolumeFragment$a extends y	// class@000ff5
{
    public final KtvEditVolumeFragment b;

    public void KtvEditVolumeFragment$a(KtvEditVolumeFragment p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(KtvEditVolumeFragment$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, KtvEditVolumeFragment$a.class, "1")) {
          return;
       }
       p0.a = p1;
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvEditVolumeFragment$a.class, "2")) {
          return;
       }
       if (this.b.u.E()) {
          return;
       }
       Karaoke$b uob = this.b.u.k();
       KaraokeGeneral$b uob1 = uob.getGeneral().toBuilder();
       uob1.f(((float)p0.getProgress() / 100.00f));
       uob1.b(DraftUtils.m0(uob1.getAttributes()));
       uob.c(uob1);
       l.a.a();
       return;
    }
}
