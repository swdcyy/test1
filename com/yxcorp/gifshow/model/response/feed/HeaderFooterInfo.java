package com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData;

public final class HeaderFooterInfo implements Serializable	// class@001f8f
{
    public HeaderFooterData mFooterData;
    public HeaderFooterData mHeaderData;
    public static final HeaderFooterInfo$a Companion;
    public static final long serialVersionUID;

    static {
       HeaderFooterInfo.Companion = new HeaderFooterInfo$a(null);
    }
    public void HeaderFooterInfo(){
       super();
    }
    public final HeaderFooterData getMFooterData(){
       return this.mFooterData;
    }
    public final HeaderFooterData getMHeaderData(){
       return this.mHeaderData;
    }
    public final void setMFooterData(HeaderFooterData p0){
       this.mFooterData = p0;
    }
    public final void setMHeaderData(HeaderFooterData p0){
       this.mHeaderData = p0;
    }
}
