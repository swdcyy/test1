package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$d;
import jn9.b$b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3;
import java.lang.Object;
import nn9.a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import androidx.lifecycle.MutableLiveData;
import rod.m;
import jod.f;
import ynd.g;
import nn9.b;
import nn9.d;
import jn9.b$b$a;

public final class TextFontViewBinderV3$d implements b$b	// class@000c57
{
    public final TextFontViewBinderV3 a;

    public void TextFontViewBinderV3$d(TextFontViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void a(a p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontViewBinderV3$d.class, "1")) {
          return;
       }
       a.p(p0, "state");
       a.p(p1, "result");
       if (p0.a() == LoadingStatus.DATA_LOADING_FINISH) {
          this.a.c.t0().setValue(this.a.f.a().a());
       }
       return;
    }
    public void b(b p0,b p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontViewBinderV3$d.class, "2");
    }
    public void c(d p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontViewBinderV3$d.class, "3")) {
          return;
       }
       a.p(p0, "newState");
       b$b$a.b(this, p0, p1);
       return;
    }
}
