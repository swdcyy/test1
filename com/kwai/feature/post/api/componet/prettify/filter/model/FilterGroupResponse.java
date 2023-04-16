package com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroupResponse;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$a;
import java.lang.Boolean;

public class FilterGroupResponse implements Serializable, Cloneable	// class@0012f0
{
    public List mCollectFilters;
    public FilterConfig mEnhanced;
    public List mGroups;
    public int mLiveDefaultId;
    public String mLiveVersionId;
    public List mPhotoMovies;
    public static final long serialVersionUID = 0xda9761cd7ed0946c;

    public void FilterGroupResponse(){
       super();
       this.mLiveDefaultId = -1;
       this.mLiveVersionId = "";
    }
    public final void a(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FilterGroupResponse.class, "3")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FilterConfig uFilterConfi = iterator.next();
          if (uFilterConfi.mAutoDownload != null && uFilterConfi.mFilterResourcesUrl != null) {
             p1.add(uFilterConfi);
          }
       }
       return;
    }
    public FilterGroupResponse clone(){
       Iterator iterator;
       FilterGroupResponse obj = PatchProxy.apply(null, this, FilterGroupResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          FilterGroupResponse tmEnhanced = this.mEnhanced;
          if (tmEnhanced != null) {
             obj.mEnhanced = tmEnhanced.clone();
          }
          if (!q.f(this.mPhotoMovies)) {
             obj.mPhotoMovies = new ArrayList(this.mPhotoMovies.size());
             iterator = this.mPhotoMovies.iterator();
             while (iterator.hasNext()) {
                obj.mPhotoMovies.add(iterator.next().clone());
             }
          }else {
             obj.mPhotoMovies = null;
          }
          if (!q.f(this.mGroups)) {
             obj.mGroups = new ArrayList(this.mGroups.size());
             iterator = this.mGroups.iterator();
             while (iterator.hasNext()) {
                obj.mGroups.add(iterator.next().clone());
             }
          }else {
             obj.mGroups = null;
          }
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public List getAllFilters(){
       ArrayList obj = PatchProxy.apply(null, this, FilterGroupResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       FilterGroupResponse tmPhotoMovie = this.mPhotoMovies;
       if (tmPhotoMovie != null) {
          obj.addAll(tmPhotoMovie);
       }
       tmPhotoMovie = this.mGroups;
       if (tmPhotoMovie != null) {
          Iterator iterator = tmPhotoMovie.iterator();
          while (iterator.hasNext()) {
             FilterGroup uFilterGroup = iterator.next();
             if (uFilterGroup.getFilters() != null) {
                obj.addAll(uFilterGroup.getFilters());
             }
          }
       }
       tmPhotoMovie = this.mEnhanced;
       if (tmPhotoMovie != null) {
          obj.add(tmPhotoMovie);
       }
       return obj;
    }
    public List getAutoDownloadFilters(){
       ArrayList obj = PatchProxy.apply(null, this, FilterGroupResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       this.a(this.mPhotoMovies, obj);
       FilterGroupResponse tmGroups = this.mGroups;
       if (tmGroups != null) {
          Iterator iterator = tmGroups.iterator();
          while (iterator.hasNext()) {
             this.a(iterator.next().getFilters(), obj);
          }
       }
       return obj;
    }
    public List getGroupsInfo(){
       ArrayList obj = PatchProxy.apply(null, this, FilterGroupResponse.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       FilterGroupResponse tmGroups = this.mGroups;
       if (tmGroups != null) {
          Iterator iterator = tmGroups.iterator();
          while (iterator.hasNext()) {
             FilterGroup uFilterGroup = iterator.next();
             FilterGroup$a uoa = new FilterGroup$a();
             uoa.a = uFilterGroup.mGroupId;
             uoa.b = uFilterGroup.mDisplayName;
             obj.add(uoa);
          }
       }
       return obj;
    }
    public List getNormal(boolean p0){
       ArrayList obj;
       if (PatchProxy.isSupport(FilterGroupResponse.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, FilterGroupResponse.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       FilterGroupResponse tmGroups = this.mGroups;
       if (tmGroups != null) {
          Iterator iterator = tmGroups.iterator();
          while (iterator.hasNext()) {
             FilterGroup uFilterGroup = iterator.next();
             if (q.f(uFilterGroup.getFilters())) {
             }else if(p0 && obj.size() > 0){
                obj.add(FilterConfig.getDivider());
             }
             Iterator iterator1 = uFilterGroup.getFilters().iterator();
             while (iterator1.hasNext()) {
                FilterConfig uFilterConfi = iterator1.next();
                if (uFilterConfi.isNormal()) {
                   obj.add(uFilterConfi);
                }else {
                   continue ;
                }
             }
          }
       }
       return obj;
    }
    public List getPhotoMovie(){
       ArrayList obj = PatchProxy.apply(null, this, FilterGroupResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       FilterGroupResponse tmPhotoMovie = this.mPhotoMovies;
       if (tmPhotoMovie != null) {
          obj.addAll(tmPhotoMovie);
       }
       tmPhotoMovie = this.mGroups;
       if (tmPhotoMovie != null) {
          Iterator iterator = tmPhotoMovie.iterator();
          while (iterator.hasNext()) {
             FilterGroup uFilterGroup = iterator.next();
             if (uFilterGroup.getFilters() == null) {
             }else {
                Iterator iterator1 = uFilterGroup.getFilters().iterator();
                while (iterator1.hasNext()) {
                   FilterConfig uFilterConfi = iterator1.next();
                   if (uFilterConfi.isPhotoMovie()) {
                      obj.add(uFilterConfi);
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return obj;
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, FilterGroupResponse.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.getNormal(b).size() && !this.getPhotoMovie().size()) {
          b = true;
       }
       return b;
    }
}
