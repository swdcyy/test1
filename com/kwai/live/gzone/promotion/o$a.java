package com.kwai.live.gzone.promotion.o$a;
import s67.h1;
import com.kwai.live.gzone.promotion.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import t67.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lp3.e;
import lp3.c;
import lp3.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;

public class o$a implements h1	// class@000dd1
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public boolean F7(String p0){
       o obj = PatchProxy.applyOneRefs(p0, this, o$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.D;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Iterator iterator = obj.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (TextUtils.n(iterator.next().b, p0)) {
                b = true;
             }
          }
          if (b && !PatchProxy.applyVoid(null, this, o$a.class, "1")) {
             this.b.a9();
             break ;
          }
          break ;
       }
       return b;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void pd(){
       if (PatchProxy.applyVoid(null, this, o$a.class, "1")) {
          return;
       }
       this.b.a9();
       return;
    }
    public boolean y2(){
       Object obj = PatchProxy.apply(null, this, o$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.getActivity() != null && y.d(this.b.getActivity()))? true: false;
       return b;
    }
}
