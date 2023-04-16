package n2a.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import n2a.g$a;
import n2a.g$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import android.view.View;
import android.view.View$OnClickListener;
import java.lang.System;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;

public class g extends PresenterV2	// class@0030d1
{
    public boolean p;
    public SlidePlayViewModel q;
    public BaseFragment r;
    public u s;
    public View$OnClickListener t;
    public View$OnClickListener u;
    public d v;
    public final ViewPager$l w;
    public final b$a x;
    public static final long y;
    public static final int z;

    static {
       TimeUnit dAYS = TimeUnit.DAYS;
       long l = (!NasaExperimentUtils.a0())? 30: (long)NasaExperimentUtils.a0();
       g.y = dAYS.toMillis(l);
       int i = (!NasaExperimentUtils.b0())? 6: NasaExperimentUtils.b0();
       g.z = i;
    }
    public void g(){
       super();
       this.w = new g$a(this);
       this.x = new g$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r);
       this.q = slidePlayVie;
       slidePlayVie.i(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       g tq = this.q;
       if (tq != null) {
          tq.g(this.w);
       }
       return;
    }
    public void P8(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "5")) {
          return;
       }
       g tu = this.u;
       if (tu != null) {
          tu.onClick(p0);
       }
       this.R8(p1);
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putLong("click_location_permission_dialog_negative_button", System.currentTimeMillis());
       g.a(uEditor);
       return;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "8")) {
          return;
       }
       g tq = this.q;
       if (tq == null || (tq.getCurrentPhoto() != null && this.q.getCurrentPhoto().mEntity != null)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LOCAL_PERMISSION_POPUP";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("button_text", p0);
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.q.getCurrentPhoto().mEntity);
          u1.M(null, null, 1, uElementPack, uContentPack, null);
       }
    label_0053 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.q8(u.class);
       return;
    }
}
