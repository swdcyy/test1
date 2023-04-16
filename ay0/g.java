package ay0.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import ay0.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ay0.f;
import java.lang.Class;
import mm8.a;

public final class g implements b	// class@0002cb
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       e uoe = new e(this, p1);
       String str = "ASR_SERVICE";
       try{
          p0.i(str, uoe);
          p0.h(b.class, new f(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
