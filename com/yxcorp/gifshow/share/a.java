package com.yxcorp.gifshow.share.a;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.share.module.SimilarPhotoResponse;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;

public final class a implements g	// class@001b73
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       Iterator iterator = p0.mPhotos.iterator();
       while (iterator.hasNext()) {
          iterator.next().setListLoadSequenceID(p0.mLlsid);
       }
       return;
    }
}
