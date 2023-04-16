package mz5.b;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;

public abstract class b	// class@00319b
{
    public User b;
    public String mHeadUrl;
    public CDNUrl[] mHeadUrls;
    public String mUserId;
    public String mUserName;
    public String mUserSex;

    public void b(){
       super();
    }
    public User linkUser(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          User user = new User(this.mUserId, this.mUserName, this.mUserSex, this.mHeadUrl, this.mHeadUrls);
          this.b = obj;
       }
       return this.b;
    }
}
