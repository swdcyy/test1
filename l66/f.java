package l66.f;
import l66.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l66.d;
import java.util.Set;
import awd.c;
import org.greenrobot.eventbus.a;
import java.util.Iterator;
import bwd.d;
import org.greenrobot.eventbus.EventBusException;
import e66.c;
import java.lang.Throwable;
import q87.c;

public class f implements e	// class@001d4a
{

    public void f(){
       super();
    }
    public void install(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       try{
          c uoc = a.b();
          Iterator iterator = new d().b().iterator();
          while (iterator.hasNext()) {
             uoc.a(iterator.next());
          }
          _monitor_enter(a.class);
          if (a.r != null) {
             throw new EventBusException("Default instance already exists. It may be only set once before it\'s used the first time to ensure consistent behavior.");
          }
          a.r = uoc.b();
          _monitor_exit(a.class);
       }catch(org.greenrobot.eventbus.EventBusException e0){
          c.C().e("EventBusInstaller", "", e0);
       }
       return;
    }
}
