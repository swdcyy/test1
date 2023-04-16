package df2.h0;
import android.content.DialogInterface$OnClickListener;
import df2.m0;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;

public final class h0 implements DialogInterface$OnClickListener	// class@0024f2
{
    public final m0 b;

    public void h0(m0 p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       h0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f104a8e) {
          tb.U9();
       }else if(p1 == 0x7f101d16 || p1 == 0x7f10406c){
          tb.C9();
       }else if(p1 == 0x7f10406b){
          tb.q9();
       }else if(p1 == 0x7f100103){
          tb.b9();
       }else if(p1 == 0x7f102cfb || p1 == 0x7f102cfd){
          tb.D9();
       }else if(p1 == 0x7f102225){
          tb.e9();
       }else if(p1 == 0x7f1028af){
          tb.G9();
       }
       return;
    }
}
