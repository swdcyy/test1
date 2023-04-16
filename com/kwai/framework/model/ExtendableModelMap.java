package com.kwai.framework.model.ExtendableModelMap;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class ExtendableModelMap implements Serializable	// class@001687
{
    public HashMap mExtraMap;
    public HashMap mParcelExtraMap;

    public void ExtendableModelMap(){
       super();
       this.mExtraMap = new HashMap();
       this.mParcelExtraMap = new HashMap();
    }
    public boolean contains(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExtendableModelMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.ensureNotNull();
       boolean b = (this.mExtraMap.containsKey(p0) || this.mParcelExtraMap.containsKey(p0))? true: false;
       return b;
    }
    public final void ensureNotNull(){
       if (PatchProxy.applyVoid(null, this, ExtendableModelMap.class, "5")) {
          return;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new HashMap();
       }
       if (this.mParcelExtraMap == null) {
          this.mParcelExtraMap = new HashMap();
       }
       return;
    }
    public Object getExtra(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExtendableModelMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.ensureNotNull();
       obj = this.mExtraMap.get(p0);
       if (obj == null) {
          obj = this.mParcelExtraMap.get(p0);
       }
       if (obj == null) {
          return null;
       }else {
          return obj;
       }
    }
    public void putExtra(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtendableModelMap.class, "1")) {
          return;
       }
       this.ensureNotNull();
       this.mExtraMap.put(p0, p1);
       return;
    }
    public void putParcelableExtra(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtendableModelMap.class, "2")) {
          return;
       }
       this.ensureNotNull();
       this.mParcelExtraMap.put(p0, p1);
       return;
    }
}
