package com.yxcorp.gifshow.webview.view.KwaiWebActionBar;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.helper.StateListImageView;
import android.view.View;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;

public class KwaiWebActionBar extends KwaiActionBar	// class@00179c
{

    public void KwaiWebActionBar(Context p0){
       super(p0);
    }
    public void KwaiWebActionBar(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void KwaiWebActionBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public KwaiActionBar i(int p0){
       KwaiActionBar obj;
       if (PatchProxy.isSupport(KwaiWebActionBar.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KwaiWebActionBar.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.i(p0);
       obj = this.c;
       if (obj == null) {
          return this;
       }else if(!obj instanceof StateListImageView){
          return this;
       }else if(p0 > 0){
          obj.a(p0);
          this.c.c(p0);
          this.c.setVisibility(0);
       }else {
          obj.setVisibility(4);
          this.h(null);
       }
       return this;
    }
    public KwaiActionBar k(Drawable p0,boolean p1){
       KwaiActionBar obj;
       if (PatchProxy.isSupport(KwaiWebActionBar.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, KwaiWebActionBar.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.k(p0, p1);
       obj = this.c;
       if (!obj instanceof StateListImageView) {
          return this;
       }else if(p0 != null){
          obj.b(p0);
          this.c.d(p0);
          if (p1) {
             this.c.setVisibility(0);
          }
       }else {
          obj.setVisibility(4);
          this.h(null);
       }
       return this;
    }
    public KwaiActionBar n(int p0,boolean p1){
       KwaiActionBar obj;
       if (PatchProxy.isSupport(KwaiWebActionBar.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, KwaiWebActionBar.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.n(p0, p1);
       obj = this.d;
       if (obj == null) {
          return this;
       }else if(!obj instanceof StateListImageView){
          return this;
       }else if(p0 > 0){
          obj.a(p0);
          this.d.c(p0);
          if (p1) {
             this.d.setVisibility(0);
          }
       }else {
          obj.setVisibility(4);
          this.l(null);
       }
       return this;
    }
    public KwaiActionBar p(Drawable p0,boolean p1){
       KwaiActionBar obj;
       if (PatchProxy.isSupport(KwaiWebActionBar.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, KwaiWebActionBar.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.p(p0, p1);
       obj = this.d;
       if (!obj instanceof StateListImageView) {
          return this;
       }else if(p0 != null){
          obj.b(p0);
          this.d.d(p0);
          if (p1) {
             this.d.setVisibility(0);
          }
       }else {
          obj.setVisibility(4);
          this.l(null);
       }
       return this;
    }
}
