package m1a.a;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import psb.c;
import psb.a;
import cjd.e;
import erd.o;
import la6.b;
import java.util.List;
import com.yxcorp.gifshow.detail.keyword.model.BlockKeywordListResponse;

public class a extends f	// class@002efc
{

    public void a(){
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().g().map(new e());
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (list != PatchProxyResult.class) {
       }else {
          List list1 = super.W1(p0, p1);
          if (list1 != null) {
             int i = 30;
             if (list1.size() > i) {
                list1 = list1.subList(0, i);
             }
          }
          list = list1;
       }
       return list;
    }
}
