package com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar$SavedState;
import java.lang.ClassLoader;

public class BaseRoundCornerProgressBar$SavedState$a implements Parcelable$ClassLoaderCreator	// class@001676
{

    public void BaseRoundCornerProgressBar$SavedState$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       BaseRoundCornerProgressBar$SavedState savedState = PatchProxy.applyOneRefs(p0, this, BaseRoundCornerProgressBar$SavedState$a.class, "2");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = new BaseRoundCornerProgressBar$SavedState(p0);
       }
       return savedState;
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       BaseRoundCornerProgressBar$SavedState savedState = PatchProxy.applyTwoRefs(p0, p1, this, BaseRoundCornerProgressBar$SavedState$a.class, "1");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = new BaseRoundCornerProgressBar$SavedState(p0, p1);
       }
       return savedState;
    }
    public Object[] newArray(int p0){
       BaseRoundCornerProgressBar$SavedState[] savedStateAr = new BaseRoundCornerProgressBar$SavedState[p0];
       return savedStateAr;
    }
}
