package com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;

public class FilterGroup implements Serializable, Cloneable	// class@0012ee
{
    public boolean b;
    public String mDisplayName;
    public List mFilters;
    public int mGroupId;
    public static final long serialVersionUID = 0xcc754e521b9f908;

    public void FilterGroup(){
       super();
       this.b = false;
    }
    public FilterGroup clone(){
       FilterGroup obj = PatchProxy.apply(null, this, FilterGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          if (!q.f(this.mFilters)) {
             obj.mFilters = new ArrayList(this.mFilters.size());
             Iterator iterator = this.mFilters.iterator();
             while (iterator.hasNext()) {
                obj.mFilters.add(iterator.next().clone());
             }
          }else {
             obj.mFilters = null;
          }
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public List getFilters(){
       Object[] objArray = null;
       FilterGroup obj = PatchProxy.apply(objArray, this, FilterGroup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null && !PatchProxy.applyVoid(objArray, this, FilterGroup.class, "3")) {
          obj = this.mFilters;
          if (obj != null && this.mGroupId != -1) {
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                FilterConfig uFilterConfi = iterator.next();
                uFilterConfi.setGroupId(this.mGroupId);
                uFilterConfi.setGroupName(this.mDisplayName);
                uFilterConfi.mDisplayType = this.mDisplayName;
             }
             this.b = true;
          }
       }
       return this.mFilters;
    }
    public void setFilters(List p0){
       this.mFilters = p0;
    }
}
