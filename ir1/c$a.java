package ir1.c$a;
import erd.g;
import ir1.c;
import java.lang.Object;
import nh3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import f02.a;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import pq1.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.core.show.multiline.LiveMultiLineCellLayoutDescription;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.utility.SystemUtil;

public final class c$a implements g	// class@002985
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Iterator iterator;
       b a;
       b b5;
       Object obj = this;
       List obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c$a.class, str)) {
       }else if(obj1 != null){
          c$a b = obj.b;
          Objects.requireNonNull(b);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          c uoc = c.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, uoc, str)) {
             obj1 = a.d(obj1);
             if (obj1 != null) {
                a.o(obj1, "LiveMultiLineConvertUtil\x20\x02oList\(roomInfo\) ?: return\x00");
                if (a.g(b.c.getValue(), Boolean.FALSE)) {
                   b.c.setValue(Boolean.TRUE);
                }
                c b1 = b.b;
                HashMap obj2 = PatchProxy.applyTwoRefs(b1, obj1, b, uoc, "4");
                boolean b2 = false;
                if (obj2 != patchProxyRe) {
                   b2 = obj2.booleanValue();
                }else {
                   b.Z(LiveLogTag.LIVE_MULTI_LINE, "localUserList = "+b1+",  newUserList = "+obj1);
                   if (b1.size() == obj1.size()) {
                      int i = b1.size();
                      int i1 = 0;
                      while (i1 < i) {
                         a uoa2 = b1.get(i1);
                         a uoa3 = obj1.get(i1);
                         b5 = (!uoa2.h.userId - uoa3.h.userId && (!uoa2.a - uoa3.a && (!uoa2.c - uoa3.c && (!uoa2.b - uoa3.b && !uoa2.d - uoa3.d))))? 1: null;
                         if (b5) {
                            i1 = i1 + 1;
                         }
                      }
                   }
                   b2 = true;
                }
                if (b2) {
                   b.b.clear();
                   b.b.addAll(obj1);
                   c b3 = b.b;
                   ArrayList uArrayList = PatchProxy.applyOneRefs(b3, b, uoc, "2");
                   if (uArrayList != patchProxyRe) {
                   }else {
                      uArrayList = new ArrayList();
                      iterator = b3.iterator();
                      while (iterator.hasNext()) {
                         a uoa1 = iterator.next();
                         b a1 = uoa1.a;
                         float f2 = uoa1.c + a1;
                         b5 = uoa1.b;
                         float f3 = uoa1.d + b5;
                         uArrayList.add(new LiveMultiLineCellLayoutDescription(a1, f2, b5, f3));
                      }
                   }
                   b3 = b.b;
                   obj2 = PatchProxy.applyOneRefs(b3, b, uoc, "3");
                   if (obj2 != patchProxyRe) {
                   }else {
                      obj2 = new HashMap();
                      iterator = b3.iterator();
                      while (iterator.hasNext()) {
                         a uoa = iterator.next();
                         a = uoa.a;
                         float f = uoa.c + a;
                         b b4 = uoa.b;
                         float f1 = uoa.d + b4;
                         obj2.put(String.valueOf(uoa.h.userId), new LiveMultiLineCellLayoutDescription(a, f, b4, f1));
                      }
                   }
                   if (SystemUtil.I()) {
                      b3 = b.b;
                      if (!PatchProxy.applyVoidTwoRefs(b3, uArrayList, b, uoc, "5")) {
                         StringBuilder str1 = "";
                         iterator = b3.iterator();
                         while (iterator.hasNext()) {
                            str1 = str1+"user:"+iterator.next().h.userId+"/n";
                         }
                         iterator = uArrayList.iterator();
                         while (iterator.hasNext()) {
                            str1 = str1+"description:"+iterator.next()+"/n";
                         }
                         b.c0(LiveLogTag.LIVE_MULTI_LINE, "render_layout", "dump: ", str1);
                      }
                   }
                   b.e.setValue(obj2);
                   b.d.setValue(b.b);
                }
             }
          }
       }
       return;
    }
}
