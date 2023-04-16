package d76.f$a;
import x97.k;
import d76.f;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import f3b.t;
import java.util.HashMap;
import eg6.a;
import java.lang.Number;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.IOException;
import java.lang.CharSequence;
import java.lang.Long;
import ekd.e;
import e76.a;
import java.util.Iterator;
import java.util.List;
import ta6.j;
import java.util.Objects;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.yxcorp.utility.AbiUtil;
import com.yxcorp.utility.AbiUtil$Abi;
import com.kwai.framework.initmodule.AzerothInitModule$b;
import java.lang.Enum;

public class f$a extends k	// class@001477
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public Map b(){
       f a;
       long l;
       BufferedReader uBufferedRea;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       Map obj = PatchProxy.apply(objArray, this, f$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = super.b();
       Map map = obj;
       map.put("socName", t.a(a.b()));
       a uoa = a.class;
       HashMap hashMap = PatchProxy.apply(objArray, objArray, uoa, str);
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          hashMap.put("boardPlatform", a.a());
          FileReader obj2 = PatchProxy.apply(objArray, objArray, uoa, "3");
          if (obj2 != patchProxyRe) {
             l = obj2.longValue();
          }else {
             l = 0;
             try{
                String str2 = "/proc/meminfo";
                try{
                   obj2 = new FileReader(str2);
                   uBufferedRea = new BufferedReader(obj2, 8192);
                   try{
                      while (true) {
                         String str3 = uBufferedRea.readLine();
                         if (str3 == null) {
                            try{
                               uBufferedRea.close();
                               break ;
                            }catch(java.io.IOException e9){
                               e9.printStackTrace();
                               break ;
                            }
                         }else {
                            if (str3.contains("MemTotal")) {
                               l = Long.valueOf(str3.split("\\s+")[1]).longValue();
                               long l1 = 10;
                               try{
                                  l = l << l1;
                                  uBufferedRea.close();
                               }catch(java.io.IOException e9){
                                  e9.printStackTrace();
                               }
                            }
                         }
                      }
                   }catch(java.lang.Exception e0){
                   }
                }catch(java.lang.Exception e0){
                   uBufferedRea = objArray;
                }
             }catch(java.lang.Exception e0){
                obj2 = objArray;
                uBufferedRea = obj2;
             }
             try{
                obj2.close();
             }catch(java.io.IOException e4){
                e4.printStackTrace();
             }
          }
       }
       map.putAll(hashMap);
       map.put("rdid", a.f);
       map.put("did_tag", String.valueOf(a.g));
       map.put("oDid", a.b);
       map.put("cdid_tag", String.valueOf(a.c));
       map.put("android_os", String.valueOf(e.a()));
       Iterator iterator = a.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(obj);
       }
       a = this.b.a;
       Objects.requireNonNull(a);
       str = PatchProxy.apply(objArray, a, AzerothInitModule.class, "7");
       String str1 = "arm32";
       if (str != patchProxyRe) {
       }else if(AbiUtil.c()){
          str = "arm64";
       }else {
          String[] stringArray = AbiUtil.d();
          if (stringArray != null && stringArray.length > 0) {
             int len = stringArray.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   object oobject = stringArray[i1];
                   if (("armeabi-v7a").equals(oobject) || ("armeabi").equals(oobject)) {
                      str = str1;
                      break ;
                   }else {
                      i1 = i1 + 1;
                   }
                }
             }
          }
          str = "";
       }
       map.put("device_abi", str);
       a = this.b.a;
       Objects.requireNonNull(a);
       Object obj1 = PatchProxy.apply(objArray, a, AzerothInitModule.class, "8");
       if (obj1 != patchProxyRe) {
          str1 = obj1;
       }else {
          int i = AzerothInitModule$b.a[AbiUtil.a().ordinal()];
          if (i != 1) {
             str1 = (i != 2)? "": "arm64";
          }
       }
       map.put("abi", str1);
       return obj;
    }
}
