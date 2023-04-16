package com.yxcorp.gifshow.record.album.utils.c;
import ok.o;
import java.lang.Object;
import r26.a;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import on5.b;
import com.kwai.kcube.TabIdentifier;

public final class c implements o	// class@001761
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && (p0.getStatus() == PostStatus.UPLOAD_FAILED || (p0.getStatus() == PostStatus.ENCODE_FAILED && (p0.getUploadInfo() != null && b.h.equals(p0.getUploadInfo().getMockFeedUploadTarget())))))? true: false;
       return b;
    }
}
