package com.yxcorp.gifshow.v3.editor.text.font.adapter.LocalFontVH$textView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LocalFontVH$textView$2 extends Lambda implements a	// class@00143b
{
    public final View $itemView;

    public void LocalFontVH$textView$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final TextView invoke(){
       Object obj = PatchProxy.apply(null, this, LocalFontVH$textView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$itemView.findViewById(0x7f0a1485);
    }
    public Object invoke(){
       return this.invoke();
    }
}
