package androidx.constraintlayout.motion.widget.a;
import android.content.Context;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.Object;
import java.util.ArrayList;
import android.util.SparseArray;
import java.util.HashMap;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import java.lang.Integer;
import java.lang.String;
import org.xmlpull.v1.XmlPullParser;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import java.util.Objects;
import android.util.AttributeSet;
import android.util.Xml;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.motion.widget.a$b;
import androidx.constraintlayout.motion.widget.b;
import android.view.MotionEvent;
import android.graphics.RectF;
import androidx.constraintlayout.motion.widget.MotionLayout$f;
import android.view.ViewGroup;
import e1.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import java.util.Iterator;
import e1.j;
import e1.e;
import java.lang.Float;
import j1.d;
import androidx.constraintlayout.motion.widget.a$b$a;
import androidx.constraintlayout.motion.widget.MotionLayout$TransitionState;
import java.util.List;
import java.lang.CharSequence;
import android.content.res.Resources;
import android.view.animation.Interpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import d1.c;
import androidx.constraintlayout.motion.widget.a$a;
import android.view.animation.AnimationUtils;
import e1.p;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public class a	// class@000675
{
    public final MotionLayout a;
    public d b;
    public a$b c;
    public boolean d;
    public ArrayList e;
    public a$b f;
    public ArrayList g;
    public SparseArray h;
    public HashMap i;
    public SparseIntArray j;
    public boolean k;
    public int l;
    public int m;
    public MotionEvent n;
    public boolean o;
    public boolean p;
    public MotionLayout$f q;
    public boolean r;
    public float s;
    public float t;

    public void a(Context p0,MotionLayout p1,int p2){
       super();
       this.b = null;
       this.c = null;
       this.d = false;
       this.e = new ArrayList();
       this.f = null;
       this.g = new ArrayList();
       this.h = new SparseArray();
       this.i = new HashMap();
       this.j = new SparseIntArray();
       this.k = false;
       this.l = 400;
       this.m = 0;
       this.o = false;
       this.p = false;
       this.a = p1;
       this.z(p0, p2);
       this.h.put(R.id.motion_base, new a());
       this.i.put("motion_base", Integer.valueOf(R.id.motion_base));
    }
    public void a(MotionLayout p0){
       super();
       this.b = null;
       this.c = null;
       this.d = false;
       this.e = new ArrayList();
       this.f = null;
       this.g = new ArrayList();
       this.h = new SparseArray();
       this.i = new HashMap();
       this.j = new SparseIntArray();
       this.k = false;
       this.l = 400;
       this.m = 0;
       this.o = false;
       this.p = false;
       this.a = p0;
    }
    public static String P(String p0){
       int i = p0.indexOf(47);
       if (i < 0) {
          return p0;
       }
       return p0.substring((i + 1));
    }
    public int A(String p0){
       return this.i.get(p0).intValue();
    }
    public final void B(Context p0,XmlPullParser p1){
       a uoa = new a();
       boolean b = false;
       uoa.M(b);
       int attributeCou = p1.getAttributeCount();
       int i = -1;
       int i1 = -1;
       while (b < attributeCou) {
          String attributeNam = p1.getAttributeName(b);
          String attributeVal = p1.getAttributeValue(b);
          if (this.k != null) {
             System.out.println("id string = "+attributeVal);
          }
          Objects.requireNonNull(attributeNam);
          if (!attributeNam.equals("deriveConstraintsFrom")) {
             if (attributeNam.equals("id")) {
                i = this.k(p0, attributeVal);
                this.i.put(a.P(attributeVal), Integer.valueOf(i));
             }
          }else {
             i1 = this.k(p0, attributeVal);
          }
          b = b + 1;
       }
       if (i != -1) {
          if (this.a.U0 != null) {
             uoa.R(true);
          }
          uoa.E(p0, p1);
          if (i1 != -1) {
             this.j.put(i, i1);
          }
          this.h.put(i, uoa);
       }
       return;
    }
    public final void C(Context p0,XmlPullParser p1){
       TypedArray typedArray = p0.obtainStyledAttributes(Xml.asAttributeSet(p1), c$b.A3);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          if (!index) {
             this.l = typedArray.getInt(index, this.l);
          }else if(index == 1){
             this.m = typedArray.getInteger(index, 0);
          }
          i = i + 1;
       }
       typedArray.recycle();
       return;
    }
    public void D(float p0,float p1){
       a tc = this.c;
       if (tc != null) {
          a$b l = tc.l;
          if (l != null) {
             l.m(p0, p1);
          }
       }
       return;
    }
    public void E(float p0,float p1){
       a tc = this.c;
       if (tc != null) {
          a$b l = tc.l;
          if (l != null) {
             l.n(p0, p1);
          }
       }
       return;
    }
    public void F(MotionEvent p0,int p1,MotionLayout p2){
       RectF rectF = new RectF();
       if (this.q == null) {
          this.q = this.a.c0();
       }
       this.q.d(p0);
       if (p1 != -1) {
          int action = p0.getAction();
          boolean b = false;
          if (action) {
             if (action == 2 && this.o == null) {
                float f1 = p0.getRawY() - this.t;
                float f2 = p0.getRawX() - this.s;
                if ((double)f2 || (double)f1) {
                   a tn = this.n;
                   if (tn != null) {
                      a$b uob = this.c(p1, f2, f1, tn);
                      if (uob != null) {
                         p2.setTransition(uob);
                         rectF = this.c.l.j(this.a, rectF);
                         if (rectF != null && !rectF.contains(this.n.getX(), this.n.getY())) {
                            b = true;
                         }
                         this.p = b;
                         this.c.l.q(this.s, this.t);
                      }
                   }
                }
                return;
             }
          }else {
             this.s = p0.getRawX();
             this.t = p0.getRawY();
             this.n = p0;
             this.o = b;
             a$b l1 = this.c.l;
             if (l1 != null) {
                RectF rectF1 = l1.e(this.a, rectF);
                if (rectF1 != null && !rectF1.contains(this.n.getX(), this.n.getY())) {
                   this.n = null;
                   this.o = true;
                   return;
                }else {
                   rectF1 = this.c.l.j(this.a, rectF);
                   this.p = (rectF1 != null && !rectF1.contains(this.n.getX(), this.n.getY()))? true: b;
                   this.c.l.o(this.s, this.t);
                }
             }
             return;
          }
       }
       if (this.o != null) {
          return;
       }else {
          a tc = this.c;
          if (tc != null) {
             a$b l = tc.l;
             if (l != null && this.p == null) {
                l.l(p0, this.q, p1, this);
             }
          }
          this.s = p0.getRawX();
          this.t = p0.getRawY();
          if (p0.getAction() == 1) {
             a tq = this.q;
             if (tq != null) {
                tq.recycle();
                this.q = null;
                MotionLayout f = p2.F;
                if (f != -1) {
                   this.b(p2, f);
                }
             }
          }
          return;
       }
    }
    public final void G(int p0){
       int i = this.j.get(p0);
       if (i > 0) {
          this.G(this.j.get(p0));
          a uoa = this.h.get(p0);
          a uoa1 = this.h.get(i);
          if (uoa1 == null) {
             c.b(this.a.getContext(), i);
             return;
          }else {
             uoa.I(uoa1);
             this.j.put(p0, -1);
          }
       }
       return;
    }
    public void H(MotionLayout p0){
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < this.h.size()) {
             int i2 = this.h.keyAt(i1);
             if (this.w(i2)) {
                break ;
             }else {
                this.G(i2);
                i1 = i1 + 1;
             }
          }else {
             for (; i < this.h.size(); i = i + 1) {
                this.h.valueAt(i).H(p0);
             }
             return;
          }
       }
       return;
    }
    public void I(int p0,a p1){
       this.h.put(p0, p1);
    }
    public void J(int p0){
       a tc = this.c;
       if (tc != null) {
          tc.l(p0);
       }else {
          this.l = p0;
       }
       return;
    }
    public void K(View p0,int p1,String p2,Object p3){
       a tc = this.c;
       if (tc == null) {
          return;
       }
       Iterator iterator = tc.k.iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().c(p0.getId()).iterator();
          while (iterator1.hasNext()) {
             if (iterator1.next().a == p1) {
                if (p3 != null) {
                   p3.floatValue();
                }
                p2.equalsIgnoreCase("app:PerpendicularPath_percent");
             }
          }
       }
       return;
    }
    public void L(boolean p0){
       this.r = p0;
       a tc = this.c;
       if (tc != null) {
          a$b l = tc.l;
          if (l != null) {
             l.p(p0);
          }
       }
       return;
    }
    public void M(int p0,int p1){
       int i;
       int i1;
       a$b uob;
       a$b uob1;
       a tb = this.b;
       if (tb != null) {
          i = tb.c(p0, -1, -1);
          if (i == -1) {
             i = p0;
          }
          i1 = this.b.c(p1, -1, -1);
          if (i1 != -1) {
          label_0018 :
             Iterator iterator = this.e.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   uob = iterator.next();
                   a$b c = uob.c;
                   if (c != i1 || (uob.d == i || (c == p1 && uob.d == p0))) {
                      this.c = uob;
                      a$b l = uob.l;
                      if (l != null) {
                         l.p(this.r);
                      }
                      return;
                   }
                }else {
                   a tf = this.f;
                   iterator = this.g.iterator();
                   while (iterator.hasNext()) {
                      uob = iterator.next();
                      if (uob.c == p1) {
                         tf = uob;
                      }else {
                         continue ;
                      }
                   }
                   uob1 = new a$b(this, tf);
                   uob1.d = i;
                   uob1.c = i1;
                   if (i != -1) {
                      this.e.add(uob1);
                   }
                }
             }
             this.c = uob1;
             return;
          }
       }else {
          i = p0;
       }
       i1 = p1;
       goto label_0018 ;
    }
    public void N(a$b p0){
       this.c = p0;
       if (p0 != null) {
          p0 = p0.l;
          if (p0 != null) {
             p0.p(this.r);
          }
       }
       return;
    }
    public void O(){
       a tc = this.c;
       if (tc != null) {
          a$b l = tc.l;
          if (l != null) {
             l.r();
          }
       }
       return;
    }
    public boolean Q(){
       boolean b;
       Iterator iterator = this.e.iterator();
       while (true) {
          b = true;
          if (iterator.hasNext()) {
             if (iterator.next().l != null) {
                return b;
             }
             continue ;
          }else {
             a tc = this.c;
             if (tc == null || tc.l == null) {
                b = false;
                break ;
             }
             break ;
          }
       }
       return b;
    }
    public void a(MotionLayout p0,int p1){
       a$b uob;
       Iterator iterator1;
       Iterator iterator2;
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          uob = iterator.next();
          if (uob.m.size() > 0) {
             iterator1 = uob.m.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().c(p0);
             }
          }
       }
       iterator = this.g.iterator();
       while (iterator.hasNext()) {
          uob = iterator.next();
          if (uob.m.size() > 0) {
             iterator1 = uob.m.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().c(p0);
             }
          }else {
             continue ;
          }
       }
       iterator = this.e.iterator();
       while (iterator.hasNext()) {
          uob = iterator.next();
          if (uob.m.size() > 0) {
             iterator2 = uob.m.iterator();
             while (iterator2.hasNext()) {
                iterator2.next().a(p0, p1, uob);
             }
          }else {
             continue ;
          }
       }
       iterator = this.g.iterator();
       while (iterator.hasNext()) {
          uob = iterator.next();
          if (uob.m.size() > 0) {
             iterator2 = uob.m.iterator();
             while (iterator2.hasNext()) {
                iterator2.next().a(p0, p1, uob);
             }
          }else {
             continue ;
          }
       }
       return;
    }
    public boolean b(MotionLayout p0,int p1){
       MotionLayout$TransitionState fINISHED;
       if (this.y()) {
          return false;
       }
       if (this.d != null) {
          return false;
       }
       Iterator iterator = this.e.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          a$b uob = iterator.next();
          a$b n = uob.n;
          if (n == null || this.c == uob) {
             continue ;
          }else if(p1 == uob.d){
             a$b uob1 = 4;
             if (n == uob1 || n == 2) {
                fINISHED = MotionLayout$TransitionState.FINISHED;
                p0.setState(fINISHED);
                p0.setTransition(uob);
                if (uob.n == uob1) {
                   p0.l0();
                   p0.setState(MotionLayout$TransitionState.SETUP);
                   p0.setState(MotionLayout$TransitionState.MOVING);
                   break ;
                }else {
                   p0.setProgress(0x3f800000);
                   p0.Q(true);
                   p0.setState(MotionLayout$TransitionState.SETUP);
                   p0.setState(MotionLayout$TransitionState.MOVING);
                   p0.setState(fINISHED);
                   p0.d0();
                   break ;
                }
             }
          }
          if (p1 == uob.c) {
             a uoa = 3;
             if (n == uoa || n == true) {
                fINISHED = MotionLayout$TransitionState.FINISHED;
                p0.setState(fINISHED);
                p0.setTransition(uob);
                if (uob.n == uoa) {
                   p0.m0();
                   p0.setState(MotionLayout$TransitionState.SETUP);
                   p0.setState(MotionLayout$TransitionState.MOVING);
                }else {
                   p0.setProgress(0);
                   p0.Q(true);
                   p0.setState(MotionLayout$TransitionState.SETUP);
                   p0.setState(MotionLayout$TransitionState.MOVING);
                   p0.setState(fINISHED);
                   p0.d0();
                }
                return true;
             }
          }
       }
       return true;
    }
    public a$b c(int p0,float p1,float p2,MotionEvent p3){
       if (p0 == -1) {
          return this.c;
       }
       int i = 0;
       a$b uob = null;
       RectF rectF = new RectF();
       Iterator iterator = this.v(p0).iterator();
       while (iterator.hasNext()) {
          a$b uob1 = iterator.next();
          if (uob1.o != null) {
             continue ;
          }else {
             a$b l = uob1.l;
             if (l != null) {
                l.p(this.r);
                RectF rectF1 = uob1.l.j(this.a, rectF);
                if (rectF1 != null && (p3 != null && !rectF1.contains(p3.getX(), p3.getY()))) {
                   continue ;
                }else {
                   rectF1 = uob1.l.j(this.a, rectF);
                   if (rectF1 != null && (p3 != null && !rectF1.contains(p3.getX(), p3.getY()))) {
                      continue ;
                   }else {
                      float f = uob1.l.a(p1, p2);
                      float f1 = (uob1.c == p0)? 0xbf800000: 0x3f8ccccd;
                      f = f * f1;
                      if (f - i > 0) {
                         uob = uob1;
                         i = f;
                      }
                   }
                }
             }
          }
       }
       return uob;
    }
    public int d(){
       a tc = this.c;
       a$b p = (tc != null)? tc.p: -1;
       return p;
    }
    public a e(int p0){
       return this.f(p0, -1, -1);
    }
    public a f(int p0,int p1,int p2){
       if (this.k != null) {
          System.out.println("id "+p0);
          System.out.println("size "+this.h.size());
       }
       a tb = this.b;
       if (tb != null) {
          p1 = tb.c(p0, p1, p2);
          if (p1 != -1) {
             p0 = p1;
          }
       }
       if (this.h.get(p0) == null) {
          c.b(this.a.getContext(), p0);
          a th = this.h;
          return th.get(th.keyAt(0));
       }else {
          return this.h.get(p0);
       }
    }
    public int[] g(){
       int i = this.h.size();
       int[] ointArray = new int[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ointArray[i1] = this.h.keyAt(i1);
       }
       return ointArray;
    }
    public ArrayList h(){
       return this.e;
    }
    public int i(){
       a tc = this.c;
       if (tc != null) {
          return tc.h;
       }
       return this.l;
    }
    public int j(){
       a tc = this.c;
       if (tc == null) {
          return -1;
       }
       return tc.c;
    }
    public final int k(Context p0,String p1){
       int identifier;
       if (p1.contains("/")) {
          identifier = p0.getResources().getIdentifier(p1.substring((p1.indexOf(47) + 1)), "id", p0.getPackageName());
          if (this.k != null) {
             System.out.println("id getMap res = "+identifier);
          }
       }else {
          identifier = -1;
       }
       if (identifier == -1 && p1.length() > 1) {
          identifier = Integer.parseInt(p1.substring(1));
       }
       return identifier;
    }
    public Interpolator l(){
       a tc = this.c;
       a$b e = tc.e;
       if (e == -2) {
          return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
       }
       if (e == -1) {
          return new a$a(this, c.c(tc.f));
       }
       if (e == null) {
          return new AccelerateDecelerateInterpolator();
       }
       if (e == 1) {
          return new AccelerateInterpolator();
       }
       if (e == 2) {
          return new DecelerateInterpolator();
       }
       if (e == 4) {
          return new AnticipateInterpolator();
       }
       if (e != 5) {
          return null;
       }
       return new BounceInterpolator();
    }
    public void m(p p0){
       Iterator iterator;
       a tc = this.c;
       if (tc == null) {
          tc = this.f;
          if (tc != null) {
             iterator = tc.k.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p0);
             }
          }
          return;
       }else {
          iterator = tc.k.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
          return;
       }
    }
    public float n(){
       a tc = this.c;
       if (tc != null) {
          a$b l = tc.l;
          if (l != null) {
             return l.f();
          }
       }
       return 0;
    }
    public float o(){
       a tc = this.c;
       if (tc != null) {
          a$b l = tc.l;
          if (l != null) {
             return l.g();
          }
       }
       return 0;
    }
    public boolean p(){
       a tc = this.c;
       if (tc != null) {
          a$b l = tc.l;
          if (l != null) {
             return l.h();
          }
       }
       return false;
    }
    public float q(float p0,float p1){
       a tc = this.c;
       if (tc != null) {
          a$b l = tc.l;
          if (l != null) {
             return l.i(p0, p1);
          }
       }
       return 0;
    }
    public final int r(int p0){
       a tb = this.b;
       if (tb != null) {
          int i = tb.c(p0, -1, -1);
          if (i != -1) {
             return i;
          }
       }
       return p0;
    }
    public float s(){
       a tc = this.c;
       if (tc != null) {
          return tc.i;
       }
       return 0;
    }
    public int t(){
       a tc = this.c;
       if (tc == null) {
          return -1;
       }
       return tc.d;
    }
    public a$b u(int p0){
       a$b uob;
       Iterator iterator = this.e.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uob = iterator.next();
          if (uob.a == p0) {
             break ;
          }
       }
       return uob;
    }
    public List v(int p0){
       p0 = this.r(p0);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          a$b uob = iterator.next();
          if (uob.d == p0 || uob.c == p0) {
             uArrayList.add(uob);
          }
       }
       return uArrayList;
    }
    public final boolean w(int p0){
       int i = this.j.get(p0);
       int i1 = this.j.size();
       while (true) {
          if (i <= 0) {
             return false;
          }
          if (i == p0) {
             break ;
          }else {
             int i2 = i1 - 1;
             if (i1 < 0) {
                return true;
             }
             i = this.j.get(i);
             i1 = i2;
          }
       }
       return true;
    }
    public boolean x(View p0,int p1){
       a tc = this.c;
       if (tc == null) {
          return false;
       }
       Iterator iterator = tc.k.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Iterator iterator1 = iterator.next().c(p0.getId()).iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (iterator1.next().a == p1) {
                      return true;
                   }
                }else {
                   continue ;
                }
             }
             return false;
          }else {
             goto label_0036 ;
          }
       }
    }
    public final boolean y(){
       boolean b = (this.q != null)? true: false;
       return b;
    }
    public final void z(Context p0,int p1){
       a$b l;
       XmlResourceParser xml = p0.getResources().getXml(p1);
       try{
          int i = 0;
          int eventType = xml.getEventType();
          String str = 1;
          while (eventType != str) {
             if (eventType) {
                if (eventType == 2) {
                   String name = xml.getName();
                   if (this.k != null) {
                      System.out.println("parsing = "+name);
                   }
                   StringBuilder str1 = -1;
                   switch (name.hashCode()){
                       case 0xaf89b525:
                         if (name.equals("ConstraintSet")) {
                            str = 5;
                         }else {
                         label_0083 :
                            str = -1;
                         }
                         break;
                       case 0xb6206314:
                         if (name.equals("KeyFrameSet")) {
                            str = 6;
                         }else {
                            goto label_0083 ;
                         }
                         break;
                       case 0x100d4975:
                         if (!name.equals("Transition")) {
                         }
                         break;
                       case 0x12a432c9:
                         if (name.equals("OnClick")) {
                            str = 3;
                         }else {
                            goto label_0083 ;
                         }
                         break;
                       case 0x138aac7b:
                         if (name.equals("OnSwipe")) {
                            str = 2;
                         }else {
                            goto label_0083 ;
                         }
                         break;
                       case 0x2f487256:
                         if (name.equals("MotionScene")) {
                            str = 0;
                         }else {
                            goto label_0083 ;
                         }
                         break;
                       case 0x526c4e31:
                         if (name.equals("StateSet")) {
                            str = 4;
                         }else {
                            goto label_0083 ;
                         }
                         break;
                       default:
                         goto label_0083 ;
                   }
                   switch (str){
                       case 0:
                         this.C(p0, xml);
                         break;
                       case 1:
                         a$b uob = new a$b(this, p0, xml);
                         this.e.add(uob);
                         if (this.c == null && uob.b == null) {
                            this.c = uob;
                            l = uob.l;
                            if (l != null) {
                               l.p(this.r);
                            }
                         }
                         if (uob.b != null) {
                            if (uob.c == str1) {
                               this.f = uob;
                            }else {
                               this.g.add(uob);
                            }
                            this.e.remove(uob);
                         }
                         l = uob;
                         break;
                       case 2:
                         if (i == null) {
                            p0.getResources().getResourceEntryName(p1);
                            xml.getLineNumber();
                         }
                         i.l = new b(p0, this.a, xml);
                         break;
                       case 3:
                         i.a(p0, xml);
                         break;
                       case 4:
                         this.b = new d(p0, xml);
                         break;
                       case 5:
                         this.B(p0, xml);
                         break;
                       case 6:
                         i.k.add(new j(p0, xml));
                         break;
                       default:
                   }
                }
             }else {
                xml.getName();
             }
             eventType = xml.next();
          }
       }catch(org.xmlpull.v1.XmlPullParserException e9){
          e9.printStackTrace();
       }catch(java.io.IOException e9){
          e9.printStackTrace();
       }
       return;
    }
}
