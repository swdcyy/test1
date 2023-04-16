package ga.d0;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import com.contrarywind.view.WheelView;
import fa.a;
import fa.c;
import com.contrarywind.view.CustomWheelView;
import ga.d0$a;
import ka.b;
import android.content.Context;
import aa.a;
import java.util.ArrayList;
import java.util.List;
import ia.a;
import aa.b;
import ga.z;
import ga.a0;
import java.lang.RuntimeException;
import java.util.Arrays;
import ga.b0;
import ga.c0;
import java.lang.IllegalArgumentException;
import java.util.Calendar;
import ea.b;

public class d0	// class@00205c
{
    public boolean A;
    public b B;
    public View a;
    public CustomWheelView b;
    public CustomWheelView c;
    public CustomWheelView d;
    public CustomWheelView e;
    public CustomWheelView f;
    public CustomWheelView g;
    public int h;
    public boolean[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public float s;
    public int t;
    public int u;
    public int v;
    public float w;
    public int x;
    public float y;
    public WheelView$DividerType z;

    public void d0(View p0,boolean[] p1,int p2,int p3){
       super();
       this.j = 1900;
       this.k = 2100;
       this.l = 1;
       this.m = 12;
       this.n = 1;
       this.o = 31;
       this.A = false;
       this.a = p0;
       this.i = p1;
       this.h = p2;
       this.q = p3;
       this.a = p0;
    }
    public String a(){
       StringBuilder str2;
       int currentItem;
       boolean b;
       String str = " ";
       int i = 1;
       String str1 = "-";
       if (this.A != null) {
          str2 = "";
          int i1 = this.b.getCurrentItem() + this.j;
          if (!a.e(i1)) {
             currentItem = this.c.getCurrentItem();
          }else if(((this.c.getCurrentItem() + i) - a.e(i1)) <= 0){
             currentItem = this.c.getCurrentItem();
          }else if(((this.c.getCurrentItem() + i) - a.e(i1)) == i){
             currentItem = this.c.getCurrentItem();
             b = true;
          label_005a :
             int[] ointArray = c.b(i1, currentItem, (this.d.getCurrentItem() + i), b);
             return str2+ointArray[0]+str1+ointArray[i]+str1+ointArray[2]+str+this.e.getCurrentItem()+":"+this.f.getCurrentItem()+":"+this.g.getCurrentItem();
          }else {
             currentItem = this.c.getCurrentItem();
          label_0059 :
             b = false;
             goto label_005a ;
          }
          currentItem = currentItem + i;
          goto label_0059 ;
       }else {
          str2 = "";
          if (this.p == this.j) {
             d0 tl = this.l;
             str2 = ((this.c.getCurrentItem() + tl) == tl)? str2+(this.b.getCurrentItem() + this.j)+str1+(this.c.getCurrentItem() + this.l)+str1+(this.d.getCurrentItem() + this.n)+str+this.e.getCurrentItem()+":"+this.f.getCurrentItem()+":"+this.g.getCurrentItem(): str2+(this.b.getCurrentItem() + this.j)+str1+(this.c.getCurrentItem() + this.l)+str1+(this.d.getCurrentItem() + i)+str+this.e.getCurrentItem()+":"+this.f.getCurrentItem()+":"+this.g.getCurrentItem();
          }else {
             str2 = str2+(this.b.getCurrentItem() + this.j)+str1+(this.c.getCurrentItem() + i)+str1+(this.d.getCurrentItem() + i)+str+this.e.getCurrentItem()+":"+this.f.getCurrentItem()+":"+this.g.getCurrentItem();
          }
          return str2;
       }
    }
    public void b(boolean p0){
       this.d.e(p0);
       this.c.e(p0);
       this.b.e(p0);
       this.e.e(p0);
       this.f.e(p0);
       this.g.e(p0);
    }
    public final void c(CustomWheelView p0){
       if (this.B != null) {
          p0.setOnItemSelectedListener(new d0$a(this));
       }
       return;
    }
    public final void d(){
       this.d.setCenterTextSize(this.s);
       this.c.setCenterTextSize(this.s);
       this.b.setCenterTextSize(this.s);
       this.e.setCenterTextSize(this.s);
       this.f.setCenterTextSize(this.s);
       this.g.setCenterTextSize(this.s);
       this.d.setOuterTextSize(this.r);
       this.c.setOuterTextSize(this.r);
       this.b.setOuterTextSize(this.r);
       this.e.setOuterTextSize(this.r);
       this.f.setOuterTextSize(this.r);
       this.g.setOuterTextSize(this.r);
    }
    public void e(boolean p0){
       this.b.setCyclic(p0);
       this.c.setCyclic(p0);
       this.d.setCyclic(p0);
       this.e.setCyclic(p0);
       this.f.setCyclic(p0);
       this.g.setCyclic(p0);
    }
    public void f(int p0){
       this.v = p0;
       this.d.setDividerColor(p0);
       this.c.setDividerColor(this.v);
       this.b.setDividerColor(this.v);
       this.e.setDividerColor(this.v);
       this.f.setDividerColor(this.v);
       this.g.setDividerColor(this.v);
    }
    public void g(float p0){
       this.w = p0;
    }
    public void h(String p0,String p1,String p2,String p3,String p4,String p5){
       if (this.A != null) {
          return;
       }
       if (p0 != null) {
          this.b.setLabel(p0);
       }else {
          this.b.setLabel(this.a.getContext().getString(R.string.arg_RES_7f103c76));
       }
       if (p1 != null) {
          this.c.setLabel(p1);
       }else {
          this.c.setLabel(this.a.getContext().getString(R.string.arg_RES_7f103c73));
       }
       if (p2 != null) {
          this.d.setLabel(p2);
       }else {
          this.d.setLabel(this.a.getContext().getString(R.string.arg_RES_7f103c70));
       }
       if (p3 != null) {
          this.e.setLabel(p3);
       }else {
          this.e.setLabel(this.a.getContext().getString(R.string.arg_RES_7f103c71));
       }
       if (p4 != null) {
          this.f.setLabel(p4);
       }else {
          this.f.setLabel(this.a.getContext().getString(R.string.arg_RES_7f103c72));
       }
       if (p5 != null) {
          this.g.setLabel(p5);
       }else {
          this.g.setLabel(this.a.getContext().getString(R.string.arg_RES_7f103c74));
       }
       return;
    }
    public void i(float p0){
       this.y = p0;
       this.d.setLineSpacingMultiplier(p0);
       this.c.setLineSpacingMultiplier(this.y);
       this.b.setLineSpacingMultiplier(this.y);
       this.e.setLineSpacingMultiplier(this.y);
       this.f.setLineSpacingMultiplier(this.y);
       this.g.setLineSpacingMultiplier(this.y);
    }
    public void j(boolean p0){
       this.A = p0;
    }
    public void k(int p0,int p1,int p2,int p3,int p4,int p5){
       int i10;
       d0 uod01;
       CustomWheelView uCustomWheel;
       CustomWheelView uCustomWheel1;
       CustomWheelView uCustomWheel2;
       d0 b;
       d0 uod0 = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       int i3 = p3;
       int i4 = p4;
       int i5 = 0x7f0a1304;
       int i6 = 0x7f0a0a50;
       int i7 = 0x7f0a2be8;
       int i8 = 0x7f0a45f6;
       int i9 = 0;
       if (uod0.A != null) {
          int[] ointArray = c.d(i, (i1 + 1), i2);
          i1 = ointArray[i9];
          i2 = ointArray[1] - 1;
          i10 = ointArray[2];
          uod01 = (ointArray[3] == 1)? 1: null;
          uCustomWheel = uod0.a.findViewById(i8);
          uod0.b = uCustomWheel;
          uCustomWheel.setAdapter(new a(a.c(uod0.j, uod0.k)));
          uod0.b.setLabel("");
          uod0.b.setCurrentItem((i1 - uod0.j));
          uod0.b.setGravity(uod0.h);
          uCustomWheel1 = uod0.a.findViewById(i7);
          uod0.c = uCustomWheel1;
          uCustomWheel1.setAdapter(new a(a.b(i1)));
          uod0.c.setLabel("");
          i7 = a.e(i1);
          if (i7 && (i2 > (i7 - 1) || uod01)) {
             uod0.c.setCurrentItem((i2 + 1));
          }else {
             uod0.c.setCurrentItem(i2);
          }
          uod0.c.setGravity(uod0.h);
          uod0.d = uod0.a.findViewById(i6);
          if (!a.e(i1)) {
             uod0.d.setAdapter(new a(a.a(a.f(i1, i2))));
          }else {
             uod0.d.setAdapter(new a(a.a(a.d(i1))));
          }
          uod0.d.setLabel("");
          uod0.d.setCurrentItem((i10 - 1));
          uod0.d.setGravity(uod0.h);
          uCustomWheel2 = uod0.a.findViewById(i5);
          uod0.e = uCustomWheel2;
          uCustomWheel2.setAdapter(new b(0, 23));
          uod0.e.setCurrentItem(i3);
          uod0.e.setGravity(uod0.h);
          uCustomWheel2 = uod0.a.findViewById(R.id.min);
          uod0.f = uCustomWheel2;
          uCustomWheel2.setAdapter(new b(0, 59));
          uod0.f.setCurrentItem(i4);
          uod0.f.setGravity(uod0.h);
          uCustomWheel2 = uod0.a.findViewById(R.id.second);
          uod0.g = uCustomWheel2;
          uCustomWheel2.setAdapter(new b(0, 59));
          uod0.g.setCurrentItem(i4);
          uod0.g.setGravity(uod0.h);
          uod0.b.setOnItemSelectedListener(new z(uod0));
          uod0.c.setOnItemSelectedListener(new a0(uod0));
          uod0.c(uod0.d);
          uod0.c(uod0.e);
          uod0.c(uod0.f);
          uod0.c(uod0.g);
          uod01 = uod0.i;
          if (uod01.length == 6) {
             b = uod0.b;
             i = (uod01[0])? 0: 8;
             b.setVisibility(i);
             uod01 = uod0.c;
             i1 = (uod0.i[1])? 0: 8;
             uod01.setVisibility(i1);
             uod01 = uod0.d;
             i1 = (uod0.i[2])? 0: 8;
             uod01.setVisibility(i1);
             uod01 = uod0.e;
             i1 = (uod0.i[3])? 0: 8;
             uod01.setVisibility(i1);
             uod01 = uod0.f;
             i1 = (uod0.i[4])? 0: 8;
             uod01.setVisibility(i1);
             uod01 = uod0.g;
             i1 = (uod0.i[5])? 0: 8;
             uod01.setVisibility(i1);
             this.d();
          }else {
             throw new RuntimeException("type[] length is not 6");
          }
       }else {
          String[] stringArray = new String[]{"1","3","5","7","8","10","12"};
          String[] stringArray1 = new String[]{"4","6","9","11"};
          List list = Arrays.asList(stringArray);
          List list1 = Arrays.asList(stringArray1);
          uod0.p = i;
          uCustomWheel = uod0.a.findViewById(i8);
          uod0.b = uCustomWheel;
          uCustomWheel.setAdapter(new b(uod0.j, uod0.k));
          uod0.b.setCurrentItem((i - uod0.j));
          uod0.b.setGravity(uod0.h);
          uCustomWheel1 = uod0.a.findViewById(i7);
          uod0.c = uCustomWheel1;
          d0 j = uod0.j;
          d0 k = uod0.k;
          if (j == k) {
             uCustomWheel1.setAdapter(new b(uod0.l, uod0.m));
             uod0.c.setCurrentItem(((i1 + 1) - uod0.l));
          }else {
             int i11 = 12;
             if (i == j) {
                uCustomWheel1.setAdapter(new b(uod0.l, i11));
                uod0.c.setCurrentItem(((i1 + 1) - uod0.l));
             }else if(i == k){
                uCustomWheel1.setAdapter(new b(1, uod0.m));
                uod0.c.setCurrentItem(i1);
             }else {
                uCustomWheel1.setAdapter(new b(1, i11));
                uod0.c.setCurrentItem(i1);
             }
          }
          uod0.c.setGravity(uod0.h);
          uod0.d = uod0.a.findViewById(i6);
          d0 j1 = uod0.j;
          j = uod0.k;
          if (j1 == j && uod0.l == uod0.m) {
             i1 = i1 + 1;
             if (list.contains(String.valueOf(i1))) {
                if (uod0.o > 31) {
                   uod0.o = 31;
                }
                uod0.d.setAdapter(new b(uod0.n, uod0.o));
             }else if(list1.contains(String.valueOf(i1))){
                if (uod0.o > 30) {
                   uod0.o = 30;
                }
                uod0.d.setAdapter(new b(uod0.n, uod0.o));
             }else if((i % 4) || ((i % 100) || !(i % 400))){
                i1 = 29;
                if (uod0.o > i1) {
                   uod0.o = i1;
                }
                uod0.d.setAdapter(new b(uod0.n, uod0.o));
             }else {
                i1 = 28;
                if (uod0.o > i1) {
                   uod0.o = i1;
                }
                uod0.d.setAdapter(new b(uod0.n, uod0.o));
             }
             uod0.d.setCurrentItem((i2 - uod0.n));
          }else if(i == j1){
             i7 = i1 + 1;
             if (i7 == uod0.l) {
                if (list.contains(String.valueOf(i7))) {
                   uod0.d.setAdapter(new b(uod0.n, 31));
                }else if(list1.contains(String.valueOf(i7))){
                   uod0.d.setAdapter(new b(uod0.n, 30));
                }else if((i % 4) || ((i % 100) || !(i % 400))){
                   uod0.d.setAdapter(new b(uod0.n, 29));
                }else {
                   uod0.d.setAdapter(new b(uod0.n, 28));
                }
                uod0.d.setCurrentItem((i2 - uod0.n));
             }
          }
          if (i == j) {
             i7 = i1 + 1;
             if (i7 == uod0.m) {
                if (list.contains(String.valueOf(i7))) {
                   if (uod0.o > 31) {
                      uod0.o = 31;
                   }
                   uod0.d.setAdapter(new b(1, uod0.o));
                }else if(list1.contains(String.valueOf(i7))){
                   if (uod0.o > 30) {
                      uod0.o = 30;
                   }
                   uod0.d.setAdapter(new b(1, uod0.o));
                }else if((i % 4) || ((i % 100) || !(i % 400))){
                   i1 = 29;
                   if (uod0.o > i1) {
                      uod0.o = i1;
                   }
                   uod0.d.setAdapter(new b(1, uod0.o));
                }else {
                   i1 = 28;
                   if (uod0.o > i1) {
                      uod0.o = i1;
                   }
                   uod0.d.setAdapter(new b(1, uod0.o));
                }
                uod0.d.setCurrentItem((i2 - 1));
             }
          }
          i1 = i1 + 1;
          if (list.contains(String.valueOf(i1))) {
             uod0.d.setAdapter(new b(1, 31));
          }else if(list1.contains(String.valueOf(i1))){
             uod0.d.setAdapter(new b(1, 30));
          }else if((i % 4) || ((i % 100) || !(i % 400))){
             uod0.d.setAdapter(new b(1, 29));
          }else {
             uod0.d.setAdapter(new b(1, 28));
          }
          uod0.d.setCurrentItem((i2 - 1));
          uod0.d.setGravity(uod0.h);
          uCustomWheel2 = uod0.a.findViewById(R.id.hour);
          uod0.e = uCustomWheel2;
          uCustomWheel2.setAdapter(new b(0, 23));
          uod0.e.setCurrentItem(i3);
          uod0.e.setGravity(uod0.h);
          uCustomWheel2 = uod0.a.findViewById(R.id.min);
          uod0.f = uCustomWheel2;
          uCustomWheel2.setAdapter(new b(0, 59));
          uod0.f.setCurrentItem(i4);
          uod0.f.setGravity(uod0.h);
          uCustomWheel2 = uod0.a.findViewById(R.id.second);
          uod0.g = uCustomWheel2;
          uCustomWheel2.setAdapter(new b(0, 59));
          uod0.g.setCurrentItem(p5);
          uod0.g.setGravity(uod0.h);
          uod0.b.setOnItemSelectedListener(new b0(uod0, list, list1));
          uod0.c.setOnItemSelectedListener(new c0(uod0, list, list1));
          uod0.c(uod0.d);
          uod0.c(uod0.e);
          uod0.c(uod0.f);
          uod0.c(uod0.g);
          uod01 = uod0.i;
          if (uod01.length == 6) {
             b = uod0.b;
             i10 = 0;
             i = (uod01[i10])? 0: 8;
             b.setVisibility(i);
             uod01 = uod0.c;
             i1 = (uod0.i[1])? 0: 8;
             uod01.setVisibility(i1);
             uod01 = uod0.d;
             i1 = (uod0.i[2])? 0: 8;
             uod01.setVisibility(i1);
             uod01 = uod0.e;
             i1 = (uod0.i[3])? 0: 8;
             uod01.setVisibility(i1);
             uod01 = uod0.f;
             i1 = (uod0.i[4])? 0: 8;
             uod01.setVisibility(i1);
             uod01 = uod0.g;
             if (!uod0.i[5]) {
                i10 = 8;
             }
             uod01.setVisibility(i10);
             this.d();
          }else {
             throw new IllegalArgumentException("type[] length is not 6");
          }
       }
       uod0.b.setItemHeight(uod0.w);
       uod0.c.setItemHeight(uod0.w);
       uod0.d.setItemHeight(uod0.w);
       uod0.e.setItemHeight(uod0.w);
       uod0.f.setItemHeight(uod0.w);
       uod0.g.setItemHeight(uod0.w);
       uod0.b.setHeightOffsets(uod0.x);
       uod0.c.setHeightOffsets(uod0.x);
       uod0.d.setHeightOffsets(uod0.x);
       uod0.e.setHeightOffsets(uod0.x);
       uod0.f.setHeightOffsets(uod0.x);
       uod0.g.setHeightOffsets(uod0.x);
       return;
    }
    public void l(Calendar p0,Calendar p1){
       int i2;
       int i3;
       d0 tj;
       int i = 5;
       int i1 = 2;
       if (p0 == null && p1 != null) {
          i2 = p1.get(1);
          i1 = p1.get(i1) + 1;
          i3 = p1.get(i);
          tj = this.j;
          if (i2 > tj) {
             this.k = i2;
             this.m = i1;
             this.o = i3;
          }else if(i2 == tj){
             tj = this.l;
             if (i1 > tj) {
                this.k = i2;
                this.m = i1;
                this.o = i3;
             }else if(i1 == tj && i3 > this.n){
                this.k = i2;
                this.m = i1;
                this.o = i3;
             }
          }
       }else if(p0 != null && p1 == null){
          i3 = p0.get(1);
          i1 = p0.get(i1) + 1;
          i2 = p0.get(i);
          tj = this.k;
          if (i3 < tj) {
             this.l = i1;
             this.n = i2;
             this.j = i3;
          }else if(i3 == tj){
             tj = this.m;
             if (i1 < tj) {
                this.l = i1;
                this.n = i2;
                this.j = i3;
             }else if(i1 == tj && i2 < this.o){
                this.l = i1;
                this.n = i2;
                this.j = i3;
             }
          }
       }else if(p0 != null && p1 != null){
          this.j = p0.get(1);
          this.k = p1.get(1);
          this.l = p0.get(i1) + 1;
          this.m = p1.get(i1) + 1;
          this.n = p0.get(i);
          this.o = p1.get(i);
       }
       return;
    }
    public void m(int p0,int p1,int p2,int p3,List p4,List p5){
       int currentItem = this.d.getCurrentItem();
       if (p4.contains(String.valueOf(p1))) {
          if (p3 > 31) {
             p3 = 31;
          }
          this.d.setAdapter(new b(p2, p3));
       }else if(p5.contains(String.valueOf(p1))){
          if (p3 > 30) {
             p3 = 30;
          }
          this.d.setAdapter(new b(p2, p3));
       }else if((p0 % 4) || ((p0 % 100) || !(p0 % 400))){
          if (p3 > 29) {
             p3 = 29;
          }
          this.d.setAdapter(new b(p2, p3));
       }else if(p3 > 28){
          p3 = 28;
       }
       this.d.setAdapter(new b(p2, p3));
       if (currentItem > (this.d.getAdapter().getItemsCount() - 1)) {
          this.d.setCurrentItem((this.d.getAdapter().getItemsCount() - 1));
       }
       return;
    }
    public void n(b p0){
       this.B = p0;
    }
    public void o(int p0){
       this.u = p0;
       this.d.setTextColorCenter(p0);
       this.c.setTextColorCenter(this.u);
       this.b.setTextColorCenter(this.u);
       this.e.setTextColorCenter(this.u);
       this.f.setTextColorCenter(this.u);
       this.g.setTextColorCenter(this.u);
    }
    public void p(int p0){
       this.t = p0;
       this.d.setTextColorOut(p0);
       this.c.setTextColorOut(this.t);
       this.b.setTextColorOut(this.t);
       this.e.setTextColorOut(this.t);
       this.f.setTextColorOut(this.t);
       this.g.setTextColorOut(this.t);
    }
}
