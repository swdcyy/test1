package com.yxcorp.gifshow.activity.share.topic.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class e implements g	// class@00147c
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareTopicGuideFragment", "mTopicItemClickPublisher", p0);
    }
}
