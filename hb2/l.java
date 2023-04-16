package hb2.l;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.view.View;
import hb2.g$b;
import ekd.m1;
import android.widget.TextView;
import hb2.k;
import android.view.View$OnClickListener;
import com.yxcorp.widget.KwaiRadiusStyles;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import xj2.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import kp3.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;

public class l extends c	// class@002d4d
{
    public e p;
    public a0 q;
    public a r;
    public TextView s;
    public static String sLivePresenterClassName = "LiveChainSideBarPendantPresenter";

    public void l(){
       super();
    }
    public void E8(){
       a0 l1;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "2")) {
          a0 l11 = this.q.l1;
          if (l11 != null) {
             View view = l11.i();
             this.s = m1.f(view, 0x7f0a2579);
             m1.a(view, new k(this), R.id.live_side_bar_pendant_text_view);
             view.setBackground(b.b(KwaiRadiusStyles.FULL_LEFT));
             ImageView imageView = m1.f(view, R.id.live_side_bar_pendant_left_icon_image_view);
             imageView.setImageResource(R.drawable.arg_RES_7f08144f);
             imageView.setVisibility(false);
             LinearLayout$LayoutParams layoutParams = imageView.getLayoutParams();
             layoutParams.height = a1.d(0x7f0708a5);
             layoutParams.width = a1.d(0x7f0708a5);
             layoutParams.leftMargin = a1.d(0x7f0708a6);
             layoutParams.rightMargin = a1.d(0x7f0708a4);
             imageView.setLayoutParams(layoutParams);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "4")) {
          ol = this.s;
          if (ol != null) {
             ol.setText(TextUtils.i(this.r.d.mLiveSideBarModel.mLiveSideIconText, "¸ü¶àÖ±²¥"));
          }
       }
       if (this.p.s()) {
          if (this.getActivity() instanceof LivePlayActivity) {
             this.p.l = 0;
          }
          l1 = this.q.l1;
          if (l1 != null) {
             l1.g(false);
          }
       }
       l1 = this.q.l1;
       if (l1 != null) {
          l1.a(true);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_SIDE_BAR_MOVEMENT");
       this.q = this.q8(a0.class);
       this.r = this.q8(a.class);
       return;
    }
}
