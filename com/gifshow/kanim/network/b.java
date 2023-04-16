package com.gifshow.kanim.network.b;
import com.gifshow.kanim.network.d;
import java.lang.Object;
import java.lang.String;
import com.gifshow.kanim.network.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import com.gifshow.kanim.network.a;

public class b implements d	// class@0015bf
{

    public void b(){
       super();
    }
    public c a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HttpURLConnection httpURLConne = new URL(p0).openConnection();
       httpURLConne.setRequestMethod("GET");
       httpURLConne.connect();
       return new a(httpURLConne);
    }
}
