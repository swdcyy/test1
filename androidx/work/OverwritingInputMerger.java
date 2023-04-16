package androidx.work.OverwritingInputMerger;
import k3.f;
import java.util.List;
import androidx.work.a;
import androidx.work.a$a;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map;

public final class OverwritingInputMerger extends f	// class@000a51
{

    public void OverwritingInputMerger(){
       super();
    }
    public a b(List p0){
       a$a uoa = new a$a();
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          hashMap.putAll(iterator.next().h());
       }
       uoa.d(hashMap);
       return uoa.a();
    }
}
