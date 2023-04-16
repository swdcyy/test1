package be4.b;
import u07.u;
import com.kuaishou.merchant.transaction.base.net.error.c;
import com.kuaishou.merchant.transaction.base.net.error.PromptBean$PromptData;
import java.lang.Throwable;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.String;

public final class b implements u	// class@000395
{
    public final c b;
    public final PromptBean$PromptData c;
    public final Throwable d;

    public void b(c p0,PromptBean$PromptData p1,Throwable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       tb.c(tc.mConfirmActionType, tc.mConfirmActionData, this.d);
    }
}
