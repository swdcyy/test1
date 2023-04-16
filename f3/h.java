package f3.h;
import f3.g;
import android.graphics.PorterDuff$Mode;
import android.graphics.Matrix;
import android.graphics.Rect;
import f3.h$h;
import android.graphics.PorterDuffColorFilter;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import o1.f;
import f3.h$i;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.String;
import androidx.core.graphics.drawable.a;
import android.graphics.Canvas;
import java.lang.Math;
import android.graphics.ColorFilter;
import java.lang.Object;
import f3.h$g;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayDeque;
import f3.h$d;
import f3.h$c;
import java.util.ArrayList;
import f3.h$f;
import f3.h$b;
import f3.a;
import android.content.res.TypedArray;
import o1.g;
import java.lang.StringBuilder;
import java.lang.Runnable;

public class h extends g	// class@001fce
{
    public h$h c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean g;
    public Drawable$ConstantState h;
    public final float[] i;
    public final Matrix j;
    public final Rect k;
    public static final PorterDuff$Mode l;

    static {
       h.l = PorterDuff$Mode.SRC_IN;
    }
    public void h(){
       super();
       this.g = true;
       float[] uofloatArray = new float[9];
       this.i = uofloatArray;
       this.j = new Matrix();
       this.k = new Rect();
       this.c = new h$h();
    }
    public void h(h$h p0){
       super();
       this.g = true;
       float[] uofloatArray = new float[9];
       this.i = uofloatArray;
       this.j = new Matrix();
       this.k = new Rect();
       this.c = p0;
       this.d = this.m(this.d, p0.c, p0.d);
    }
    public static int a(int p0,float p1){
       return ((p0 & 0xffffff) | ((int)((float)Color.alpha(p0) * p1) << 24));
    }
    public static h e(Resources p0,int p1,Resources$Theme p2){
       int i;
       if (Build$VERSION.SDK_INT >= 24) {
          h oh = new h();
          oh.b = f.c(p0, p1, p2);
          oh.h = new h$i(oh.b.getConstantState());
          return oh;
       }else {
          try{
             XmlResourceParser xml = p0.getXml(p1);
             AttributeSet uAttributeSe = Xml.asAttributeSet(xml);
             do {
                i = xml.next();
             } while (i != 2 && i != 1);
             if (i == 2) {
                return h.f(p0, xml, uAttributeSe, p2);
             }
             throw new XmlPullParserException("No start tag found");
          }catch(org.xmlpull.v1.XmlPullParserException e0){
             return null;
          }catch(java.io.IOException e0){
          }
       }
    }
    public static h f(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       h oh = new h();
       oh.inflate(p0, p1, p2, p3);
       return oh;
    }
    public static PorterDuff$Mode j(int p0,PorterDuff$Mode p1){
       if (p0 == 3) {
          return PorterDuff$Mode.SRC_OVER;
       }
       if (p0 == 5) {
          return PorterDuff$Mode.SRC_IN;
       }
       if (p0 == 9) {
          return PorterDuff$Mode.SRC_ATOP;
       }
       switch (p0){
           case 14:
             return PorterDuff$Mode.MULTIPLY;
           case 15:
             return PorterDuff$Mode.SCREEN;
           case 16:
             return PorterDuff$Mode.ADD;
           default:
             return p1;
       }
    }
    public boolean canApplyTheme(){
       g tb = this.b;
       if (tb != null) {
          a.b(tb);
       }
       return false;
    }
    public void draw(Canvas p0){
       g tb = this.b;
       if (tb != null) {
          tb.draw(p0);
          return;
       }else {
          this.copyBounds(this.k);
          if (this.k.width() > 0 && this.k.height() > 0) {
             h te = this.e;
             if (te == null) {
                te = this.d;
             }
             p0.getMatrix(this.j);
             this.j.getValues(this.i);
             int i = 0;
             float f = Math.abs(this.i[i]);
             float f1 = Math.abs(this.i[4]);
             float f2 = Math.abs(this.i[3]);
             if (Math.abs(this.i[1]) || f2) {
                f = 0x3f800000;
                f1 = 0x3f800000;
             }
             int i1 = 2048;
             int i2 = Math.min(i1, (int)((float)this.k.width() * f));
             int i3 = Math.min(i1, (int)((float)this.k.height() * f1));
             if (i2 > 0 && i3 > 0) {
                i1 = p0.save();
                h tk = this.k;
                p0.translate((float)tk.left, (float)tk.top);
                if (this.i()) {
                   p0.translate((float)this.k.width(), 0);
                   p0.scale(0xbf800000, 0x3f800000);
                }
                this.k.offsetTo(i, i);
                this.c.c(i2, i3);
                if (this.g == null) {
                   this.c.j(i2, i3);
                }else if(!this.c.b()){
                   this.c.j(i2, i3);
                   this.c.i();
                }
                this.c.d(p0, te, this.k);
                p0.restoreToCount(i1);
             }
          }
       label_00db :
          return;
       }
    }
    public Object g(String p0){
       return this.c.b.p.get(p0);
    }
    public int getAlpha(){
       g tb = this.b;
       if (tb != null) {
          return a.d(tb);
       }
       return this.c.b.getRootAlpha();
    }
    public int getChangingConfigurations(){
       g tb = this.b;
       if (tb != null) {
          return tb.getChangingConfigurations();
       }
       return (super.getChangingConfigurations() | this.c.getChangingConfigurations());
    }
    public ColorFilter getColorFilter(){
       g tb = this.b;
       if (tb != null) {
          return a.e(tb);
       }
       return this.e;
    }
    public Drawable$ConstantState getConstantState(){
       if (this.b != null && Build$VERSION.SDK_INT >= 24) {
          return new h$i(this.b.getConstantState());
       }
       this.c.a = this.getChangingConfigurations();
       return this.c;
    }
    public int getIntrinsicHeight(){
       g tb = this.b;
       if (tb != null) {
          return tb.getIntrinsicHeight();
       }
       return (int)this.c.b.j;
    }
    public int getIntrinsicWidth(){
       g tb = this.b;
       if (tb != null) {
          return tb.getIntrinsicWidth();
       }
       return (int)this.c.b.i;
    }
    public int getOpacity(){
       g tb = this.b;
       if (tb != null) {
          return tb.getOpacity();
       }
       return -3;
    }
    public final void h(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       h tc = this.c;
       h$h b = tc.b;
       ArrayDeque uArrayDeque = new ArrayDeque();
       uArrayDeque.push(b.h);
       int eventType = p1.getEventType();
       int i = p1.getDepth() + 1;
       h$d uod = 1;
       while (true) {
          if (eventType != 1) {
             String str = 3;
             if (p1.getDepth() >= i || eventType != str) {
                if (eventType == 2) {
                   String name = p1.getName();
                   h$d uod1 = uArrayDeque.peek();
                   if (("path").equals(name)) {
                      h$c uoc = new h$c();
                      uoc.g(p0, p2, p3, p1);
                      uod1.b.add(uoc);
                      if (uoc.getPathName() != null) {
                         b.p.put(uoc.getPathName(), uoc);
                      }
                      uod = null;
                      eventType = uoc.d | tc.a;
                      tc.a = eventType;
                   }else if(("clip-path").equals(name)){
                      h$b uob = new h$b();
                      uob.e(p0, p2, p3, p1);
                      uod1.b.add(uob);
                      if (uob.getPathName() != null) {
                         b.p.put(uob.getPathName(), uob);
                      }
                      eventType = uob.d | tc.a;
                      tc.a = eventType;
                   }else if("group".equals(name)){
                      h$d uod2 = new h$d();
                      uod2.c(p0, p2, p3, p1);
                      uod1.b.add(uod2);
                      uArrayDeque.push(uod2);
                      if (uod2.getGroupName() != null) {
                         b.p.put(uod2.getGroupName(), uod2);
                      }
                      eventType = uod2.k | tc.a;
                      tc.a = eventType;
                   }
                }else if(eventType == str && "group".equals(p1.getName())){
                   uArrayDeque.pop();
                }
                eventType = p1.next();
             }else if(uod == null){
                return;
             }else {
                break ;
             }
          }else {
             goto label_00ce ;
          }
       }
       throw new XmlPullParserException("no path defined");
    }
    public final boolean i(){
       boolean b = true;
       if (!this.isAutoMirrored() || a.f(this) != b) {
          b = false;
       }
       return b;
    }
    public void inflate(Resources p0,XmlPullParser p1,AttributeSet p2){
       g tb = this.b;
       if (tb != null) {
          tb.inflate(p0, p1, p2);
          return;
       }else {
          this.inflate(p0, p1, p2, null);
          return;
       }
    }
    public void inflate(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       g tb = this.b;
       if (tb != null) {
          a.g(tb, p0, p1, p2, p3);
          return;
       }else {
          h tc = this.c;
          tc.b = new h$g();
          TypedArray typedArray = g.k(p0, p3, p2, a.a);
          this.l(typedArray, p1, p3);
          typedArray.recycle();
          tc.a = this.getChangingConfigurations();
          tc.l = true;
          this.h(p0, p1, p2, p3);
          this.d = this.m(this.d, tc.c, tc.d);
          return;
       }
    }
    public void invalidateSelf(){
       g tb = this.b;
       if (tb != null) {
          tb.invalidateSelf();
          return;
       }else {
          super.invalidateSelf();
          return;
       }
    }
    public boolean isAutoMirrored(){
       g tb = this.b;
       if (tb != null) {
          return a.h(tb);
       }
       return this.c.e;
    }
    public boolean isStateful(){
       g tb = this.b;
       if (tb != null) {
          return tb.isStateful();
       }
       if (!super.isStateful()) {
          h tc = this.c;
          if (tc != null) {
             if (!tc.g()) {
                h$h c = this.c.c;
                if (c == null || !c.isStateful()) {
                }
             }
          }else {
          }
       }
    label_0028 :
       boolean b = true;
    label_0029 :
       return b;
    }
    public void k(boolean p0){
       this.g = p0;
    }
    public final void l(TypedArray p0,XmlPullParser p1,Resources$Theme p2){
       h tc = this.c;
       h$h b = tc.b;
       tc.d = h.j(g.g(p0, p1, "tintMode", 6, -1), PorterDuff$Mode.SRC_IN);
       ColorStateList uColorStateL = g.c(p0, p1, p2, "tint", 1);
       if (uColorStateL != null) {
          tc.c = uColorStateL;
       }
       tc.e = g.a(p0, p1, "autoMirrored", 5, tc.e);
       b.k = g.f(p0, p1, "viewportWidth", 7, b.k);
       float f = g.f(p0, p1, "viewportHeight", 8, b.l);
       b.l = f;
       String str = null;
       if (b.k - str > 0) {
          if (f - str > 0) {
             b.i = p0.getDimension(3, b.i);
             f = p0.getDimension(2, b.j);
             b.j = f;
             if (b.i - str > 0) {
                if (f - str > 0) {
                   b.setAlpha(g.f(p0, p1, "alpha", 4, b.getAlpha()));
                   String str1 = p0.getString(0);
                   if (str1 != null) {
                      b.n = str1;
                      b.p.put(str1, b);
                   }
                   return;
                }else {
                   throw new XmlPullParserException(p0.getPositionDescription()+"<vector> tag requires height > 0");
                }
             }else {
                throw new XmlPullParserException(p0.getPositionDescription()+"<vector> tag requires width > 0");
             }
          }else {
             throw new XmlPullParserException(p0.getPositionDescription()+"<vector> tag requires viewportHeight > 0");
          }
       }else {
          throw new XmlPullParserException(p0.getPositionDescription()+"<vector> tag requires viewportWidth > 0");
       }
    }
    public PorterDuffColorFilter m(PorterDuffColorFilter p0,ColorStateList p1,PorterDuff$Mode p2){
       if (p1 == null || p2 == null) {
          return null;
       }
       return new PorterDuffColorFilter(p1.getColorForState(this.getState(), 0), p2);
    }
    public Drawable mutate(){
       g tb = this.b;
       if (tb != null) {
          tb.mutate();
          return this;
       }else if(this.f == null && super.mutate() == this){
          this.c = new h$h(this.c);
          this.f = true;
       }
       return this;
    }
    public void onBoundsChange(Rect p0){
       g tb = this.b;
       if (tb != null) {
          tb.setBounds(p0);
       }
       return;
    }
    public boolean onStateChange(int[] p0){
       g tb = this.b;
       if (tb != null) {
          return tb.setState(p0);
       }
       h oh = null;
       h tc = this.c;
       h$h c = tc.c;
       boolean b = true;
       if (c != null) {
          h$h d = tc.d;
          if (d != null) {
             this.d = this.m(this.d, c, d);
             this.invalidateSelf();
             oh = 1;
          }
       }
       if (tc.g() && tc.h(p0)) {
          this.invalidateSelf();
       }else {
          b = oh;
       }
       return b;
    }
    public void scheduleSelf(Runnable p0,long p1){
       g tb = this.b;
       if (tb != null) {
          tb.scheduleSelf(p0, p1);
          return;
       }else {
          super.scheduleSelf(p0, p1);
          return;
       }
    }
    public void setAlpha(int p0){
       g tb = this.b;
       if (tb != null) {
          tb.setAlpha(p0);
          return;
       }else if(this.c.b.getRootAlpha() != p0){
          this.c.b.setRootAlpha(p0);
          this.invalidateSelf();
       }
       return;
    }
    public void setAutoMirrored(boolean p0){
       g tb = this.b;
       if (tb != null) {
          a.j(tb, p0);
          return;
       }else {
          this.c.e = p0;
          return;
       }
    }
    public void setColorFilter(ColorFilter p0){
       g tb = this.b;
       if (tb != null) {
          tb.setColorFilter(p0);
          return;
       }else {
          this.e = p0;
          this.invalidateSelf();
          return;
       }
    }
    public void setTint(int p0){
       g tb = this.b;
       if (tb != null) {
          a.n(tb, p0);
          return;
       }else {
          this.setTintList(ColorStateList.valueOf(p0));
          return;
       }
    }
    public void setTintList(ColorStateList p0){
       g tb = this.b;
       if (tb != null) {
          a.o(tb, p0);
          return;
       }else {
          h tc = this.c;
          if (tc.c != p0) {
             tc.c = p0;
             this.d = this.m(this.d, p0, tc.d);
             this.invalidateSelf();
          }
          return;
       }
    }
    public void setTintMode(PorterDuff$Mode p0){
       g tb = this.b;
       if (tb != null) {
          a.p(tb, p0);
          return;
       }else {
          h tc = this.c;
          if (tc.d != p0) {
             tc.d = p0;
             this.d = this.m(this.d, tc.c, p0);
             this.invalidateSelf();
          }
          return;
       }
    }
    public boolean setVisible(boolean p0,boolean p1){
       g tb = this.b;
       if (tb != null) {
          return tb.setVisible(p0, p1);
       }
       return super.setVisible(p0, p1);
    }
    public void unscheduleSelf(Runnable p0){
       g tb = this.b;
       if (tb != null) {
          tb.unscheduleSelf(p0);
          return;
       }else {
          super.unscheduleSelf(p0);
          return;
       }
    }
}
