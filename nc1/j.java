package nc1.j;
import bq5.f;
import nc1.j$a;
import bq5.f$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class j extends f	// class@0032d8
{
    public String i;
    public int j;
    public long k;

    public void j(j$a p0){
       super(p0);
       this.i = p0.f;
       this.k = p0.h;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCommentNoticeItemInfo{mBizId=\'"+this.i+'''+", mBubbleType="+this.j+", mShowDelayTimeMs="+this.k+"} "+super.toString();
    }
}
