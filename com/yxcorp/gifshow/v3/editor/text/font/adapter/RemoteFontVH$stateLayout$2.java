package com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$stateLayout$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RemoteFontVH$stateLayout$2 extends Lambda implements a	// class@001445
{
    public final View $itemView;

    public void RemoteFontVH$stateLayout$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final FrameLayout invoke(){
       Object obj = PatchProxy.apply(null, this, RemoteFontVH$stateLayout$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$itemView.findViewById(0x7f0a1486);
    }
    public Object invoke(){
       return this.invoke();
    }
}
