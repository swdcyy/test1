package elb.b;
import org.greenrobot.greendao.converter.PropertyConverter;
import com.google.gson.Gson;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Class;

public class b implements PropertyConverter	// class@00273c
{
    public static final Gson a;

    static {
       b.a = new Gson();
    }
    public void b(){
       super();
    }
    public String a(List p0){
       if (p0 == null || p0.isEmpty()) {
          return "";
       }
       StringBuilder str = "";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          str = str+b.a.q(iterator.next())+",,,";
       }
       String str1 = str;
       return str1.substring(0, str1.lastIndexOf(",,,"));
    }
    public List b(String p0){
       if (TextUtils.x(p0)) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = Arrays.asList(p0.split(",,,")).iterator();
       while (iterator.hasNext()) {
          uArrayList.add(b.a.h(iterator.next(), CDNUrl.class));
       }
       return uArrayList;
    }
    public Object convertToDatabaseValue(Object p0){
       return this.a(p0);
    }
    public Object convertToEntityProperty(Object p0){
       return this.b(p0);
    }
}
