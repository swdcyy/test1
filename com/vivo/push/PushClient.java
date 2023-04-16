package com.vivo.push.PushClient;
import android.content.Context;
import java.lang.Object;
import com.vivo.push.e;
import java.lang.String;
import com.vivo.push.IPushActionListener;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.List;
import com.vivo.push.b.f;
import com.vivo.push.o;

public class PushClient	// class@00102c
{
    public static PushClient sPushClient;

    public void PushClient(Context p0){
       super();
       e.a().a(p0);
    }
    public static synchronized PushClient getInstance(Context p0){
       _monitor_enter(PushClient.class);
       if (PushClient.sPushClient == null) {
          PushClient.sPushClient = new PushClient(p0.getApplicationContext());
       }
       _monitor_exit(PushClient.class);
       return PushClient.sPushClient;
    }
    public void bindAlias(String p0,IPushActionListener p1){
       this.checkParam(p0);
       e.a().a(p0, p1);
    }
    public void checkManifest(){
       e.a().b();
    }
    public final void checkParam(String p0){
       if (p0 != null) {
          return;
       }
       throw new IllegalArgumentException(("PushManager String param should not be ").concat(String.valueOf(p0)));
    }
    public void delTopic(String p0,IPushActionListener p1){
       ArrayList uArrayList = new ArrayList(1);
       uArrayList.add(p0);
       e.a().b(uArrayList, p1);
    }
    public String getAlias(){
       return e.a().j();
    }
    public String getRegId(){
       return e.a().f();
    }
    public List getTopics(){
       return e.a().c();
    }
    public String getVersion(){
       return "3.4.0.0";
    }
    public void initialize(){
       this.checkManifest();
       e.a().a(new f());
    }
    public boolean isSupport(){
       return e.a().d();
    }
    public void setSystemModel(boolean p0){
       e.a().a(p0);
    }
    public void setTopic(String p0,IPushActionListener p1){
       ArrayList uArrayList = new ArrayList(1);
       uArrayList.add(p0);
       e.a().a(uArrayList, p1);
    }
    public void turnOffPush(IPushActionListener p0){
       e.a().b(p0);
    }
    public void turnOnPush(IPushActionListener p0){
       e.a().a(p0);
    }
    public void unBindAlias(String p0,IPushActionListener p1){
       this.checkParam(p0);
       e.a().b(p0, p1);
    }
}
