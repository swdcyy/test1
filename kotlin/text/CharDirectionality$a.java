package kotlin.text.CharDirectionality$a;
import java.lang.Object;
import nsd.u;
import java.util.Map;
import kotlin.text.CharDirectionality;
import qrd.p;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class CharDirectionality$a	// class@0018ec
{

    public void CharDirectionality$a(){
       super();
    }
    public void CharDirectionality$a(u p0){
       super();
    }
    public final Map a(){
       return CharDirectionality.directionalityMap$delegate.getValue();
    }
    public final CharDirectionality b(int p0){
       CharDirectionality uCharDirecti = this.a().get(Integer.valueOf(p0));
       if (uCharDirecti != null) {
          return uCharDirecti;
       }
       throw new IllegalArgumentException("Directionality #"+p0+" is not defined.");
    }
}
