package com.tencent.connect.api.QQAuthManage;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.auth.c;
import com.tencent.connect.auth.QQToken;
import android.app.Activity;
import com.tencent.open.apireq.IApiCallback;
import android.content.Context;
import com.tencent.open.utils.i;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.StringBuilder;
import android.content.Intent;
import android.net.Uri;
import com.tencent.connect.api.QQAuthManage$Resp;
import com.tencent.open.apireq.BaseResp;
import com.tencent.connect.api.QQAuthManage$1;
import com.tencent.tauth.IUiListener;

public class QQAuthManage extends BaseApi	// class@000e15
{

    public void QQAuthManage(c p0,QQToken p1){
       super(p0, p1);
    }
    public static void a(QQAuthManage p0,Activity p1,IApiCallback p2){
       p0.a(p1, p2);
    }
    public final int a(Activity p0){
       if (!i.c(p0)) {
          return -1000;
       }else if(!i.b(p0)){
          return -1002;
       }else if(i.c(p0, "8.6.0") < 0){
          return -1001;
       }else {
          return 0;
       }
    }
    public final void a(Activity p0,IApiCallback p1){
       SLog.i("QQAuthManage", "doGotoMangePage");
       String str = "mqqapi://opensdk/open_auth_manage";
       this.a(str, p0);
       Intent intent = new Intent();
       intent.setData(Uri.parse(str));
       intent.putExtra("pkg_name", p0.getPackageName());
       intent.setPackage("com.tencent.mobileqq");
       intent.setFlags(0x14000000);
       p0.startActivity(intent);
       p1.onResp(new QQAuthManage$Resp());
    }
    public void gotoManagePage(Activity p0,IApiCallback p1){
       String str = "QQAuthManage";
       QQAuthManage$Resp resp = new QQAuthManage$Resp();
       int i = this.a(p0);
       if (i) {
          resp.setCode(i);
          p1.onResp(resp);
          return;
       }else if(!this.c.isSessionValid() || this.c.getOpenId() == null){
          resp.setCode(-2001);
          p1.onResp(resp);
          return;
       }else {
          this.b.a(new QQAuthManage$1(this, p0, p1, resp));
          return;
       }
    }
}
