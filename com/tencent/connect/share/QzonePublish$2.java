package com.tencent.connect.share.QzonePublish$2;
import android.media.MediaPlayer$OnErrorListener;
import com.tencent.connect.share.QzonePublish;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.tauth.UiError;

public class QzonePublish$2 implements MediaPlayer$OnErrorListener	// class@000e4f
{
    public final IUiListener a;
    public final QzonePublish b;

    public void QzonePublish$2(QzonePublish p0,IUiListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean onError(MediaPlayer p0,int p1,int p2){
       SLog.e("openSDK_LOG.QzonePublish", "publishToQzone\(\) mediaplayer onError\(\)");
       this.a.onError(new UiError(-5, "请选择有效的视频文件", null));
       return false;
    }
}
