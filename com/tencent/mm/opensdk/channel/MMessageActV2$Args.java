package com.tencent.mm.opensdk.channel.MMessageActV2$Args;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class MMessageActV2$Args	// class@000e6a
{
    public Bundle bundle;
    public String content;
    public int flags;
    public int launchMode;
    public String targetClassName;
    public String targetPkgName;
    public String token;

    public void MMessageActV2$Args(){
       super();
       this.flags = -1;
       this.launchMode = 2;
    }
    public String toString(){
       return "targetPkgName:"+this.targetPkgName+", targetClassName:"+this.targetClassName+", content:"+this.content+", flags:"+this.flags+", bundle:"+this.bundle;
    }
}
