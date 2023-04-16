package lk9.h;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;

public final class h implements DialogInterface$OnClickListener	// class@002dfc
{
    public final e b;

    public void h(e p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f100943) {
          tb.S8();
       }else if(p1 == 0x7f10428f){
          tb.R8();
       }
       return;
    }
}
