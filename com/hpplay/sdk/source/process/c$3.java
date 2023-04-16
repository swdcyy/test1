package com.hpplay.sdk.source.process.c$3;
import com.hpplay.sdk.source.e$a;
import com.hpplay.sdk.source.process.c;
import java.util.List;
import com.hpplay.sdk.source.browse.api.IAPICallbackListener;
import java.lang.Object;

public class c$3 extends e$a	// class@000699
{
    public final c b;

    public void c$3(c p0){
       this.b = p0;
       super();
    }
    public void onResult(int p0,List p1){
       if (c.c(this.b) != null) {
          c.c(this.b).onResult(p0, p1);
       }
       return;
    }
}
