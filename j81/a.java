package j81.a;
import n81.d;
import java.lang.Object;
import java.util.HashSet;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.Set;
import ok.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class a implements d	// class@002a5f
{
    public final Set b;

    public void a(){
       super();
       this.b = new HashSet();
    }
    public String K8(QLiveMessage p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next().apply(p0);
          if (!TextUtils.x(str)) {
             obj = obj+str+" ";
          }
       }
       return obj;
    }
    public void Yl(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.b.clear();
       return;
    }
    public void po(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.COMMENT_PREFIX_CONDITION, "LiveCommentPrefixConditionServiceImpl.registerCondition");
       this.b.add(p0);
       return;
    }
}
