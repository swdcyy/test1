package com.hpplay.sdk.source.process.c$5;
import com.hpplay.sdk.source.a$a;
import com.hpplay.sdk.source.process.c;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.a.a;

public class c$5 extends a$a	// class@00069b
{
    public final c b;

    public void c$5(c p0){
       this.b = p0;
       super();
    }
    public void onResult(int p0,List p1){
       String str = c.d(this.b);
       StringBuilder str1 = " controller device callback -- >   "+p0+"  "+p1.size()+" mIBrowseListener == null ";
       boolean b = (c.g(this.b) == null)? true: false;
       a.f(str, str1+b);
       if (c.g(this.b) != null) {
          c.g(this.b).onBrowse(p0, p1);
       }
       return;
    }
}
