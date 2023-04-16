package com.kwai.feature.component.entry.SearchLandingParams;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;

public class SearchLandingParams	// class@001209
{
    public String mBackQuery;
    public boolean mFromShare;
    public int mPageSize;
    public String mPageType;
    public String mSubTabId;

    public void SearchLandingParams(){
       super();
       this.mFromShare = false;
       this.mPageSize = 30;
    }
    public static SearchLandingParams parserUri(Uri p0){
       SearchLandingParams obj = PatchProxy.applyOneRefs(p0, null, SearchLandingParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new SearchLandingParams();
          obj.mBackQuery = x0.a(p0, "bachQuery");
          obj.mPageType = x0.a(p0, "pageType");
          obj.mFromShare = p0.getBooleanQueryParameter("fromShare", false);
          obj.mSubTabId = x0.a(p0, "subTabId");
          String str = x0.a(p0, "pageSize");
          if (!TextUtils.x(str)) {
             obj.mPageSize = Integer.parseInt(str);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public String getBackQuery(){
       return this.mBackQuery;
    }
    public int getPageSize(){
       return this.mPageSize;
    }
    public String getPageType(){
       return this.mPageType;
    }
    public String getSubTabId(){
       return this.mSubTabId;
    }
    public boolean isFromShare(){
       return this.mFromShare;
    }
}
