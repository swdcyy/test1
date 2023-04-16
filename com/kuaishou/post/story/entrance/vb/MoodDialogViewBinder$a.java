package com.kuaishou.post.story.entrance.vb.MoodDialogViewBinder$a;
import w07.l;
import java.lang.Object;
import u07.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public final class MoodDialogViewBinder$a implements l	// class@000b52
{
    public static final MoodDialogViewBinder$a a;

    static {
       MoodDialogViewBinder$a.a = new MoodDialogViewBinder$a();
    }
    public void MoodDialogViewBinder$a(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodDialogViewBinder$a.class, "1")) {
       }else {
          a.p(p0, "it");
          p0 = p0.z();
          if (p0 != null) {
             p0 = p0.findViewById(R.id.positive);
             if (p0 != null) {
                p0.width = a1.e(168.00f);
             }
          }
       }
       return;
    }
}
