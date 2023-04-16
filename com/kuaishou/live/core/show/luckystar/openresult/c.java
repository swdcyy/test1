package com.kuaishou.live.core.show.luckystar.openresult.c;
import y8c.g;
import yb2.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import g9c.a;
import java.lang.Number;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.luckystar.openresult.c$b;
import ml8.c;
import com.kuaishou.live.core.show.luckystar.openresult.c$c;
import com.kuaishou.live.core.show.luckystar.openresult.c$a;

public class c extends g	// class@000ce7
{
    public i w;
    public View x;
    public int y;
    public String z;

    public void c(i p0){
       super();
       this.y = -1;
       this.w = p0;
    }
    public Object N0(int p0){
       Object obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
          }else if(!p0 || (p0 == (this.getItemCount() - 1) && !TextUtils.isEmpty(this.z))){
             obj = null;
          }else {
             p0--;
             obj = super.N0(p0);
          }
       }else {
          goto label_0019 ;
       }
       return obj;
    }
    public final int f0(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          return 0;
       }else if(p0 == (this.getItemCount() - 1) && !TextUtils.isEmpty(this.z)){
          return 2;
       }else {
          return 1;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((super.getItemCount() + 1) + (TextUtils.isEmpty(this.z) ^ 0x01));
    }
    public f h1(ViewGroup p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1) {
          this.x = a.i(p0, 0x7f0d0c7f);
          return new f(this.x, new c$b(this));
       }else if(p1 == 1){
          return new f(a.i(p0, 0x7f0d0c82), new c$c(this));
       }else {
          return new f(a.i(p0, 0x7f0d0c7d), new c$a(this));
       }
    }
    public void r1(int p0){
       this.y = p0;
    }
    public void s1(String p0){
       this.z = p0;
    }
}
