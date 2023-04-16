package cl9.y$a;
import androidx.recyclerview.widget.RecyclerView$r;
import cl9.y;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import al9.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.System;
import ek9.l1;
import android.content.SharedPreferences;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import android.view.View;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.c$b;
import cl9.w;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;

public class y$a extends RecyclerView$r	// class@000680
{
    public final y a;

    public void y$a(y p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(y$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, y$a.class, "1")) {
          return;
       }
       if (!this.a.q.isArticle() && !this.a.q.isLongPhotos()) {
          if (TextUtils.x(this.a.q.getCommentAtBubbleMessage())) {
             return;
          }else {
             y$a ta = this.a;
             if (ta.J != null) {
                return;
             }else if(ta.M.q() instanceof a && this.a.M.q().D0() >= 5){
                ta = this.a;
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(null, ta, y.class, "20") && (ta.getActivity() != null && ((System.currentTimeMillis() - l1.a.getLong("commentBtnAtBubbleShowedTime", 0)) - 0x20f5800 > 0 && (!l1.a() && ta.B != null)))) {
                   y k = ta.K;
                   if (k == null || !k.K()) {
                      a uoa = new a(ta.getActivity());
                      uoa.I0(0x2724);
                      uoa.K0(KwaiBubbleOption.e);
                      uoa.C0(-25);
                      uoa.o0(ta.B);
                      uoa.D0(BubbleInterface$Position.TOP);
                      uoa.F0(ta.q.getCommentAtBubbleMessage());
                      uoa.P(true);
                      uoa.z(true);
                      uoa.A(false);
                      uoa.T(5000);
                      uoa.p();
                      uoa.M(new w(ta));
                      ta.J = a.b0(0x7f110612, uoa);
                   }
                }
             }
          }
       }
       return;
    }
}
