package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$c;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import s5b.b;
import q87.c;
import com.yxcorp.gifshow.activity.share.model.LocationResponse;
import java.util.List;
import java.lang.Integer;
import a4b.b;
import java.util.HashMap;
import a4b.a;
import com.kuaishou.android.model.mix.Location;
import java.util.Iterator;
import a4b.a$a;
import fg6.a;
import com.google.gson.Gson;
import k4b.a;

public final class MagicEditionHandler$c implements g	// class@001bbc
{
    public final MagicEditionHandler b;

    public void MagicEditionHandler$c(MagicEditionHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler$c.class, "1")) {
       }else {
          MagicEditionHandler$c tb = this.b;
          a.o(p0, "res");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MagicEditionHandler.class, "17")) {
             int i = 0;
             Object[] objArray = new Object[i];
             b.D().w("MagicEditionController", "handleLocation", objArray);
             p0 = p0.a();
             if (p0 == null || (p0.getItems() != null && p0.getItems().size())) {
                Integer integer = tb.c();
                if (integer != null) {
                   a uoa = b.d.a().get(Integer.valueOf(integer.intValue()));
                   if (uoa != null) {
                      a.o(uoa, "MagicEditionResourceInst\x20\x02heMap[recordId] ?: return\x00");
                      p0 = p0.getItems().get(i);
                      Iterator iterator = uoa.a().iterator();
                      while (iterator.hasNext()) {
                         a$a uoa1 = iterator.next();
                         a.o(uoa1, "ele");
                         if (a.g(uoa1.d(), "location")) {
                            a.o(p0, "location");
                            uoa1.f(tb.a(p0));
                            p0 = tb.h;
                            if (p0 != null) {
                               p0.q(a.a.q(uoa));
                               break ;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
