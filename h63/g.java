package h63.g;
import android.view.View;
import j47.c;
import java.lang.Object;
import h63.g$a;
import com.kwai.library.widget.textview.DrawableCenterTextView;
import android.widget.TextView;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h63.c;
import h63.d;
import h63.e;
import h63.f;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import r0.a;
import androidx.core.graphics.drawable.a;
import h63.g$b;
import f37.o0;
import tkd.b;
import tkd.d;
import os5.h;
import java.lang.Boolean;
import d61.f0;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;

public class g	// class@002c7d
{
    public final Context a;
    public View b;
    public View c;
    public DrawableCenterTextView d;
    public TextView e;
    public g$a f;
    public g$b g;
    public g$b h;
    public g$b i;
    public g$b j;
    public g$b k;
    public c l;
    public AnimatorSet m;

    public void g(View p0,c p1){
       super();
       this.f = new g$a(this);
       this.l = p1;
       this.b = p0.findViewById(0x7f0a1f8e);
       this.c = p0.findViewById(0x7f0a1f8f);
       this.d = p0.findViewById(0x7f0a1f8d);
       this.e = p0.findViewById(0x7f0a1f90);
       this.a = p0.getContext();
       if (PatchProxy.applyVoid(null, this, g.class, "13")) {
       }else {
          this.i = new c(this);
          this.h = new d(this);
          this.j = new e(this);
          this.k = new f(this);
       }
       return;
    }
    public static Drawable b(Context p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, g.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          Drawable uDrawable = a.d(p0, p1);
          if (uDrawable == null) {
             return null;
          }else {
             uDrawable = a.r(uDrawable);
             a.n(uDrawable, p2);
             return uDrawable;
          }
       }
    }
    public final void a(g$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "11")) {
          return;
       }
       this.g = p0;
       p0.a();
       return;
    }
    public void c(int p0){
       Object obj;
       String str1;
       g og = g.class;
       String str = "7";
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, str)) {
          return;
       }
       if (p0 > 0) {
          this.e.setVisibility(0);
          og = this.e;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (PatchProxy.isSupport(o0.class)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, o0.class, "6");
             if (obj != patchProxyRe) {
             }else {
             label_003b :
                boolean b = d.a(0x2cb5d4a8).pd();
                if (PatchProxy.isSupport(o0.class)) {
                   Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(b), null, o0.class, str);
                   if (obj1 != patchProxyRe) {
                      obj = obj1;
                   }
                }
                if (b) {
                   str1 = f0.k((long)p0);
                }else if(p0 >= 0x5f5e100){
                   str1 = TextUtils.N(0x5f5b9f0)+"+";
                }else {
                   str1 = TextUtils.N((long)p0);
                }
                obj = str1;
             }
          }else {
             goto label_003b ;
          }
          og.setText(obj);
       }else {
          this.e.setVisibility(8);
       }
       return;
    }
    public void d(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "9")) {
          return;
       }
       this.d.setText(R.string.arg_RES_7f102128);
       if (p0) {
          this.a(this.k);
       }else {
          this.a(this.j);
       }
       return;
    }
    public void e(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "10")) {
          return;
       }
       if (p0) {
          this.d.setText(R.string.arg_RES_7f101034);
          this.a(this.h);
       }else {
          this.d.setText(R.string.arg_RES_7f100f8f);
          this.a(this.i);
       }
       return;
    }
}
