package bq6.w2;
import java.util.concurrent.Callable;
import bq6.x2;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import com.kwai.imsdk.d;
import java.lang.Integer;
import java.lang.String;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.imsdk.model.tag.KwaiIMConversationTagDao;
import cp6.x;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.model.tag.KwaiIMConversationTagDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.util.Collection;
import java.lang.Throwable;
import l85.b;
import nq6.s;
import com.kwai.imsdk.internal.util.b;
import java.util.Map;

public final class w2 implements Callable	// class@0005c9
{
    public final x2 b;
    public final List c;
    public final long d;

    public void w2(x2 p0,List p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       w2 tb = this.b;
       w2 td = this.d;
       x2 b = tb.b;
       Objects.requireNonNull(b);
       ArrayList uArrayList = new ArrayList();
       HashMap hashMap = new HashMap();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (hashMap.containsKey(Integer.valueOf(uod.getTargetType()))) {
             hashMap.get(Integer.valueOf(uod.getTargetType())).add(uod.getTarget());
          }else {
             ArrayList uArrayList1 = new ArrayList();
             uArrayList1.add(uod.getTarget());
             hashMap.put(Integer.valueOf(uod.getTargetType()), uArrayList1);
          }
       }
       iterator = hashMap.entrySet().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          try{
             WhereCondition[] whereConditi = new WhereCondition[i];
             WhereCondition[] whereConditi1 = new WhereCondition[i];
             uArrayList.addAll(b.a().queryBuilder().where(KwaiIMConversationTagDao$Properties.TargetType.eq(uEntry.getKey()), whereConditi).where(KwaiIMConversationTagDao$Properties.TargetId.in(uEntry.getValue()), whereConditi1).list());
          }catch(java.lang.Exception e6){
             b.g(e6);
             goto label_0069 ;
          }
       }
       s os = s.t(tb.a);
       if (!b.c(uArrayList)) {
          i = uArrayList.size();
       }
       Map map = os.x("IMSDK.ConversationTag.Fetch");
       map.put("tagCount", Integer.valueOf(i));
       os.b(map, td);
       os.E(map, 0.00f);
       return uArrayList;
    }
}
