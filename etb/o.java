package etb.o;
import android.content.DialogInterface$OnCancelListener;
import etb.v;
import java.lang.Object;
import android.content.DialogInterface;
import k2b.e0;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import java.lang.String;
import dtb.c;

public final class o implements DialogInterface$OnCancelListener	// class@002807
{
    public final v b;

    public void o(v p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       o tb = this.b;
       c.i(tb.t, tb.r, "cancel");
    }
}
