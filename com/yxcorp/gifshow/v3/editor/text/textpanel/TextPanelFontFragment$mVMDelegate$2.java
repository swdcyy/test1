package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment$mVMDelegate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import androidx.lifecycle.ViewModel;

public final class TextPanelFontFragment$mVMDelegate$2 extends Lambda implements a	// class@0014be
{
    public final TextPanelFontFragment this$0;

    public void TextPanelFontFragment$mVMDelegate$2(TextPanelFontFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final FontVMDelegate invoke(){
       Object obj = PatchProxy.apply(null, this, TextPanelFontFragment$mVMDelegate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       FragmentActivity activity = this.this$0.getActivity();
       a.m(activity);
       ViewModel viewModel = ViewModelProviders.of(activity).get(FontViewModel.class);
       a.o(viewModel, "ViewModelProviders.of\(ac¡­ontViewModel::class.java\)");
       return new FontVMDelegate(viewModel);
    }
    public Object invoke(){
       return this.invoke();
    }
}
