package com.tencent.connect.share.QzonePublish$1;
import android.media.MediaPlayer$OnPreparedListener;
import com.tencent.connect.share.QzonePublish;
import java.lang.String;
import android.os.Bundle;
import android.app.Activity;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import android.media.MediaPlayer;
import java.io.File;
import com.tencent.open.log.SLog;

public class QzonePublish$1 implements MediaPlayer$OnPreparedListener	// class@000e4e
{
    public final String a;
    public final Bundle b;
    public final Activity c;
    public final IUiListener d;
    public final QzonePublish e;

    public void QzonePublish$1(QzonePublish p0,String p1,Bundle p2,Activity p3,IUiListener p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onPrepared(MediaPlayer p0){
       this.b.putString("videoPath", this.a);
       this.b.putInt("videoDuration", p0.getDuration());
       this.b.putLong("videoSize", new File(this.a).length());
       QzonePublish.a(this.e, this.c, this.b, this.d);
       SLog.i("openSDK_LOG.QzonePublish", "publishToQzone\(\) --end");
    }
}
