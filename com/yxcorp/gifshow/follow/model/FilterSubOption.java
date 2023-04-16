package com.yxcorp.gifshow.follow.model.FilterSubOption;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FilterSubOption implements Serializable	// class@0010ff
{
    public boolean mConfirmed;
    public String mId;
    public boolean mIsDefault;
    public String mName;
    public boolean mSelected;
    public static final long serialVersionUID = 0x98180073e722a8e7;

    public void FilterSubOption(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FilterSubOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FilterSubOption{mId=\'"+this.mId+'''+", mName=\'"+this.mName+'''+", mIsDefault="+this.mIsDefault+", mSelected="+this.mSelected+", mConfirmed="+this.mConfirmed+'}';
    }
}
