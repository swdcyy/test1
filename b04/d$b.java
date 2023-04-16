package b04.d$b;
import tu.i;
import b04.d;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zz3.b;
import java.util.Objects;
import fg6.a;
import com.kuaishou.merchant.home2.main.dataPreProcess.PreData;
import com.google.gson.Gson;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.StringBuilder;
import java.lang.Exception;
import p74.a;
import o74.a;

public class d$b implements i	// class@0002f4
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public List a(JsonElement p0){
       List list;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       b obj = PatchProxy.applyOneRefs(p0, this, d$b.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = b.a;
          Objects.requireNonNull(obj);
          list = PatchProxy.applyOneRefs(p0, obj, b.class, str);
          if (list != patchProxyRe) {
          }else {
             PreData preData = a.a.c(p0, PreData.class);
             List liveStreamVi = (preData != null)? preData.getLiveStreamViews(): null;
             b = (liveStreamVi == null || liveStreamVi.isEmpty())? true: false;
             if (b) {
                list = CollectionsKt__CollectionsKt.E();
             }else {
                list = new ArrayList();
                List liveStreamVi1 = preData.getLiveStreamViews();
                if (liveStreamVi1 != null) {
                   Iterator iterator = liveStreamVi1.iterator();
                   while (iterator.hasNext()) {
                      list.add(iterator.next());
                   }
                }
             }
          }
       }catch(java.lang.Exception e5){
          a.A(MerchantHomeLogBiz.Common, "DataPreProcessor", "json parse error:"+e5.getMessage());
          list = CollectionsKt__CollectionsKt.E();
       }
       return list;
    }
}
