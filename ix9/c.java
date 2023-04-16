package ix9.c;
import erd.g;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.d;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;

public final class c implements g	// class@0028b1
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.P8("commentWonderfulEnterPage", "");
       }else {
          tb.P8("commentWonderfulLeavePage", "");
       }
       return;
    }
}
