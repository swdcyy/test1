package com.yxcorp.gifshow.widget.magicFaceReco.HomeMockMagicFaceRecoRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewParent;
import android.view.ViewGroup;

public class HomeMockMagicFaceRecoRecyclerView extends RecyclerView	// class@001996
{

    public void HomeMockMagicFaceRecoRecyclerView(Context p0){
       super(p0);
    }
    public void HomeMockMagicFaceRecoRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void HomeMockMagicFaceRecoRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       ViewParent obj = PatchProxy.applyOneRefs(p0, this, HomeMockMagicFaceRecoRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       for (obj = this; obj != null && !obj instanceof ViewPager; obj = obj.getParent()) {
       }
       if (obj != null) {
          obj.requestDisallowInterceptTouchEvent(true);
       }
       return super.dispatchTouchEvent(p0);
    }
}
