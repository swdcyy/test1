package kx8.m;
import cta.c;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import java.lang.Object;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Status;
import java.util.Objects;
import hsa.f;

public final class m implements c	// class@002c43
{
    public final OperateWebViewFragment a;

    public void m(OperateWebViewFragment p0){
       this.a = p0;
    }
    public final void a(DynamicTabConfig p0,DynamicTabConfig$Status p1){
       m ta = this.a;
       Objects.requireNonNull(ta);
       if (p1 == DynamicTabConfig$Status.CHANGE) {
          ta.G = new f(p0);
       }
       return;
    }
}
