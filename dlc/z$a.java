package dlc.z$a;
import vy6.a;
import dlc.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import sy6.a;
import java.util.Objects;
import tkc.a;
import com.kwai.framework.model.feed.BaseFeed;
import alc.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.TextView;
import dlc.x;
import android.view.View$OnTouchListener;
import java.lang.Runnable;
import android.os.Handler;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class z$a implements a	// class@00227e
{
    public final z b;

    public void z$a(z p0){
       this.b = p0;
       super();
    }
    public void B0(){
    }
    public void F1(){
    }
    public void i2(){
    }
    public void k1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, z$a.class, "1")) {
          return;
       }
       this.b.u.getCurrentPhoto();
       if (this.b.u.j() >= 2) {
          z$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, z.class, "6") && !a.a()) {
             BaseFeed entity = tb.u.getCurrentPhoto().getEntity();
             a uoa = a.class;
             if (!PatchProxy.applyVoidOneRefs(entity, objArray, uoa, "4") && entity != null) {
                ClientEvent$ElementPackage uElementPack = PatchProxy.apply(objArray, objArray, uoa, "20");
                if (uElementPack != PatchProxyResult.class) {
                }else {
                   uElementPack = new ClientEvent$ElementPackage();
                   String str = "SHOW_POPULAR_GUIDE";
                   uElementPack.name = str;
                   uElementPack.action2 = str;
                }
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = w1.f(entity);
                u1.u0(7, uElementPack, uContentPack);
             }
             tb.P8();
             FrameLayout uFrameLayout = new FrameLayout(tb.p.getContext());
             tb.t = uFrameLayout;
             tb.p.addView(uFrameLayout, new RelativeLayout$LayoutParams(-1, -1));
             if (tb.v != null) {
                tb.r.setTextColor(a1.a(R.color.arg_RES_7f061fda));
                tb.r.setBackgroundResource(R.drawable.bubble_hint_new_style_black);
                tb.s.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_down_black);
             }else {
                tb.r.setTextColor(a1.a(R.color.arg_RES_7f061d77));
                tb.r.setBackgroundResource(R.drawable.bubble_hint_new_style_white);
                tb.s.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_down_white_light);
             }
             tb.q.setVisibility(0);
             tb.t.setOnTouchListener(new x(tb));
             tb.y.removeCallbacks(tb.x);
             tb.y.postDelayed(tb.x, 5000);
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("moreTrendingTipGuideShown", true);
             g.a(uEditor);
          }
       }
       return;
    }
}
