package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BaseDetailPendantItemModel;
import java.io.Serializable;
import java.lang.Cloneable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BaseDetailPendantItemModel$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.util.List;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantTitleModel;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;

public class BaseDetailPendantItemModel implements Serializable, Cloneable	// class@000921
{
    public boolean b;
    public boolean isFakeInfo;
    public final String mId;
    public final String mImgUrl;
    public final List mImgUrlCdn;
    public final String mJumpUrl;
    public final int mTemplateType;
    public final DetailPendantTitleModel mTitleModel;
    public static final BaseDetailPendantItemModel$a Companion;
    public static final long serialVersionUID;

    static {
       BaseDetailPendantItemModel.Companion = new BaseDetailPendantItemModel$a(null);
    }
    public void BaseDetailPendantItemModel(){
       super();
       this.mId = "";
       this.mImgUrl = "";
       this.mJumpUrl = "";
    }
    public static void getMTemplateType$annotations(){
    }
    public BaseDetailPendantItemModel clone(){
       Object obj = PatchProxy.apply(null, this, BaseDetailPendantItemModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.clone();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BaseDetailPendantItemModel");
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public final String getMId(){
       return this.mId;
    }
    public final String getMImgUrl(){
       return this.mImgUrl;
    }
    public final List getMImgUrlCdn(){
       return this.mImgUrlCdn;
    }
    public final String getMJumpUrl(){
       return this.mJumpUrl;
    }
    public final int getMTemplateType(){
       return this.mTemplateType;
    }
    public final DetailPendantTitleModel getMTitleModel(){
       return this.mTitleModel;
    }
    public final boolean isDied(){
       return this.b;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, BaseDetailPendantItemModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b == null && (!TextUtils.x(this.mImgUrl) || !q.f(this.mImgUrlCdn)))? true: false;
       return b;
    }
    public final void setDied(boolean p0){
       this.b = p0;
    }
}
