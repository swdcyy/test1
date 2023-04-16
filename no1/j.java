package no1.j;
import java.lang.Object;
import oo1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j	// class@0033a0
{
    public boolean a;
    public String b;
    public boolean c;
    public LiveLineChatMessages$SCLiveLineChatMatched d;
    public LiveLineChatMessages$SCLiveLineChatInvite e;
    public LiveLineChatMessages$SCLiveLineChatReady f;
    public final a g;

    public void j(){
       super();
       this.a = false;
       this.b = "";
       this.c = false;
       this.g = new a();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "2")) {
          return;
       }
       this.a = false;
       this.d = objArray;
       this.e = objArray;
       this.f = objArray;
       this.c = false;
       j tg = this.g;
       tg.a = objArray;
       tg.b = -1;
       return;
    }
}
