package ced.j0;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.o;
import java.lang.Object;
import xdd.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j0 implements g	// class@00055f
{
    public final o b;

    public void j0(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o.class, "12")) {
       }else if((p0.a).equals("MusicTag")){
          tb.stop();
       }
       return;
    }
}
