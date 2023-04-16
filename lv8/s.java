package lv8.s;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.webkit.SslErrorHandler;
import java.lang.Object;
import android.content.DialogInterface;

public final class s implements DialogInterface$OnClickListener	// class@002dbd
{
    public final SslErrorHandler b;

    public void s(SslErrorHandler p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       p0.dismiss();
       this.b.proceed();
    }
}
