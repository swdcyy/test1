package com.kuaishou.merchant.home2.basic.widget.MerchantHomeTabRecyclerView;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawCustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.home2.basic.widget.MerchantHomeTabRecyclerView$a;
import android.view.View;

public class MerchantHomeTabRecyclerView extends WatchDispatchDrawCustomRecyclerView	// class@0016f3
{
    public MerchantHomeTabRecyclerView$a r;

    public void MerchantHomeTabRecyclerView(Context p0){
       super(p0, null);
    }
    public void MerchantHomeTabRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean canScrollVertically(int p0){
       MerchantHomeTabRecyclerView obj;
       if (PatchProxy.isSupport(MerchantHomeTabRecyclerView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MerchantHomeTabRecyclerView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.r;
       if (obj != null) {
          return obj.F(p0);
       }else {
          return super.canScrollVertically(p0);
       }
    }
    public void setDelegate(MerchantHomeTabRecyclerView$a p0){
       this.r = p0;
    }
}
