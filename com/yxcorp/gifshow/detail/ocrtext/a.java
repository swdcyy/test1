package com.yxcorp.gifshow.detail.ocrtext.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.ocrtext.d;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment$b;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;

public class a extends Accessor	// class@001602
{
    public final OcrFragment$b c;
    public final d d;

    public void a(d p0,OcrFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.a();
    }
}
