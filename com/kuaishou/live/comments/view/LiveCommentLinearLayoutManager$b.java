package com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$b;
import androidx.recyclerview.widget.o;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$ScrollSpeed;
import com.yxcorp.utility.n;
import java.lang.Math;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
import lnc.a1;

public class LiveCommentLinearLayoutManager$b extends o	// class@000e49
{
    public final LiveCommentLinearLayoutManager q;

    public void LiveCommentLinearLayoutManager$b(LiveCommentLinearLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public final int D(int p0){
       LiveCommentLinearLayoutManager obj;
       int i;
       int i1;
       LiveCommentLinearLayoutManager$b uob = LiveCommentLinearLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          b.Z(LiveLogTag.COMMENT, "updateComments, calculateTimeForScrollingForNewStrategy, dx == 0");
          return 0;
       }else {
          uob = this.q;
          LiveCommentLinearLayoutManager v = uob.v;
          if (v == LiveCommentLinearLayoutManager$ScrollSpeed.IMMEDIATELY) {
             i = (p0 * 1000) / n.c(uob.r, 1000.00f);
          }else if(v == LiveCommentLinearLayoutManager$ScrollSpeed.SLOW){
             obj = uob.u;
             if (obj == null) {
                i1 = super.x(p0);
             }else {
                i = (p0 * 1000) / obj;
             }
          }else {
             obj = uob.t;
             if (obj == null) {
                i1 = super.x(p0);
             }else {
                i = (p0 * 1000) / obj;
             }
          }
          i = i1;
          i1 = Math.max(i, 10);
          b.e0(LiveLogTag.COMMENT, "updateComments, calculateTimeForScrollingForNewStrategy", "dx", Integer.valueOf(p0), "adjustTime", Integer.valueOf(i1), "time", Integer.valueOf(i));
          return i1;
       }
    }
    public PointF a(int p0){
       LiveCommentLinearLayoutManager$b uob = LiveCommentLinearLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.q.computeScrollVectorForPosition(p0);
    }
    public float v(DisplayMetrics p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommentLinearLayoutManager$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.q.v == LiveCommentLinearLayoutManager$ScrollSpeed.SLOW) {
          return (8.00f / p0.density);
       }
       return super.v(p0);
    }
    public int w(int p0){
       LiveCommentLinearLayoutManager$b uob = LiveCommentLinearLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.q.s != null) {
          return this.D(p0);
       }else {
          return super.w(p0);
       }
    }
    public int x(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveCommentLinearLayoutManager$b uob = LiveCommentLinearLayoutManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (this.q.s != null) {
          return this.D(p0);
       }else if(PatchProxy.isSupport(uob)){
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "3");
          if (obj1 != patchProxyRe) {
             p0 = obj1.intValue();
          }else if(this.q.v == LiveCommentLinearLayoutManager$ScrollSpeed.SLOW){
             p0 = super.x(p0);
          }else if(!p0){
             p0 = 0;
          }else if(p0 == 0x2710){
             p0 = 4000;
          }else {
             float f = (float)n.P(a1.c(), (float)p0) / 26.00f;
             if (f - 0x4059999a < 0) {
                f = 3.40f;
             }else if(f - 0x41200000 > 0){
                f = 10.00f;
             }
             f = (int)(f * 0x41f00000);
          }
       }else {
          goto label_0041 ;
       }
       return p0;
    }
}
