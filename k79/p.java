package k79.p;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import k79.p$a;
import nsd.u;
import android.content.Context;
import android.database.Cursor;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import k79.i;
import k79.i$a;
import com.yxcorp.gifshow.models.QMedia;

public final class p extends BaseLoaderImpl	// class@002b5e
{
    public static final p$a n;

    static {
       p.n = new p$a(null);
    }
    public void p(Context p0,int p1,Cursor p2,MediaFilterList p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = new MediaFilterList();
       }
       a.q(p0, "context");
       a.q(p3, "filter");
       super(p0, p1, null, p3);
       return;
    }
    public Cursor q(int p0){
       String[] obj;
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, op, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new String[]{"screenshot","screenrecord"};
       return i.e.b(p0, CollectionsKt__CollectionsKt.P(obj));
    }
    public QMedia v(int p0,Cursor p1){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, op, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return i.e.m(p1);
    }
}
