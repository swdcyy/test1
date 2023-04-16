package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$CursorHandle;
import android.view.View;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Paint;
import android.widget.PopupWindow;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.text.Layout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Canvas;
import android.view.MotionEvent;
import java.lang.Boolean;
import ted.a;
import java.lang.CharSequence;

public class SearchScrollSelectTextView$CursorHandle extends View	// class@0007e2
{
    public PopupWindow b;
    public Paint c;
    public TextView d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int[] n;
    public final SearchScrollSelectTextView o;

    public void SearchScrollSelectTextView$CursorHandle(SearchScrollSelectTextView p0,boolean p1,TextView p2){
       this.o = p0;
       super(p0.c);
       int i = p0.t / 2;
       this.e = i;
       i = i * 2;
       this.f = i;
       this.g = i;
       this.h = 25;
       int[] ointArray = new int[2];
       this.n = ointArray;
       this.d = p2;
       this.i = p1;
       Paint paint = new Paint(1);
       this.c = paint;
       paint.setColor(p0.s);
       PopupWindow popupWindow = new PopupWindow(this);
       this.b = popupWindow;
       popupWindow.setClippingEnabled(false);
       this.b.setWidth((this.f + (this.h * 2)));
       this.b.setHeight((this.g + (this.h * 2)));
       p0.e();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView$CursorHandle.class, "3")) {
          return;
       }
       this.i = this.i ^ 0x01;
       this.o.e();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView$CursorHandle.class, "4")) {
          return;
       }
       this.b.dismiss();
       return;
    }
    public void c(int p0,int p1){
       if (PatchProxy.isSupport(SearchScrollSelectTextView$CursorHandle.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchScrollSelectTextView$CursorHandle.class, "7")) {
          return;
       }
       this.d.getLocationInWindow(this.n);
       SearchScrollSelectTextView$CursorHandle tf = (this.i != null)? this.f: 0;
       p1 = p1 + this.getExtraY();
       SearchScrollSelectTextView$CursorHandle tn = this.n;
       int i = 1;
       if (p1 < tn[i]) {
          p1 = tn[i];
       }else if(p1 > (tn[i] + this.d.getHeight())){
          p1 = this.n[i] + this.d.getHeight();
       }
       this.b.showAtLocation(this.d, 0, ((p0 - tf) + this.getExtraX()), p1);
       return;
    }
    public final void d(){
       int i1;
       SearchScrollSelectTextView$CursorHandle tn;
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView$CursorHandle.class, "6")) {
          return;
       }
       this.d.getLocationInWindow(this.n);
       Layout layout = this.d.getLayout();
       int i = 1;
       if (this.i != null) {
          i1 = layout.getLineTop(layout.getLineForOffset(this.o.u)) + this.getExtraY();
          tn = this.n;
          if (i1 < tn[i]) {
             i1 = tn[i];
          }else if(i1 > (tn[i] + this.d.getHeight())){
             i1 = this.n[i] + this.d.getHeight();
          }
          this.b.update((((int)layout.getPrimaryHorizontal(this.o.u) - this.f) + this.getExtraX()), i1, -1, -1);
       }else {
          i1 = layout.getLineTop(layout.getLineForOffset(this.o.v)) + this.getExtraY();
          tn = this.n;
          if (i1 < tn[i]) {
             i1 = tn[i];
          }else if(i1 > (tn[i] + this.d.getHeight())){
             i1 = this.n[i] + this.d.getHeight();
          }
          this.b.update(((int)layout.getPrimaryHorizontal(this.o.v) + this.getExtraX()), i1, -1, -1);
       }
       return;
    }
    public int getExtraX(){
       Object obj = PatchProxy.apply(null, this, SearchScrollSelectTextView$CursorHandle.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.n[0] - this.h) + this.d.getPaddingLeft());
    }
    public int getExtraY(){
       Object obj = PatchProxy.apply(null, this, SearchScrollSelectTextView$CursorHandle.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.n[1] + this.d.getPaddingTop()) - this.o.m);
    }
    public void onDraw(Canvas p0){
       SearchScrollSelectTextView$CursorHandle te;
       SearchScrollSelectTextView$CursorHandle th1;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchScrollSelectTextView$CursorHandle.class, "1")) {
          return;
       }
       if (this.i != null) {
          te = this.e;
          SearchScrollSelectTextView$CursorHandle th = this.h;
          p0.drawRect((float)(((te * 2) + th) - 5), 0, (float)((te * 2) + th), 50.00f, this.c);
          te = this.e;
          p0.drawCircle((float)(this.h + te), (float)(te + 50), (float)te, this.c);
          te = this.e;
          th1 = this.h;
          p0.drawRect((float)(te + th1), 50.00f, (float)((te * 2) + th1), (float)(te + 50), this.c);
       }else {
          te = this.h;
          float f = (float)te;
          p0.drawRect(f, 0, (float)(te + 5), 50.00f, this.c);
          te = this.e;
          p0.drawCircle((float)(this.h + te), (float)(te + 50), (float)te, this.c);
          te = this.h;
          f = (float)te;
          th1 = this.e;
          p0.drawRect(f, 50.00f, (float)(te + th1), (float)(th1 + 50), this.c);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       SearchScrollSelectTextView$CursorHandle tm;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchScrollSelectTextView$CursorHandle.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_016f :
                   this.o.j();
                }
             }else {
                this.o.G.dismiss();
                action = ((int)p0.getRawX() + this.j) - this.f;
                int i = (((int)p0.getRawY() + this.k) - this.g) + this.o.m;
                if (!PatchProxy.isSupport(SearchScrollSelectTextView$CursorHandle.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(action), Integer.valueOf(i), this, SearchScrollSelectTextView$CursorHandle.class, "5")) {
                   this.d.getLocationInWindow(this.n);
                   SearchScrollSelectTextView u = (this.i != null)? this.o.u: this.o.v;
                   i = i - this.n[1];
                   SearchScrollSelectTextView$CursorHandle td = this.d;
                   if (PatchProxy.isSupport(a.class)) {
                      Object obj1 = PatchProxy.applyFourRefs(td, Integer.valueOf(action), Integer.valueOf(i), Integer.valueOf(u), null, a.class, "2");
                      if (obj1 != patchProxyRe) {
                         i = obj1.intValue();
                      }else {
                      label_00a6 :
                         Layout layout = td.getLayout();
                         if (layout == null) {
                            i = -1;
                         }else {
                            int lineForVerti = layout.getLineForVertical(i);
                            if (a.a(layout, u)) {
                               i1 = u - 1;
                               int i2 = (int)layout.getLineRight(lineForVerti);
                               if (action > (i2 - ((i2 - (int)layout.getPrimaryHorizontal(i1)) / 2))) {
                               label_00cc :
                                  i1 = layout.getLineForOffset(i1);
                                  int lineTop = layout.getLineTop(i1);
                                  i2 = layout.getLineBottom(i1);
                                  int i3 = (i2 - lineTop) / 2;
                                  if (lineForVerti != (i1 + 1) || ((i - i2) < i3 || (lineForVerti == (i1 - 1) && (lineTop - i) < i3))) {
                                     lineForVerti = i1;
                                  }
                                  i = layout.getOffsetForHorizontal(lineForVerti, (float)action);
                                  if (i < (td.getText().length() - 1)) {
                                     i1 = i + 1;
                                     if (a.a(layout, i1)) {
                                        int i4 = (int)layout.getLineRight(lineForVerti);
                                        if (action > (i4 - ((i4 - (int)layout.getPrimaryHorizontal(i)) / 2))) {
                                           i = i1;
                                        }
                                     }
                                  }
                               }
                            }
                            i1 = u;
                            goto label_00cc ;
                         }
                      }
                   }else {
                      goto label_00a6 ;
                   }
                   if (i != u) {
                      this.o.f();
                      if (this.i != null) {
                         if (i > this.m) {
                            this.a();
                            this.o.D.a();
                            tm = this.m;
                            this.l = tm;
                            this.o.h(tm, i);
                            this.o.D.d();
                         }else {
                            this.o.h(i, -1);
                         }
                         this.d();
                      }else {
                         tm = this.l;
                         if (i < tm) {
                            this.o.C.a();
                            this.a();
                            tm = this.l;
                            this.m = tm;
                            this.o.h(i, tm);
                            this.o.C.d();
                         }else {
                            this.o.h(tm, i);
                         }
                         this.d();
                      }
                   }
                }
             }
          }else {
             goto label_016f ;
          }
       }else {
          tm = this.o;
          this.l = tm.u;
          this.m = tm.v;
          this.j = (int)p0.getX();
          this.k = (int)p0.getY();
       }
    label_018d :
       return true;
    }
}
