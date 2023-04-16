package com.yxcorp.gifshow.featured.detail.featured.presenter.PhotoInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PhotoInfo	// class@000f69
{
    public int a;
    public int b;
    public int c;
    public int d;
    public final QPhoto e;
    public boolean hasSameHash;
    public boolean hasSameId;
    public int index;
    public final String lsid;
    public final String photoId;
    public final String userId;

    public void PhotoInfo(QPhoto p0){
       a.p(p0, "mPhoto");
       super();
       this.e = p0;
       this.photoId = p0.getPhotoId();
       this.userId = p0.getUserId();
       this.lsid = p0.getListLoadSequenceID();
       this.index = -1;
       this.a = -1;
       this.b = -1;
       this.c = -1;
       this.d = -1;
    }
}
