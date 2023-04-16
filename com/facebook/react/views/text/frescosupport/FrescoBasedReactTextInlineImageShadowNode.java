package com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageShadowNode;
import yf.m;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import pf.g;
import yf.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.n0;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import android.content.res.Resources;
import android.content.ContextWrapper;
import java.lang.Math;
import zf.a;
import android.net.Uri;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import java.util.Locale;
import java.lang.CharSequence;
import android.content.Context;
import android.net.Uri$Builder;

public class FrescoBasedReactTextInlineImageShadowNode extends m	// class@001420
{
    public Uri b;
    public ReadableMap c;
    public final AbstractDraweeControllerBuilder d;
    public final g e;
    public float f;
    public float g;
    public int h;

    public void FrescoBasedReactTextInlineImageShadowNode(AbstractDraweeControllerBuilder p0,g p1){
       super();
       this.f = Float.NaN;
       this.g = Float.NaN;
       this.h = 0;
       this.d = p0;
       this.e = p1;
    }
    public t b(){
       Object obj = PatchProxy.apply(null, this, FrescoBasedReactTextInlineImageShadowNode.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(this.getThemedContext().getResources(), (int)Math.ceil((double)this.g), (int)Math.ceil((double)this.f), this.h, this.b, this.c, this.e, this.d);
       return obj;
    }
    public boolean isVirtual(){
       return true;
    }
    public void setHeaders(ReadableMap p0){
       this.c = p0;
    }
    public void setHeight(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrescoBasedReactTextInlineImageShadowNode.class, "3")) {
          return;
       }
       if (p0.getType() != ReadableType.Number) {
          throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
       }
       this.g = (float)p0.asDouble();
       return;
    }
    public void setSource(ReadableArray p0){
       FrescoBasedReactTextInlineImageShadowNode uFrescoBased = FrescoBasedReactTextInlineImageShadowNode.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uFrescoBased, "1")) {
          return;
       }
       Object obj = null;
       String str = (p0 == null || !p0.size())? obj: p0.getMap(0).getString("uri");
       if (str != null) {
          try{
             Uri uri = Uri.parse(str);
             try{
                if (uri.getScheme() == null) {
                   uri = obj;
                }
             }catch(java.lang.Exception e0){
             }
             if (uri == null) {
                n0 themedContex = this.getThemedContext();
                Object obj1 = PatchProxy.applyTwoRefs(themedContex, str, obj, e0, "4");
                if (obj1 != PatchProxyResult.class) {
                   obj = obj1;
                }else if(str.isEmpty()){
                   obj = new Uri$Builder().scheme("res").path(String.valueOf(themedContex.getResources().getIdentifier((str.toLowerCase(Locale.getDefault())).replace("-", "_"), "drawable", themedContex.getPackageName()))).build();
                }
             }else {
                obj = uri;
             }
          }catch(java.lang.Exception e0){
          }
       }
       if (obj != this.b) {
          this.markUpdated();
       }
       this.b = obj;
       return;
    }
    public void setTintColor(int p0){
       this.h = p0;
    }
    public void setWidth(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrescoBasedReactTextInlineImageShadowNode.class, "2")) {
          return;
       }
       if (p0.getType() != ReadableType.Number) {
          throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
       }
       this.f = (float)p0.asDouble();
       return;
    }
}
