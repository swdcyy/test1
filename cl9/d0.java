package cl9.d0;
import com.yxcorp.gifshow.widget.m;
import cl9.y;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yk9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import cl9.r;
import n3d.a;
import uid.e;

public class d0 extends m	// class@000612
{
    public final y c;

    public void d0(y p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       y m = this.c.M;
       boolean b = true;
       if (m != null && m.Kh() != null) {
          d uod = this.c.M.Kh();
          d0 tc = this.c;
          e0 uoe0 = f0.a(tc.M, tc.getActivity());
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(uoe0, uod, d.class, "87")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PICTURE_COMMENT_BTN";
             u1.B(new ClickMetaData().setLogPage(uoe0).setType(b).setElementPackage(uElementPack));
          }
       }
       d0 tc1 = this.c;
       Objects.requireNonNull(tc1);
       if (!PatchProxy.applyVoid(null, tc1, y.class, "14")) {
          y c = tc1.C;
          if (c != null) {
             c.setPressed(b);
          }
          if (!tc1.q.isAllowComment()) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10078c));
          }else {
             e.c(tc1.getActivity(), new r(tc1));
          }
       }
       return;
    }
}
