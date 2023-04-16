package com.kwai.library.widget.viewpager.tabstrip.c;
import com.kwai.library.widget.viewpager.tabstrip.c$a;
import nsd.u;
import java.lang.Object;
import com.kwai.library.widget.protocol.WidgetThemeManager;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import lnc.a1;
import ll8.c$b;
import android.content.res.TypedArray;
import kotlin.jvm.internal.a;

public final class c	// class@000a99
{
    public int A;
    public int B;
    public float C;
    public boolean D;
    public boolean E;
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static c F;
    public static final c$a G;

    static {
       c.G = new c$a(null);
    }
    public void c(){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(PagerSlidingTabStrip.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.O3);
          a.o(typedArray, "CommonUtil.context\(\)\n   ¡­ble.PagerSlidingTabStrip\)");
          this.b = typedArray.getResourceId(13, this.b);
          this.d = typedArray.getResourceId(8, this.d);
          this.c = typedArray.getResourceId(35, this.c);
          this.s = typedArray.getResourceId(31, this.s);
          this.t = typedArray.getBoolean(29, this.t);
          this.u = typedArray.getBoolean(34, this.u);
          this.v = typedArray.getBoolean(30, this.v);
          this.w = typedArray.getBoolean(23, this.w);
          this.x = typedArray.getBoolean(3, this.x);
          this.y = typedArray.getBoolean(26, this.y);
          this.r = typedArray.getResourceId(true, this.r);
          this.e = typedArray.getResourceId(15, this.e);
          this.f = typedArray.getResourceId(36, this.f);
          this.g = typedArray.getResourceId(9, this.g);
          this.h = typedArray.getResourceId(33, this.h);
          this.i = typedArray.getResourceId(25, this.i);
          this.j = typedArray.getResourceId(17, this.j);
          this.k = typedArray.getResourceId(22, this.k);
          this.l = typedArray.getResourceId(16, this.l);
          this.o = typedArray.getResourceId(14, this.o);
          this.p = typedArray.getResourceId(2, this.p);
          this.q = typedArray.getResourceId(0, this.q);
          typedArray.recycle();
       }
       this.b = 0x7f060afc;
       this.c = 0x7f06206b;
       this.d = 0x7f0609ba;
       this.e = 0x7f070576;
       this.f = 0x7f070574;
       this.g = 0x7f07056f;
       this.h = 0x7f070573;
       this.i = 0x7f070575;
       this.j = 0x7f07056d;
       this.k = 0x7f07056d;
       this.l = 0x7f07056d;
       this.m = 0x7f07056d;
       this.n = 0x7f07056d;
       this.o = 0x7f070572;
       this.p = 0x7f07056d;
       this.q = 0x7f07056d;
       this.r = 0x7f070570;
       this.x = true;
       this.z = true;
       this.A = 5;
       this.D = true;
       return;
    }
    public void c(u p0){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(PagerSlidingTabStrip.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.O3);
          a.o(typedArray, "CommonUtil.context\(\)\n   ¡­ble.PagerSlidingTabStrip\)");
          this.b = typedArray.getResourceId(13, this.b);
          this.d = typedArray.getResourceId(8, this.d);
          this.c = typedArray.getResourceId(35, this.c);
          this.s = typedArray.getResourceId(31, this.s);
          this.t = typedArray.getBoolean(29, this.t);
          this.u = typedArray.getBoolean(34, this.u);
          this.v = typedArray.getBoolean(30, this.v);
          this.w = typedArray.getBoolean(23, this.w);
          this.x = typedArray.getBoolean(3, this.x);
          this.y = typedArray.getBoolean(26, this.y);
          this.r = typedArray.getResourceId(true, this.r);
          this.e = typedArray.getResourceId(15, this.e);
          this.f = typedArray.getResourceId(36, this.f);
          this.g = typedArray.getResourceId(9, this.g);
          this.h = typedArray.getResourceId(33, this.h);
          this.i = typedArray.getResourceId(25, this.i);
          this.j = typedArray.getResourceId(17, this.j);
          this.k = typedArray.getResourceId(22, this.k);
          this.l = typedArray.getResourceId(16, this.l);
          this.o = typedArray.getResourceId(14, this.o);
          this.p = typedArray.getResourceId(2, this.p);
          this.q = typedArray.getResourceId(0, this.q);
          typedArray.recycle();
       }
       this.b = 0x7f060afc;
       this.c = 0x7f06206b;
       this.d = 0x7f0609ba;
       this.e = 0x7f070576;
       this.f = 0x7f070574;
       this.g = 0x7f07056f;
       this.h = 0x7f070573;
       this.i = 0x7f070575;
       this.j = 0x7f07056d;
       this.k = 0x7f07056d;
       this.l = 0x7f07056d;
       this.m = 0x7f07056d;
       this.n = 0x7f07056d;
       this.o = 0x7f070572;
       this.p = 0x7f07056d;
       this.q = 0x7f07056d;
       this.r = 0x7f070570;
       this.x = true;
       this.z = true;
       this.A = 5;
       this.D = true;
       return;
    }
}
