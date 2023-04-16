package z36.d;
import java.lang.Object;
import z36.d$a;
import com.kuaishou.android.post.PostArguments;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.p3;
import q87.c;
import java.lang.StringBuilder;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import com.kuaishou.android.post.StrArg;
import android.content.Intent;

public class d	// class@004572
{
    public PostArguments b;
    public int mActivityFlag;
    public Map mArgsMap;
    public a mIPageCallBack;
    public int mRequestCode;
    public Bundle mThirdPartyBundle;

    public void d(){
       super();
    }
    public void d(d$a p0){
       super();
       this.mActivityFlag = p0.b;
       this.mRequestCode = p0.c;
       this.mThirdPartyBundle = p0.d;
       this.mIPageCallBack = p0.e;
       this.b = p0.b();
       p0 = p0.f;
       this.mArgsMap = p0;
       if (p0 != null) {
          this.getArgs().parseFromMap(this.mArgsMap);
       }
       return;
    }
    public PostArguments getArgs(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          return obj;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostPageParam", "getArgs\(\) create new PostArguments\(\)", objArray);
       PostArguments postArgument = new PostArguments();
       this.b = postArgument;
       return postArgument;
    }
    public void setArgs(PostArguments p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostPageParam", "setArgs\(\) args="+p0, objArray);
       this.b = p0;
       return;
    }
    public void setThirdParty(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       this.getArgs().getFromThirdParty().set(Boolean.TRUE);
       this.getArgs().getThirdPartyAppPackage().set(p0);
       this.getArgs().getThirdPartyPubInfo().set(p1);
       return;
    }
    public void write(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       d tb = this.b;
       if (tb == null) {
          return;
       }
       tb.write(p0);
       return;
    }
}
