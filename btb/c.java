package btb.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import ctb.a;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;

public class c	// class@000469
{

    public void c(){
       super();
    }
    public static void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "3")) {
          return;
       }
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          a b = uoa.b;
          if (b instanceof NoticeBoxTextOnlyItem || b instanceof NoticeBoxVideoCardItem) {
             int i1 = i + 1;
             uoa.e = i;
             i = i1;
          }
       }
       return;
    }
}
