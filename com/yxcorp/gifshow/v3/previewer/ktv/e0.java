package com.yxcorp.gifshow.v3.previewer.ktv.e0;
import ok.h;
import java.lang.Object;
import com.kuaishou.edit.draft.Asset;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class e0 implements h	// class@0015bc
{
    public static final e0 b;

    static {
       e0.b = new e0();
    }
    public void e0(){
       super();
    }
    public final Object apply(Object p0){
       if (p0 == null) {
          p0 = "";
       }else if(TextUtils.x(p0.getAlbumId())){
          p0 = p0.getFile();
       }else {
          p0 = p0.getAlbumId();
       }
       return p0;
    }
}
