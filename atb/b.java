package atb.b;
import a9c.e;
import java.lang.Object;
import ctb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;

public final class b extends e	// class@000302
{

    public void b(){
       super();
    }
    public boolean a(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 == null || p1 == null){
          b = false;
       }else {
          b = k.a(p0, p1);
       }
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 == null || (p1 == null || p0.d != p1.d)){
          p0 = p0.b;
          p1 = p1.b;
          if (p0 == p1) {
             b = true;
          }else if(p0 instanceof NoticeBoxBaseItem && p1 instanceof NoticeBoxBaseItem){
             b = k.a(p0.mNotifyId, p1.mNotifyId);
          }
       }
       b = false;
       return b;
    }
}
