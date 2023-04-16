package com.kuaishou.post.story.entrance.vb.MoodDialogViewBinder;
import ei0.a;
import android.app.Activity;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.entrance.vb.MoodDialogViewBinder$dialogBuilder$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences;
import com.kwai.robust.PatchProxyResult;
import u07.t$a;
import u07.a;
import com.kuaishou.post.story.entrance.vb.MoodDialogViewBinder$a;
import w07.l;
import com.kuaishou.post.story.entrance.vb.MoodDialogViewBinder$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;

public final class MoodDialogViewBinder extends a	// class@000b58
{
    public t c;
    public final p d;
    public final Activity e;

    public void MoodDialogViewBinder(Activity p0,View p1){
       a.p(p0, "activity");
       a.p(p1, "mRootView");
       super(p1);
       this.e = p0;
       this.d = s.c(new MoodDialogViewBinder$dialogBuilder$2(this));
    }
    public void B(){
       MoodDialogViewBinder moodDialogVi = MoodDialogViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, moodDialogVi, "2")) {
          return;
       }
       if (!a.a.getBoolean("mood_guide_dialog_showed", false)) {
          t$a uoa = PatchProxy.apply(objArray, this, moodDialogVi, "1");
          if (uoa == PatchProxyResult.class) {
             uoa = this.d.getValue();
          }
          uoa = a.b(uoa);
          uoa.a0(MoodDialogViewBinder$a.a);
          this.c = uoa.Y(new MoodDialogViewBinder$b());
       }
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, MoodDialogViewBinder.class, "3")) {
          return;
       }
       MoodDialogViewBinder tc = this.c;
       if (tc != null) {
          tc.o();
       }
       return;
    }
}
