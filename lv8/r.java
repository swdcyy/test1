package lv8.r;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.webkit.SslErrorHandler;
import java.lang.Object;
import android.content.DialogInterface;

public final class r implements DialogInterface$OnClickListener	// class@002dbc
{
    public final SslErrorHandler b;

    public void r(SslErrorHandler p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       p0.dismiss();
       this.b.cancel();
    }
}
