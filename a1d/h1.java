package a1d.h1;
import erd.g;
import a1d.j1;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import w0d.f;
import android.widget.TextView;
import com.yxcorp.login.http.response.AuthInfoResponse;
import com.yxcorp.login.http.response.AuthInfoResponse$MaxLimit;
import android.app.Application;
import o56.a;
import java.lang.Integer;
import java.lang.CharSequence;

public final class h1 implements g	// class@00002a
{
    public final j1 b;

    public void h1(j1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       h1 tb = this.b;
       Objects.requireNonNull(tb);
       j1 oj1 = j1.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oj1, "4")) {
       }else if(p0 == AuthEvent.DATA_LOAD_SUCCESS){
          if (!PatchProxy.applyVoid(null, tb, oj1, "5")) {
             int i = 0;
             int i1 = 1;
             AuthInfoResponse$MaxLimit maxLimit = 3;
             if (f.b(tb.r.get())) {
                tb.w.setText(R.string.arg_RES_7f1002e0);
                if (tb.p.get().mMaxLimit != null) {
                   maxLimit = tb.p.get().mMaxLimit.mUserInfoLimit;
                }
                objArray = new Object[i1];
                objArray[i] = Integer.valueOf(maxLimit);
                tb.x.setText(String.format(a.b().getString(R.string.arg_RES_7f1002d5), objArray));
                tb.P8();
             }else if(f.a(tb.r.get())){
                tb.w.setText(R.string.arg_RES_7f1002e1);
                if (tb.p.get().mMaxLimit != null) {
                   maxLimit = tb.p.get().mMaxLimit.mPhoneLimit;
                }
                objArray = new Object[i1];
                objArray[i] = Integer.valueOf(maxLimit);
                tb.x.setText(String.format(a.b().getString(R.string.arg_RES_7f1002d6), objArray));
                tb.P8();
             }else {
                tb.w.setVisibility(8);
                tb.x.setVisibility(8);
             }
          }
       }else if(p0 == AuthEvent.REFRESH_MANAGER_VIEW){
          tb.P8();
       }
       return;
    }
}
