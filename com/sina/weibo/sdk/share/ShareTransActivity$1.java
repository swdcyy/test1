package com.sina.weibo.sdk.share.ShareTransActivity$1;
import android.os.Handler;
import com.sina.weibo.sdk.share.ShareTransActivity;
import android.os.Looper;
import android.os.Message;
import android.content.Intent;

public final class ShareTransActivity$1 extends Handler	// class@000bcf
{
    public final ShareTransActivity y;

    public void ShareTransActivity$1(ShareTransActivity p0,Looper p1){
       this.y = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       super.handleMessage(p0);
       if (p0.what == 1) {
          p0 = p0.obj;
          if (p0 instanceof Intent) {
             ShareTransActivity.a(this.y, p0);
             return;
          }
       }
       ShareTransActivity.a(this.y);
       return;
    }
}
