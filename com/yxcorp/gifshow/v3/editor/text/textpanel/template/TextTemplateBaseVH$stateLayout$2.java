package com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateBaseVH$stateLayout$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTemplateBaseVH$stateLayout$2 extends Lambda implements a	// class@0014e3
{
    public final View $itemView;

    public void TextTemplateBaseVH$stateLayout$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final FrameLayout invoke(){
       Object obj = PatchProxy.apply(null, this, TextTemplateBaseVH$stateLayout$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$itemView.findViewById(0x7f0a14cf);
    }
    public Object invoke(){
       return this.invoke();
    }
}
