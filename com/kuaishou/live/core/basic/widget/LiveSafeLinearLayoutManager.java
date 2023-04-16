package com.kuaishou.live.core.basic.widget.LiveSafeLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
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

public class LiveSafeLinearLayoutManager extends LinearLayoutManager	// class@00090e
{

    public void LiveSafeLinearLayoutManager(Context p0){
       super(p0);
    }
    public void LiveSafeLinearLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
    }
    public void LiveSafeLinearLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSafeLinearLayoutManager.class, "1")) {
          return;
       }
       try{
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.IndexOutOfBoundsException e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return;
    }
}
