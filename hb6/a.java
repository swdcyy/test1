package hb6.a;
import java.lang.Object;
import hb6.a$a;
import java.lang.reflect.Type;
import el.a;
import com.google.common.collect.LinkedListMultimap;
import java.util.List;
import qk.g0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import hb6.c;
import java.util.Collections;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import com.google.gson.Gson;
import ok.n;
import java.lang.Throwable;
import java.lang.RuntimeException;
import xf6.e;

public class a	// class@001742
{
    public final Type a;
    public g0 b;
    public g0 c;

    public void a(){
       super();
       this.a = new a$a(this).getType();
       this.b = LinkedListMultimap.create();
    }
    public static g0 c(List p0){
       LinkedListMultimap obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LinkedListMultimap.create();
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          Collections.shuffle(uoc.a());
          Object[] objArray = new Object[0];
          c.C().w("HostFailoverIpMapProvider", "Shuffled host_ip_map\("+uoc.b()+"\) : "+uoc.a(), objArray);
          Iterator iterator1 = uoc.a().iterator();
          while (iterator1.hasNext()) {
             String str = iterator1.next();
             if (!TextUtils.isEmpty(str)) {
                obj.put(uoc.b(), str);
             }
          }
       }
       return obj;
    }
    public final g0 a(){
       Gson a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          Object[] objArray1 = new Object[0];
          c.C().w("HostFailoverIpMapProvider", "GetFailoverHostIpMap from asset file.", objArray1);
          List list = PatchProxy.apply(objArray, this, uoa, "8");
          if (list != patchProxyRe) {
          }else {
             a = a.a;
             Resources resources = a.a().a().getResources();
             objArray = 0x7f0f0029;
             InputStream inputStream = resources.openRawResource(objArray);
             List list1 = a.g(new InputStreamReader(inputStream), this.a);
             n.j(list1);
             if (inputStream != null) {
                inputStream.close();
             }
             list = list1;
          }
          return a.c(list);
       }catch(java.lang.Exception e0){
          throw new RuntimeException("Load \"idc_host_ip map\" info from raw file error.", e0);
       }
    }
    public final g0 b(){
       String obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.a();
       Object[] objArray = new Object[0];
       c.C().w("HostFailoverIpMapProvider", "GetFailoverHostIpMap from TestHook: "+obj, objArray);
       return a.c(a.a.i(obj, this.a));
    }
}
