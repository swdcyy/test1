package com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider$highlightTimeRepo$2$a;
import hqc.i;
import com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider$highlightTimeRepo$2;
import java.lang.Object;
import hqc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.graphics.Bitmap;
import java.lang.Boolean;
import brd.t;
import com.yxcorp.gifshow.v3.editor.effectv2.network.a;
import erd.o;
import t45.d;
import brd.z;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import rwc.j;

public final class HighlightTimeDataProvider$highlightTimeRepo$2$a implements i	// class@000f52
{
    public final HighlightTimeDataProvider$highlightTimeRepo$2 a;

    public void HighlightTimeDataProvider$highlightTimeRepo$2$a(HighlightTimeDataProvider$highlightTimeRepo$2 p0){
       this.a = p0;
       super();
    }
    public Object get(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, HighlightTimeDataProvider$highlightTimeRepo$2$a.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "i");
          VideoSDKPlayerView videoSDKPlay = this.a.this$0.i().j();
          a.m(videoSDKPlay);
          Bitmap uBitmap = videoSDKPlay.dumpNextOriginalFrame();
          if (uBitmap == null) {
             uBitmap = t.just(Boolean.TRUE).map(new a(this, p0)).subscribeOn(d.a).blockingFirst();
             Object[] objArray = new Object[0];
             a.D().w("HighlightTimeDataProvider", "currentVideoFrameSupplier origin frame is null dumpNextOriginalFrame:"+uBitmap, objArray);
          }
          pair = new Pair(new j(uBitmap), "");
       }
       return pair;
    }
}
