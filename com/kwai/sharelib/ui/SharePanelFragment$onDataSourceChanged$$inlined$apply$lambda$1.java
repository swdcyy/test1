package com.kwai.sharelib.ui.SharePanelFragment$onDataSourceChanged$$inlined$apply$lambda$1;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.kwai.sharelib.ui.SharePanelFragment;
import java.util.List;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class SharePanelFragment$onDataSourceChanged$$inlined$apply$lambda$1 extends LinearLayoutManager	// class@00170c
{
    public final SharePanelFragment r;
    public final List s;
    public final View t;

    public void SharePanelFragment$onDataSourceChanged$$inlined$apply$lambda$1(Context p0,SharePanelFragment p1,List p2,View p3){
       this.r = p1;
       this.s = p2;
       this.t = p3;
       super(p0);
    }
    public boolean canScrollVertically(){
       SharePanelFragment$onDataSourceChanged$$inlined$apply$lambda$1 oonDataSourc = SharePanelFragment$onDataSourceChanged$$inlined$apply$lambda$1.class;
       Object obj = PatchProxy.applyWithListener(null, this, oonDataSourc, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.s.size() > 3)? true: false;
       PatchProxy.onMethodExit(oonDataSourc, "1");
       return b;
    }
}
