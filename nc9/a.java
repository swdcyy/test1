package nc9.a;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ic9.b;

public class a	// class@0032dc
{

    public void a(){
       super();
    }
    public static String a(Object p0){
       if (p0 instanceof MagicBaseConfig) {
          return p0.mName;
       }
       if (p0 instanceof Music) {
          return p0.mName;
       }
       if (p0 instanceof FilterConfig) {
          return p0.mFilterName;
       }
       if (p0 instanceof MakeupSuite) {
          return p0.mName;
       }
       return "";
    }
    public static String b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof b) {
          return "compound";
       }
       if (p0 instanceof MagicBaseConfig) {
          p0 = (p0.isMakeup())? "makeup": "magicface";
          return p0;
       }else if(p0 instanceof Music){
          return "music";
       }else if(p0 instanceof FilterConfig){
          return "filter";
       }else {
          return "";
       }
    }
}
