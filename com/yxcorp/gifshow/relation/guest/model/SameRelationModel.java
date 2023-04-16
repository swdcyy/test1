package com.yxcorp.gifshow.relation.guest.model.SameRelationModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class SameRelationModel implements Serializable	// class@0018d3
{
    public int area;
    public int count;
    public String name;
    public String pageType;
    public String scene;
    public String title;
    public String uid;
    public static final long serialVersionUID = 0xe71f5da5be85cae1;

    public void SameRelationModel(){
       super();
    }
    public boolean isParamValid(){
       Object obj = PatchProxy.apply(null, this, SameRelationModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.scene) && (!TextUtils.x(this.pageType) && this.count > null))? true: false;
       return b;
    }
}
