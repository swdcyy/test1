package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$c;
import jn9.b$b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
import java.lang.Object;
import nn9.a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import jod.f;
import ynd.g;
import nn9.b;
import nn9.d;
import jn9.b$b$a;

public final class TextFontViewBinderV2$c implements b$b	// class@000ba0
{
    public final TextFontViewBinderV2 a;

    public void TextFontViewBinderV2$c(TextFontViewBinderV2 p0){
       this.a = p0;
       super();
    }
    public void a(a p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontViewBinderV2$c.class, "1")) {
          return;
       }
       a.p(p0, "state");
       a.p(p1, "result");
       if (p0.a() == LoadingStatus.DATA_LOADING_FINISH) {
          this.a.c.t0().setValue(this.a.d.a().a());
       }
       return;
    }
    public void b(b p0,b p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontViewBinderV2$c.class, "2");
    }
    public void c(d p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontViewBinderV2$c.class, "3")) {
          return;
       }
       a.p(p0, "newState");
       b$b$a.b(this, p0, p1);
       return;
    }
}
