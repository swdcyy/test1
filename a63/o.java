package a63.o;
import android.content.DialogInterface$OnClickListener;
import brd.v;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Boolean;
import brd.g;

public final class o implements DialogInterface$OnClickListener	// class@00005f
{
    public final v b;

    public void o(v p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       o tb = this.b;
       if (0x7f10368e == p1) {
          tb.onNext(Boolean.TRUE);
       }else {
          tb.onNext(Boolean.FALSE);
       }
       tb.onComplete();
       return;
    }
}
