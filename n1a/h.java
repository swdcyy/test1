package n1a.h;
import sfc.a;
import n1a.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.common.base.b;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e17.i;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;

public class h extends a	// class@0030be
{
    public final g c;

    public void h(g p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       try{
          h tc = this.c;
          Objects.requireNonNull(tc);
          g obj = PatchProxy.applyOneRefs(p0, tc, g.class, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = null;
             Throwable throwable = b.c(p0);
             if (throwable instanceof KwaiException) {
                KwaiException mErrorCode = throwable.mErrorCode;
                if (mErrorCode != 0x4ea5) {
                   if (mErrorCode == 0x4ea6) {
                      tc.v.a();
                      i.a(R.style.arg_RES_7f11066a, 0x7f1017f7);
                      tc.R8();
                   }
                }else {
                   tc.v.a();
                   i.a(R.style.arg_RES_7f11066a, 0x7f1017fb);
                   tc.R8();
                }
                b = true;
             }
          label_005d :
             b = false;
          }
       }catch(java.lang.Exception e0){
       }
       if (!b) {
          super.b(p0);
       }
       this.c.r.setEnabled(true);
       h tc1 = this.c;
       tc1.s.setEnabled(tc1.P8(TextUtils.G(tc1.r).toString()));
       return;
    }
}
