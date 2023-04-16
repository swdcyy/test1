package com.kuaishou.post.story.edit.decoration.text.font.MoodLocalFontVH$background$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MoodLocalFontVH$background$2 extends Lambda implements a	// class@000aee
{
    public final View $itemView;

    public void MoodLocalFontVH$background$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final FrameLayout invoke(){
       Object obj = PatchProxy.apply(null, this, MoodLocalFontVH$background$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$itemView.findViewById(0x7f0a34cc);
    }
    public Object invoke(){
       return this.invoke();
    }
}
