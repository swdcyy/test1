package com.kwai.library.widget.progressbar.a;
import com.kwai.library.widget.progressbar.a$a;
import nsd.u;
import java.lang.Object;
import com.kwai.library.widget.protocol.WidgetThemeManager;
import com.kwai.library.widget.progressbar.StepProgressBar;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import lnc.a1;
import ll8.c$b;
import android.content.res.TypedArray;
import kotlin.jvm.internal.a;

public final class a	// class@0009b5
{
    public final int a;
    public int b;
    public int c;
    public int d;
    public static a e;
    public static final a$a f;

    static {
       a.f = new a$a(null);
    }
    public void a(){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(StepProgressBar.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.u5);
          a.o(typedArray, "CommonUtil.context\(\)\n   ¡­tyleable.StepProgressBar\)");
          this.b = typedArray.getResourceId(1, this.b);
          this.c = typedArray.getResourceId(2, this.c);
          this.d = typedArray.getResourceId(0, this.d);
          typedArray.recycle();
       }
       this.b = 0x7f062143;
       this.c = 0x7f0710f5;
       this.d = 10;
       return;
    }
    public void a(u p0){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(StepProgressBar.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.u5);
          a.o(typedArray, "CommonUtil.context\(\)\n   ¡­tyleable.StepProgressBar\)");
          this.b = typedArray.getResourceId(1, this.b);
          this.c = typedArray.getResourceId(2, this.c);
          this.d = typedArray.getResourceId(0, this.d);
          typedArray.recycle();
       }
       this.b = 0x7f062143;
       this.c = 0x7f0710f5;
       this.d = 10;
       return;
    }
}
