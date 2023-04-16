package f52.s;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import f52.b;

public final class s implements DialogInterface$OnClickListener	// class@002898
{
    public final k b;

    public void s(k p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f104f05) {
          tb.r.a(tb.p.c, false);
       }
       return;
    }
}
