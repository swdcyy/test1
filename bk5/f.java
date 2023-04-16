package bk5.f;
import org.greenrobot.greendao.converter.PropertyConverter;
import java.lang.Object;
import com.google.gson.Gson;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;

public class f implements PropertyConverter	// class@0004bc
{
    public Gson a;

    public void f(){
       super();
       this.a = new Gson();
    }
    public String a(List p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.isEmpty()) {
          return "";
       }
       obj = "";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          EmotionInfo uEmotionInfo = iterator.next();
          try{
             obj = obj+this.a.q(uEmotionInfo)+",,,";
          }catch(java.lang.Exception e0){
             goto label_0021 ;
          }
       }
       String str = obj;
       return str.substring(0, str.lastIndexOf(",,,"));
    }
    public List b(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       String[] stringArray = p0.split(",,,");
       obj = new ArrayList();
       int len = stringArray.length;
       for (int i = 0; i < len; i = i + 1) {
          obj.add(this.a.h(stringArray[i], EmotionInfo.class));
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
