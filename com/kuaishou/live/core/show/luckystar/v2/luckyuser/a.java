package com.kuaishou.live.core.show.luckystar.v2.luckyuser.a;
import y8c.g;
import yb2.i;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import g9c.a;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.luckystar.v2.luckyuser.a$a;
import ml8.c;
import com.kuaishou.live.core.show.luckystar.v2.luckyuser.a$b;

public class a extends g	// class@000d02
{
    public final i w;
    public final String x;
    public String y;

    public void a(i p0,String p1){
       super();
       this.w = p0;
       this.x = p1;
    }
    public final int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == (this.getItemCount() - 1) && !TextUtils.isEmpty(this.y)) {
          return 1;
       }else {
          return 0;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (super.getItemCount() + (TextUtils.isEmpty(this.y) ^ 0x01));
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 1) {
          return new f(a.i(p0, 0x7f0d0c7e), new a$a(this));
       }else {
          return new f(a.i(p0, 0x7f0d0c7c), new a$b(this));
       }
    }
    public void r1(String p0){
       this.y = p0;
    }
}
