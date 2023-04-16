package com.yxcorp.gifshow.v3.editor.text.subtitle.j;
import erd.r;
import java.lang.Object;
import njd.a;
import faa.a;
import java.lang.StringBuilder;
import java.lang.String;
import evc.b;
import q87.c;

public final class j implements r	// class@00149d
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final boolean test(Object p0){
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("SubtitleAudioAssetUploadHelper", "takeUntil: status "+p0.a().a(), objArray);
       if (p0.a().a() != 20) {
          i = true;
       }
       return i;
    }
}
