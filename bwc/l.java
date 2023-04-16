package bwc.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import bwc.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.mixed.model.b;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import bwc.i;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import hwc.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bwc.j;
import im8.f;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import pb9.p;
import hwc.d$a;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import android.view.View;
import ekd.m1;

public class l extends PresenterV2	// class@0004b0
{
    public Button p;
    public VideoSDKPlayerView q;
    public b r;
    public f s;
    public final MixImporterFragment t;
    public double u;
    public m v;

    public void l(MixImporterFragment p0){
       super();
       this.u = 57.50f;
       this.v = new l$a(this);
       this.t = p0;
       this.s = p0.t;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.r = this.t.dh();
       this.p.setOnClickListener(this.v);
       if (this.getActivity() != null) {
          double d = 57.50f;
          double doubleExtra = this.getActivity().getIntent().getDoubleExtra("MIX_IMPORT_CLIP_DURATION", d);
          this.u = doubleExtra;
          if (!doubleExtra) {
             this.u = d;
          }
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       ViewModelProviders.of(activity).get(b.class).r.observe(this.t, new i(this));
       return;
    }
    public void P8(boolean p0,b p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ol, "2")) {
          return;
       }
       this.p.setClickable(false);
       ol = this.r;
       if (ol.v != null) {
          return;
       }
       ol.v = true;
       p1.q.setValue(Boolean.TRUE);
       d uod = new d(this.getActivity(), p1, p0, this.q, this.r.f, new j(this), this.s.get(), this.u);
       Void[] voidArray = new Void[false];
       ol.c(voidArray);
       this.s.set(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2dc0);
       this.q = m1.f(p0, 0x7f0a30f6);
       return;
    }
}
