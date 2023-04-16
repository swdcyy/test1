package a7a.c$d;
import erd.g;
import a7a.c;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Enum;

public final class c$d implements g	// class@000045
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$d.class, "1")) {
       }else if(p0.equals(FragmentEvent.PAUSE)){
          p0 = this.b;
          if (p0.B != null) {
             p0.d9(13);
          }else if(p0.Y8()){
             this.b.d9(2);
          }
       }else if(p0.equals(FragmentEvent.RESUME)){
          p0 = this.b;
          if (p0.B != null) {
             p0.a9(13);
             p0.B = false;
          }else if(p0.Y8()){
             this.b.a9(2);
          }
       }
       PatchProxy.onMethodExit(c$d.class, "1");
       return;
    }
}
