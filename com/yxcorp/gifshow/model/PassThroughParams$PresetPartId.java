package com.yxcorp.gifshow.model.PassThroughParams$PresetPartId;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u3b.a;
import java.lang.Throwable;
import q87.c;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class PassThroughParams$PresetPartId implements Serializable, Cloneable	// class@001e6b
{
    public String mMaterialId;
    public String mPartId;
    public static final long serialVersionUID = 0x23b165124d7bd661;

    public void PassThroughParams$PresetPartId(){
       super();
    }
    public PassThroughParams$PresetPartId clone(){
       Object obj = PatchProxy.apply(null, this, PassThroughParams$PresetPartId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          Object[] objArray = new Object[0];
          a.C().u("PassThroughParams", e0, objArray);
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, PassThroughParams$PresetPartId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.n(this.mMaterialId, "0") ^ 0x01);
    }
}
