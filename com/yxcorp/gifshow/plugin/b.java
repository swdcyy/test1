package com.yxcorp.gifshow.plugin.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.plugin.a;
import ok.x;
import java.lang.Object;
import uxb.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g80.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@000fb8
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("DisabledPhotoAlbumDirs", b.e(p0.mDisabledPhotoAlbumDirs));
          g.a(uEditor);
       }
       return;
    }
}
