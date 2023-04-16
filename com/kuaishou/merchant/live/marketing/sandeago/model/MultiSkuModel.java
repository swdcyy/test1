package com.kuaishou.merchant.live.marketing.sandeago.model.MultiSkuModel;
import java.io.Serializable;
import android.widget.EditText;
import java.lang.Object;
import com.kuaishou.merchant.live.marketing.sandeago.model.MultiSkuModel$MultiSkuPublishModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.text.Editable;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import java.lang.Boolean;
import j14.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiSkuModel implements Serializable	// class@001a45
{
    public EditText mSkuNameEt;
    public EditText mStockTitleEt;
    public static final long serialVersionUID = 0xc737195ead00e95a;

    public void MultiSkuModel(EditText p0,EditText p1){
       super();
       this.mSkuNameEt = p0;
       this.mStockTitleEt = p1;
    }
    public MultiSkuModel$MultiSkuPublishModel getPublishModel(){
       MultiSkuModel$MultiSkuPublishModel obj = PatchProxy.apply(null, this, MultiSkuModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MultiSkuModel$MultiSkuPublishModel();
       obj.mSkuName = this.getSkuName();
       obj.mSkuStock = this.getSkuStock();
       return obj;
    }
    public String getSkuName(){
       Object obj = PatchProxy.apply(null, this, MultiSkuModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return (this.mSkuNameEt.getText().toString()).trim();
    }
    public long getSkuStock(){
       Object obj = PatchProxy.apply(null, this, MultiSkuModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          long l = 0;
          if (!TextUtils.isEmpty((this.mStockTitleEt.getText().toString()).trim())) {
             l = Long.parseLong((this.mStockTitleEt.getText().toString()).trim());
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public String getSkuStockText(){
       Object obj = PatchProxy.apply(null, this, MultiSkuModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return (this.mStockTitleEt.getText().toString()).trim();
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, MultiSkuModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty((this.mStockTitleEt.getText().toString()).trim()) || TextUtils.isEmpty((this.mSkuNameEt.getText().toString()).trim()))? true: false;
       return b;
    }
    public boolean isSkuNameAvailable(){
       boolean b;
       char c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, MultiSkuModel.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.getSkuName();
       c uoc = c.class;
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, uoc, "2");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!TextUtils.isEmpty(obj)){
          obj1 = PatchProxy.applyOneRefs(obj, objArray, uoc, "3");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): c.b.matcher(obj).find();
          if (!b1) {
             Object obj2 = PatchProxy.applyOneRefs(obj, objArray, uoc, "5");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                b = obj.length();
                int i = 0;
                while (true) {
                   if (i < b) {
                      c = obj.charAt(i);
                      c = (c && (c != 9 && (c != 10 && (c != 13 && (c < ' ' || (c > 0xd7ff && (c < 0xe000 || (c > 0xfffd && (c < 0x10000 || c > 0x10ffff)))))))))? 1: 0;
                      if (c) {
                         b = true;
                      }else {
                         i = i + 1;
                      }
                   }else {
                      b = false;
                   }
                }
             }
             if (!b) {
                b = true;
             }
          }
       }
    label_00a2 :
       b = false;
       return b;
    }
    public boolean isSkuStockAvailable(){
       Object obj = PatchProxy.apply(null, this, MultiSkuModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long skuStock = this.getSkuStock();
       boolean b = (skuStock > 0 && skuStock - 999 <= 0)? true: false;
       return b;
    }
}
