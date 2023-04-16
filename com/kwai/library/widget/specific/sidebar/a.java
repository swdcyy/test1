package com.kwai.library.widget.specific.sidebar.a;
import com.kwai.library.widget.specific.sidebar.a$a;
import nsd.u;
import java.lang.Object;
import com.kwai.library.widget.protocol.WidgetThemeManager;
import com.kwai.library.widget.specific.sidebar.SideBarLayout;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import lnc.a1;
import ll8.c$b;
import android.content.res.TypedArray;
import kotlin.jvm.internal.a;

public final class a	// class@000a29
{
    public final int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public static a i;
    public static final a$a j;

    static {
       a.j = new a$a(null);
    }
    public void a(){
       super();
       int i = WidgetThemeManager.INSTANCE.findThemeId(SideBarLayout.class.getName());
       this.a = i;
       if (i == -1) {
       }else {
          TypedArray typedArray = a1.c().obtainStyledAttributes(i, c$b.c5);
          a.o(typedArray, "CommonUtil.context\(\).obt¡­eId, R.styleable.SideBar\)");
          this.b = typedArray.getBoolean(6, this.b);
          this.c = typedArray.getResourceId(true, this.c);
          this.d = typedArray.getResourceId(5, this.d);
          this.e = typedArray.getResourceId(0, this.e);
          this.f = typedArray.getResourceId(4, this.f);
          this.g = typedArray.getResourceId(2, this.g);
          this.h = typedArray.getResourceId(3, this.h);
          typedArray.recycle();
       }
       this.b = true;
       this.c = 0x7f070e90;
       this.d = 0x7f070e91;
       this.e = 0x7f062159;
       this.f = 0x7f06215b;
       this.g = 0x7f060af1;
       this.h = 0x7f070e8f;
       return;
    }
}
