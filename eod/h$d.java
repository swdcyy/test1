package eod.h$d;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import eod.h;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b$a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import mn9.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import jn9.b;
import bod.d;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import eod.d;
import ynd.c;
import god.b;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import k2b.e0;
import pn9.d;

public final class h$d implements PostListComponentView$b	// class@000dc4
{
    public final h a;

    public void h$d(h p0){
       this.a = p0;
       super();
    }
    public void a(b p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h$d.class, "3")) {
          return;
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.b(this, p0, p1, p2);
       return;
    }
    public void b(LoadingStatus p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$d.class, "2")) {
          return;
       }
       a.p(p0, "newLoadingStatus");
       a.p(p1, "tag");
       PostListComponentView$b$a.a(this, p0, p1);
       return;
    }
    public void c(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h$d.class, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "tag");
       Object[] objArray = new Object[0];
       a.D().s("TextTemplateUnfoldViewBinderV2", "onItemSelected: "+p0.getId(), objArray);
       d uod = this.a.h.q();
       this.a.e.u0().setValue(p0.getId());
       this.a.e.v0().setValue(p0.e());
       MutableLiveData mutableLiveD = this.a.e.s0();
       TextStyleValue textStyleVal = p0.f();
       textStyleVal = (textStyleVal != null)? TextStyleValue.a(textStyleVal, 0, null, null, null, null, 0, null, false, 255, null): null;
       mutableLiveD.setValue(textStyleVal);
       d uod1 = this.a.D(p0);
       c uoc = this.a.e.r0();
       if (uoc != null) {
          uoc.a(uod, uod1);
       }
       Context context = this.a.m.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       b.a.b(context, p0);
       return;
    }
    public void d(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h$d.class, "4")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.c(this, p0, p1, p2);
       return;
    }
    public void e(b p0,b p1,String p2){
       d.a(this, p0, p1, p2);
    }
}
