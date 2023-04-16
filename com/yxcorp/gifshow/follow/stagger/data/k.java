package com.yxcorp.gifshow.follow.stagger.data.k;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.stagger.data.m;
import com.yxcorp.gifshow.postwork.PostStatus;

public final class k implements o	// class@00117a
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && (p0.getMockFeedTarget() && (p0.getFeedStatus() == PostStatus.UPLOAD_COMPLETE || p0.getFeedStatus() == null)))? true: false;
       return b;
    }
}
