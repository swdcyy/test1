package com.kuaishou.live.lite.comment.editor.LiveLiteEmotionFloatEditorFragment;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import com.kuaishou.live.lite.comment.editor.LiveLiteEmotionFloatEditorFragment$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import e17.i$b;
import e17.i;
import kotlin.jvm.internal.a;
import android.view.Window;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;

public final class LiveLiteEmotionFloatEditorFragment extends EmotionFloatEditorFragment	// class@000802
{
    public long f2;
    public static final LiveLiteEmotionFloatEditorFragment$a g2;

    static {
       LiveLiteEmotionFloatEditorFragment.g2 = new LiveLiteEmotionFloatEditorFragment$a(null);
    }
    public void LiveLiteEmotionFloatEditorFragment(){
       super();
    }
    public int Ei(){
       return 0x7f0806c9;
    }
    public void Uh(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEmotionFloatEditorFragment.class, "1")) {
          return;
       }
       if ((SystemClock.elapsedRealtime() - this.f2) - TimeUnit.SECONDS.toMillis(1) > 0) {
          if (this.getDialog() != null) {
             i$b uob = i.m();
             uob.x(R.string.arg_RES_7f101e22);
             uob.p(R.drawable.arg_RES_7f082462);
             Dialog dialog = this.getDialog();
             a.m(dialog);
             a.o(dialog, "dialog!!");
             Window window = dialog.getWindow();
             a.m(window);
             a.o(window, "dialog!!.window!!");
             View decorView = window.getDecorView();
             Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
             uob.n(decorView);
             i.z(uob);
          }
          this.f2 = SystemClock.elapsedRealtime();
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0c58;
    }
}
