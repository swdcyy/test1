package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3$mTextMainViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;
import java.lang.Object;
import rod.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rod.l;
import ynd.f;
import ynd.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public final class TextMainFragmentV3$mTextMainViewModel$2 extends Lambda implements a	// class@000c42
{
    public final TextMainFragmentV3 this$0;

    public void TextMainFragmentV3$mTextMainViewModel$2(TextMainFragmentV3 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final m invoke(){
       TextMainFragmentV3$mTextMainViewModel$2 obj = PatchProxy.apply(null, this, TextMainFragmentV3$mTextMainViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       return ViewModelProviders.of(obj, new l(obj.vh().a())).get(m.class);
    }
}
