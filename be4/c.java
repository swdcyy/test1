package be4.c;
import u07.u;
import com.kuaishou.merchant.transaction.base.net.error.c;
import com.kuaishou.merchant.transaction.base.net.error.PromptBean$PromptData;
import java.lang.Throwable;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.String;

public final class c implements u	// class@000396
{
    public final c b;
    public final PromptBean$PromptData c;
    public final Throwable d;

    public void c(c p0,PromptBean$PromptData p1,Throwable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       tb.c(tc.mCancelActionType, tc.mCancelActionData, this.d);
    }
}
