package com.kuaishou.recruit.live.rightpendant.anchor.a$a;
import yt4.a;
import com.kuaishou.recruit.live.rightpendant.anchor.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;
import sr5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yt4.b;
import java.lang.Boolean;

public class a$a extends a	// class@000ed0
{
    public final a h;

    public void a$a(a p0){
       this.h = p0;
       super();
    }
    public View H(){
       return this.h.t;
    }
    public int g(){
       return this.h.z;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       b uob = this.h.r.b();
       a v = this.h.v;
       String str = (TextUtils.x(v))? "EMPTY": "PUT_ON";
       b.a(uob, null, v, str, this.h.R8(), this.h.W8());
       return;
    }
    public void o(boolean p0){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a$a.class, "3")) {
          return;
       }
       p0.w = false;
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.h.w = true;
       return;
    }
}
