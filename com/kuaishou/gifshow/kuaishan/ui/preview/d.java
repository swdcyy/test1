package com.kuaishou.gifshow.kuaishan.ui.preview.d;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import u80.e;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.gifshow.kuaishan.ui.preview.f;
import q87.c;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.System;
import r90.a0;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$a;

public final class d implements IMediaPlayer$OnInfoListener	// class@001aed
{
    public final c$b b;

    public void d(c$b p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       Object[] objArray;
       d tb = this.b;
       Objects.requireNonNull(tb);
       String str = "KSPreviewAdapter";
       if (p1 == 701) {
          objArray = new Object[0];
          e.D().w(str, "onInfo: start buffer "+tb.b, objArray);
          if (tb.k != null) {
             c$b y = tb.y;
             if (y != null) {
                y.setVisibility(0);
                tb.y.h();
             }
          }
       }else if(p1 == 702){
          objArray = new Object[0];
          e.D().w(str, "onInfo: end buffer "+tb.b, objArray);
          tb.B();
       }else if(p1 == 3){
          if (tb.X0 - null > 0) {
             Object[] objArray1 = new Object[0];
             e.D().w("KSPreviewPlayer", "First video frame rendered in "+(System.currentTimeMillis() - tb.X0), objArray1);
          }
          tb.Y0 = true;
       }else if(p1 == 0x2777){
          k1.o(new a0(tb, p2));
       }else if(p1 == 0x2775){
          c$b n = tb.N;
          if (n != null) {
             n.Vd();
          }
       }
       return 0;
    }
}
