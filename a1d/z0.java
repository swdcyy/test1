package a1d.z0;
import erd.g;
import a1d.b1;
import java.lang.Object;
import com.yxcorp.login.authorization.mode.AuthEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import z8c.a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import java.util.ArrayList;
import x0d.q;
import java.util.List;
import b1d.c;
import x0d.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import x0d.j;
import x0d.a;
import android.widget.Button;
import w0d.f;
import android.app.Application;
import o56.a;
import x0d.c;

public final class z0 implements g	// class@000061
{
    public final b1 b;

    public void z0(b1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z0 tb = this.b;
       Objects.requireNonNull(tb);
       b1 uob1 = b1.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uob1, "5")) {
       }else if(p0 == AuthEvent.DATA_LOAD_SUCCESS){
          if (!PatchProxy.applyVoid(null, tb, uob1, "6")) {
             p0 = new LinearLayoutManager(tb.getContext());
             int i = 1;
             p0.setOrientation(i);
             tb.x.setLayoutManager(p0);
             boolean b = false;
             tb.x.addItemDecoration(new a(i, b, i));
             p0 = tb.P8();
             if (p0 != null) {
                AuthInfoResponse$Scope mUserInfoLis = p0.mUserInfoList;
                if (mUserInfoLis != null && mUserInfoLis.size() > 0) {
                   q oq = new q(p0.mUserInfoList, tb.u, tb, (i ^ tb.w));
                   tb.y = oq;
                   tb.x.setAdapter(oq);
                }else {
                   mUserInfoLis = p0.mPhoneNumList;
                   if (mUserInfoLis != null && mUserInfoLis.size() > 0) {
                      j oj = new j(p0.mPhoneNumList, tb.u, tb, (tb.w ^ i));
                      tb.z = oj;
                      tb.x.setAdapter(oj);
                      tb.B.setEnabled(i);
                   }else if(f.a(p0.mScope)){
                      p0 = p0.mPhoneNumList;
                      if (p0 != null && !p0.size()) {
                         p0 = new ArrayList();
                         p0.add(a.b().getString(R.string.arg_RES_7f1002d9));
                         c uoc = new c(p0);
                         tb.A = uoc;
                         tb.x.setAdapter(uoc);
                         tb.B.setEnabled(b);
                      }
                   }
                }
             }
          }
       }else if(p0 == AuthEvent.REFRESH_LIST){
          tb.R8();
       }
       return;
    }
}
