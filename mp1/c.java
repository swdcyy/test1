package mp1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class c	// class@0031dc
{
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public String e;
    public String f;
    public int g;

    public void c(){
       super();
       this.e = "";
       this.f = "";
    }
    public final boolean a(){
       return this.a;
    }
    public final int b(){
       return this.g;
    }
    public final boolean c(){
       return this.b;
    }
    public final int d(){
       return this.d;
    }
    public final String e(){
       return this.e;
    }
    public final void f(boolean p0){
       this.a = p0;
    }
    public final void g(int p0){
       this.d = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiChatOnInviteExtra\(allowVideoChat="+this.a+", fromAudienceApply="+this.b+", isAutoAccept="+this.c+", mediaType="+this.d+", userId=\'"+this.e+"\', chatId=\'"+this.f+"\', countdownSecond="+this.g+')';
    }
}
