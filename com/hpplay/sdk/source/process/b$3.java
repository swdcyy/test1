package com.hpplay.sdk.source.process.b$3;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.process.b;
import java.lang.Object;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.String;
import com.hpplay.sdk.source.a.a;

public class b$3 implements IBrowseListener	// class@000692
{
    public final b a;

    public void b$3(b p0){
       this.a = p0;
       super();
    }
    public void onBrowse(int p0,List p1){
       a.f("LelinkSdkManager", "sdk manager device callback -- >   "+p0+"  "+p1.size());
       if (b.e(this.a) != null) {
          b.e(this.a).onBrowse(p0, p1);
       }
       b.a(this.a, p1);
       return;
    }
}
