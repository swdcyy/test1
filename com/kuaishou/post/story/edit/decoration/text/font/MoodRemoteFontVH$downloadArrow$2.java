package com.kuaishou.post.story.edit.decoration.text.font.MoodRemoteFontVH$downloadArrow$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MoodRemoteFontVH$downloadArrow$2 extends Lambda implements a	// class@000af4
{
    public final View $itemView;

    public void MoodRemoteFontVH$downloadArrow$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final ImageView invoke(){
       Object obj = PatchProxy.apply(null, this, MoodRemoteFontVH$downloadArrow$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$itemView.findViewById(0x7f0a1484);
    }
    public Object invoke(){
       return this.invoke();
    }
}
