package eub.a$a;
import erd.g;
import eub.a;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import tkd.b;
import tkd.d;
import bq.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import q16.a$a;
import java.lang.Integer;
import java.lang.Number;
import kotlin.jvm.internal.a;
import q16.a;
import eub.i;
import xvc.f;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;

public final class a$a implements g	// class@002819
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          DraftFileManager.E().m0(p0);
          a$a uoa = d.a(0x7c418b06).Sz(p0, null, null, 4, true, null);
          Integer integer = this.b.r();
          if (integer != null) {
             a.o(uoa, "editParamBuilder");
             uoa.T1 = integer.intValue();
          }
          a uoa1 = uoa.f();
          a.o(uoa1, "editParamBuilder.build\(\)");
          this.b.q(uoa1);
          c[] uocArray = new c[]{p0};
          this.b.p(new f(CollectionsKt__CollectionsKt.r(uocArray)));
          a.o(p0, "it");
          this.b.l().k(p0);
       }
       return;
    }
}
