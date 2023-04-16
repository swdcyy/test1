package androidx.constraintlayout.widget.a;
import android.util.SparseIntArray;
import java.lang.Object;
import java.util.HashMap;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.a$a;
import androidx.constraintlayout.widget.a$d;
import androidx.constraintlayout.widget.a$b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import android.util.AttributeSet;
import android.util.Xml;
import java.lang.Integer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import androidx.constraintlayout.widget.a$c;
import androidx.constraintlayout.widget.a$e;
import android.util.TypedValue;
import d1.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.Barrier;
import java.util.Set;
import java.util.Iterator;
import java.lang.IllegalArgumentException;
import e1.c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import android.util.SparseArray;
import h1.b;
import java.util.HashSet;
import java.util.Collection;
import java.lang.Float;
import androidx.constraintlayout.widget.Guideline;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import j1.c;
import java.lang.reflect.Field;
import java.lang.Class;
import android.view.ViewParent;
import java.util.Arrays;
import ll8.c$b;

public class a	// class@0006c3
{
    public boolean a;
    public HashMap b;
    public boolean c;
    public HashMap d;
    public static final int[] e;
    public static SparseIntArray f;

    static {
       a.e = new int[3]{0,4,8};
       SparseIntArray sparseIntArr = new SparseIntArray();
       a.f = sparseIntArr;
       sparseIntArr.append(77, 25);
       a.f.append(78, 26);
       a.f.append(80, 29);
       a.f.append(81, 30);
       a.f.append(87, 36);
       a.f.append(86, 35);
       a.f.append(59, 4);
       a.f.append(58, 3);
       a.f.append(56, 1);
       a.f.append(95, 6);
       a.f.append(96, 7);
       a.f.append(66, 17);
       a.f.append(67, 18);
       a.f.append(68, 19);
       a.f.append(0, 27);
       a.f.append(82, 32);
       a.f.append(83, 33);
       a.f.append(65, 10);
       a.f.append(64, 9);
       a.f.append(99, 13);
       a.f.append(102, 16);
       a.f.append(100, 14);
       a.f.append(97, 11);
       a.f.append(101, 15);
       a.f.append(98, 12);
       a.f.append(90, 40);
       a.f.append(75, 39);
       a.f.append(74, 41);
       a.f.append(89, 42);
       a.f.append(73, 20);
       a.f.append(88, 37);
       a.f.append(63, 5);
       a.f.append(76, 82);
       a.f.append(85, 82);
       a.f.append(79, 82);
       a.f.append(57, 82);
       a.f.append(55, 82);
       a.f.append(5, 24);
       a.f.append(7, 28);
       a.f.append(23, 31);
       a.f.append(24, 8);
       a.f.append(6, 34);
       a.f.append(8, 2);
       a.f.append(3, 23);
       a.f.append(4, 21);
       a.f.append(2, 22);
       a.f.append(13, 43);
       a.f.append(26, 44);
       a.f.append(21, 45);
       a.f.append(22, 46);
       a.f.append(20, 60);
       a.f.append(18, 47);
       a.f.append(19, 48);
       a.f.append(14, 49);
       a.f.append(15, 50);
       a.f.append(16, 51);
       a.f.append(17, 52);
       a.f.append(25, 53);
       a.f.append(91, 54);
       a.f.append(69, 55);
       a.f.append(92, 56);
       a.f.append(70, 57);
       a.f.append(93, 58);
       a.f.append(71, 59);
       a.f.append(60, 61);
       a.f.append(62, 62);
       a.f.append(61, 63);
       a.f.append(27, 64);
       a.f.append(107, 65);
       a.f.append(34, 66);
       a.f.append(108, 67);
       a.f.append(104, 79);
       a.f.append(1, 38);
       a.f.append(103, 68);
       a.f.append(94, 69);
       a.f.append(72, 70);
       a.f.append(31, 71);
       a.f.append(29, 72);
       a.f.append(30, 73);
       a.f.append(32, 74);
       a.f.append(28, 75);
       a.f.append(105, 76);
       a.f.append(84, 77);
       a.f.append(109, 78);
       a.f.append(54, 80);
       a.f.append(53, 81);
    }
    public void a(){
       super();
       this.b = new HashMap();
       this.c = true;
       this.d = new HashMap();
    }
    public static int F(TypedArray p0,int p1,int p2){
       p2 = p0.getResourceId(p1, p2);
       if (p2 == -1) {
          p2 = p0.getInt(p1, -1);
       }
       return p2;
    }
    public int A(int p0){
       return this.v(p0).b.b;
    }
    public int B(int p0){
       return this.v(p0).b.c;
    }
    public int C(int p0){
       return this.v(p0).d.c;
    }
    public void D(Context p0,int p1){
       XmlResourceParser xml = p0.getResources().getXml(p1);
       try{
          int eventType = xml.getEventType();
          boolean b = true;
          while (eventType != b) {
             if (eventType) {
                if (eventType == 2) {
                   a$a uoa = this.u(p0, Xml.asAttributeSet(xml));
                   if ((xml.getName()).equalsIgnoreCase("Guideline")) {
                      uoa.d.a = b;
                   }
                   this.d.put(Integer.valueOf(uoa.a), uoa);
                }
             }else {
                xml.getName();
             }
             eventType = xml.next();
          }
       }catch(org.xmlpull.v1.XmlPullParserException e5){
          e5.printStackTrace();
       }catch(java.io.IOException e5){
          e5.printStackTrace();
       }
       return;
    }
    public void E(Context p0,XmlPullParser p1){
       String name;
       a$a uoa1;
       try{
          int eventType = p1.getEventType();
          StringBuilder str = null;
          a$a uoa = str;
          String str1 = 1;
          while (eventType != str1) {
             try{
                if (eventType) {
                   String str2 = "Constraint";
                   int i = 3;
                   if (eventType != 2) {
                      if (eventType == i) {
                         name = p1.getName();
                         if (("ConstraintSet").equals(name)) {
                            return;
                         }else if(name.equalsIgnoreCase(str2)){
                            this.d.put(Integer.valueOf(uoa.a), uoa);
                            uoa = str;
                         }
                      }
                   }else {
                      name = p1.getName();
                      switch (name.hashCode()){
                          case 0x873fe74a:
                            if (name.equals("Layout")) {
                               i = 5;
                            }else {
                            label_008f :
                               i = -1;
                            }
                            break;
                          case 0x89b7abd6:
                            if (name.equals("Motion")) {
                               i = 6;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          case 0xb454c22d:
                            if (!name.equals("PropertySet")) {
                            }
                            break;
                          case 0xb6308b4c:
                            if (name.equals("Transform")) {
                               i = 4;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          case 0xfbb92cd0:
                            if (name.equals("Guideline")) {
                               i = 1;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          case 0x4f5d3b97:
                            if (name.equals("Barrier")) {
                               i = 2;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          case 0x6acd460b:
                            if (name.equals("CustomAttribute")) {
                               i = 7;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          case 0x6b78f1fd:
                            if (name.equals(str2)) {
                               i = 0;
                            }else {
                               goto label_008f ;
                            }
                            break;
                          default:
                            goto label_008f ;
                      }
                      name = "XML parser error must be within a Constraint ";
                      switch (i){
                          case 0:
                            uoa1 = this.u(p0, Xml.asAttributeSet(p1));
                         label_0173 :
                            uoa = uoa1;
                            break;
                          case 1:
                            uoa1 = this.u(p0, Xml.asAttributeSet(p1));
                            uoa = uoa1.d;
                            uoa.a = str1;
                            uoa.b = str1;
                            goto label_0173 ;
                            break;
                          case 2:
                            uoa1 = this.u(p0, Xml.asAttributeSet(p1));
                            uoa1.d.d0 = str1;
                            goto label_0173 ;
                            break;
                          case 3:
                            if (uoa != null) {
                               uoa.b.b(p0, Xml.asAttributeSet(p1));
                            }else {
                               throw new RuntimeException(name+p1.getLineNumber());
                            }
                            break;
                          case 4:
                            if (uoa != null) {
                               uoa.e.b(p0, Xml.asAttributeSet(p1));
                            }else {
                               throw new RuntimeException(name+p1.getLineNumber());
                            }
                            break;
                          case 5:
                            if (uoa != null) {
                               uoa.d.b(p0, Xml.asAttributeSet(p1));
                            }else {
                               throw new RuntimeException(name+p1.getLineNumber());
                            }
                            break;
                          case 6:
                            if (uoa != null) {
                               uoa.c.b(p0, Xml.asAttributeSet(p1));
                            }else {
                               throw new RuntimeException(name+p1.getLineNumber());
                            }
                            break;
                          case 7:
                            if (uoa != null) {
                               ConstraintAttribute.g(p0, p1, uoa.f);
                            }else {
                               throw new RuntimeException(name+p1.getLineNumber());
                            }
                            break;
                          default:
                      }
                   }
                }else {
                   p1.getName();
                }
                eventType = p1.next();
             }catch(java.io.IOException e9){
                e9.printStackTrace();
             }
          }
       }catch(org.xmlpull.v1.XmlPullParserException e9){
          e9.printStackTrace();
       }catch(java.io.IOException e9){
       }
       return;
    }
    public final void G(Context p0,a$a p1,TypedArray p2){
       a$a d;
       int indexCount = p2.getIndexCount();
       int i = 0;
       while (i < indexCount) {
          int index = p2.getIndex(i);
          boolean b = true;
          if (index != b && (23 != index && 24 != index)) {
             p1.c.a = b;
             p1.d.b = b;
             p1.b.a = b;
             p1.e.a = b;
          }
          switch (a.f.get(index)){
              case 1:
                d = p1.d;
                d.p = a.F(p2, index, d.p);
                break;
              case 2:
                d = p1.d;
                d.G = p2.getDimensionPixelSize(index, d.G);
                break;
              case 3:
                d = p1.d;
                d.o = a.F(p2, index, d.o);
                break;
              case 4:
                d = p1.d;
                d.n = a.F(p2, index, d.n);
                break;
              case 5:
                p1.d.w = p2.getString(index);
                break;
              case 6:
                d = p1.d;
                d.A = p2.getDimensionPixelOffset(index, d.A);
                break;
              case 7:
                d = p1.d;
                d.B = p2.getDimensionPixelOffset(index, d.B);
                break;
              case 8:
                d = p1.d;
                d.H = p2.getDimensionPixelSize(index, d.H);
                break;
              case 9:
                d = p1.d;
                d.t = a.F(p2, index, d.t);
                break;
              case 10:
                d = p1.d;
                d.s = a.F(p2, index, d.s);
                break;
              case 11:
                d = p1.d;
                d.M = p2.getDimensionPixelSize(index, d.M);
                break;
              case 12:
                d = p1.d;
                d.N = p2.getDimensionPixelSize(index, d.N);
                break;
              case 13:
                d = p1.d;
                d.J = p2.getDimensionPixelSize(index, d.J);
                break;
              case 14:
                d = p1.d;
                d.L = p2.getDimensionPixelSize(index, d.L);
                break;
              case 15:
                d = p1.d;
                d.O = p2.getDimensionPixelSize(index, d.O);
                break;
              case 16:
                d = p1.d;
                d.K = p2.getDimensionPixelSize(index, d.K);
                break;
              case 17:
                d = p1.d;
                d.e = p2.getDimensionPixelOffset(index, d.e);
                break;
              case 18:
                d = p1.d;
                d.f = p2.getDimensionPixelOffset(index, d.f);
                break;
              case 19:
                d = p1.d;
                d.g = p2.getFloat(index, d.g);
                break;
              case 20:
                d = p1.d;
                d.u = p2.getFloat(index, d.u);
                break;
              case 21:
                d = p1.d;
                d.d = p2.getLayoutDimension(index, d.d);
                break;
              case 22:
                d = p1.b;
                d.b = p2.getInt(index, d.b);
                a$a b1 = p1.b;
                b1.b = a.e[b1.b];
                break;
              case 23:
                d = p1.d;
                d.c = p2.getLayoutDimension(index, d.c);
                break;
              case 24:
                d = p1.d;
                d.D = p2.getDimensionPixelSize(index, d.D);
                break;
              case 25:
                d = p1.d;
                d.h = a.F(p2, index, d.h);
                break;
              case 26:
                d = p1.d;
                d.i = a.F(p2, index, d.i);
                break;
              case 27:
                d = p1.d;
                d.C = p2.getInt(index, d.C);
                break;
              case 28:
                d = p1.d;
                d.E = p2.getDimensionPixelSize(index, d.E);
                break;
              case 29:
                d = p1.d;
                d.j = a.F(p2, index, d.j);
                break;
              case 30:
                d = p1.d;
                d.k = a.F(p2, index, d.k);
                break;
              case 31:
                d = p1.d;
                d.I = p2.getDimensionPixelSize(index, d.I);
                break;
              case 32:
                d = p1.d;
                d.q = a.F(p2, index, d.q);
                break;
              case '!':
                d = p1.d;
                d.r = a.F(p2, index, d.r);
                break;
              case '"':
                d = p1.d;
                d.F = p2.getDimensionPixelSize(index, d.F);
                break;
              case '#':
                d = p1.d;
                d.m = a.F(p2, index, d.m);
                break;
              case '$':
                d = p1.d;
                d.l = a.F(p2, index, d.l);
                break;
              case '%':
                d = p1.d;
                d.v = p2.getFloat(index, d.v);
                break;
              case '&':
                p1.a = p2.getResourceId(index, p1.a);
                break;
              case 39:
                d = p1.d;
                d.Q = p2.getFloat(index, d.Q);
                break;
              case '(':
                d = p1.d;
                d.P = p2.getFloat(index, d.P);
                break;
              case ')':
                d = p1.d;
                d.R = p2.getInt(index, d.R);
                break;
              case '*':
                d = p1.d;
                d.S = p2.getInt(index, d.S);
                break;
              case '+':
                d = p1.b;
                d.d = p2.getFloat(index, d.d);
                break;
              case ',':
                a$a e = p1.e;
                e.l = b;
                e.m = p2.getDimension(index, e.m);
                break;
              case '-':
                d = p1.e;
                d.c = p2.getFloat(index, d.c);
                break;
              case '.':
                d = p1.e;
                d.d = p2.getFloat(index, d.d);
                break;
              case '/':
                d = p1.e;
                d.e = p2.getFloat(index, d.e);
                break;
              case '0':
                d = p1.e;
                d.f = p2.getFloat(index, d.f);
                break;
              case '1':
                d = p1.e;
                d.g = p2.getDimension(index, d.g);
                break;
              case '2':
                d = p1.e;
                d.h = p2.getDimension(index, d.h);
                break;
              case '3':
                d = p1.e;
                d.i = p2.getDimension(index, d.i);
                break;
              case '4':
                d = p1.e;
                d.j = p2.getDimension(index, d.j);
                break;
              case '5':
                d = p1.e;
                d.k = p2.getDimension(index, d.k);
                break;
              case '6':
                d = p1.d;
                d.T = p2.getInt(index, d.T);
                break;
              case '7':
                d = p1.d;
                d.U = p2.getInt(index, d.U);
                break;
              case '8':
                d = p1.d;
                d.V = p2.getDimensionPixelSize(index, d.V);
                break;
              case '9':
                d = p1.d;
                d.W = p2.getDimensionPixelSize(index, d.W);
                break;
              case ':':
                d = p1.d;
                d.X = p2.getDimensionPixelSize(index, d.X);
                break;
              case ';':
                d = p1.d;
                d.Y = p2.getDimensionPixelSize(index, d.Y);
                break;
              case '<':
                d = p1.e;
                d.b = p2.getFloat(index, d.b);
                break;
              case '=':
                d = p1.d;
                d.x = a.F(p2, index, d.x);
                break;
              case '>':
                d = p1.d;
                d.y = p2.getDimensionPixelSize(index, d.y);
                break;
              case '?':
                d = p1.d;
                d.z = p2.getFloat(index, d.z);
                break;
              case '@':
                d = p1.c;
                d.b = a.F(p2, index, d.b);
                break;
              case 'A':
                if (p2.peekValue(index).type == 3) {
                   p1.c.c = p2.getString(index);
                }else {
                   p1.c.c = c.c[p2.getInteger(index, 0)];
                }
                break;
              case 'B':
                p1.c.e = p2.getInt(index, 0);
                break;
              case 'C':
                d = p1.c;
                d.g = p2.getFloat(index, d.g);
                break;
              case 'D':
                d = p1.b;
                d.e = p2.getFloat(index, d.e);
                break;
              case 'E':
                p1.d.Z = p2.getFloat(index, 0x3f800000);
                break;
              case 'F':
                p1.d.a0 = p2.getFloat(index, 0x3f800000);
                break;
              case 'G':
                break;
              case 'H':
                d = p1.d;
                d.b0 = p2.getInt(index, d.b0);
                break;
              case 'I':
                d = p1.d;
                d.c0 = p2.getDimensionPixelSize(index, d.c0);
                break;
              case 'J':
                p1.d.f0 = p2.getString(index);
                break;
              case 'K':
                d = p1.d;
                d.j0 = p2.getBoolean(index, d.j0);
                break;
              case 'L':
                d = p1.c;
                d.d = p2.getInt(index, d.d);
                break;
              case 'M':
                p1.d.g0 = p2.getString(index);
                break;
              case 'N':
                d = p1.b;
                d.c = p2.getInt(index, d.c);
                break;
              case 'O':
                d = p1.c;
                d.f = p2.getFloat(index, d.f);
                break;
              case 'P':
                d = p1.d;
                d.h0 = p2.getBoolean(index, d.h0);
                break;
              case 'Q':
                d = p1.d;
                d.i0 = p2.getBoolean(index, d.i0);
                break;
              case 'R':
                Integer.toHexString(index);
                a.f.get(index);
                break;
              default:
                Integer.toHexString(index);
                a.f.get(index);
          }
          i = i + 1;
       }
       return;
    }
    public void H(ConstraintLayout p0){
       int childCount = p0.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return;
          }
          View childAt = p0.getChildAt(i);
          ConstraintLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int id = childAt.getId();
          if (this.c == null || id != -1) {
             if (!this.d.containsKey(Integer.valueOf(id))) {
                this.d.put(Integer.valueOf(id), new a$a());
             }
             a$a uoa = this.d.get(Integer.valueOf(id));
             boolean b = true;
             if (uoa.d.b == null) {
                uoa.c(id, layoutParams);
                if (childAt instanceof ConstraintHelper) {
                   uoa.d.e0 = childAt.getReferencedIds();
                   if (childAt instanceof Barrier) {
                      View view = childAt;
                      uoa.d.j0 = view.x();
                      uoa.d.b0 = view.getType();
                      uoa.d.c0 = view.getMargin();
                   }
                }
                uoa.d.b = b;
             }
             a$a b1 = uoa.b;
             if (b1.a == null) {
                b1.b = childAt.getVisibility();
                uoa.b.d = childAt.getAlpha();
                uoa.b.a = b;
             }
             b1 = uoa.e;
             if (b1.a == null) {
                b1.a = b;
                b1.b = childAt.getRotation();
                uoa.e.c = childAt.getRotationX();
                uoa.e.d = childAt.getRotationY();
                uoa.e.e = childAt.getScaleX();
                uoa.e.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if ((double)pivotX || (double)pivotY) {
                   a$a e = uoa.e;
                   e.g = pivotX;
                   e.h = pivotY;
                }
                uoa.e.i = childAt.getTranslationX();
                uoa.e.j = childAt.getTranslationY();
                uoa.e.k = childAt.getTranslationZ();
                b1 = uoa.e;
                if (b1.l != null) {
                   b1.m = childAt.getElevation();
                }
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }
    public void I(a p0){
       Iterator iterator = p0.d.keySet().iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          int i = integer.intValue();
          a$a uoa = p0.d.get(integer);
          if (!this.d.containsKey(Integer.valueOf(i))) {
             this.d.put(Integer.valueOf(i), new a$a());
          }
          a$a uoa1 = this.d.get(Integer.valueOf(i));
          a$a d = uoa1.d;
          if (d.b == null) {
             d.a(uoa.d);
          }
          d = uoa1.b;
          if (d.a == null) {
             d.a(uoa.b);
          }
          d = uoa1.e;
          if (d.a == null) {
             d.a(uoa.e);
          }
          d = uoa1.c;
          if (d.a == null) {
             d.a(uoa.c);
          }
          Iterator iterator1 = uoa.f.keySet().iterator();
          while (iterator1.hasNext()) {
             String str = iterator1.next();
             if (!uoa1.f.containsKey(str)) {
                uoa1.f.put(str, uoa.f.get(str));
             }
          }
       }
       return;
    }
    public void J(int p0,String p1){
       p0.w = p1;
    }
    public void K(int p0,int p1){
       p0.A = p1;
    }
    public void L(int p0,int p1){
       p0.B = p1;
    }
    public void M(boolean p0){
       this.c = p0;
    }
    public void N(int p0,float p1){
       this.v(p0).d.g = p1;
       p1.f = -1;
       p0.e = -1;
    }
    public void O(int p0,float p1){
       p0.u = p1;
    }
    public void P(int p0,float p1){
       p0.Q = p1;
    }
    public void Q(int p0,int p1,int p2){
       a$a uoa = this.v(p0);
       switch (p1){
           case 1:
             uoa.D = p2;
          label_0034 :
             return;
             break;
           case 2:
             uoa.E = p2;
             goto label_0034 ;
             break;
           case 3:
             uoa.F = p2;
             goto label_0034 ;
             break;
           case 4:
             uoa.G = p2;
             goto label_0034 ;
             break;
           case 5:
             throw new IllegalArgumentException("baseline does not support margins");
           case 6:
             uoa.I = p2;
             goto label_0034 ;
             break;
           case 7:
             uoa.H = p2;
             goto label_0034 ;
             break;
           default:
             throw new IllegalArgumentException("unknown constraint");
       }
    }
    public void R(boolean p0){
       this.a = p0;
    }
    public void S(int p0,float p1){
       p0.v = p1;
    }
    public void T(int p0,int p1){
       p0.S = p1;
    }
    public void U(int p0,float p1){
       p0.P = p1;
    }
    public void V(int p0,int p1){
       p0.b = p1;
    }
    public final String W(int p0){
       switch (p0){
           case 1:
             return "left";
           case 2:
             return "right";
           case 3:
             return "top";
           case 4:
             return "bottom";
           case 5:
             return "baseline";
           case 6:
             return "start";
           case 7:
             return "end";
           default:
             return "undefined";
       }
    }
    public void a(ConstraintLayout p0){
       int childCount = p0.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return;
          }
          View childAt = p0.getChildAt(i);
          int id = childAt.getId();
          if (!this.d.containsKey(Integer.valueOf(id))) {
             c.c(childAt);
          }else if(this.c == null || id != -1){
             if (this.d.containsKey(Integer.valueOf(id))) {
                ConstraintAttribute.h(childAt, this.d.get(Integer.valueOf(id)).f);
             }
          }else {
             break ;
          }
          i = i + 1;
       }
       throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }
    public void b(ConstraintLayout p0){
       this.d(p0, true);
       p0.setConstraintSet(null);
       p0.requestLayout();
    }
    public void c(ConstraintHelper p0,ConstraintWidget p1,ConstraintLayout$LayoutParams p2,SparseArray p3){
       int id = p0.getId();
       if (this.d.containsKey(Integer.valueOf(id))) {
          a$a uoa = this.d.get(Integer.valueOf(id));
          if (p1 instanceof b) {
             p0.p(uoa, p1, p2, p3);
          }
       }
       return;
    }
    public void d(ConstraintLayout p0,boolean p1){
       a$b e0;
       int childCount = p0.getChildCount();
       HashSet hashSet = new HashSet(this.d.keySet());
       int i = 0;
       while (true) {
          int i1 = 1;
          a$a uoa = -1;
          if (i < childCount) {
             View childAt = p0.getChildAt(i);
             int id = childAt.getId();
             if (!this.d.containsKey(Integer.valueOf(id))) {
                c.c(childAt);
             }else if(this.c == null || id != uoa){
                if (id != uoa && this.d.containsKey(Integer.valueOf(id))) {
                   hashSet.remove(Integer.valueOf(id));
                   a$a uoa1 = this.d.get(Integer.valueOf(id));
                   if (childAt instanceof Barrier) {
                      uoa1.d.d0 = i1;
                   }
                   a$b d0 = uoa1.d.d0;
                   if (d0 != uoa && d0 == i1) {
                      View view = childAt;
                      view.setId(id);
                      view.setType(uoa1.d.b0);
                      view.setMargin(uoa1.d.c0);
                      view.setAllowsGoneWidget(uoa1.d.j0);
                      uoa = uoa1.d;
                      e0 = uoa.e0;
                      if (e0 != null) {
                         view.setReferencedIds(e0);
                      }else {
                         e0 = uoa.f0;
                         if (e0 != null) {
                            uoa.e0 = this.r(view, e0);
                            view.setReferencedIds(uoa1.d.e0);
                         }
                      }
                   }
                   ConstraintLayout$LayoutParams layoutParams = childAt.getLayoutParams();
                   layoutParams.c();
                   uoa1.a(layoutParams);
                   if (p1) {
                      ConstraintAttribute.h(childAt, uoa1.f);
                   }
                   childAt.setLayoutParams(layoutParams);
                   a$a b = uoa1.b;
                   if (b.c == null) {
                      childAt.setVisibility(b.b);
                   }
                   childAt.setAlpha(uoa1.b.d);
                   childAt.setRotation(uoa1.e.b);
                   childAt.setRotationX(uoa1.e.c);
                   childAt.setRotationY(uoa1.e.d);
                   childAt.setScaleX(uoa1.e.e);
                   childAt.setScaleY(uoa1.e.f);
                   if (!Float.isNaN(uoa1.e.g)) {
                      childAt.setPivotX(uoa1.e.g);
                   }
                   if (!Float.isNaN(uoa1.e.h)) {
                      childAt.setPivotY(uoa1.e.h);
                   }
                   childAt.setTranslationX(uoa1.e.i);
                   childAt.setTranslationY(uoa1.e.j);
                   childAt.setTranslationZ(uoa1.e.k);
                   b = uoa1.e;
                   if (b.l != null) {
                      childAt.setElevation(b.m);
                   }
                }
             }else {
                break ;
             }
             i = i + 1;
          }else {
             Iterator iterator = hashSet.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                a$a uoa2 = this.d.get(integer);
                a$b d01 = uoa2.d.d0;
                if (d01 != uoa && d01 == i1) {
                   Barrier uBarrier = new Barrier(p0.getContext());
                   uBarrier.setId(integer.intValue());
                   a$a d = uoa2.d;
                   e0 = d.e0;
                   if (e0 != null) {
                      uBarrier.setReferencedIds(e0);
                   }else {
                      e0 = d.f0;
                      if (e0 != null) {
                         d.e0 = this.r(uBarrier, e0);
                         uBarrier.setReferencedIds(uoa2.d.e0);
                      }
                   }
                   uBarrier.setType(uoa2.d.b0);
                   uBarrier.setMargin(uoa2.d.c0);
                   ConstraintLayout$LayoutParams layoutParams2 = p0.generateDefaultLayoutParams();
                   uBarrier.w();
                   uoa2.a(layoutParams2);
                   p0.addView(uBarrier, layoutParams2);
                }
                if (uoa2.d.a != null) {
                   Guideline guideline = new Guideline(p0.getContext());
                   guideline.setId(integer.intValue());
                   ConstraintLayout$LayoutParams layoutParams1 = p0.generateDefaultLayoutParams();
                   uoa2.a(layoutParams1);
                   p0.addView(guideline, layoutParams1);
                }else {
                   continue ;
                }
             }
             return;
          }
       }
       throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }
    public void e(int p0,ConstraintLayout$LayoutParams p1){
       if (this.d.containsKey(Integer.valueOf(p0))) {
          this.d.get(Integer.valueOf(p0)).a(p1);
       }
       return;
    }
    public void f(int p0){
       this.d.remove(Integer.valueOf(p0));
    }
    public void g(int p0,int p1){
       if (this.d.containsKey(Integer.valueOf(p0))) {
          a$a uoa = this.d.get(Integer.valueOf(p0));
          switch (p1){
              case 1:
                uoa = uoa.d;
                uoa.i = -1;
                uoa.h = -1;
                uoa.D = -1;
                uoa.J = -1;
                break;
              case 2:
                uoa = uoa.d;
                uoa.k = -1;
                uoa.j = -1;
                uoa.E = -1;
                uoa.L = -1;
                break;
              case 3:
                uoa = uoa.d;
                uoa.m = -1;
                uoa.l = -1;
                uoa.F = -1;
                uoa.K = -1;
                break;
              case 4:
                uoa = uoa.d;
                uoa.n = -1;
                uoa.o = -1;
                uoa.G = -1;
                uoa.M = -1;
                break;
              case 5:
                uoa.p = -1;
                break;
              case 6:
                uoa = uoa.d;
                uoa.q = -1;
                uoa.r = -1;
                uoa.I = -1;
                uoa.O = -1;
                break;
              case 7:
                uoa = uoa.d;
                uoa.s = -1;
                uoa.t = -1;
                uoa.H = -1;
                uoa.N = -1;
                break;
              default:
                throw new IllegalArgumentException("unknown constraint");
          }
       }
       return;
    }
    public void h(Context p0,int p1){
       this.i(LayoutInflater.from(p0).inflate(p1, null));
    }
    public void i(ConstraintLayout p0){
       int childCount = p0.getChildCount();
       this.d.clear();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return;
          }
          View childAt = p0.getChildAt(i);
          ConstraintLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int id = childAt.getId();
          if (this.c == null || id != -1) {
             if (!this.d.containsKey(Integer.valueOf(id))) {
                this.d.put(Integer.valueOf(id), new a$a());
             }
             a$a uoa = this.d.get(Integer.valueOf(id));
             uoa.f = ConstraintAttribute.b(this.b, childAt);
             uoa.c(id, layoutParams);
             uoa.b.b = childAt.getVisibility();
             uoa.b.d = childAt.getAlpha();
             uoa.e.b = childAt.getRotation();
             uoa.e.c = childAt.getRotationX();
             uoa.e.d = childAt.getRotationY();
             uoa.e.e = childAt.getScaleX();
             uoa.e.f = childAt.getScaleY();
             float pivotX = childAt.getPivotX();
             float pivotY = childAt.getPivotY();
             if ((double)pivotX || (double)pivotY) {
                a$a e = uoa.e;
                e.g = pivotX;
                e.h = pivotY;
             }
             uoa.e.i = childAt.getTranslationX();
             uoa.e.j = childAt.getTranslationY();
             uoa.e.k = childAt.getTranslationZ();
             a$a e1 = uoa.e;
             if (e1.l != null) {
                e1.m = childAt.getElevation();
             }
             if (childAt instanceof Barrier) {
                uoa.d.j0 = childAt.x();
                uoa.d.e0 = childAt.getReferencedIds();
                uoa.d.b0 = childAt.getType();
                uoa.d.c0 = childAt.getMargin();
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }
    public void j(a p0){
       this.d.clear();
       Iterator iterator = p0.d.keySet().iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          this.d.put(integer, p0.d.get(integer).b());
       }
       return;
    }
    public void k(Constraints p0){
       int childCount = p0.getChildCount();
       this.d.clear();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return;
          }
          View childAt = p0.getChildAt(i);
          Constraints$LayoutParams layoutParams = childAt.getLayoutParams();
          int id = childAt.getId();
          if (this.c == null || id != -1) {
             if (!this.d.containsKey(Integer.valueOf(id))) {
                this.d.put(Integer.valueOf(id), new a$a());
             }
             a$a uoa = this.d.get(Integer.valueOf(id));
             if (childAt instanceof ConstraintHelper) {
                uoa.e(childAt, id, layoutParams);
             }
             uoa.d(id, layoutParams);
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }
    public void l(int p0,int p1,int p2,int p3){
       if (!this.d.containsKey(Integer.valueOf(p0))) {
          this.d.put(Integer.valueOf(p0), new a$a());
       }
       a$a uoa = this.d.get(Integer.valueOf(p0));
       switch (p1){
           case 1:
             if (p3 == 1) {
                uoa = uoa.d;
                uoa.h = p2;
                uoa.i = -1;
             }else if(p3 == 2){
                uoa = uoa.d;
                uoa.i = p2;
                uoa.h = -1;
             }else {
                throw new IllegalArgumentException("left to "+this.W(p3)+" undefined");
             }
             break;
           case 2:
             if (p3 == 1) {
                uoa = uoa.d;
                uoa.j = p2;
                uoa.k = -1;
             }else if(p3 == 2){
                uoa = uoa.d;
                uoa.k = p2;
                uoa.j = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             break;
           case 3:
             if (p3 == 3) {
                uoa = uoa.d;
                uoa.l = p2;
                uoa.m = -1;
                uoa.p = -1;
             }else if(p3 == 4){
                uoa = uoa.d;
                uoa.m = p2;
                uoa.l = -1;
                uoa.p = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             break;
           case 4:
             if (p3 == 4) {
                uoa = uoa.d;
                uoa.o = p2;
                uoa.n = -1;
                uoa.p = -1;
             }else if(p3 == 3){
                uoa = uoa.d;
                uoa.n = p2;
                uoa.o = -1;
                uoa.p = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             break;
           case 5:
             if (p3 == 5) {
                uoa = uoa.d;
                uoa.p = p2;
                uoa.o = -1;
                uoa.n = -1;
                uoa.l = -1;
                uoa.m = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             break;
           case 6:
             if (p3 == 6) {
                uoa = uoa.d;
                uoa.r = p2;
                uoa.q = -1;
             }else if(p3 == 7){
                uoa = uoa.d;
                uoa.q = p2;
                uoa.r = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             break;
           case 7:
             if (p3 == 7) {
                uoa = uoa.d;
                uoa.t = p2;
                uoa.s = -1;
             }else if(p3 == 6){
                uoa = uoa.d;
                uoa.s = p2;
                uoa.t = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             break;
           default:
             throw new IllegalArgumentException(this.W(p1)+" to "+this.W(p3)+" unknown");
       }
       return;
    }
    public void m(int p0,int p1,int p2,int p3,int p4){
       a$a d;
       if (!this.d.containsKey(Integer.valueOf(p0))) {
          this.d.put(Integer.valueOf(p0), new a$a());
       }
       a$a uoa = this.d.get(Integer.valueOf(p0));
       switch (p1){
           case 1:
             if (p3 == 1) {
                d = uoa.d;
                d.h = p2;
                d.i = -1;
             }else if(p3 == 2){
                d = uoa.d;
                d.i = p2;
                d.h = -1;
             }else {
                throw new IllegalArgumentException("Left to "+this.W(p3)+" undefined");
             }
             uoa.D = p4;
             break;
           case 2:
             if (p3 == 1) {
                d = uoa.d;
                d.j = p2;
                d.k = -1;
             }else if(p3 == 2){
                d = uoa.d;
                d.k = p2;
                d.j = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             uoa.E = p4;
             break;
           case 3:
             if (p3 == 3) {
                d = uoa.d;
                d.l = p2;
                d.m = -1;
                d.p = -1;
             }else if(p3 == 4){
                d = uoa.d;
                d.m = p2;
                d.l = -1;
                d.p = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             uoa.F = p4;
             break;
           case 4:
             if (p3 == 4) {
                d = uoa.d;
                d.o = p2;
                d.n = -1;
                d.p = -1;
             }else if(p3 == 3){
                d = uoa.d;
                d.n = p2;
                d.o = -1;
                d.p = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             uoa.G = p4;
             break;
           case 5:
             if (p3 == 5) {
                uoa = uoa.d;
                uoa.p = p2;
                uoa.o = -1;
                uoa.n = -1;
                uoa.l = -1;
                uoa.m = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             break;
           case 6:
             if (p3 == 6) {
                d = uoa.d;
                d.r = p2;
                d.q = -1;
             }else if(p3 == 7){
                d = uoa.d;
                d.q = p2;
                d.r = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             uoa.I = p4;
             break;
           case 7:
             if (p3 == 7) {
                d = uoa.d;
                d.t = p2;
                d.s = -1;
             }else if(p3 == 6){
                d = uoa.d;
                d.s = p2;
                d.t = -1;
             }else {
                throw new IllegalArgumentException("right to "+this.W(p3)+" undefined");
             }
             uoa.H = p4;
             break;
           default:
             throw new IllegalArgumentException(this.W(p1)+" to "+this.W(p3)+" unknown");
       }
       return;
    }
    public void n(int p0,int p1){
       p0.d = p1;
    }
    public void o(int p0,int p1){
       p0.V = p1;
    }
    public void p(int p0,float p1){
       p0.Z = p1;
    }
    public void q(int p0,int p1){
       p0.c = p1;
    }
    public final int[] r(View p0,String p1){
       int intx;
       String[] stringArray = p1.split(",");
       Context context = p0.getContext();
       int[] ointArray = new int[stringArray.length];
       int i = 0;
       int i1 = 0;
       while (i < stringArray.length) {
          String str = (stringArray[i]).trim();
          try{
             intx = c.class.getField(str).getInt(null);
          }catch(java.lang.Exception e0){
             intx = 0;
          }
          if (!intx) {
             intx = e0.getResources().getIdentifier(str, "id", e0.getPackageName());
          }
          if (!intx && (p0.isInEditMode() && p0.getParent() instanceof ConstraintLayout)) {
             Object designInform = p0.getParent().getDesignInformation(0, str);
             if (designInform != null && designInform instanceof Integer) {
                intx = designInform.intValue();
             }
          }
       label_005c :
          int i2 = i1 + 1;
          ointArray[i1] = intx;
          i = i + 1;
          i1 = i2;
       }
       if (i1 != stringArray.length) {
          ointArray = Arrays.copyOf(ointArray, i1);
       }
       return ointArray;
    }
    public void s(int p0,int p1,int p2,int p3,int[] p4,float[] p5,int p6){
       this.t(p0, p1, p2, p3, p4, p5, p6, 1, 2);
    }
    public final void t(int p0,int p1,int p2,int p3,int[] p4,float[] p5,int p6,int p7,int p8){
       int i = p4;
       int i1 = p5;
       String str = "must have 2 or more widgets in a chain";
       if (i.length < 2) {
          throw new IllegalArgumentException(str);
       }
       if (i1 && i1.length != i.length) {
          throw new IllegalArgumentException(str);
       }
       int i2 = 0;
       if (i1) {
          this.v(i[i2]).d.Q = i1[i2];
       }
       this.v(i[i2]).d.R = p6;
       this.m(i[i2], p7, p0, p1, -1);
       int i3 = 1;
       while (i3 < i.length) {
          int i4 = i3 - 1;
          int i5 = -1;
          a uoa = this;
          uoa.m(i[i3], p7, i[i4], p8, i5);
          uoa.m(i[i4], p8, i[i3], p7, i5);
          if (i1) {
             uoa.Q = i1[i3];
          }
          i3 = i3 + 1;
       }
       this.m(i[(i.length - 1)], p8, p2, p3, -1);
       return;
    }
    public final a$a u(Context p0,AttributeSet p1){
       a$a uoa = new a$a();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Z);
       this.G(p0, uoa, typedArray);
       typedArray.recycle();
       return uoa;
    }
    public final a$a v(int p0){
       if (!this.d.containsKey(Integer.valueOf(p0))) {
          this.d.put(Integer.valueOf(p0), new a$a());
       }
       return this.d.get(Integer.valueOf(p0));
    }
    public a$a w(int p0){
       if (this.d.containsKey(Integer.valueOf(p0))) {
          return this.d.get(Integer.valueOf(p0));
       }
       return null;
    }
    public int x(int p0){
       return this.v(p0).d.d;
    }
    public int[] y(){
       int i = 0;
       Integer[] integerArray = new Integer[i];
       Integer[] integerArray1 = this.d.keySet().toArray(integerArray);
       int len = integerArray1.length;
       int[] ointArray = new int[len];
       for (; i < len; i = i + 1) {
          ointArray[i] = integerArray1[i].intValue();
       }
       return ointArray;
    }
    public a$a z(int p0){
       return this.v(p0);
    }
}
