package ga1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@002440
{
    public int a;
    public int b;
    public int c;
    public int d;

    public void a(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceMultiChatPlayViewAdapterModel{mRightPadding="+this.a+", mBottomPadding="+this.b+", mPlayerViewHeight="+this.c+", mPlayerViewWidth="+this.d+'}';
    }
}
