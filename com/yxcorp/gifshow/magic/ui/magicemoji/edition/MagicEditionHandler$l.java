package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$l;
import n3d.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import a4b.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import com.kuaishou.android.model.mix.Location;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import a4b.a$a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$b;
import fg6.a;
import com.google.gson.Gson;
import k4b.a;

public final class MagicEditionHandler$l implements a	// class@001bc5
{
    public final MagicEditionHandler b;
    public final a c;

    public void MagicEditionHandler$l(MagicEditionHandler p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(MagicEditionHandler$l.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MagicEditionHandler$l.class, "1")) {
          return;
       }
       MagicEditionHandler$l tb = this.b;
       if (p0 != 1000 || p1 != -1) {
          Object[] objArray = new Object[0];
          b.D().w("MagicEditionController", "无效的地理选择信息", objArray);
       }else {
          tb.g = false;
          if (p2 != null) {
             String str = "location";
             if (p2.hasExtra(str)) {
                Serializable serializable = SerializableHook.getSerializableExtra(p2, str);
                Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.kuaishou.android.model.mix.Location");
                Object[] objArray1 = new Object[0];
                b.D().w("MagicEditionController", "选择的地理位置: "+serializable.getCity(), objArray1);
                a$a uoa = this.c.a().get(0);
                a.o(uoa, "element");
                uoa.f(tb.a(serializable));
                MagicEditionHandler$b uob = tb.b();
                if (uob != null) {
                   uob.q(a.a.q(this.c));
                }
             }
          }
       }
       return;
    }
}
