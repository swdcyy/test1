package g4b.a;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class a	// class@002a76
{
    public final List mEndPoints;
    public String mToken;
    public List mTokenList;

    public void a(){
       super();
       this.mEndPoints = Collections.emptyList();
    }
    public String a(){
       return this.mToken;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicUploadPrepareResponse mToken="+this.mToken+" mEndPoints="+this.mEndPoints;
    }
}
