package com.kuaishou.merchant.marketing.shop.ginsengfruit.model.DialogConfigV2;
import mkd.a;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.BaseDialogConfig;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.DialogConfigV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import d84.b;
import d84.b$a;
import kotlin.jvm.internal.a;
import android.graphics.Color;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import java.lang.StringBuilder;
import p74.a;
import java.lang.Throwable;
import o74.a;

public final class DialogConfigV2 extends BaseDialogConfig implements a	// class@001be3
{
    public int[] bgImageColorArray;
    public List bgImageColors;
    public List bgImageUrl;
    public List items;
    public List receiveButtonBgImageUrl;
    public List receiveCouponFailBgImageUrl;
    public static final DialogConfigV2$a Companion;
    public static final long serialVersionUID;

    static {
       DialogConfigV2.Companion = new DialogConfigV2$a(null);
    }
    public void DialogConfigV2(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, DialogConfigV2.class, "1")) {
          return;
       }
       if (q.f(this.bgImageUrl) || q.f(this.bgImageColors)) {
          String[] stringArray = new String[]{"#FA4E49","#FF311B","#FF5508"};
          this.bgImageColors = CollectionsKt__CollectionsKt.L(stringArray);
       }
       DialogConfigV2 tbgImageColo = this.bgImageColors;
       if (tbgImageColo != null) {
          int[] ointArray = new int[tbgImageColo.size()];
          this.bgImageColorArray = ointArray;
          Iterator iterator = tbgImageColo.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             DialogConfigV2 obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             String str = b.a.a(obj);
             try{
                DialogConfigV2 tbgImageColo1 = this.bgImageColorArray;
                a.m(tbgImageColo1);
                tbgImageColo1[i] = Color.parseColor(str);
             }catch(java.lang.Exception e6){
                a.l(MerchantMarketingShopLogBiz.GINSENG_FRUIT, "DrawResult", "parse color error "+str+" "+obj, e6);
                obj = this.bgImageColorArray;
                a.m(obj);
                obj[i] = 0;
             }
             i = i1;
          }
       }
       return;
    }
    public final int[] getBgImageColorArray(){
       return this.bgImageColorArray;
    }
    public final List getBgImageColors(){
       return this.bgImageColors;
    }
    public final List getBgImageUrl(){
       return this.bgImageUrl;
    }
    public final List getItems(){
       return this.items;
    }
    public final List getReceiveButtonBgImageUrl(){
       return this.receiveButtonBgImageUrl;
    }
    public final List getReceiveCouponFailBgImageUrl(){
       return this.receiveCouponFailBgImageUrl;
    }
    public final void setBgImageColorArray(int[] p0){
       this.bgImageColorArray = p0;
    }
    public final void setBgImageColors(List p0){
       this.bgImageColors = p0;
    }
    public final void setBgImageUrl(List p0){
       this.bgImageUrl = p0;
    }
    public final void setItems(List p0){
       this.items = p0;
    }
    public final void setReceiveButtonBgImageUrl(List p0){
       this.receiveButtonBgImageUrl = p0;
    }
    public final void setReceiveCouponFailBgImageUrl(List p0){
       this.receiveCouponFailBgImageUrl = p0;
    }
}
