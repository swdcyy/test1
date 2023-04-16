package com.yxcorp.plugin.search.result.widget.BottomSheetInsetsBehavior$SavedState$a;
import w1.j;
import java.lang.Object;
import android.os.Parcel;
import java.lang.ClassLoader;
import com.yxcorp.plugin.search.result.widget.BottomSheetInsetsBehavior$SavedState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;

public class BottomSheetInsetsBehavior$SavedState$a implements j	// class@000759
{

    public void BottomSheetInsetsBehavior$SavedState$a(){
       super();
    }
    public BottomSheetInsetsBehavior$SavedState a(Parcel p0,ClassLoader p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BottomSheetInsetsBehavior$SavedState$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 24) {
          return new BottomSheetInsetsBehavior$SavedState(p0, p1);
       }
       return null;
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       return this.a(p0, p1);
    }
    public Object[] newArray(int p0){
       BottomSheetInsetsBehavior$SavedState[] savedStateAr = new BottomSheetInsetsBehavior$SavedState[p0];
       return savedStateAr;
    }
}
