package jca.a$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import jca.a;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.post.api.widget.RecordSeekBar;
import brd.y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import ica.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import gca.b;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import gca.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a$a implements SeekBar$OnSeekBarChangeListener	// class@002a47
{
    public int b;
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, a$a.class, "1")) {
          return;
       }
       if (p2) {
          a$a tc = this.c;
          tc.i.onNext(Integer.valueOf(tc.d.getProgress()));
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.b = p0.getProgress();
       }
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       ClientContent$ContentPackage uContentPack;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       if (p0 != null) {
          int i = (this.c.D().getActivity() instanceof GifshowActivity && this.c.m.o0().getValue() != null)? 1: 0;
          i = (i)? p0: null;
          if (i != null) {
             a a = a.a;
             FragmentActivity activity = this.c.D().getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             ClientEvent$ElementPackage value = this.c.m.o0().getValue();
             a.m(value);
             String typeLoggerNa = value.a().getTypeLoggerName();
             a$a tb = this.b;
             int progress = p0.getProgress();
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(activity, typeLoggerNa, Integer.valueOf(tb), Integer.valueOf(progress), a, a.class, "2")) {
                a.p(activity, "page");
                a.p(typeLoggerNa, "fineTuningFeature");
                value = new ClientEvent$ElementPackage();
                value.action2 = "ADJUST_SLIDER";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("feature", typeLoggerNa);
                jsonObject.a0("from", Integer.valueOf(tb));
                jsonObject.a0("to", Integer.valueOf(progress));
                value.params = jsonObject.toString();
                u1.L("", activity, 1, value, null);
             }
          }
       }
    label_00c1 :
       return;
    }
}
