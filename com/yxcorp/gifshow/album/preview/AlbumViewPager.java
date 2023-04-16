package com.yxcorp.gifshow.album.preview.AlbumViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public class AlbumViewPager extends ViewPager	// class@001a26
{
    public HashMap b;

    public void AlbumViewPager(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          a.q(p0, "ev");
          b = super.onTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e3){
          Log.k(e3);
          b = false;
       }
       return b;
    }
}
