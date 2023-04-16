package h2a.m$a;
import y8c.g;
import h2a.m;
import io.reactivex.subjects.PublishSubject;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h2a.m$a$a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.view.View;
import i2b.a;
import h2a.m$a$b;
import ml8.c;

public class m$a extends g	// class@00254f
{
    public PublishSubject w;
    public final m x;

    public void m$a(m p0,PublishSubject p1){
       this.x = p0;
       super();
       this.w = p1;
    }
    public f$b d1(f$b p0){
       m$a$a obj = PatchProxy.applyOneRefs(p0, this, m$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new m$a$a(this, p0);
       obj.h = this.w;
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       m$a uoa = m$a.class;
       if (PatchProxy.isSupport(uoa)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new m$a$b(this));
       return new f(a.a(this.x.getContext(), 0x7f0d109a), presenterV2);
    }
}
