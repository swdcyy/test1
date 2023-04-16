package f52.r;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;

public final class r implements DialogInterface$OnClickListener	// class@002897
{
    public final k b;

    public void r(k p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f100fdf) {
          tb.V8(true);
       }
       return;
    }
}
