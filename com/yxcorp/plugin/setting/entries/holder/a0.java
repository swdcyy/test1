package com.yxcorp.plugin.setting.entries.holder.a0;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;

public final class a0 implements o	// class@000844
{
    public static final a0 b;

    static {
       a0.b = new a0();
    }
    public void a0(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0.mCurrentStatus == APKDownloadTask$DownloadStatus.COMPLETED)? true: false;
       return b;
    }
}
