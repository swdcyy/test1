package com.kwai.feature.component.entry.SearchVerticalParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.entry.SearchVerticalParams$$Parcelable$a;
import com.kwai.feature.component.entry.SearchVerticalParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.component.entry.SearchSceneSource;
import java.lang.Class;
import java.lang.Enum;

public class SearchVerticalParams$$Parcelable implements Parcelable, d	// class@00120c
{
    public SearchVerticalParams searchVerticalParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchVerticalParams$$Parcelable.CREATOR = new SearchVerticalParams$$Parcelable$a();
    }
    public void SearchVerticalParams$$Parcelable(SearchVerticalParams p0){
       super();
       this.searchVerticalParams$$0 = p0;
    }
    public static SearchVerticalParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SearchVerticalParams searchVertic = new SearchVerticalParams();
          p1.f(p1.g(), searchVertic);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          searchVertic.mDisableSugPage = b1;
          String str = p0.readString();
          SearchSceneSource searchSceneS = (str == null)? null: Enum.valueOf(SearchSceneSource.class, str);
          searchVertic.mSearchSceneSource = searchSceneS;
          searchVertic.mProfileHomeTips = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          searchVertic.mUseSimpleHomeStyle = b1;
          b1 = (p0.readInt() == 1)? true: false;
          searchVertic.mIsShowHistory = b1;
          searchVertic.mReportExtParams = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          searchVertic.mHasSelectedInterest = b1;
          searchVertic.mUserName = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          searchVertic.mEnableGuessModule = b1;
          searchVertic.mProfileMasterTab = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          searchVertic.mNeedRequestPreset = b;
          searchVertic.mColorMode = p0.readInt();
          p1.f(i, searchVertic);
          return searchVertic;
       }
    }
    public static void write(SearchVerticalParams p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mDisableSugPage);
          SearchVerticalParams mSearchScene = p0.mSearchSceneSource;
          String str = (mSearchScene == null)? null: mSearchScene.name();
          p1.writeString(str);
          p1.writeString(p0.mProfileHomeTips);
          p1.writeInt(p0.mUseSimpleHomeStyle);
          p1.writeInt(p0.mIsShowHistory);
          p1.writeString(p0.mReportExtParams);
          p1.writeInt(p0.mHasSelectedInterest);
          p1.writeString(p0.mUserName);
          p1.writeInt(p0.mEnableGuessModule);
          p1.writeInt(p0.mProfileMasterTab);
          p1.writeInt(p0.mNeedRequestPreset);
          p1.writeInt(p0.mColorMode);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchVerticalParams getParcel(){
       return this.searchVerticalParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchVerticalParams$$Parcelable.write(this.searchVerticalParams$$0, p0, p1, new a());
    }
}
