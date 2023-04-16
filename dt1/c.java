package dt1.c;
import lf3.g;
import dt1.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import du1.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import msd.a;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import lf3.f;

public final class c implements g	// class@002016
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          c tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "4") || (p0 == null || (!TextUtils.n(String.valueOf(p0.authorId), tb.h.d()) || (TextUtils.n(p0.pkId, tb.e.invoke()) && a.g(tb.b.getValue(), Boolean.FALSE))))) {
             tb.b.setValue(Boolean.TRUE);
          }
       }
    label_005b :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
