package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$q;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.b;
import oa0.a;
import android.content.SharedPreferences;

public final class MultiTakePictureController$q implements b$c	// class@000ee6
{
    public final MultiTakePictureController a;

    public void MultiTakePictureController$q(MultiTakePictureController p0){
       this.a = p0;
       super();
    }
    public final boolean c(){
       d obj = PatchProxy.apply(null, this, MultiTakePictureController$q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.d;
       a.o(obj, "mCallerContext");
       boolean b = true;
       if (obj.k() || !a.a.getBoolean("first_show_new_multi_take_tips", b)) {
          b = false;
       }
       return b;
    }
}
