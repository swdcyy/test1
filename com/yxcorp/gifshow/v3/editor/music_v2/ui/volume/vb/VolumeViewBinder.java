package com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder;
import vrc.d;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ekd.m1;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.widget.TextView;
import qrc.r;
import lsc.f0;
import msc.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.SeekBar;
import android.graphics.drawable.Drawable;
import lnc.a1;
import dsc.a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import urc.k;
import dsc.b;
import urc.j;

public final class VolumeViewBinder extends a implements d	// class@0010f3
{
    public final String c;
    public KwaiSeekBar d;
    public KwaiSeekBar e;
    public TextView f;
    public TextView g;
    public final r h;
    public final q i;
    public final Fragment j;

    public void VolumeViewBinder(Fragment p0,View p1){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       super(p1);
       this.j = p0;
       this.c = "VolumeViewBinder";
       p1 = m1.f(this.A(), R.id.voice_seek_bar);
       a.o(p1, "ViewBindUtils.bindWidget¡­iew, R.id.voice_seek_bar\)");
       this.d = p1;
       p1 = m1.f(this.A(), R.id.music_seek_bar);
       a.o(p1, "ViewBindUtils.bindWidget¡­iew, R.id.music_seek_bar\)");
       this.e = p1;
       p1 = m1.f(this.A(), R.id.voice_seek_bar_left_text);
       a.o(p1, "ViewBindUtils.bindWidget¡­voice_seek_bar_left_text\)");
       this.f = p1;
       p1 = m1.f(this.A(), R.id.music_seek_bar_left_text);
       a.o(p1, "ViewBindUtils.bindWidget¡­music_seek_bar_left_text\)");
       this.g = p1;
       r or = f0.l(p0);
       this.h = or;
       q oq = f0.i(p0);
       this.i = oq;
       if (PatchProxy.applyVoid(null, this, VolumeViewBinder.class, "1")) {
       }else {
          VolumeViewBinder td = this.d;
          td.setMax(200);
          td.b(a1.f(R.drawable.arg_RES_7f080861), a1.f(R.drawable.arg_RES_7f080861));
          td.setOnSeekBarChangeListener(new a(this));
          if (!or.e()) {
             boolean b = false;
             td.setEnabled(b);
             td.setProgress(b);
          }else {
             td.setProgress(oq.o0().v().b());
          }
          VolumeViewBinder te = this.e;
          te.setMax(200);
          te.b(a1.f(R.drawable.arg_RES_7f080861), a1.f(R.drawable.arg_RES_7f080861));
          te.setOnSeekBarChangeListener(new b(this));
       }
       return;
    }
    public void Mb(e p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VolumeViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       boolean b = (p0.v().h() && this.h.e())? true: false;
       this.f.setEnabled(b);
       VolumeViewBinder te = this.e;
       te.setEnabled(p0.v().e());
       float f = 0x3f800000;
       float f1 = (p0.v().e())? 0x3f800000: 0x3f000000;
       te.setAlpha(f1);
       if (te.getProgress() != p0.v().f()) {
          te.setProgress(p0.v().f());
       }
       this.g.setEnabled(p0.v().e());
       if (p0.u().d()) {
          this.f.setText(R.string.arg_RES_7f103759);
       }else {
          this.f.setText(R.string.arg_RES_7f100b39);
       }
       te = this.d;
       te.setEnabled(b);
       if (!b) {
          f = 0x3f000000;
       }
       te.setAlpha(f);
       if (te.isEnabled()) {
          if (te.getProgress() != p0.v().i()) {
             te.setProgress(p0.v().i());
          }
       }else {
          te.setProgress(p0.v().b());
       }
       if (p0.u().f()) {
          this.f.setText(R.string.arg_RES_7f103759);
       }else {
          this.f.setText(R.string.arg_RES_7f100b39);
       }
       return;
    }
}
