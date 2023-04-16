package lz9.z;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import lz9.b0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.SystemClock;
import java.lang.System;
import ek9.l1;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class z implements PopupInterface$d	// class@002ef0
{
    public final b0 a;

    public void z(b0 p0){
       this.a = p0;
       super();
    }
    public void a(c p0,int p1){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oz, "1")) {
          return;
       }
       if (p1 == 2) {
          p0.U = SystemClock.elapsedRealtime();
          SharedPreferences$Editor uEditor = l1.a.edit();
          uEditor.putLong("commentBtnAtBubbleShowedTime", System.currentTimeMillis());
          g.a(uEditor);
       }
       return;
    }
}
