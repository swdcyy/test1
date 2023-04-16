package com.yxcorp.gifshow.webview.bridge.GetAppListFunction$a;
import com.kuaishou.client.log.packages.nano.ClientBase$ApplicationPackage;
import java.lang.Object;

public class GetAppListFunction$a	// class@001702
{
    public long firstInstallationTimestamp;
    public String name;
    public String packageName;
    public boolean running;
    public boolean system;
    public int versionCode;
    public String versionName;

    public void GetAppListFunction$a(ClientBase$ApplicationPackage p0){
       super();
       this.packageName = p0.packageName;
       this.versionName = p0.versionName;
       this.versionCode = p0.versionCode;
       this.system = p0.system;
       this.running = p0.running;
       this.firstInstallationTimestamp = p0.firstInstallationTimestamp;
    }
}
