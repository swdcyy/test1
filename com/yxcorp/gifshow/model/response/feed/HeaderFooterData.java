package com.yxcorp.gifshow.model.response.feed.HeaderFooterData;
import java.io.Serializable;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterData$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class HeaderFooterData implements Serializable	// class@001f8b
{
    public String mJsonContent;
    public static final HeaderFooterData$a Companion;
    public static final long serialVersionUID;

    static {
       HeaderFooterData.Companion = new HeaderFooterData$a(null);
    }
    public void HeaderFooterData(){
       super();
    }
    public final String getMJsonContent(){
       return this.mJsonContent;
    }
    public final void setMJsonContent(String p0){
       this.mJsonContent = p0;
    }
}
