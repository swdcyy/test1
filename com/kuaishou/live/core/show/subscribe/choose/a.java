package com.kuaishou.live.core.show.subscribe.choose.a;
import y8c.g;
import qk2.a;
import com.kuaishou.live.core.show.subscribe.choose.a$c;
import com.kuaishou.live.core.show.subscribe.choose.a$a;
import a9c.e;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Number;
import g9c.a;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.subscribe.choose.a$f;
import ml8.c;
import com.kuaishou.live.core.show.subscribe.choose.a$b;
import com.kuaishou.live.core.show.subscribe.choose.a$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.subscribe.choose.a$e;

public class a extends g	// class@0010d1
{
    public a w;

    public void a(a p0){
       super(new a$c(null));
       this.w = p0;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.g.put("KEY_LISTENER", this.w.a);
       p0.g.put("KEY_CONTEXT", this.w);
       p0.g.put("KEY_RELATE_TIPS", TextUtils.k(this.w.d));
       p0.g.put("KEY_SELECT_HINT", TextUtils.k(this.w.e));
       return p0;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 >= super.getItemCount()) {
          return 2;
       }else {
          return 1;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int itemCount = super.getItemCount();
       if (itemCount > 0) {
          itemCount = itemCount + 1;
       }
       return itemCount;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a$a uoa1 = null;
       if (p1 == 2) {
          return new f(a.k(p0, 0x7f0d0de9, false), new a$f(uoa1));
       }else {
          a$b uob = new a$b(uoa1);
          if (this.w.b > 1) {
             uob.U7(new a$d(uoa1));
          }else {
             uob.U7(new a$e(uoa1));
          }
          return new f(a.k(p0, 0x7f0d0de8, false), uob);
       }
    }
}
