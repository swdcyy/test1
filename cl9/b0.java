package cl9.b0;
import com.yxcorp.gifshow.widget.m;
import cl9.y;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import ek9.m1;
import q87.c;
import com.yxcorp.gifshow.comment.utils.e;

public class b0 extends m	// class@000608
{
    public final y c;

    public void b0(y p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       b0 tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, y.class, "12")) {
          if (!QCurrentUser.ME.isLogined()) {
             d.a(-1712118428).ne(tc.getActivity(), tc.q.getFullSource(), "photo_comment", 10, a.B.getString(R.string.arg_RES_7f103078), tc.q.mEntity, null, null, null).h();
          }else if(!tc.q.isAllowComment()){
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10078c));
          }else {
             Object[] objArray = new Object[0];
             m1.C().w("NasaCommentPageEditorBarPresenter", "onAtButtonClick: showEditorAndAtFloatPanel", objArray);
             y f = tc.F;
             f.F(f.k());
          }
       }
       return;
    }
}
