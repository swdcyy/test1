package com.yxcorp.gifshow.detail.plc.helper.e;
import ok.h;
import java.lang.Object;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.google.common.base.Optional;
import java.lang.String;

public final class e implements h	// class@001677
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object apply(Object p0){
       return Optional.fromNullable(p0.mStage).or("");
    }
}
