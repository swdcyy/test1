package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction$a;
import erd.a;
import androidx.lifecycle.ViewModelProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uwc.b;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.a;

public final class PicTemplateCommitEditAction$a implements a	// class@001359
{
    public final ViewModelProvider b;

    public void PicTemplateCommitEditAction$a(ViewModelProvider p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicTemplateCommitEditAction$a.class, "1")) {
          return;
       }
       ViewModel viewModel = this.b.get(b.class);
       a.o(viewModel, "get\(T::class.java\)");
       viewModel.T0();
       return;
    }
}
