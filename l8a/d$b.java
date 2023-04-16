package l8a.d$b;
import qvb.q;
import l8a.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qvb.p;

public class d$b implements q	// class@002d65
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       if (p1 instanceof KwaiException) {
          KwaiException mErrorCode = p1.mErrorCode;
          if (mErrorCode == 224 || mErrorCode == 403) {
             i.d(R.style.arg_RES_7f110668, p1.mErrorMessage);
             if (this.b.getActivity() != null && !this.b.getActivity().isFinishing()) {
                this.b.getActivity().finish();
             }
             return;
          }
       }
       this.b.a9();
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(d$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, d$b.class, "1")) {
          return;
       }
       this.b.a9();
       return;
    }
}
