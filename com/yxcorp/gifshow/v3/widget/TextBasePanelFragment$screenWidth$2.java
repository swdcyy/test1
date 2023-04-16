package com.yxcorp.gifshow.v3.widget.TextBasePanelFragment$screenWidth$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import java.lang.Integer;

public final class TextBasePanelFragment$screenWidth$2 extends Lambda implements a	// class@00165d
{
    public final TextBasePanelFragment this$0;

    public void TextBasePanelFragment$screenWidth$2(TextBasePanelFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, TextBasePanelFragment$screenWidth$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.y(this.this$0.getContext());
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
