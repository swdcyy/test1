package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder;
import yld.l;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import amd.c;
import tnd.b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.SeekBar$OnSeekBarChangeListener;
import xld.a;
import xld.c;
import java.util.List;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import wnd.h;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import wnd.g;
import android.widget.SeekBar;

public final class TTSVolumeViewBinder extends a implements l	// class@000b69
{
    public final ImageView c;
    public final KwaiSeekBar d;
    public final c e;
    public final TTSVolumeViewBinder$a f;
    public final Fragment g;
    public final boolean h;

    public void TTSVolumeViewBinder(Fragment p0,View p1,boolean p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       super(p1);
       this.g = p0;
       this.h = p2;
       View view = p1.findViewById(R.id.volume_icon);
       a.o(view, "rootView.findViewById\(R.id.volume_icon\)");
       this.c = view;
       p1 = p1.findViewById(R.id.volume_seek_bar);
       a.o(p1, "rootView.findViewById\(R.id.volume_seek_bar\)");
       this.d = p1;
       this.e = b.c(p0, p2);
       TTSVolumeViewBinder$a uoa = new TTSVolumeViewBinder$a(this);
       this.f = uoa;
       if (PatchProxy.applyVoid(null, this, TTSVolumeViewBinder.class, "1")) {
       }else {
          p1.b(a1.f(R.drawable.arg_RES_7f080840), a1.f(R.drawable.arg_RES_7f080840));
          p1.setOnSeekBarChangeListener(uoa);
       }
       return;
    }
    public void x(a p0,a p1){
       int i1;
       int i2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSVolumeViewBinder.class, "2")) {
       }else {
          a.p(p0, "newState");
          a.p(p1, "lastState");
          NewTextBaseElementData newTextBaseE = h.l(p0.i(), this.e.o0().C());
          boolean i = -1;
          if (newTextBaseE != null) {
             DraftTTSInfo uDraftTTSInf = newTextBaseE.I0();
             if (uDraftTTSInf != null) {
                i1 = uDraftTTSInf.d();
             label_003d :
                if (newTextBaseE != null) {
                   DraftTTSInfo uDraftTTSInf1 = newTextBaseE.I0();
                   if (uDraftTTSInf1 != null) {
                      i = uDraftTTSInf1.c();
                   }
                }
                i = g.a.g(i1, i);
                if (newTextBaseE != null) {
                   DraftTTSInfo uDraftTTSInf2 = newTextBaseE.I0();
                   if (uDraftTTSInf2 != null) {
                      i2 = uDraftTTSInf2.g();
                   label_005e :
                      TTSVolumeViewBinder td = this.d;
                      if (i) {
                         i2 = 0;
                      }
                      td.setProgress(i2);
                      i1 = i ^ 0x01;
                      this.d.setClickable(i1);
                      this.d.setEnabled(i1);
                      TTSVolumeViewBinder td1 = this.d;
                      float f = 0x3f800000;
                      float f1 = (i)? 0x3f000000: 0x3f800000;
                      td1.setAlpha(f1);
                      td1 = this.c;
                      if (i) {
                         f = 0x3f000000;
                      }
                      td1.setAlpha(f);
                   }
                }
                i2 = 200;
                goto label_005e ;
             }
          }
          i1 = -1;
          goto label_003d ;
       }
       return;
    }
}
