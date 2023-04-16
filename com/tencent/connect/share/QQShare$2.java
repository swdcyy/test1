package com.tencent.connect.share.QQShare$2;
import com.tencent.open.utils.d;
import com.tencent.connect.share.QQShare;
import android.os.Bundle;
import java.lang.String;
import com.tencent.tauth.IUiListener;
import android.app.Activity;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.tauth.UiError;
import com.tencent.open.log.SLog;
import com.tencent.open.b.e;
import com.tencent.connect.auth.QQToken;
import android.os.SystemClock;
import java.lang.Long;
import java.util.ArrayList;

public class QQShare$2 implements d	// class@000e4c
{
    public final Bundle a;
    public final String b;
    public final String c;
    public final IUiListener d;
    public final Activity e;
    public final QQShare f;

    public void QQShare$2(QQShare p0,Bundle p1,String p2,String p3,IUiListener p4,Activity p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void a(int p0,String p1){
       if (!p0) {
          this.a.putString("imageLocalUrl", p1);
       }else if(TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c)){
          QQShare$2 td = this.d;
          if (td != null) {
             td.onError(new UiError(-6, "获取分享图片失败!", null));
             SLog.e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
          }
          e.a().a(1, "SHARE_CHECK_SDK", "1000", QQShare.b(this.f).getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "获取分享图片失败!");
          return;
       }
       QQShare.a(this.f, this.e, this.a, this.d);
       return;
    }
    public void a(int p0,ArrayList p1){
       if (!p0) {
          this.a.putStringArrayList("imageLocalUrlArray", p1);
       }else if(TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c)){
          QQShare$2 td = this.d;
          if (td != null) {
             td.onError(new UiError(-6, "获取分享图片失败!", null));
             SLog.e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
          }
          e.a().a(1, "SHARE_CHECK_SDK", "1000", QQShare.c(this.f).getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "获取分享图片失败!");
          return;
       }
       QQShare.a(this.f, this.e, this.a, this.d);
       return;
    }
}
