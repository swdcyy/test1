package com.kuaishou.live.core.voiceparty.clipmusic.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kuaishou.live.core.voiceparty.d0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i2b.a;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyOrderedMusic;
import com.kuaishou.android.model.music.Music;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import java.lang.Number;
import java.util.List;
import com.yxcorp.gifshow.model.Lyrics$Line;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import o07.n;
import java.io.File;
import xt2.l;
import qkd.b;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import qkd.c;
import kqb.g0;
import java.io.IOException;
import z12.e;
import ekd.m1;
import no2.b;
import android.view.View$OnClickListener;
import no2.a;

public class b extends c implements PopupInterface$f, d	// class@001386
{
    public LiveVoicePartyLyricClipView p;
    public TextView q;
    public LiveVoicePartyOrderedMusic r;
    public b$a s;
    public static final int t;

    static {
       b.t = a1.e(564.00f);
    }
    public void b(c$b p0){
       super(p0);
       p0.P(false);
       p0.z(true);
       p0.A(true);
       p0.L(this);
       p0.x(false);
       p0.H(a1.e(564.00f));
       p0.F(d0.f());
       p0.N(d0.g());
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       boolean b;
       int i;
       int i1;
       b uob = b.class;
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d0e66, p2, b);
       this.doBindView(view);
       this.q.setText(this.r.music.mName);
       b tp = this.p;
       LiveVoicePartyOrderedMusic music = this.r.music;
       Lyrics lyrics = this.b0();
       Music mDuration = this.r.music.mDuration;
       Objects.requireNonNull(tp);
       if (!PatchProxy.isSupport(LiveVoicePartyLyricClipView.class) || !PatchProxy.applyVoidThreeRefs(music, lyrics, Integer.valueOf(mDuration), tp, LiveVoicePartyLyricClipView.class, "6")) {
          tp.p = mDuration;
          tp.f = music;
          tp.e = lyrics;
          tp.g = lyrics.mLines;
          tp.b.h(lyrics, mDuration);
       }
       tp = this.p;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uob, "5");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = 0;
          while (true) {
             if (i < this.b0().mLines.size()) {
                if ((long)this.b0().mLines.get(i).mStart - this.r.startTimeOffset) {
                   i = i + 1;
                }
             }else {
                i = 0;
             }
          }
       }
       objArray = PatchProxy.apply(objArray, this, uob, "6");
       if (objArray != PatchProxyResult.class) {
          i1 = objArray.intValue();
       }else {
          while (true) {
             if (b < this.b0().mLines.size()) {
                i1 = this.b0().mLines.get(b).mStart + this.b0().mLines.get(b).mDuration;
                long l = (long)i1;
                if (!l - this.r.endTimeOffset) {
                   i1 = b;
                   break ;
                }else {
                   b++;
                }
             }else if(4 < this.b0().mLines.size()){
                i1 = 3;
                break ;
             }else {
                i1 = this.b0().mLines.size() - 1;
                break ;
             }
          }
       }
       tp.n = i;
       tp.o = i1;
       FrameLayout$LayoutParams layoutParams = view.getLayoutParams();
       layoutParams.height = b.t;
       layoutParams.gravity = 80;
       view.setLayoutParams(layoutParams);
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public final Lyrics b0(){
       Lyrics lyrics;
       File obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(l.h(this.r.music));
       if (!b.S(obj)) {
          return new Lyrics();
       }
       try{
          lyrics = new g0().b(c.k(new InputStreamReader(new BufferedInputStream(new FileInputStream(obj)), "UTF-8")));
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          String[] stringArray = new String[0];
          e.c("LiveVoicePartyMusicClipPopup", "read lyrics file error", stringArray);
       }
       if (lyrics == null) {
          lyrics = new Lyrics();
       }
       return lyrics;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a29d5);
       this.q = m1.f(p0, 0x7f0a077e);
       m1.a(p0, new b(this), R.id.clip_done);
       m1.a(p0, new a(this), R.id.clip_abort);
       return;
    }
}
