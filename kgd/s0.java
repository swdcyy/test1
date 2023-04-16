package kgd.s0;
import a17.b$b;
import com.yxcorp.plugin.setting.entries.holder.y$a;
import java.lang.Object;
import a17.c;
import android.view.View;
import com.yxcorp.plugin.setting.entries.holder.y;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import k2b.e0;
import java.lang.String;
import sgd.b;

public final class s0 implements b$b	// class@0017b5
{
    public final y$a a;

    public void s0(y$a p0){
       this.a = p0;
    }
    public final void a(c p0,View p1,int p2){
       s0 ta = this.a;
       int i = 3;
       if (!p2) {
          p2 = 2;
       }else if(p2 == 1){
          p2 = 3;
       }else {
          p2 = 1;
       }
       y$a r = ta.r;
       r.f = p2;
       r.g.onNext(Integer.valueOf(p2));
       y a = ta.r.a;
       if (p2 == 1) {
          i = 5;
       }else if(p2 != 2 && p2 == i){
          i = 7;
       }else {
          i = 6;
       }
       b.k(a, "ONLINE_STATUS", i);
       return;
    }
}
