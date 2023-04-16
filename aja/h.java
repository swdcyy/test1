package aja.h;
import java.lang.Runnable;
import aja.j;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import k2b.e0;
import java.lang.Object;
import x2b.a;
import pa5.n;
import pa5.a;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import aja.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ra5.c;

public final class h implements Runnable	// class@00008e
{
    public final j b;
    public final QPhoto c;
    public final int d;
    public final View e;
    public final e0 f;

    public void h(j p0,QPhoto p1,int p2,View p3,e0 p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       d uod;
       int i;
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       h tf = this.f;
       a c = tb.c;
       c = (c instanceof n)? c.u1(): null;
       if (FollowConfigUtil.g() && c == null) {
          uod = new d(tb);
       }
       a uoa = uod;
       Object obj = PatchProxy.applyOneRefs(tc, tb, j.class, "10");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(tc == null){
          if (tc.isTemplate()) {
             i = 449;
          }else if(tc.isCityHotSpot()){
             i = 1324;
          }
       }
       i = 804;
       c.g(tc, td, i, te, tf, uoa);
       return;
    }
}
