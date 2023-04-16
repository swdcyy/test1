package com.yxcorp.gifshow.detail.ocrtext.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment$b;
import com.yxcorp.gifshow.detail.ocrtext.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.ocrtext.b;
import com.yxcorp.gifshow.detail.ocrtext.c;
import java.lang.Class;
import mm8.a;

public final class d implements b	// class@001605
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("OCR_SELECTED_ITEMS", new a(this, p1));
       b uob = new b(this, p1);
       String str = "OCR_TEXT_INFO";
       try{
          p0.i(str, uob);
          p0.h(OcrFragment$b.class, new c(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
