package com.yxcorp.gifshow.v3.mixed.timeline.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import com.yxcorp.gifshow.v3.mixed.timeline.j$a;
import com.yxcorp.gifshow.v3.mixed.timeline.j$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.mixed.model.b;
import gwc.t;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import gwc.s;
import gwc.r;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.v3.mixed.model.MixStatus;
import ekd.m1;
import android.widget.Button;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTranslationIndicators;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public class j extends PresenterV2	// class@001570
{
    public m A;
    public TransitionEffectFragment$c B;
    public VideoSDKPlayerView p;
    public View q;
    public View r;
    public Button s;
    public Button t;
    public View u;
    public View v;
    public MixTranslationIndicators w;
    public b x;
    public final MixImporterActivity y;
    public final MixImporterFragment z;

    public void j(MixImporterFragment p0){
       super();
       this.A = new j$a(this);
       this.B = new j$b(this);
       this.z = p0;
       this.y = p0.j;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       b uob = this.z.dh();
       this.x = uob;
       uob.h.observe(this.z, new t(this));
       this.x.o.observe(this.z, new s(this));
       this.x.j.observe(this.z, new r(this));
       this.R8();
       this.u.setOnClickListener(this.A);
       return;
    }
    public void J8(){
    }
    public final boolean P8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.x;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "17");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.F0() == MixStatus.EDITING){
          b = obj.w0();
       }else {
          b = false;
       }
       return b;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       j tu = this.u;
       int i = 0;
       int i1 = (this.P8())? 0: 8;
       tu.setVisibility(i1);
       tu = this.v;
       if (!this.P8()) {
          i = 8;
       }
       tu.setVisibility(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a405f);
       this.r = m1.f(p0, 0x7f0a1716);
       this.t = m1.f(p0, 0x7f0a103a);
       this.w = m1.f(p0, 0x7f0a4054);
       this.s = m1.f(p0, 0x7f0a3643);
       this.v = m1.f(p0, 0x7f0a4057);
       this.p = m1.f(p0, 0x7f0a30f6);
       this.q = m1.f(p0, 0x7f0a3f2c);
       return;
    }
}
