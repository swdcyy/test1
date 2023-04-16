package com.yxcorp.gifshow.detail.plc.helper.h;
import ok.h;
import java.lang.Object;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.google.common.base.Optional;
import java.lang.String;

public final class h implements h	// class@00167a
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object apply(Object p0){
       return Optional.fromNullable(p0.mStage).or("");
    }
}
