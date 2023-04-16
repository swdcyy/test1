package com.kuaishou.webkit.WebStorage$Origin;
import java.lang.String;
import java.lang.Object;

public class WebStorage$Origin	// class@00127b
{
    public String mOrigin;
    public long mQuota;
    public long mUsage;

    public void WebStorage$Origin(String p0,long p1,long p2){
       super();
       this.mOrigin = null;
       this.mQuota = 0;
       this.mUsage = 0;
       this.mOrigin = p0;
       this.mQuota = p1;
       this.mUsage = p2;
    }
    public String getOrigin(){
       return this.mOrigin;
    }
    public long getQuota(){
       return this.mQuota;
    }
    public long getUsage(){
       return this.mUsage;
    }
}
