package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$d;
import com.yxcorp.gifshow.music.KaraokeDoubleSeekBar$a;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment;
import java.lang.Object;
import com.yxcorp.gifshow.music.KaraokeDoubleSeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.c;
import mwc.p;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Karaoke$b;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.KaraokeGeneral$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import faa.a;
import w46.b;

public class KtvEditVolumeFragment$d implements KaraokeDoubleSeekBar$a	// class@000ff8
{
    public final KtvEditVolumeFragment a;

    public void KtvEditVolumeFragment$d(KtvEditVolumeFragment p0){
       this.a = p0;
       super();
    }
    public void a(KaraokeDoubleSeekBar p0,int p1){
    }
    public void b(KaraokeDoubleSeekBar p0,int p1){
       KtvEditVolumeFragment$d uod = KtvEditVolumeFragment$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       try{
          if (this.a.u.E()) {
             return;
          }else {
             uod = this.a;
             p0.f = p1 + uod.v.mRecordDelay;
             Karaoke$b uob = uod.u.k();
             KaraokeGeneral$b uob1 = uob.getGeneral().toBuilder();
             uob1.d(((double)p.a().g() / 0x408f400000000000));
             uob1.b(DraftUtils.m0(uob1.getAttributes()));
             uob.c(uob1);
             KtvEditVolumeFragment$d ta = this.a;
             ta.y.postDelayed(ta.z, 600);
          }
       }catch(java.lang.Exception e5){
          PostUtils.D("KtvEditVolumeFragment", "ktv OnKaraokeDoubleSeekBarChangeListener ", e5);
          a.D().e("ktv_log", "fail to change offset ", e5);
       }
       return;
    }
    public void c(KaraokeDoubleSeekBar p0,int p1){
       if (PatchProxy.isSupport(KtvEditVolumeFragment$d.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KtvEditVolumeFragment$d.class, "2")) {
          return;
       }
       this.a.ch();
       return;
    }
}
