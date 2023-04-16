package com.yxcorp.gifshow.recycler.widget.KwaiStaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class KwaiStaggeredGridLayoutManager extends StaggeredGridLayoutManager	// class@0017b9
{

    public void KwaiStaggeredGridLayoutManager(int p0,int p1){
       super(p0, p1);
    }
    public void KwaiStaggeredGridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiStaggeredGridLayoutManager.class, "3")) {
          return;
       }
       try{
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.IndexOutOfBoundsException e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return;
    }
    public void onScrollStateChanged(int p0){
       KwaiStaggeredGridLayoutManager kwaiStaggere = KwaiStaggeredGridLayoutManager.class;
       if (PatchProxy.isSupport(kwaiStaggere) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiStaggere, "2")) {
          return;
       }
       try{
          super.onScrollStateChanged(p0);
       }catch(java.lang.Exception e4){
          ExceptionHandler.handleCaughtException(e4);
       }
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(KwaiStaggeredGridLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, KwaiStaggeredGridLayoutManager.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.scrollVerticallyBy(p0, p1, p2);
       }catch(java.lang.Exception e8){
          ExceptionHandler.handleCaughtException(e8);
          return 0;
       }
    }
}
