package com.kwai.feature.component.model.SearchPlaceHolderInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public class SearchPlaceHolderInfo implements Serializable	// class@00121d
{
    public String mJumpUrl;
    public String mQueryId;
    public String mQueryListId;
    public String mSearchKeyword;
    public String mSearchPlaceholder;
    public static final long serialVersionUID = 0x1e7f3b658e51e394;

    public void SearchPlaceHolderInfo(String p0){
       super();
       this.mQueryListId = "-1";
       this.mSearchKeyword = p0;
       this.mSearchPlaceholder = p0;
    }
    public void SearchPlaceHolderInfo(String p0,String p1){
       super();
       this.mQueryListId = "-1";
       this.mSearchPlaceholder = p0;
       this.mSearchKeyword = p1;
    }
    public String getRealSearchMsg(){
       SearchPlaceHolderInfo obj = PatchProxy.apply(null, this, SearchPlaceHolderInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.x(this.mSearchKeyword))? this.mSearchPlaceholder: this.mSearchKeyword;
       return obj;
    }
    public String getShowMsg(){
       return this.mSearchPlaceholder;
    }
    public boolean isListIdValid(){
       Object obj = PatchProxy.apply(null, this, SearchPlaceHolderInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.mQueryListId) && !TextUtils.n(this.mQueryListId, "-1"))? true: false;
       return b;
    }
}
