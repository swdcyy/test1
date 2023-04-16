package com.kwai.library.widget.textview.c;
import com.kwai.library.widget.textview.c$a;
import nsd.u;
import java.lang.Object;
import com.kwai.library.widget.protocol.WidgetThemeManager;
import com.kwai.library.widget.textview.KwaiBadgeView;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import lnc.a1;
import ll8.c$b;
import android.content.res.TypedArray;
import kotlin.jvm.internal.a;

public final class c	// class@000a62
{
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public static c j;
    public static final c$a k;

    static {
       c.k = new c$a(null);
    }
    public void c(){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(KwaiBadgeView.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.D1);
          a.o(typedArray, "CommonUtil.context\(\)\n   бн.styleable.KwaiBadgeView\)");
          this.e = typedArray.getResourceId(4, this.e);
          this.f = typedArray.getResourceId(2, this.f);
          this.g = typedArray.getResourceId(8, this.g);
          this.h = typedArray.getResourceId(6, this.h);
          this.i = typedArray.getResourceId(9, this.i);
          this.b = typedArray.getResourceId(0, this.b);
          this.c = typedArray.getResourceId(1, this.c);
          this.d = typedArray.getResourceId(10, this.d);
          typedArray.recycle();
       }
       this.b = 0x7f060097;
       this.c = 0x7f060098;
       this.d = 0x7f0606da;
       this.e = 0x7f0710b4;
       this.f = 0x7f0710b1;
       this.g = 0x7f0710b2;
       this.h = 0x7f0710b3;
       this.i = 0x7f0710b1;
       return;
    }
    public void c(u p0){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(KwaiBadgeView.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.D1);
          a.o(typedArray, "CommonUtil.context\(\)\n   бн.styleable.KwaiBadgeView\)");
          this.e = typedArray.getResourceId(4, this.e);
          this.f = typedArray.getResourceId(2, this.f);
          this.g = typedArray.getResourceId(8, this.g);
          this.h = typedArray.getResourceId(6, this.h);
          this.i = typedArray.getResourceId(9, this.i);
          this.b = typedArray.getResourceId(0, this.b);
          this.c = typedArray.getResourceId(1, this.c);
          this.d = typedArray.getResourceId(10, this.d);
          typedArray.recycle();
       }
       this.b = 0x7f060097;
       this.c = 0x7f060098;
       this.d = 0x7f0606da;
       this.e = 0x7f0710b4;
       this.f = 0x7f0710b1;
       this.g = 0x7f0710b2;
       this.h = 0x7f0710b3;
       this.i = 0x7f0710b1;
       return;
    }
}
