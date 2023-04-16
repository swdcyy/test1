package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$o;
import suc.b;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;

public final class TextElementViewBinder$o implements b	// class@00140f
{
    public final TextElementViewBinder a;

    public void TextElementViewBinder$o(TextElementViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1,String p2){
       if (PatchProxy.isSupport(TextElementViewBinder$o.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TextElementViewBinder$o.class, "1")) {
          return;
       }
       a.p(p1, "oldString");
       a.p(p2, "newString");
       if (a.g(this.a.A.K0().getValue(), Boolean.TRUE)) {
          this.a.A.r1(p0, p2);
       }
       return;
    }
}
