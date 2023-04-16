package b06.d$a;
import tca.h;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uh5.e;
import wh5.c;

public class d$a implements h	// class@0003df
{

    public void d$a(){
       super();
    }
    public String a(){
       return "article_feed";
    }
    public boolean accept(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(e.b() || (c.b() && p0.isArticle())){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
