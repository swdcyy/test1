package fg0.k;
import fg0.k$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import o56.c;
import o56.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.util.List;
import java.util.Collection;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import fg6.a;
import com.google.gson.Gson;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg0.k$b;
import java.lang.reflect.Type;
import el.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.Throwable;
import java.util.Map;

public class k	// class@00232d
{
    public final SharedPreferences a;
    public final ConcurrentHashMap b;
    public static final k$a c;

    static {
       k.c = new k$a(null);
    }
    public void k(){
       super();
       this.b = new ConcurrentHashMap();
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       SharedPreferences sharedPrefer = b.c(uoc.a(), "task_pendant_data", 0);
       a.o(sharedPrefer, "KwaiSharedPreferences.ob¡­ME, Context.MODE_PRIVATE\)");
       this.a = sharedPrefer;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.b.clear();
       return;
    }
    public final void b(TaskCommonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       a.p(p0, "params");
       List list = this.c();
       boolean b = (list == null || list.isEmpty())? true: false;
       if (b) {
          return;
       }else if(list.remove(p0) && !p0.getMDisableStoreTask()){
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          g.a(this.a.edit().putString("TaskPendantData_"+qCurrentUser.getId(), a.a.q(list)));
       }
       return;
    }
    public final List c(){
       Object[] objArray = null;
       QCurrentUser obj = PatchProxy.apply(objArray, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.me();
       String str = "QCurrentUser.me\(\)";
       a.o(obj, str);
       String id = obj.getId();
       a.o(id, "userId");
       if (Long.parseLong(id) - null <= 0) {
          return objArray;
       }
       if (this.b.containsKey(id)) {
          return this.b.get(id);
       }
       ArrayList uArrayList = new ArrayList();
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, str);
       String str1 = this.a.getString("TaskPendantData_"+qCurrentUser.getId(), objArray);
       if (!TextUtils.x(str1)) {
          Iterator obj1 = a.a.i(str1, new k$b().getType());
          a.o(obj1, "Gsons.KWAI_GSON.fromJson\x20\x02ommonParams>?>\(\) {}.type\)\x00");
          ArrayList uArrayList1 = new ArrayList();
          obj1 = obj1.iterator();
          while (obj1.hasNext()) {
             Object obj2 = obj1.next();
             int i = obj2.getMDisableStoreTask() ^ 0x01;
             if (i) {
                uArrayList1.add(obj2);
             }
          }
          uArrayList.addAll(uArrayList1);
       }
       this.b.put(id, uArrayList);
       return uArrayList;
    }
    public final void d(TaskCommonParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       a.p(p0, "params");
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "TaskDataManager", "updateTaskParams: mEventType: "+p0.getMTaskTypeId(), false, 4, null);
       List list = this.c();
       if (list == null) {
          TaskCenterLogUtil.e(b, "TaskDataManager", "updateTaskParams failed, taskList is null", false, 4, null);
          return;
       }else {
          int i = list.indexOf(p0);
          if (i >= 0) {
             list.remove(i);
          }
          list.add(p0);
          if (!p0.getMDisableStoreTask()) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             g.a(this.a.edit().putString("TaskPendantData_"+qCurrentUser.getId(), a.a.q(list)));
          }
          return;
       }
    }
}
