package ak5.e;
import erd.r;
import ak5.j;
import java.lang.String;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class e implements r	// class@0000c0
{
    public final j b;
    public final String c;

    public void e(j p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean test(Object p0){
       boolean b;
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       EmotionInfo$EmotionCode obj = PatchProxy.applyTwoRefs(p0, tc, tb, j.class, "36");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && !q.f(p0.mEmotionCode)){
          p0 = p0.mEmotionCode.iterator();
          while (true) {
             if (p0.hasNext()) {
                obj = p0.next();
                if (obj != null && !q.f(obj.mCode)) {
                   Iterator iterator = obj.mCode.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (TextUtils.n(iterator.next(), tc)) {
                            b = true;
                            break ;
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
       }
       b = false;
       return b;
    }
}
