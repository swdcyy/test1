package efa.c;
import dfa.b;
import java.lang.Object;
import java.io.Serializable;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import dfa.b$a;

public final class c implements b	// class@002676
{
    public final int a;

    public void c(int p0){
       super();
       this.a = p0;
    }
    public Serializable a(Serializable p0){
       int i;
       HomeFeedResponse obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else if(p0 != null){
          obj = p0.mQPhotos;
          if (obj != null) {
             i = obj.size();
          label_001e :
             if (i < this.a) {
                p0 = null;
             }
          }
       }
       i = 0;
       goto label_001e ;
       return p0;
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$a.a(this);
    }
}
