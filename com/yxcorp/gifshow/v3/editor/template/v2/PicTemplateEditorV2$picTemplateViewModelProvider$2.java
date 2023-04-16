package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$picTemplateViewModelProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2;
import androidx.lifecycle.ViewModelProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$picTemplateViewModelProvider$2$a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProviders;

public final class PicTemplateEditorV2$picTemplateViewModelProvider$2 extends Lambda implements a	// class@001341
{
    public final PicTemplateEditorV2 this$0;

    public void PicTemplateEditorV2$picTemplateViewModelProvider$2(PicTemplateEditorV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider invoke(){
       EditorDelegate obj = PatchProxy.apply(null, this, PicTemplateEditorV2$picTemplateViewModelProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.i();
       a.o(obj, "delegate");
       return ViewModelProviders.of(obj.q(), new PicTemplateEditorV2$picTemplateViewModelProvider$2$a(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
