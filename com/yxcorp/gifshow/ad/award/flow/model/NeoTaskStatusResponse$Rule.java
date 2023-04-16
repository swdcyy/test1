package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$Rule;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$Rule$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;

public final class NeoTaskStatusResponse$Rule implements Serializable	// class@001509
{
    public final String title;
    public final String url;
    public static final NeoTaskStatusResponse$Rule$a Companion;
    public static final long serialVersionUID;

    static {
       NeoTaskStatusResponse$Rule.Companion = new NeoTaskStatusResponse$Rule$a(null);
    }
    public void NeoTaskStatusResponse$Rule(String p0,String p1){
       super();
       this.title = p0;
       this.url = p1;
    }
    public final String getTitle(){
       return this.title;
    }
    public final String getUrl(){
       return this.url;
    }
}
