package com.yxcorp.widget.selector.drawable.b;
import com.yxcorp.widget.selector.drawable.d;
import com.kuaishou.ax2c.IAttrHost;
import java.lang.Object;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.IllegalAccessException;
import java.lang.NoSuchFieldException;
import android.graphics.drawable.StateListDrawable;
import ald.c;

public class b implements d	// class@0009e2
{
    public boolean A;
    public Rect B;
    public GradientDrawable C;
    public IAttrHost a;
    public IAttrHost b;
    public IAttrHost c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public float[] h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public float q;
    public float r;
    public float s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public float x;
    public int y;
    public int z;

    public void b(IAttrHost p0,IAttrHost p1,IAttrHost p2,boolean p3){
       int i2;
       int index;
       super();
       this.e = 0;
       this.f = 0;
       this.g = 0;
       float[] uofloatArray = new float[8];
       this.h = uofloatArray;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.m = 0xbf800000;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 0;
       this.t = 0;
       this.u = 0;
       this.v = 0;
       this.w = false;
       this.x = 0;
       this.y = 0;
       this.z = 0;
       this.A = false;
       this.B = new Rect();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       if (p2.hasValue(0)) {
          this.A = this.c.getBoolean(0, 0);
       }
       int i = 5;
       int i1 = 4;
       if (this.b != null) {
          i2 = 0;
          while (i2 < this.b.getIndexCount()) {
             index = this.b.getIndex(i2);
             b uob = 2;
             if (index == uob) {
                this.k = this.b.getDimension(index, 0);
             }else if(!index){
                this.h[6] = this.b.getDimension(index, 0);
                this.h[7] = this.b.getDimension(index, 0);
             }else {
                b uob1 = 1;
                if (index == uob1) {
                   this.h[i1] = this.b.getDimension(index, 0);
                   this.h[i] = this.b.getDimension(index, 0);
                }else {
                   b uob2 = 3;
                   if (index == uob2) {
                      this.h[0] = this.b.getDimension(index, 0);
                      this.h[uob1] = this.b.getDimension(index, 0);
                   }else if(index == i1){
                      this.h[uob] = this.b.getDimension(index, 0);
                      this.h[uob2] = this.b.getDimension(index, 0);
                   }
                }
             }
             i2++;
          }
       }
       i2 = 0;
       while (i2 < this.a.getIndexCount()) {
          index = this.a.getIndex(i2);
          if (index == 26) {
             this.l = this.a.getInt(index, 0);
          }else if(index == 29){
             this.p = this.a.getColor(index, 0);
          }else if(index == 8){
             this.z = this.a.getInteger(index, 0);
          }else if(index == 10){
             this.r = this.a.getFloat(index, 0xbf800000);
          }else if(index == 11){
             this.s = this.a.getFloat(index, 0xbf800000);
          }else if(index == 9){
             this.t = this.a.getColor(index, 0);
          }else if(index == 12){
             this.v = this.a.getColor(index, 0);
          }else if(index == 14){
             this.u = this.a.getColor(index, 0);
          }else if(index == 13){
             this.x = this.a.getDimension(index, 0);
          }else if(index == 15){
             this.y = this.a.getInt(index, 0);
          }else if(index == 16){
             this.w = this.a.getBoolean(index, 0);
          }else if(index == 18){
             this.B.left = (int)this.a.getDimension(index, 0);
          }else if(index == 20){
             this.B.top = (int)this.a.getDimension(index, 0);
          }else if(index == 19){
             this.B.right = (int)this.a.getDimension(index, 0);
          }else if(index == 17){
             this.B.bottom = (int)this.a.getDimension(index, 0);
          }else if(index == 28){
             this.i = this.a.getDimension(index, 0);
          }else if(index == 27){
             this.j = this.a.getDimension(index, 0);
          }else if(index == 30){
             this.o = this.a.getColor(index, 0);
          }else if(index == 34){
             this.m = this.a.getDimension(index, 0);
          }else if(index == 32){
             this.n = this.a.getDimension(index, 0);
          }else if(index == 31){
             this.q = this.a.getDimension(index, 0);
          }
          i2++;
       }
       b tp = this.p;
       if (tp != null) {
          this.f = tp;
       }else if(this.a.hasValue(i1)){
          this.f = this.a.getColor(i1, 0);
       }else if(this.a.hasValue(43)){
          this.f = this.a.getColor(43, 0);
       }
       tp = this.o;
       if (tp != null) {
          this.g = tp;
       }else if(this.a.hasValue(i)){
          this.g = this.a.getColor(i, 0);
       }else if(this.a.hasValue(44)){
          this.g = this.a.getColor(44, 0);
       }
       return;
    }
    public GradientDrawable a(){
       int[] ointArray;
       GradientDrawable$Orientation lEFT_RIGHT;
       int i3;
       b tC = this.C;
       if (tC != null && tC.getConstantState() != null) {
          return this.C.getConstantState().newDrawable().mutate();
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       b tk = this.k;
       b uob = null;
       if (tk - uob > 0) {
          gradientDraw.setCornerRadius(tk);
       }
       tk = this.l;
       if (tk != null) {
          gradientDraw.setShape(tk);
       }
       tk = this.x;
       if (tk - uob > 0) {
          gradientDraw.setGradientRadius(tk);
       }
       tk = this.y;
       if (tk != null) {
          gradientDraw.setGradientType(tk);
       }
       boolean b = true;
       if (this.w != null) {
          gradientDraw.setUseLevel(b);
       }
       if (this.a.hasValue(10) && this.a.hasValue(11)) {
          gradientDraw.setGradientCenter(this.r, this.s);
       }
       int i = 0;
       if (this.a.hasValue(14) && this.a.hasValue(12)) {
          int i1 = 2;
          if (this.a.hasValue(9)) {
             ointArray = new int[]{this.u,this.t,this.v};
          }else {
             ointArray = new int[i1];
             ointArray[i] = this.u;
             ointArray[b] = this.v;
          }
          gradientDraw.setColors(ointArray);
       }
       if (this.y == null && this.a.hasValue(8)) {
          int i2 = this.z % 360;
          this.z = i2;
          if (!(i2 % 45)) {
             if (i2 != 45) {
                if (i2 != 90) {
                   if (i2 != 135) {
                      if (i2 != 180) {
                         if (i2 != 225) {
                            if (i2 != 270) {
                               lEFT_RIGHT = (i2 != 315)? GradientDrawable$Orientation.LEFT_RIGHT: GradientDrawable$Orientation.TL_BR;
                            }else {
                               lEFT_RIGHT = GradientDrawable$Orientation.TOP_BOTTOM;
                            }
                         }else {
                            lEFT_RIGHT = GradientDrawable$Orientation.TR_BL;
                         }
                      }else {
                         lEFT_RIGHT = GradientDrawable$Orientation.RIGHT_LEFT;
                      }
                   }else {
                      lEFT_RIGHT = GradientDrawable$Orientation.BR_TL;
                   }
                }else {
                   lEFT_RIGHT = GradientDrawable$Orientation.BOTTOM_TOP;
                }
             }else {
                lEFT_RIGHT = GradientDrawable$Orientation.BL_TR;
             }
             gradientDraw.setOrientation(lEFT_RIGHT);
          }else {
             throw new XmlPullParserException(this.a.getPositionDescription()+"<gradient> tag requires \'angle\' attribute to be a multiple of 45");
          }
       }
       if (this.a.hasValue(18) && (this.a.hasValue(20) && (this.a.hasValue(19) && this.a.hasValue(17)))) {
          try{
             Field declaredFiel = gradientDraw.getClass().getDeclaredField("mPadding");
             declaredFiel.setAccessible(b);
             declaredFiel.set(gradientDraw, this.B);
          }catch(java.lang.NoSuchFieldException e1){
             e1.printStackTrace();
          }catch(java.lang.IllegalAccessException e1){
             e1.printStackTrace();
          }
       }
    }
    public final void b(StateListDrawable p0,int p1,int p2,int[] p3){
       if (this.a.hasValue(p1) || this.a.hasValue(p2)) {
          GradientDrawable gradientDraw = this.a();
          int i = 0;
          if (this.a.hasValue(p1)) {
             gradientDraw.setColor(this.a.getColor(p1, i));
          }
          if (this.a.hasValue(p2)) {
             b tg = this.g;
             if (this.a.hasValue(p2)) {
                tg = this.a.getColor(p2, i);
             }
             gradientDraw.setStroke((int)this.m, tg, this.n, this.q);
          }
          p0.addState(p3, gradientDraw);
          this.e = this.e + 1;
       }
       return;
    }
    public Drawable create(){
       GradientDrawable gradientDraw1;
       int[] ointArray;
       int[] ointArray2;
       if (this.d == null) {
          return this.a();
       }
       GradientDrawable gradientDraw = this.a();
       int i = 0;
       this.e = i;
       StateListDrawable stateListDra = new StateListDrawable();
       int i1 = 0;
       int i2 = 0x10100a7;
       if (this.A != null) {
          gradientDraw1 = this.a();
          b tf = this.f;
          float f = 0x3f000000;
          if (tf != null) {
             gradientDraw1.setColor(c.b(tf, f));
          }
          tf = this.g;
          if (tf != null) {
             b tm = this.m;
             if (tm - i1 > 0) {
                gradientDraw1.setStroke((int)tm, c.b(tf, f), this.n, this.q);
             }
          }
          ointArray = new int[]{i2};
          stateListDra.addState(ointArray, gradientDraw1);
          this.e = this.e + 1;
       }else {
          ointArray2 = new int[]{i2};
          this.b(stateListDra, 21, 22, ointArray2);
       }
       this.b(stateListDra, 24, 25, new int[2]{0x10100a1,0xfefeff59});
       this.b(stateListDra, 45, 46, new int[2]{0xfefeff5f,0xfefeff59});
       int[] ointArray1 = new int[]{0x101009f};
       this.b(stateListDra, i, 1, ointArray1);
       ointArray2 = new int[]{-16842911};
       this.b(stateListDra, 35, 36, ointArray2);
       int[] ointArray3 = new int[]{0x10100a0};
       this.b(stateListDra, 2, 3, ointArray3);
       ointArray = new int[]{-16842912};
       this.b(stateListDra, 37, 38, ointArray);
       ointArray = new int[]{0x101009e};
       this.b(stateListDra, 4, 5, ointArray);
       ointArray = new int[]{-16842910};
       this.b(stateListDra, 39, 40, ointArray);
       ointArray = new int[]{0x101009c};
       this.b(stateListDra, 6, 7, ointArray);
       ointArray = new int[]{-16842908};
       this.b(stateListDra, 41, 42, ointArray);
       gradientDraw1 = (this.e > null)? 1: null;
       if (this.f != null || (this.g == null || (this.m - i1 > 0 || gradientDraw1))) {
          int[] ointArray4 = new int[i];
          stateListDra.addState(ointArray4, this.a());
          this.e = this.e + 1;
       }
       if (this.e <= 1) {
          return gradientDraw;
       }else {
          return stateListDra;
       }
    }
}
