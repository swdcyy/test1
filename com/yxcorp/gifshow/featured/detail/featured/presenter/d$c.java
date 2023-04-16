package com.yxcorp.gifshow.featured.detail.featured.presenter.d$c;
import com.yxcorp.gifshow.featured.detail.featured.presenter.d;
import java.lang.Object;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.lang.String;

public class d$c	// class@000f70
{
    public long a;
    public boolean b;
    public String c;
    public Map d;
    public final d e;

    public void d$c(d p0,long p1){
       this.e = p0;
       super();
       this.a = 0;
       this.b = false;
       this.c = "";
       this.d = new HashMap();
       this.a = p1 * 1000;
       this.c = "SCENE_FEATURED_DETAIL_SLIDE_"+this.a;
    }
}
