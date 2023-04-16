package com.yxcorp.gifshow.album.widget.NpaGridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class NpaGridLayoutManager extends GridLayoutManager	// class@001b09
{

    public void NpaGridLayoutManager(Context p0,int p1){
       super(p0, p1);
    }
    public void NpaGridLayoutManager(Context p0,int p1,int p2,boolean p3){
       super(p0, p1, p2, p3);
    }
    public void NpaGridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NpaGridLayoutManager.class, "1")) {
          return;
       }
       try{
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.Exception e3){
          Log.e("NpaGridLayoutManager", "onLayoutChildren", e3);
       }
       return;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(NpaGridLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, NpaGridLayoutManager.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.scrollHorizontallyBy(p0, p1, p2);
       }catch(java.lang.Exception e8){
          Log.e("NpaGridLayoutManager", "scrollHorizontallyBy", e8);
          return 0;
       }
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(NpaGridLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, NpaGridLayoutManager.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.scrollVerticallyBy(p0, p1, p2);
       }catch(java.lang.Exception e8){
          Log.e("NpaGridLayoutManager", "scrollVerticallyBy", e8);
          return 0;
       }
    }
}
