package com.hpplay.sdk.source.process.b$6;
import com.hpplay.sdk.source.browse.api.IParceResultListener;
import com.hpplay.sdk.source.process.b;
import java.lang.Object;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;

public class b$6 implements IParceResultListener	// class@000695
{
    public final b a;

    public void b$6(b p0){
       this.a = p0;
       super();
    }
    public void onParceResult(int p0,LelinkServiceInfo p1){
       b.j(this.a).onParceResult(p0, p1);
    }
}
