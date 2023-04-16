package k0a.c$a;
import qvb.q;
import k0a.c;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import sy6.a;

public class c$a implements q	// class@002b92
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       c s = this.b.s;
       if (s != null && p0) {
          if (TextUtils.x(s.mRepositionPCursor)) {
             return;
          }else {
             int i = Integer.parseInt(this.b.s.mRepositionPCursor);
             if (this.b.r.a0() != i && (i >= 0 && i < this.b.r.Q())) {
                this.b.r.k(i, true);
             }
          }
       }
       return;
    }
}
