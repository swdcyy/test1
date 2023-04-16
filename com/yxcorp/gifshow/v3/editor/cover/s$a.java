package com.yxcorp.gifshow.v3.editor.cover.s$a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$a;
import com.yxcorp.gifshow.v3.editor.cover.s;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import w46.b;

public class s$a implements DynamicTextViewModel$a	// class@000ecf
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       if (this.a.T.isEmpty()) {
          this.a.Z8();
       }else {
          this.a.a9();
       }
       this.a.X8();
       Object[] objArray = new Object[0];
       a.D().w("CoverTextPresenter", "retryFetchTextConfig result size = "+p0.size(), objArray);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "2")) {
          return;
       }
       this.a.Z8();
       this.a.X8();
       Object[] objArray = new Object[0];
       a.D().t("CoverTextPresenter", "retryFetchTextConfig error: "+p0, objArray);
       return;
    }
}
