package hz0.b$a;
import ug1.r;
import hz0.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import i81.g;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import java.util.Stack;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import z12.x;

public class b$a implements r	// class@0027ca
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(String p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (this.a.p.R6()) {
          b.d0(this.a.q, "updateAnimationItemViewLocation", "key", p0, "contentDisplayHeight", Integer.valueOf(p1));
          return;
       }else if(!this.a.x.containsKey(p0)){
          this.a.w.push(p0);
          this.a.R8(p1);
       }else if(!this.a.w.empty() && TextUtils.n(p0, this.a.w.peek())){
          this.a.R8(p1);
       }
       this.a.x.put(p0, Integer.valueOf(p1));
       return;
    }
    public void b(String p0){
       b$a ta;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       if (this.a.p.R6()) {
          b.c0(this.a.q, "updateAnimationItemViewLocation", "key", p0);
          return;
       }else if(!this.a.w.empty() && TextUtils.n(p0, this.a.w.peek())){
          this.a.w.pop();
          while (!this.a.w.empty()) {
             ta = this.a;
             if (!ta.x.containsKey(ta.w.peek())) {
                this.a.w.pop();
             }else {
                break ;
             }
          }
          ta = null;
          if (!this.a.w.empty()) {
             str = this.a.w.peek();
          }
          b$a ta1 = this.a;
          ta1.R8(x.n(ta1.x, str, Integer.valueOf(0)).intValue());
       }
       this.a.x.remove(p0);
       return;
    }
}
