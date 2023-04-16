package bk5.a;
import org.greenrobot.greendao.converter.PropertyConverter;
import com.google.gson.Gson;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Arrays;
import java.util.ArrayList;

public class a implements PropertyConverter	// class@0004b7
{
    public static final Gson a;

    static {
       a.a = new Gson();
    }
    public void a(){
       super();
    }
    public String a(List p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.isEmpty()) {
          return "";
       }
       obj = "";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj = obj+a.a.q(iterator.next())+",,,";
       }
       String str = obj;
       return str.substring(0, str.lastIndexOf(",,,"));
    }
    public List b(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       obj = new ArrayList();
       Iterator iterator = Arrays.asList(p0.split(",,,")).iterator();
       while (iterator.hasNext()) {
          obj.add(a.a.h(iterator.next(), CDNUrl.class));
       }
       return obj;
    }
    public Object convertToDatabaseValue(Object p0){
       return this.a(p0);
    }
    public Object convertToEntityProperty(Object p0){
       return this.b(p0);
    }
}
