package ac9.k;
import ac9.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class k extends g	// class@000083
{

    public void k(){
       super();
    }
    public String getTemplateId(){
       Object obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(-124);
    }
    public String getTemplateName(){
       return "Ä§±í°´Å¥";
    }
    public int getType(){
       return -124;
    }
}
