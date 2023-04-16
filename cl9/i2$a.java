package cl9.i2$a;
import java.lang.Runnable;
import cl9.i2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.g;
import g9c.a;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kwai.library.widget.shadow.KwaiShadowLayout;
import hl9.t;
import cl9.f2;
import android.view.View$OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import cl9.j2;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import lnc.i3;
import k2b.u1;

public class i2$a implements Runnable	// class@00062e
{
    public final i2 b;

    public void i2$a(i2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       int i2;
       i2 oi2 = i2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i2$a.class, "1")) {
          return;
       }
       int i = this.b.w.i0();
       int i1 = this.b.w.c();
       i2 = this.b.p.ia().b1();
       if (this.b.p.g7().getItemCount() > 0 && (this.b.p.g7().N0(0) != null && this.b.p.g7().N0(0).mType == 5)) {
          i2 = i2 + 1;
       }
    label_005c :
       if (i2 >= i && i2 <= i1) {
          i2$a tb = this.b;
          Objects.requireNonNull(tb);
          float f = 0;
          if (!PatchProxy.applyVoid(objArray, tb, oi2, "5") && tb.r == null) {
             View view = a.c(tb.p.h0().getContext(), R.layout.arg_RES_7f0d01d2, objArray);
             tb.r = view;
             tb.p.h0().getParent().addView(view, tb.p.h0().getLayoutParams());
             KwaiShadowLayout kwaiShadowLa = tb.r.findViewById(R.id.comment_float_button);
             tb.z = kwaiShadowLa;
             if (!t.W8(kwaiShadowLa.getContext())) {
                tb.z.setShadowColor(0);
             }
             tb.z.setOnClickListener(new f2(tb));
             tb.z.setAlpha(f);
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, oi2, "7") && !tb.R8()) {
             tb.v = false;
             tb.A = true;
             tb.r.setVisibility(0);
             tb.z.setAlpha(f);
             tb.z.setScaleX(0x3f4ccccd);
             tb.z.setScaleY(0x3f4ccccd);
             tb.z.animate().alpha(0x3f800000).scaleY(0x3f800000).scaleX(0x3f800000).setDuration(300).setInterpolator(new DecelerateInterpolator(0x3fc00000)).setListener(new j2(tb)).start();
             if (!PatchProxy.applyVoid(objArray, tb, oi2, "8")) {
                ShowMetaData showMetaData = new ShowMetaData();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uContentPack.photoPackage = w1.f(tb.y.mQPhoto.mEntity);
                uElementPack.action2 = "LAST_VIEWED_BUTTON";
                i3 oi3 = i3.f();
                oi3.d("button_area", "COMMENT");
                oi3.d("button_type", "DOWN");
                uElementPack.params = oi3.e();
                showMetaData.setType(6);
                showMetaData.setContentPackage(uContentPack);
                showMetaData.setElementPackage(uElementPack);
                u1.B0(showMetaData);
             }
          }
       }
    label_017a :
       return;
    }
}
