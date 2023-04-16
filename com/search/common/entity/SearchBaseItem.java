package com.search.common.entity.SearchBaseItem;
import java.io.Serializable;
import al8.a;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.utility.TextUtils;

public abstract class SearchBaseItem implements Serializable, a	// class@000b85
{
    public boolean mHasPlayed;
    public boolean mIsShow;
    public String mKsOrderId;
    public int mPosition;
    public String mSessionId;
    public static final long serialVersionUID = 0x75bcae8f618ef72d;

    public void SearchBaseItem(){
       super();
    }
    public String getKsOrderId(){
       return TextUtils.I(this.mKsOrderId);
    }
    public void setKsOrderId(String p0){
       this.mKsOrderId = p0;
    }
}
