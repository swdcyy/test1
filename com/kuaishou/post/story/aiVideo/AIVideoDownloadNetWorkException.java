package com.kuaishou.post.story.aiVideo.AIVideoDownloadNetWorkException;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class AIVideoDownloadNetWorkException extends Throwable	// class@000aa6
{

    public void AIVideoDownloadNetWorkException(String p0,Throwable p1){
       a.p(p0, "msg");
       a.p(p1, "err");
       super(p0, p1);
    }
}
