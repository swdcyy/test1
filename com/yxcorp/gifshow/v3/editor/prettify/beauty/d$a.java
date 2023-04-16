package com.yxcorp.gifshow.v3.editor.prettify.beauty.d$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.d;
import java.lang.Object;
import voc.x;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.e;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import p0c.a;
import p0c.h;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import voc.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import q0c.c;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.beauty.util.BeautifyConfigSerializeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import qr4.k$b;
import kaa.v;
import com.kuaishou.edit.draft.Beauty;
import wba.i;
import ssc.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import msd.l;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt;

public class d$a implements y	// class@001152
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public final boolean a(){
       d y = this.b.y;
       boolean b = (y != null && y.mId > null)? true: false;
       return b;
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$a.class, "4")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EditBeautyPresenterV3", "discardEditChanges", objArray1);
       d x = this.b.x;
       if (x != null) {
          x.dh();
       }
       d$a tb = this.b;
       tb.y = objArray;
       x = tb.A;
       Objects.requireNonNull(x);
       if (!PatchProxy.applyVoid(objArray, x, e.class, "7")) {
          x.a(x.c);
       }
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$a uoa = d$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditBeautyPresenterV3", "saveEditorChanges", objArray);
       d$a tb = this.b;
       if (tb.x != null && !tb.s.a().n()) {
          this.b.x.dh();
       }
       VideoContext videoContext = this.b.t.f().x().e();
       String str = PatchProxy.apply(null, this, uoa, "2");
       if (str != patchProxyRe) {
       }else if(this.a()){
          str = a.a.q(c.a(this.b.y));
       }else {
          str = "";
       }
       videoContext = videoContext.K0(str);
       k$b uob = PatchProxy.apply(null, this, uoa, "3");
       if (uob != patchProxyRe) {
       }else if(!this.a()){
          uob = new k$b();
       }else {
          d y = this.b.y;
          d$a tb1 = this.b;
          uob = i.b(i.c(y, v.a(y.mId), tb1.A.M1(tb1.y.mId)), 1);
          uob.h = this.b.y.mUseQuickBeauty;
       }
       videoContext.J0(uob).f1(this.a());
       VideoContextDraftExtKt.a(this.b.t.f().x().e(), this.b.w, new i(this));
       this.b.y = null;
       return;
    }
    public void z2(){
       x.c(this);
    }
}
