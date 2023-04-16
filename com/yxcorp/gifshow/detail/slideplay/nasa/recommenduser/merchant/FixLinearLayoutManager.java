package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.FixLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import e17.i;

public class FixLinearLayoutManager extends LinearLayoutManager	// class@001783
{

    public void FixLinearLayoutManager(Context p0){
       super(p0);
    }
    public void FixLinearLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
    }
    public void FixLinearLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, FixLinearLayoutManager.class, "1")) {
          return;
       }
       try{
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.Exception e7){
          Object[] objArray = new Object[0];
          o.C().t("FixLinearLayoutManager", "MerchantRecommendUser refresh list exception:"+e7.toString(), objArray);
          if (SystemUtil.I()) {
             i.e(R.style.arg_RES_7f11066a, "onLayoutChildren±»catchµÄ±ÀÀ£:"+e7.toString(), 0);
          }
       }
       PatchProxy.onMethodExit(FixLinearLayoutManager.class, "1");
       return;
    }
}
