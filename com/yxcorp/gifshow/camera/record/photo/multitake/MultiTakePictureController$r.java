package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$r;
import com.yxcorp.gifshow.camera.bubble.b$c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class MultiTakePictureController$r implements b$c	// class@000ee7
{
    public final MultiTakePictureController a;

    public void MultiTakePictureController$r(MultiTakePictureController p0){
       this.a = p0;
       super();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$r.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("first_show_new_multi_take_tips", false);
       g.a(uEditor);
       if (!this.a.c1() && PermissionUtils.a(this.a.e, "android.permission.WRITE_EXTERNAL_STORAGE")) {
          this.a.p2(false, false, true);
       }
       return;
    }
}
