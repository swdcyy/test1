package db1.b;
import java.lang.Object;
import java.lang.String;
import p91.m;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b61.b;
import com.kuaishou.live.basic.model.StreamType;

public class b	// class@001f65
{
    public String a;
    public String b;
    public UserInfo c;
    public boolean d;
    public LiveApiParams$AssistantType e;
    public LiveApiParams$AssistantType f;
    public LiveAdminPrivilege g;
    public StreamType h;
    public String i;
    public String j;
    public m k;

    public void b(){
       super();
    }
    public String a(){
       return this.b;
    }
    public m b(){
       return this.k;
    }
    public String c(){
       return this.a;
    }
    public LiveApiParams$AssistantType d(){
       return this.f;
    }
    public LiveApiParams$AssistantType e(){
       return this.e;
    }
    public UserInfo f(){
       return this.c;
    }
    public LiveAdminPrivilege g(){
       return this.g;
    }
    public String h(){
       b obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          return b.c(obj);
       }
       return "";
    }
    public boolean i(){
       return this.d;
    }
    public void j(String p0){
       this.b = p0;
    }
    public void k(boolean p0){
       this.d = p0;
    }
    public void l(String p0){
       this.a = p0;
    }
    public void m(LiveApiParams$AssistantType p0){
       this.f = p0;
    }
    public void n(StreamType p0){
       this.h = p0;
    }
    public void o(LiveApiParams$AssistantType p0){
       this.e = p0;
    }
    public void p(UserInfo p0){
       this.c = p0;
    }
    public void q(LiveAdminPrivilege p0){
       this.g = p0;
    }
}
