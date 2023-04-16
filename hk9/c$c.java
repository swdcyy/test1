package hk9.c$c;
import com.kwai.component.tabs.panel.h$d;
import hk9.c;
import com.kwai.component.tabs.panel.h;
import ik9.i;
import java.lang.Object;
import com.kwai.component.tabs.panel.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hk9.c$a;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import al9.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.entity.QPhoto;

public final class c$c implements h$d	// class@00269d
{
    public final c a;
    public final h b;
    public final i c;

    public void c$c(c p0,h p1,i p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final h$b a(){
       Object obj = PatchProxy.apply(null, this, c$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c$c ta = this.a;
       a uoa = this.c.i(ta.q, ta.r.mPageListConfig);
       a.m(uoa);
       c$c ta1 = this.a;
       c$a uoa1 = new c$a(this.b, uoa, ta1.d, ta1.p, ta1.o);
       return obj;
    }
}
