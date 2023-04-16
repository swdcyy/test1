package com.kuaishou.post.story.entrance.vb.MoodDialogViewBinder$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class MoodDialogViewBinder$b implements PopupInterface$h	// class@000b53
{

    public void MoodDialogViewBinder$b(){
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodDialogViewBinder$b.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("mood_guide_dialog_showed", true);
       g.a(uEditor);
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
