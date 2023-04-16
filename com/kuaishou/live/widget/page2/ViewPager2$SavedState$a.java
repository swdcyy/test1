package com.kuaishou.live.widget.page2.ViewPager2$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.ClassLoader;
import com.kuaishou.live.widget.page2.ViewPager2$SavedState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;

public class ViewPager2$SavedState$a implements Parcelable$ClassLoaderCreator	// class@00102a
{

    public void ViewPager2$SavedState$a(){
       super();
    }
    public ViewPager2$SavedState a(Parcel p0,ClassLoader p1){
       ViewPager2$SavedState obj = PatchProxy.applyTwoRefs(p0, p1, this, ViewPager2$SavedState$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (Build$VERSION.SDK_INT >= 24)? new ViewPager2$SavedState(p0, p1): new ViewPager2$SavedState(p0);
       return obj;
    }
    public Object createFromParcel(Parcel p0){
       ViewPager2$SavedState savedState = PatchProxy.applyOneRefs(p0, this, ViewPager2$SavedState$a.class, "2");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = this.a(p0, null);
       }
       return savedState;
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       return this.a(p0, p1);
    }
    public Object[] newArray(int p0){
       ViewPager2$SavedState[] savedStateAr = new ViewPager2$SavedState[p0];
       return savedStateAr;
    }
}
