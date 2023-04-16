package an9.a$b;
import ha5.e;
import an9.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPreInfo;
import fg6.a;
import com.google.gson.Gson;
import oe6.e;
import com.kwai.framework.model.feed.BaseFeed;
import ha5.d;
import android.util.Pair;
import io.reactivex.subjects.PublishSubject;
import wkd.b;
import zc5.b;
import vm5.h$a;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;

public class a$b implements e	// class@000101
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,int p5){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       e.k0(a.a.q(QPreInfo.createPreInfo(p0, p1, p2, p3, p4, p5)));
       return;
    }
    public void b(BaseFeed p0,int p1){
       d.c(this, p0, p1);
    }
    public void c(BaseFeed p0,int p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       this.a.p.onNext(new Pair(p0, Integer.valueOf(p1)));
       b.a(-869999145).k(p0.getId());
       return;
    }
    public void d(h$a p0,int p1){
       d.e(this, p0, p1);
    }
    public int[] e(CoverMeta p0,CommonMeta p1){
       return d.a(this, p0, p1);
    }
}
