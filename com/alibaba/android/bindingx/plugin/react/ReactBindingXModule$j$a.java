package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$j$a;
import java.lang.Runnable;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$j;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import x5.i$c;
import java.util.Map;
import com.facebook.react.uimanager.f;
import z5.c;
import z5.f;

public class ReactBindingXModule$j$a implements Runnable	// class@000e2a
{
    public final String b;
    public final int c;
    public final View d;
    public final Object e;
    public final i$c f;
    public final Map g;
    public final f h;
    public final ReactBindingXModule$j i;

    public void ReactBindingXModule$j$a(ReactBindingXModule$j p0,String p1,int p2,View p3,Object p4,i$c p5,Map p6,f p7){
       this.i = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       super();
    }
    public void run(){
       f.a(this.b).a(this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
