package com.yxcorp.gifshow.detail.school.SchoolSquareResponse;
import java.io.Serializable;
import la6.b;
import com.yxcorp.gifshow.detail.school.SchoolSquareResponse$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public final class SchoolSquareResponse implements Serializable, b	// class@001705
{
    public String mContext;
    public List mFeeds;
    public String mLlsid;
    public String mPcursor;
    public List mfilterItems;
    public static final SchoolSquareResponse$a Companion;
    public static final long serialVersionUID;

    static {
       SchoolSquareResponse.Companion = new SchoolSquareResponse$a(null);
    }
    public void SchoolSquareResponse(){
       super();
    }
    public final List getFilterItems(){
       return this.mfilterItems;
    }
    public List getItems(){
       return this.mFeeds;
    }
    public final String getMContext(){
       return this.mContext;
    }
    public final List getMFeeds(){
       return this.mFeeds;
    }
    public final String getMLlsid(){
       return this.mLlsid;
    }
    public final String getMPcursor(){
       return this.mPcursor;
    }
    public final List getMfilterItems(){
       return this.mfilterItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, SchoolSquareResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPcursor);
    }
    public final void setMContext(String p0){
       this.mContext = p0;
    }
    public final void setMFeeds(List p0){
       this.mFeeds = p0;
    }
    public final void setMLlsid(String p0){
       this.mLlsid = p0;
    }
    public final void setMPcursor(String p0){
       this.mPcursor = p0;
    }
    public final void setMfilterItems(List p0){
       this.mfilterItems = p0;
    }
}
