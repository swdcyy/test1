package bk5.d;
import org.greenrobot.greendao.converter.PropertyConverter;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionAuthor;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class d implements PropertyConverter	// class@0004ba
{

    public void d(){
       super();
    }
    public String a(EmotionAuthor p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return new Gson().q(p0);
    }
    public EmotionAuthor b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       return new Gson().h(p0, EmotionAuthor.class);
    }
    public Object convertToDatabaseValue(Object p0){
       return this.a(p0);
    }
    public Object convertToEntityProperty(Object p0){
       return this.b(p0);
    }
}
