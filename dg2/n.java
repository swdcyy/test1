package dg2.n;
import erd.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import dg2.d;

public final class n implements g	// class@00251b
{
    public final j b;

    public void n(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "19")) {
       }else if(QCurrentUser.me().isLogined()){
          tb.b(0, tb.d.d(), "login_in");
          tb.c(0, tb.d.d());
       }
       return;
    }
}
