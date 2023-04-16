package aa8.b;
import w78.c;
import com.mini.ipc.a$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import android.os.Message;
import android.os.Bundle;
import com.mini.ipc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.mini.ipc.IPCResult;
import android.os.Parcelable;

public final class b implements c	// class@000053
{
    public final a$a a;
    public final PublishSubject b;

    public void b(a$a p0,PublishSubject p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Message p0){
       b ta = this.a;
       b tb = this.b;
       Bundle data = p0.getData();
       Parcelable parcelable = PatchProxy.applyOneRefs(data, null, a.class, "1");
       if (parcelable != PatchProxyResult.class) {
       }else {
          parcelable = data.getParcelable("ipc_key_result");
       }
       if (ta == null || ta.a(parcelable)) {
          tb.onNext(parcelable);
          tb.onComplete();
       }
       return;
    }
}
