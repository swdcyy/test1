package gka.k;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.fragment.ObservableBox$d;
import java.lang.Object;
import android.content.DialogInterface;

public final class k implements DialogInterface$OnCancelListener	// class@002b10
{
    public final ObservableBox$d b;

    public void k(ObservableBox$d p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       p0.a = true;
    }
}
