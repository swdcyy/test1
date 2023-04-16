package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$s$a;
import com.yxcorp.gifshow.camera.bubble.b$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class MultiTakePictureController$s$a implements b$c	// class@000eeb
{
    public static final MultiTakePictureController$s$a a;

    static {
       MultiTakePictureController$s$a.a = new MultiTakePictureController$s$a();
    }
    public void MultiTakePictureController$s$a(){
       super();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$s$a.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("first_show_new_multi_album_tips", false);
       g.a(uEditor);
       return;
    }
}
