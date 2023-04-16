package com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c$b$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.dynamic.component.sku.v2.c$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification$PropValue;
import com.kuaishou.merchant.transaction.live.dynamic.service.preview.PreviewSpbModel;
import com.kuaishou.merchant.transaction.live.dynamic.service.preview.PreviewSpbModel$Location;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ue4.g;
import ju4.d;

public class c$b$a extends m	// class@0007a5
{
    public final c$b c;

    public void c$b$a(c$b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b$a.class, "1")) {
          return;
       }
       if (this.c.q.mEnabled == null) {
          return;
       }
       PreviewSpbModel previewSpbMo = new PreviewSpbModel();
       previewSpbMo.mPropValueId = this.c.q.mPropValueId;
       previewSpbMo.mLocation = new PreviewSpbModel$Location();
       int[] ointArray = new int[2];
       p0.getLocationOnScreen(ointArray);
       PreviewSpbModel mLocation = previewSpbMo.mLocation;
       mLocation.y = ointArray[1];
       mLocation.x = ointArray[0];
       mLocation.w = p0.getWidth();
       previewSpbMo.mLocation.h = p0.getHeight();
       d.i(this.c.getActivity(), "mtp_show_img_preview", g.d(previewSpbMo));
       return;
    }
}
