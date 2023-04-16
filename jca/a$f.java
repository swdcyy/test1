package jca.a$f;
import lca.a;
import jca.a;
import java.lang.Object;
import gca.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import rwc.j;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$e;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo;
import ica.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import gca.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class a$f implements a	// class@002a4c
{
    public final a a;

    public void a$f(a p0){
       this.a = p0;
       super();
    }
    public void a(b p0,int p1){
       a a;
       a$f uof = a$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "1")) {
          return;
       }
       String str = "fineTuningItemUiData";
       a.p(p0, str);
       PictureSelectView$e value = this.a.n.getValue();
       if (value != null) {
          value.a(this.a.m.d);
       }
       a m = this.a.m;
       Objects.requireNonNull(m);
       if (!PatchProxy.applyVoidOneRefs(p0, m, FineTuningViewModel.class, "5")) {
          a.p(p0, str);
          FineTuningViewModel e = m.e;
          Objects.requireNonNull(e, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.yxcorp.gifshow.editor.fine.tuning.data.FineTuningItemUiData?>");
          e.setValue(p0);
          FineTuningRepo.e(m.h, m.d, 0, 2, null);
          a = a.a;
          str = p0.a().getTypeLoggerName();
          FineTuningViewModel d = m.d;
          boolean b = m.h.b();
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(d), Boolean.valueOf(b), a, a.class, "3")) {
             a.p(str, "fineTuningFeature");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ADJUST_DATAIL_FEATURE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("feature", str);
             str = 1;
             if (!b) {
                jsonObject.a0("picture_index", Integer.valueOf((d + str)));
             }
             uElementPack.params = jsonObject.toString();
             u1.u(str, uElementPack, null);
          }
          Object[] objArray = new Object[0];
          a.D().w("FineTuningViewModel", "selectFineTuningType fineTuningItemUiData:"+p0, objArray);
       }
       return;
    }
}
