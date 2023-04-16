package com.kwai.live.gzone.accompanyplay.edit.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n37.p;
import n37.k;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameFleetSetting;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import n37.z;
import android.view.View$OnClickListener;
import n37.y;

public class t extends PresenterV2	// class@000c18
{
    public k p;
    public y q;
    public RecyclerView r;

    public void t(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       p op = new p(this.p);
       op.W0(this.p.a.mFleetSettingList);
       this.r.setAdapter(op);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       this.r.setAdapter(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       RecyclerView recyclerView = p0.findViewById(R.id.live_gzone_accompany_select_setting_recycler_view);
       this.r = recyclerView;
       recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
       this.r.addItemDecoration(new b(1, a1.e(8.00f)));
       p0.findViewById(R.id.live_gzone_accompany_setting_select_close_image_view).setOnClickListener(new z(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.p = this.q8(k.class);
       this.q = this.q8(y.class);
       return;
    }
}
