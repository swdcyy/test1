package e1a.b;
import yxb.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.survey.ActionSurveyType;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.helper.a;
import com.yxcorp.gifshow.entity.QPhoto;

public class b implements a	// class@002040
{

    public void b(){
       super();
    }
    public List Ja(ActionSurveyType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0);
    }
    public void ii(QPhoto p0,ActionSurveyType p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "1")) {
          return;
       }
       a.b(p0, p1, p2);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
