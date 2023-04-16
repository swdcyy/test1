package bk5.i;
import org.greenrobot.greendao.converter.PropertyConverter;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionExtraInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class i implements PropertyConverter	// class@0004c0
{

    public void i(){
       super();
    }
    public String a(EmotionExtraInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return new Gson().q(p0);
    }
    public EmotionExtraInfo b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       return new Gson().h(p0, EmotionExtraInfo.class);
    }
    public Object convertToDatabaseValue(Object p0){
       return this.a(p0);
    }
    public Object convertToEntityProperty(Object p0){
       return this.b(p0);
    }
}
