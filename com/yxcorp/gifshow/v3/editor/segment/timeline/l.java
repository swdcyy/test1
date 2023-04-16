package com.yxcorp.gifshow.v3.editor.segment.timeline.l;
import com.yxcorp.gifshow.v3.editor.segment.timeline.k$b;
import com.yxcorp.gifshow.v3.editor.segment.timeline.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import ooc.g1;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import ftc.h;
import etc.g0;
import java.lang.CharSequence;
import e17.i;

public class l implements k$b	// class@0011f2
{
    public final k a;

    public void l(k p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1,int p2,int p3){
       l a;
       l ol = this;
       int i = p0;
       int i1 = p1;
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, l.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("SegmentTimelinePresenter", "range selected: start: "+i+", end: "+i1+", startIndex: "+p2+", endIndex: "+p3, objArray);
       int i2 = i1 - i;
       a = ol.a;
       k c = a.C;
       double d = ((double)i * 0x3ff0000000000000) / 0x408f400000000000;
       if (c - d && a.D - (((double)i1 * 0x3ff0000000000000) / 0x408f400000000000)) {
          g1.s("whole");
       }else if(c - d){
          g1.s("left");
       }else if(a.D - (((double)i1 * 0x3ff0000000000000) / 0x408f400000000000)){
          g1.s("right");
          a = this;
          c = a.a.F;
          if (i2 >= (c * 1000)) {
             i2 = i1 - (c * 1000);
          label_00b4 :
             l a1 = a.a;
             a1.C = d;
             double d1 = ((double)i1 * 0x3ff0000000000000) / 0x408f400000000000;
             a1.D = d1;
             a1.W8((d1 - d));
             a.a.E.seekTo((((double)i2 * 0x3ff0000000000000) / 0x408f400000000000));
             a.a.E.play();
             return;
          }else {
          label_00b3 :
             i2 = i;
             goto label_00b4 ;
          }
       }
       a = this;
       goto label_00b3 ;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, g0.c((long)h.m));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f1004ad);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("SegmentTimelinePresenter", "onSliderPressed", objArray);
       this.a.B = true;
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("SegmentTimelinePresenter", "onSliderPressedEnd", objArray);
       l ta = this.a;
       ta.B = false;
       if (!ta.E.isPlaying()) {
          this.a.E.play();
       }
       return;
    }
}
