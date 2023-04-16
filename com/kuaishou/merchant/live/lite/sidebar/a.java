package com.kuaishou.merchant.live.lite.sidebar.a;
import com.kuaishou.live.lite.sidebar.e$a;
import java.lang.Object;
import fd3.l;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.live.lite.sidebar.a$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;
import com.kuaishou.live.lite.sidebar.e$b;
import fd3.m;
import java.util.List;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ha1.b;

public class a implements e$a	// class@001a33
{
    public a$a a;
    public View$OnClickListener b;

    public void a(){
       super();
    }
    public void a(){
       l.c(this);
    }
    public JsonObject b(){
       return l.a(this);
    }
    public boolean c(){
       return l.e(this);
    }
    public JsonObject d(){
       return l.b(this);
    }
    public void e(){
       a a;
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, a$a.class, "1")) {
             a = ta.f.a;
             if (a != null) {
                a.a.setOnClickListener(null);
             }
             ta.c.t();
             ta.c.u();
             ta.c.j(true);
          }
          this.a = null;
       }
       return;
    }
    public View f(){
       return m.b(this);
    }
    public List g(){
       return m.a(this);
    }
    public String getLogName(){
       return "SHOP";
    }
    public void h(){
       m.c(this);
    }
    public void i(){
       m.d(this);
    }
    public int j(){
       return 7;
    }
    public View k(Context p0,JsonObject p1,boolean p2){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
       }else if(this.a == null){
          ViewGroup viewGroup = b.b(p0, R.layout.arg_RES_7f0d07f9);
          this.a = new a$a(this, viewGroup, p1);
          a tb = this.b;
          if (tb != null) {
             viewGroup.setOnClickListener(tb);
          }
       }
       obj = this.a;
       return obj.a;
    }
}
