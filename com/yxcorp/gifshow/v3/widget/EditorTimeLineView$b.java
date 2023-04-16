package com.yxcorp.gifshow.v3.widget.EditorTimeLineView$b;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$b;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import android.widget.HorizontalScrollView;

public class EditorTimeLineView$b implements ITimelineView$IRangeView$b	// class@00163e
{
    public boolean a;
    public final EditorTimeLineView b;

    public void EditorTimeLineView$b(EditorTimeLineView p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public boolean a(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, EditorTimeLineView$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       EditorTimeLineView$b tb = this.b;
       tb.s = true;
       if (tb.p == null || p1.getBindData() == null) {
          return false;
       }
       tb = p1.getBindData().f();
       EditorTimeLineView p = this.b.p;
       ITimelineView$IRangeView$a bindData = p1.getBindData();
       double d = (tb == ITimelineView$IRangeView$RangeHandler.LEFT)? p1.getBindData().h(): p1.getBindData().g();
       return p.b(tb, bindData, d);
    }
    public boolean b(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView p1,int p2){
       EditorTimeLineView$b obj;
       boolean this;
       EditorTimeLineView p1;
       if (PatchProxy.isSupport(EditorTimeLineView$b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, EditorTimeLineView$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b;
       ITimelineView$IRangeView$RangeHandler lEFT = ITimelineView$IRangeView$RangeHandler.LEFT;
       double d = (p0 == lEFT)? p1.getBindData().h(): p1.getBindData().g();
       d = obj.p(obj.q(d), p2);
       boolean b = true;
       this = false;
       if (p0 == lEFT && d - false < 0) {
          Iterator iterator = this.b.r.iterator();
          while (true) {
             if (iterator.hasNext()) {
                ITimelineView$IRangeView$a iRangeView$a = iterator.next();
                if (iRangeView$a.g() - p1.getBindData().h() >= 0) {
                   EditorTimeLineView p = this.b.p;
                   if (p != null && this.a == null) {
                      p.c(p1.getBindData().f(), p1.getBindData(), d);
                      this.a = b;
                   }
                   return this;
                }else {
                   double d1 = p1.getBindData().h() + d;
                   if (iRangeView$a.g() - d1 > 0) {
                      iRangeView$a.g();
                      p1.getBindData().h();
                   }
                }
             }
          }
       }
       this.a = this;
       EditorTimeLineView$b tb = this.b;
       tb.s = b;
       if (tb.p != null && p1.getBindData() != null) {
          obj = this.b;
          if (obj.m > null) {
             p1 = obj.p;
             lEFT = p1.getBindData().f();
             ITimelineView$IRangeView$a bindData = p1.getBindData();
             EditorTimeLineView$b tb1 = this.b;
             double d2 = (p0 == ITimelineView$IRangeView$RangeHandler.LEFT)? p1.getBindData().h(): p1.getBindData().g();
             return p1.a(lEFT, bindData, tb1.p(tb1.q(d2), p2));
          }
       }
       return this;
    }
    public boolean c(ITimelineView$IRangeView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.p == null || p0.getBindData() == null) {
          return false;
       }
       return this.b.p.h(p0.getBindData());
    }
    public boolean d(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView p1,boolean p2){
       EditorTimeLineView$b obj;
       int i;
       double d2;
       EditorTimeLineView$b uob = this;
       if (PatchProxy.isSupport(EditorTimeLineView$b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, EditorTimeLineView$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = uob.b;
       int b = false;
       obj.s = b;
       if (obj.p == null || p1.getBindData() == null) {
          uob.b.m(b);
          return true;
       }else {
          ITimelineView$IRangeView$RangeHandler iRangeView$R = p1.getBindData().f();
          EditorTimeLineView j = uob.b.j;
          ITimelineView$d o = j.o;
          obj = (o <= 0)? 0xbff0000000000000: j.b / (double)o;
          ITimelineView$IRangeView$RangeHandler lEFT = ITimelineView$IRangeView$RangeHandler.LEFT;
          double d = (iRangeView$R == lEFT)? p1.getBindData().h(): p1.getBindData().g();
          double d1 = 0x3ff0000000000000;
          if ((v5 = obj - d1) >= 0) {
             obj = uob.b;
             o = obj.j.o;
             d = ((d % (double)o) - (double)(o / 2.00f) > 0 && v5 >= 0)? (d / (double)o) + d1: d / (double)o;
             d = (double)((float)(int)d * o);
             if (iRangeView$R == lEFT) {
                i = obj.q(d);
                b = uob.b.q(p1.getBindData().h());
             }else {
                i = obj.q(d);
                b = uob.b.q(p1.getBindData().g());
             }
             i = i - b;
             EditorTimeLineView p = uob.b.p;
             ITimelineView$IRangeView$a bindData = p1.getBindData();
             EditorTimeLineView$b b1 = uob.b;
             d1 = (iRangeView$R == lEFT)? p1.getBindData().h(): p1.getBindData().g();
             p.a(iRangeView$R, bindData, b1.p(b1.q(d1), i));
          }
          return uob.b.p.e(iRangeView$R, p1.getBindData(), d, p2);
       }
    }
    public void e(ITimelineView$IRangeView p0,int p1,boolean p2){
       if (PatchProxy.isSupport(EditorTimeLineView$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, EditorTimeLineView$b.class, "6")) {
          return;
       }
       if (this.b.p == null || (p0 != null && p0.getBindData() != null)) {
          this.b.p.g(p0.getBindData(), p1, p2);
       }
    label_0037 :
       return;
    }
    public boolean f(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView p1,int p2){
       EditorTimeLineView$b obj;
       EditorTimeLineView$b this;
       if (PatchProxy.isSupport(EditorTimeLineView$b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, EditorTimeLineView$b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b;
       obj.s = true;
       if (obj.p != null && (p1 != null && p1.getBindData() != null)) {
          obj = this.b;
          if (obj.m > null) {
             EditorTimeLineView p = obj.p;
             ITimelineView$IRangeView$a bindData = p1.getBindData();
             this = this.b;
             double d = (p0 == ITimelineView$IRangeView$RangeHandler.LEFT)? p1.getBindData().h(): p1.getBindData().g();
             if (p.a(p0, bindData, this.p(this.q(d), p2)) && p1.getBindData().n()) {
                this.b.smoothScrollBy(p2, false);
                return true;
             }
          }
       }
    label_0076 :
       return false;
    }
}
