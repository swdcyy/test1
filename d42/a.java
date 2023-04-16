package d42.a;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import d42.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@00243f
{
    public UserInfo a;
    public boolean b;
    public int c;
    public boolean d;
    public final boolean e;
    public String f;
    public String g;
    public a$a h;

    public void a(UserInfo p0,boolean p1,int p2,boolean p3,String p4,String p5){
       super(p0, p1, p2, p3, p4, p5, null);
    }
    public void a(UserInfo p0,boolean p1,int p2,boolean p3,String p4,String p5,a$a p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveChatAcceptInviteRequestParameter{mUser="+this.a+", mIsAudienceApply="+this.b+", mInviteGuestMediaType="+this.c+", mIsInviteGuestNewVersion="+this.d+", mIsGuestSupportMultiChat="+this.e+'}';
    }
}
