package com.yxcorp.gifshow.comment.utils.comboanim.a;
import erd.g;
import java.lang.Object;
import android.content.Context;
import com.yxcorp.gifshow.comment.utils.comboanim.ComboAnimView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Vibrator;

public final class a implements g	// class@00110b
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ComboAnimView.class, "17")) {
       }else {
          p0 = p0.getSystemService("vibrator");
          if (p0 != null && p0.hasVibrator()) {
             p0.vibrate(20);
          }
       }
       return;
    }
}
