package com.kwai.lib.interfacies.PushApiBuilder;
import gv6.c;
import java.lang.Object;
import com.kwai.lib.interfacies.PushApiBuilder$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import okhttp3.OkHttpClient;

public class PushApiBuilder implements c	// class@000d02
{
    public final p a;

    public void PushApiBuilder(){
       super();
       this.a = s.c(new PushApiBuilder$instance$2(this));
    }
    public final c a(){
       return this.a.getValue();
    }
    public String getApiHost(){
       return this.a().getApiHost();
    }
    public OkHttpClient getApiOkhttpClient(){
       return this.a().getApiOkhttpClient();
    }
}
