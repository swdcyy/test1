package com.kuaishou.merchant.base.rmc.widget.ItemMarketingComplexView;
import at3.b;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.content.Context;
import android.widget.TextView;
import zs3.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import at3.a;
import java.util.Objects;
import zs3.f;
import java.lang.CharSequence;
import vr3.a;

public final class ItemMarketingComplexView extends SelectShapeTextView implements b	// class@001587
{
    public f g;
    public HashMap h;

    public void ItemMarketingComplexView(Context p0){
       super(p0);
       this.setIncludeFontPadding(false);
    }
    public e getItemMarketingViewModel(){
       return this.g;
    }
    public void release(){
       PatchProxy.applyVoid(null, this, ItemMarketingComplexView.class, "2");
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public void setItemMarketingViewModel(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ItemMarketingComplexView.class, "1")) {
          return;
       }
       a.c(this, p0);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.merchant.base.rmc.model.ItemMarketingComplexModel");
       this.g = p0;
       this.setText(p0.b());
       return;
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
    }
}
