package com.yxcorp.gifshow.activity.share.presenter.k1;
import ok.h;
import java.lang.Object;
import com.kuaishou.edit.draft.Asset;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class k1 implements h	// class@0013f8
{
    public static final k1 b;

    static {
       k1.b = new k1();
    }
    public void k1(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (TextUtils.x(p0.getAlbumId()))? p0.getFile(): p0.getAlbumId();
       return p0;
    }
}
