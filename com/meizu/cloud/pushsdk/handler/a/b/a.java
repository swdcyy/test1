package com.meizu.cloud.pushsdk.handler.a.b.a;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.a.c.g;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.a.c.b;
import com.meizu.cloud.pushsdk.handler.a.c.f;
import com.meizu.cloud.pushsdk.util.d;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushinternal.DebugLogger;
import android.os.Build$VERSION;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import com.meizu.cloud.pushsdk.handler.a.b.b;
import java.util.List;
import java.lang.Exception;
import com.meizu.cloud.pushsdk.util.a;
import com.meizu.cloud.pushsdk.platform.a.b;
import com.meizu.cloud.pushsdk.c.a.c;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.b.a;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.handler.a.c.a;

public class a extends a	// class@001533
{

    public void a(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 0x10000;
    }
    public void a(g p0){
       d.b(this.d(), this.d().getPackageName(), p0.d().b().d(), p0.d().b().a(), p0.d().b().e(), p0.d().b().b());
    }
    public void a(g p0,c p1){
       File uFile;
       String str3;
       DebugLogger.flush();
       String str = p0.d().b().a();
       String str1 = p0.d().b().d();
       String str2 = ".zip";
       str = (Build$VERSION.SDK_INT >= 29)? MzSystemUtils.getDocumentsPath(this.d())+"/pushSdktmp/"+str+"_"+str1+str2: Environment.getExternalStorageDirectory().getAbsolutePath()+"/Android/data/pushSdktmp/"+str+"_"+str1+str2;
       b uob = new b(str);
       try{
          int i = 0;
          uob.a(p0.c());
          str = i;
          uFile = new File(str);
       }catch(java.lang.Exception e0){
          str = e0.getMessage();
          DebugLogger.e("AbstractMessageHandler", "zip error message "+str);
       }
       if (uFile != null && (uFile.length() / 1024) - (long)p0.a() > 0) {
          str = "the upload file exceeds the max size";
       }else if(p0.b() && !a.b(this.d())){
          str = "current network not allowed upload log file";
       }
       c uoc = b.a(this.d()).a(p0.d().b().a(), p0.d().b().d(), str, uFile);
       if (uoc != null && uoc.b()) {
          if (uFile != null) {
             uFile.delete();
          }
          DebugLogger.e("AbstractMessageHandler", "upload success "+uoc.a());
       }else if(uoc != null){
          str3 = "upload error code "+uoc.c()+uoc.a();
       }else {
          str3 = "upload error";
       }
       DebugLogger.i("AbstractMessageHandler", str3);
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       int i;
       DebugLogger.i("AbstractMessageHandler", "start LogUploadMessageHandler match");
       String stringExtra = p0.getStringExtra("mz_push_control_message");
       boolean b = false;
       if (!TextUtils.isEmpty(stringExtra)) {
          b uob = b.a(stringExtra);
          if (uob.a() != null) {
             i = uob.a().a();
          label_0028 :
             if (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("2").equals(String.valueOf(i))) {
                b = true;
             }
             return b;
          }
       }
       i = 0;
       goto label_0028 ;
    }
    public void b(Object p0){
       this.a(p0);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public g l(Intent p0){
       return new g(p0.getStringExtra("pushMessage"), p0.getStringExtra("mz_push_control_message"), p0.getStringExtra("statistics_imei_key"), p0.getStringExtra("extra_app_push_seq_Id"));
    }
}
