package eg2.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class c	// class@002723
{
    public String a;
    public int b;

    public void c(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveQuizAudienceSheet{mLiveQuizId=\'"+this.a+'''+", mTotalQuestionsCount="+this.b+'}';
    }
}
