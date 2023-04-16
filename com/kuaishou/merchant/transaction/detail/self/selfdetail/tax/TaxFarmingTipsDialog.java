package com.kuaishou.merchant.transaction.detail.self.selfdetail.tax.TaxFarmingTipsDialog;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.TaxFarmingTipsInfo$PopupWindowInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import androidx.fragment.app.KwaiDialogFragment;
import android.widget.TextView;
import java.lang.CharSequence;
import android.widget.ImageView;
import ai4.a;
import android.view.View$OnClickListener;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import bld.b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.TaxFarmingTipsInfo$PopupWindowInfo$ButtonInfo;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import ai4.b;

public class TaxFarmingTipsDialog extends BottomSheetFragment	// class@000761
{
    public TaxFarmingTipsInfo$PopupWindowInfo z;
    public static final int A;

    public void TaxFarmingTipsDialog(){
       super();
    }
    public static TaxFarmingTipsDialog Ih(TaxFarmingTipsInfo$PopupWindowInfo p0){
       TaxFarmingTipsDialog obj = PatchProxy.applyOneRefs(p0, null, TaxFarmingTipsDialog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TaxFarmingTipsDialog();
       obj.z = p0;
       return obj;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TaxFarmingTipsDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d0310, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TaxFarmingTipsDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0.findViewById(R.id.title_view).setText(this.z.mTitle);
       p0.findViewById(R.id.content).setText(this.z.mContent);
       p0.findViewById(R.id.close).setOnClickListener(new a(this));
       SelectShapeTextView selectShapeT = p0.findViewById(R.id.positive);
       if (this.z.mButtonInfo != null) {
          b uob = new b();
          uob.v(TextUtils.J(this.z.mButtonInfo.mBackgroundColor, a1.a(R.color.arg_RES_7f061de2)));
          uob.g(KwaiRadiusStyles.FULL);
          selectShapeT.setBackground(uob.a());
          selectShapeT.setText(this.z.mButtonInfo.mText);
       }
       selectShapeT.setOnClickListener(new b(this));
       return;
    }
}
