package iba.f;
import laa.e;
import java.io.File;
import com.kuaishou.edit.draft.Theme;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import saa.a;
import java.util.List;
import yaa.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Theme$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.Iterable;

public class f extends e	// class@0027db
{
    public a f;
    public c g;

    public void f(File p0,Theme p1,c p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
       }else {
          this.d = new ArrayList();
          a uoa = new a(this.i(), this.h().getFiltersList(), this.c);
          this.f = uoa;
          this.d.add(uoa);
          c uoc = new c(this.i(), this.h().getMusicsList(), this.c);
          this.g = uoc;
          this.d.add(uoc);
       }
       return;
    }
    public GeneratedMessageLite d(){
       Theme theme = PatchProxy.apply(null, this, f.class, "2");
       if (theme != PatchProxyResult.class) {
       }else {
          Theme$b uob = Theme.newBuilder();
          uob.a(DraftUtils.i());
          theme = uob.build();
       }
       return theme;
    }
    public List j(GeneratedMessageLite p0){
       return null;
    }
    public void l(){
       Theme$b uob;
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (this.f.F()) {
          uob = this.f();
          uob.copyOnWrite();
          uob.instance.clearFilters();
          uob.copyOnWrite();
          uob.instance.addAllFilters(this.f.o());
          this.f.a0();
       }
       if (this.g.F()) {
          uob = this.f();
          uob.copyOnWrite();
          uob.instance.clearMusics();
          uob.copyOnWrite();
          uob.instance.addAllMusics(this.g.o());
          this.g.a0();
       }
       this.f().a(DraftUtils.m0(this.f().instance.getAttributes()));
       return;
    }
}
