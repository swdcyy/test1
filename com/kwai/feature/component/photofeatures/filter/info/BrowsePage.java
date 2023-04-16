package com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;

public class BrowsePage implements Serializable	// class@001224
{
    public String mFromPage;
    public String mPage;
    public static final long serialVersionUID = 0x61a01a08d2f2d2eb;

    public void BrowsePage(){
       super();
    }
    public void BrowsePage(String p0){
       super();
       this.mPage = p0;
    }
    public void BrowsePage(String p0,String p1){
       super();
       this.mPage = p0;
       this.mFromPage = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BrowsePage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       boolean b1 = false;
       if (p0 == null || this.getClass() != p0.getClass()) {
          return b1;
       }
       if (!(this.mPage).equals(p0.mPage)) {
          return b1;
       }
       if (this.mFromPage == null && (p0.mPage).equals(p0.mFromPage)) {
          return b;
       }
       if (p0.mFromPage == null && (this.mPage).equals(this.mFromPage)) {
          return b;
       }
       return TextUtils.n(this.mFromPage, p0.mFromPage);
    }
    public int hashCode(){
       BrowsePage obj = PatchProxy.apply(null, this, BrowsePage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPage;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       BrowsePage tmFromPage = this.mFromPage;
       if (tmFromPage != null) {
          i = tmFromPage.hashCode();
       }
       return (i1 + i);
    }
}
