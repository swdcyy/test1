package com.sina.weibo.sdk.net.e;
import com.sina.weibo.sdk.net.d;
import com.sina.weibo.sdk.net.e$a;
import java.lang.Object;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public final class e implements d	// class@000bc4
{
    public String i;
    public Bundle j;
    public Bundle k;
    public Map l;
    public Map m;
    public int n;
    public int o;

    public void e(e$a p0){
       super();
       this.j = new Bundle();
       this.k = new Bundle();
       this.l = new HashMap();
       this.m = new HashMap();
       this.i = p0.i;
       this.j.putAll(p0.j);
       this.k.putAll(p0.k);
       this.l.putAll(p0.l);
       this.m.putAll(p0.m);
       this.n = p0.n;
       this.o = p0.o;
    }
    public final Bundle d(){
       return this.k;
    }
    public final int getConnectTimeout(){
       return this.n;
    }
    public final Bundle getParams(){
       return this.j;
    }
    public final int getReadTimeout(){
       return this.o;
    }
    public final String getUrl(){
       return this.i;
    }
}
