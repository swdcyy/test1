package com.kuaishou.live.core.show.guestactivity.a;
import y8c.g;
import t02.a0;
import com.kuaishou.live.core.show.guestactivity.b$b;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n92.f;
import java.lang.Integer;
import java.lang.Number;
import g9c.a;
import n92.j;
import java.lang.CharSequence;
import android.text.TextUtils;
import n92.g0;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import n92.a0;
import ml8.c;
import com.kuaishou.live.core.show.guestactivity.b;

public class a extends g	// class@000bce
{
    public a0 w;
    public b$b x;

    public void a(a0 p0,b$b p1){
       super();
       this.w = p0;
       this.x = p1;
    }
    public void Z0(){
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(p0, this.w);
    }
    public int f0(int p0){
       j obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = null;
       j oj = this.N0(p0);
       if (oj != null) {
          obj = oj.a;
       }
       if (!TextUtils.isEmpty(obj) && g0.b(this.getItemCount(), p0)) {
          return 1;
       }else {
          return 0;
       }
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = false;
       if (!p1) {
          return new f(a.k(p0, 0x7f0d0b55, b), new a0());
       }else {
          return new f(a.k(p0, 0x7f0d0b51, b), new b(this.x));
       }
    }
}
