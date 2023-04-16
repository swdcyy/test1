package com.kwai.library.widget.refresh.a;
import com.kwai.library.widget.refresh.a$a;
import nsd.u;
import java.lang.Object;
import com.kwai.library.widget.protocol.WidgetThemeManager;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import lnc.a1;
import ll8.c$b;
import android.content.res.TypedArray;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.refresh.path.LoadingStyle;

public final class a	// class@0009d3
{
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public static a f;
    public static final a$a g;

    static {
       a.g = new a$a(null);
    }
    public void a(){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(KwaiLoadingView.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.Y1);
          a.o(typedArray, "CommonUtil.context\(\)\n   ¡­yleable.KwaiLoadingStyle\)");
          this.c = typedArray.getResourceId(2, this.c);
          this.d = typedArray.getResourceId(6, this.d);
          this.b = typedArray.getResourceId(0, this.b);
          this.e = typedArray.getInt(4, this.e);
          typedArray.recycle();
       }
       this.b = -2;
       this.c = 0x7f0710fb;
       this.d = 0x7f0710fb;
       this.e = LoadingStyle.GRADIENT.value;
       return;
    }
    public void a(u p0){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(KwaiLoadingView.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.Y1);
          a.o(typedArray, "CommonUtil.context\(\)\n   ¡­yleable.KwaiLoadingStyle\)");
          this.c = typedArray.getResourceId(2, this.c);
          this.d = typedArray.getResourceId(6, this.d);
          this.b = typedArray.getResourceId(0, this.b);
          this.e = typedArray.getInt(4, this.e);
          typedArray.recycle();
       }
       this.b = -2;
       this.c = 0x7f0710fb;
       this.d = 0x7f0710fb;
       this.e = LoadingStyle.GRADIENT.value;
       return;
    }
}
