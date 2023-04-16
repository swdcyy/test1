package fva.r$g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class r$g extends Accessor	// class@002a20
{
    public final int c;

    public void r$g(int p0){
       this.c = p0;
       super();
    }
    public Object get(){
       Integer integer = PatchProxy.apply(null, this, r$g.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          integer = Integer.valueOf(this.c);
       }
       return integer;
    }
}
