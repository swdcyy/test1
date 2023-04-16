package com.kwai.library.widget.button.a;
import com.kwai.library.widget.button.a$a;
import nsd.u;
import java.lang.Object;
import com.kwai.library.widget.protocol.WidgetThemeManager;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import lnc.a1;
import ll8.c$b;
import android.content.res.TypedArray;
import kotlin.jvm.internal.a;

public final class a	// class@00090f
{
    public final int a;
    public boolean b;
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
       int i = WidgetThemeManager.INSTANCE.findThemeId(SlipSwitchButton.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.k5);
          a.o(typedArray, "CommonUtil.context\(\)\n   ¡­yleable.SlipSwitchButton\)");
          this.c = typedArray.getResourceId(3, this.c);
          this.d = typedArray.getResourceId(1, this.d);
          this.e = typedArray.getResourceId(6, this.e);
          this.b = typedArray.getBoolean(5, this.b);
          typedArray.recycle();
       }
       this.c = 0x7f062108;
       this.d = 0x7f062107;
       this.e = 0x7f062109;
       return;
    }
    public void a(u p0){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(SlipSwitchButton.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.k5);
          a.o(typedArray, "CommonUtil.context\(\)\n   ¡­yleable.SlipSwitchButton\)");
          this.c = typedArray.getResourceId(3, this.c);
          this.d = typedArray.getResourceId(1, this.d);
          this.e = typedArray.getResourceId(6, this.e);
          this.b = typedArray.getBoolean(5, this.b);
          typedArray.recycle();
       }
       this.c = 0x7f062108;
       this.d = 0x7f062107;
       this.e = 0x7f062109;
       return;
    }
}
