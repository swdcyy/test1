package com.yxcorp.gifshow.v3.mixed.timeline.i$a;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller$b;
import com.yxcorp.gifshow.v3.mixed.timeline.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import com.yxcorp.gifshow.v3.mixed.timeline.MixVideoView;
import android.widget.FrameLayout;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import com.yxcorp.gifshow.v3.mixed.model.b;
import com.yxcorp.gifshow.v3.mixed.model.MixStatus;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Number;
import gwc.o;
import android.view.View;
import java.lang.Runnable;
import hwc.b;
import android.graphics.Canvas;
import tyc.i0;

public class i$a implements CustomHorizontalScroller$b	// class@00156b
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       double d;
       int i;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, i.class, "10")) {
          i p = ta.p;
          Objects.requireNonNull(p);
          if (!PatchProxy.applyVoid(objArray, p, MixTimeline.class, "14")) {
             MixTimeline mixTimeline = PatchProxy.apply(objArray, p, MixTimeline.class, "15");
             if (mixTimeline != patchProxyRe) {
             }else {
                d = p.getCursorPositionInTimeline();
                MixTimeline e = p.e;
                if (e != null && ((double)e.getLeft() - d <= 0 && (double)p.e.getRight() - d >= 0)) {
                   mixTimeline = p.e;
                }else {
                   double d3 = 0;
                   String str = -1;
                   i = 0;
                   int i1 = -1;
                   while (true) {
                      if (i < p.i.size()) {
                         MixVideoView mixVideoView = p.i.get(i);
                         if ((double)mixVideoView.getLeft() - d <= 0 && (double)mixVideoView.getRight() - d >= 0) {
                            mixTimeline = mixVideoView;
                         }else if(d - (double)mixVideoView.getRight() > 0){
                            i1 = i;
                         }
                         i = i + 1;
                      }else if(i1 < (p.i.size() + str)){
                         mixTimeline = p.i.get((i1 + 1));
                      }else if(i1 == (p.i.size() + str)){
                         MixTimeline i2 = p.i;
                         mixTimeline = i2.get((i2.size() + str));
                      }else {
                         mixTimeline = p.i.get(d3);
                      }
                   }
                }
             }
             Objects.requireNonNull(mixTimeline);
             if (!PatchProxy.applyVoid(objArray, mixTimeline, MixVideoView.class, "9")) {
                mixTimeline.c.D0(mixTimeline.f.mIndex);
             }
          }
          if (ta.G.F0() == MixStatus.EDITING) {
             d = ta.I.xToTime(ta.p.getCursorPositionInTimeline());
             double d1 = 0;
             if (EditorSdk2UtilsV2.getComputedFps(ta.r.getVideoProject()) - d1 > 0) {
                p = ta.G;
                Objects.requireNonNull(p);
                Object obj = PatchProxy.apply(objArray, p, b.class, "37");
                if (obj != patchProxyRe) {
                   d1 = obj.doubleValue();
                }else if(p.y0()){
                   MixVideoTrack mixVideoTrac = p.s0();
                   Objects.requireNonNull(mixVideoTrac);
                   d1 = mixVideoTrac.mBaseOffsetIgnoreSpeed + p.s0().getDurationIgnoreSpeed();
                }
                double d2 = d1 - (0x3ff0000000000000 / EditorSdk2UtilsV2.getComputedFps(ta.r.getVideoProject()));
                if (d - d2 > 0 && d - d1 <= 0) {
                   d = d2;
                }
             }
          label_015c :
             ta.r.seekTo(d);
             ta.S8();
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "2")) {
          return;
       }
       b.a(this.a.p, new o(this));
       return;
    }
    public void c(Canvas p0){
       i0.b(this, p0);
    }
}
