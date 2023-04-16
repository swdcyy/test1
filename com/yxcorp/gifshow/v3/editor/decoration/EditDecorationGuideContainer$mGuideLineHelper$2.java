package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationGuideContainer$mGuideLineHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationGuideContainer;
import java.lang.Object;
import xpc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import xpc.b$b;

public final class EditDecorationGuideContainer$mGuideLineHelper$2 extends Lambda implements a	// class@000f04
{
    public final EditDecorationGuideContainer this$0;

    public void EditDecorationGuideContainer$mGuideLineHelper$2(EditDecorationGuideContainer p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, EditDecorationGuideContainer$mGuideLineHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context context = this.this$0.getContext();
       a.o(context, "context");
       return new b(context, this.this$0);
    }
}
