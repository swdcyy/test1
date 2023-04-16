package goa.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.model.response.InviteCodeResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import e17.i;

public final class e implements Runnable	// class@002b41
{
    public final InviteCodeResponse b;

    public void e(InviteCodeResponse p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, this.b.mToastMessage);
       return;
    }
}
