package b96.d;
import n56.b;
import java.lang.Object;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import b96.a;
import b96.b;
import b96.c;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import z1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import com.kuaishou.krn.instance.JsFramework;
import java.util.List;

public class d implements b	// class@000445
{
    public final ImmutableMap a;

    public void d(){
       super();
       this.a = ImmutableMap.builder().c("enable_water_mark", new a(this)).c("open_uri", new b(this)).c("trim_memory", new c(this)).a();
    }
    public void a(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       String str = x0.a(p0, "action");
       if (TextUtils.x(str)) {
          i.d(R.style.arg_RES_7f110668, "请传入具体指令");
          return;
       }else {
          a uoa = this.a.get(str);
          if (uoa == null) {
             i.d(R.style.arg_RES_7f110668, "无法识别的指令");
             return;
          }else {
             String str1 = x0.a(p0, "params");
             if (TextUtils.x(str1)) {
                i.d(R.style.arg_RES_7f110668, "参数不能为空");
                return;
             }else {
                uoa.accept(str1);
                return;
             }
          }
       }
    }
    public final int b(){
       KrnInternalManager obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = KrnInternalManager.c;
       return (obj.b().d(JsFramework.REACT).size() + obj.b().d(JsFramework.VUE).size());
    }
}
