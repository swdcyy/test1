package com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class SearchHistoryData implements Serializable, Cloneable	// class@00128a
{
    public boolean mEditState;
    public boolean mHasShow;
    public int mHeaderId;
    public Location mLocation;
    public boolean mNeedTop;
    public int mPosition;
    public int mSearchCount;
    public long mSearchTime;
    public String mSearchWord;
    public int type;
    public static final long serialVersionUID = 0x6d5410866a6f4e7;

    public void SearchHistoryData(){
       super();
       this.mSearchCount = 1;
       this.mHeaderId = -1;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, SearchHistoryData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchHistoryData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       SearchHistoryData tmSearchWord = this.mSearchWord;
       if (tmSearchWord == null && (p0.mSearchWord != null && (tmSearchWord == null || !tmSearchWord.equals(p0.mSearchWord)))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       SearchHistoryData obj = PatchProxy.apply(null, this, SearchHistoryData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mSearchWord;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
}
