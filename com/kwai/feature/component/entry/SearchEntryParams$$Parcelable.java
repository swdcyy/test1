package com.kwai.feature.component.entry.SearchEntryParams$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.entry.SearchEntryParams$$Parcelable$a;
import com.kwai.feature.component.entry.SearchEntryParams;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.component.entry.SearchLandingParams;
import com.kwai.feature.component.entry.SearchLandingParams$$Parcelable;
import java.lang.ClassLoader;
import java.lang.Class;
import android.net.Uri;
import com.kwai.feature.component.entry.SearchVerticalParams;
import com.kwai.feature.component.entry.SearchVerticalParams$$Parcelable;
import android.os.Bundle;
import org.parceler.a;

public class SearchEntryParams$$Parcelable implements Parcelable, d	// class@001205
{
    public SearchEntryParams searchEntryParams$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchEntryParams$$Parcelable.CREATOR = new SearchEntryParams$$Parcelable$a();
    }
    public void SearchEntryParams$$Parcelable(SearchEntryParams p0){
       super();
       this.searchEntryParams$$0 = p0;
    }
    public static SearchEntryParams read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SearchEntryParams searchEntryP = new SearchEntryParams();
          p1.f(p1.g(), searchEntryP);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          searchEntryP.mIsUserResult = b1;
          searchEntryP.mLandingParams = SearchLandingParams$$Parcelable.read(p0, p1);
          searchEntryP.mTransition = p0.readInt();
          searchEntryP.mTransitionName = p0.readString();
          searchEntryP.mSessionId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          searchEntryP.mIsFromUrl = b1;
          searchEntryP.mPlaceHolderSession = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          searchEntryP.mHasSelectedInterest = b1;
          searchEntryP.mSearchKwaiUri = p0.readParcelable(SearchEntryParams$$Parcelable.class.getClassLoader());
          searchEntryP.mExtParamStr = p0.readString();
          searchEntryP.mCollectionUri = p0.readParcelable(SearchEntryParams$$Parcelable.class.getClassLoader());
          searchEntryP.mSourceTraces = p0.readString();
          searchEntryP.mVerticalParams = SearchVerticalParams$$Parcelable.read(p0, p1);
          searchEntryP.mPhotoId = p0.readString();
          searchEntryP.mPlaceHolderKeyWord = p0.readString();
          searchEntryP.mEntrySource = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          searchEntryP.mEnableSearchHome = b1;
          searchEntryP.mFromPage = p0.readInt();
          searchEntryP.mSelectTabType = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          searchEntryP.mHideTag = b1;
          searchEntryP.mQuery = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          searchEntryP.mIsGroupResult = b1;
          searchEntryP.mReferPlayDuration = p0.readString();
          searchEntryP.mPlaceHolder = p0.readString();
          a.d(SearchEntryParams.class, searchEntryP, "mExtParams", p0.readBundle(SearchEntryParams$$Parcelable.class.getClassLoader()));
          if (p0.readInt() == 1) {
             b = true;
          }
          searchEntryP.mEnableSearchPlaceholder = b;
          searchEntryP.mHomeBaseSessionId = p0.readString();
          p1.f(i, searchEntryP);
          return searchEntryP;
       }
    }
    public static void write(SearchEntryParams p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsUserResult);
          SearchLandingParams$$Parcelable.write(p0.mLandingParams, p1, p2, p3);
          p1.writeInt(p0.mTransition);
          p1.writeString(p0.mTransitionName);
          p1.writeString(p0.mSessionId);
          p1.writeInt(p0.mIsFromUrl);
          p1.writeString(p0.mPlaceHolderSession);
          p1.writeInt(p0.mHasSelectedInterest);
          p1.writeParcelable(p0.mSearchKwaiUri, p2);
          p1.writeString(p0.mExtParamStr);
          p1.writeParcelable(p0.mCollectionUri, p2);
          p1.writeString(p0.mSourceTraces);
          SearchVerticalParams$$Parcelable.write(p0.mVerticalParams, p1, p2, p3);
          p1.writeString(p0.mPhotoId);
          p1.writeString(p0.mPlaceHolderKeyWord);
          p1.writeString(p0.mEntrySource);
          p1.writeInt(p0.mEnableSearchHome);
          p1.writeInt(p0.mFromPage);
          p1.writeString(p0.mSelectTabType);
          p1.writeInt(p0.mHideTag);
          p1.writeString(p0.mQuery);
          p1.writeInt(p0.mIsGroupResult);
          p1.writeString(p0.mReferPlayDuration);
          p1.writeString(p0.mPlaceHolder);
          p1.writeBundle(a.b(Bundle.class, SearchEntryParams.class, p0, "mExtParams"));
          p1.writeInt(p0.mEnableSearchPlaceholder);
          p1.writeString(p0.mHomeBaseSessionId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchEntryParams getParcel(){
       return this.searchEntryParams$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchEntryParams$$Parcelable.write(this.searchEntryParams$$0, p0, p1, new a());
    }
}
