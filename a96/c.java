package a96.c;
import java.lang.Runnable;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import com.kwai.framework.krn.init.preload.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lj0.c;
import zj0.v;
import sj0.b;
import com.facebook.react.a;
import ae.e;
import me.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import a96.h;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Map;
import java.lang.StringBuilder;

public final class c implements Runnable	// class@000045
{
    public final LaunchModel b;

    public void c(LaunchModel p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       a uoa = a.M();
       Objects.requireNonNull(uoa);
       if (PatchProxy.applyVoidOneRefs(tb, uoa, a.class, "11")) {
       }else {
          uoa.Z("\x27\x02 \x5f\x02\x52\x02\x59\x02\x4e\x02\x5f\x02\x53\x02\x80\x02\x6a\x02\x5f\x02\x00");
          c uoc = a.M().D();
          if (uoc != null && uoc.i() != null) {
             a uoa1 = uoc.r().o().y();
             if (uoa1 != null) {
                String str = uoa1.l();
                String str1 = uoa.N(str);
                if (!TextUtils.x(str1)) {
                   uoa.Q(str1, tb);
                }else {
                   uoa.Z("跟目录下没有网络优化配置文件,可能是单仓多bundle项目");
                   str1 = uoa.O(str, "optimize.path.config.json");
                   if (!TextUtils.x(str1)) {
                      str1 = a.a.i(str1, new h(uoa).getType()).get(tb.a());
                      if (!TextUtils.x(str1)) {
                         String str2 = "./";
                         if (str1.startsWith(str2)) {
                            str1 = str1.replace(str2, "/");
                         }
                         str = uoa.N(str+str1);
                         if (!TextUtils.x(str)) {
                            uoa.Q(str, tb);
                         }else {
                            uoa.Y("没有获取到代码仓库下的网络优化配置");
                         }
                      }else {
                         uoa.Y("没有获取到代码仓库下的网络优化配置");
                      }
                   }else {
                      uoa.Y("没有获取到代码仓库下的网络优化配置");
                   }
                }
             }
          }
       }
       return;
    }
}
