package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$e;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import lod.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ood.d;
import ood.b;
import bod.a;
import java.util.Map;
import java.util.List;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import brd.g;
import java.util.ArrayList;
import lod.i;
import brd.t;
import t45.d;
import brd.z;
import lod.j;
import lod.k;
import erd.g;
import crd.b;
import crd.a;

public final class TextTemplateRepoV3$e implements g	// class@000c25
{
    public final TextTemplateRepoV3 b;
    public final a c;

    public void TextTemplateRepoV3$e(TextTemplateRepoV3 p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$e.class, "1")) {
          return;
       }
       String str = "emitter";
       a.p(p0, str);
       if (this.c.n() == null || this.c.j() == null) {
          TextTemplateRepoV3$e tc = this.c;
          TextTemplateRepoV3$e uoe = tc;
          uoe.v(new b(tc.o()));
          b uob = this.c.n();
          a.m(uob);
          this.b.f.put(this.c.b(), uob);
       }
       List list = this.b.e(this.c);
       TextTemplateRepoV3 i = this.b.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoidTwoRefs(list, p0, i, TextFontRepoV3.class, "5")) {
          a.p(list, "fontItems");
          a.p(p0, str);
          if (i.a(list)) {
             p0.onNext(list);
             p0.onComplete();
          }else {
             i.a.c(t.create(new i(i, list, new ArrayList())).subscribeOn(d.c).observeOn(d.a).subscribe(new j(i, list, p0), new k(p0)));
          }
       }
       return;
    }
}
