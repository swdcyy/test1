package com.kuaishou.pagedy.container.widget.KwaiStaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.Throwable;
import qrd.i;
import java.util.HashMap;
import pv.a;
import java.util.Map;
import nv.c;
import java.lang.Exception;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class KwaiStaggeredGridLayoutManager extends StaggeredGridLayoutManager	// class@000a7d
{

    public void KwaiStaggeredGridLayoutManager(int p0,int p1){
       super(p0, p1);
    }
    public void KwaiStaggeredGridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       String[] stringArray;
       String[] stringArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiStaggeredGridLayoutManager.class, "3")) {
          return;
       }
       a.p(p0, "recycler");
       try{
          a.p(p1, "state");
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.Exception e5){
          int i = 1;
          if (SystemUtil.K()) {
             stringArray = new String[]{"msg"};
             stringArray1 = new String[i];
             stringArray1[0] = i.i(e5);
             c.d("KwaiStaggeredGridLayoutManager: onLayoutChildren exception:", a.a(stringArray, stringArray1));
          }else {
             stringArray = new String[]{"msg"};
             stringArray1 = new String[i];
             stringArray1[0] = e5.getMessage();
             c.d("KwaiStaggeredGridLayoutManager: onLayoutChildren exception:", a.a(stringArray, stringArray1));
          }
       }
       return;
    }
    public void onScrollStateChanged(int p0){
       String[] stringArray;
       String[] stringArray1;
       KwaiStaggeredGridLayoutManager kwaiStaggere = KwaiStaggeredGridLayoutManager.class;
       if (PatchProxy.isSupport(kwaiStaggere) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiStaggere, "2")) {
          return;
       }
       try{
          super.onScrollStateChanged(p0);
       }catch(java.lang.Exception e6){
          int i = 1;
          if (SystemUtil.K()) {
             stringArray = new String[]{"msg"};
             stringArray1 = new String[i];
             stringArray1[0] = i.i(e6);
             c.d("KwaiStaggeredGridLayoutManager: onScrollStateChanged exception:", a.a(stringArray, stringArray1));
          }else {
             stringArray = new String[]{"msg"};
             stringArray1 = new String[i];
             stringArray1[0] = e6.getMessage();
             c.d("KwaiStaggeredGridLayoutManager: onScrollStateChanged exception:", a.a(stringArray, stringArray1));
          }
       }
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       String[] stringArray;
       String[] stringArray1;
       if (PatchProxy.isSupport(KwaiStaggeredGridLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, KwaiStaggeredGridLayoutManager.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p1, "recycler");
       try{
          a.p(p2, "state");
          return super.scrollVerticallyBy(p0, p1, p2);
       }catch(java.lang.Exception e8){
          int i = 1;
          if (SystemUtil.K()) {
             stringArray = new String[]{"msg"};
             stringArray1 = new String[i];
             stringArray1[0] = i.i(e8);
             c.d("KwaiStaggeredGridLayoutManager: scrollVerticallyBy exception:", a.a(stringArray, stringArray1));
          }else {
             stringArray = new String[]{"msg"};
             stringArray1 = new String[i];
             stringArray1[0] = e8.getMessage();
             c.d("KwaiStaggeredGridLayoutManager: scrollVerticallyBy exception:", a.a(stringArray, stringArray1));
          }
          return 0;
       }
    }
}
