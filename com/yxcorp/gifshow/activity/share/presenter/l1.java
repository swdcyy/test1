package com.yxcorp.gifshow.activity.share.presenter.l1;
import ok.h;
import java.lang.Object;
import com.kuaishou.edit.draft.Asset;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.models.QMedia;
import lxa.a;

public final class l1 implements h	// class@0013fc
{
    public static final l1 b;

    static {
       l1.b = new l1();
    }
    public void l1(){
       super();
    }
    public final Object apply(Object p0){
       if (p0 == null) {
          p0 = null;
       }else if(TextUtils.x(p0.getAlbumId())){
          p0 = p0.getFile();
       }else {
          p0 = p0.getAlbumId();
       }
       String str = p0;
       p0 = new File(str);
       QMedia qMedia = new QMedia((long)p0.hashCode(), str, 0, a.a(p0.lastModified(), str), 0);
       p0 = v9;
       return p0;
    }
}
