package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$progressContext$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import ztc.n;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$c;

public final class PicTemplateDataViewModel$progressContext$1 extends Lambda implements l	// class@001334
{
    public final PicTemplate $picTemplate;
    public final n this$0;

    public void PicTemplateDataViewModel$progressContext$1(n p0,PicTemplate p1){
       this.this$0 = p0;
       this.$picTemplate = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.floatValue());
       return l1.a;
    }
    public final void invoke(float p0){
       if (PatchProxy.isSupport(PicTemplateDataViewModel$progressContext$1.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PicTemplateDataViewModel$progressContext$1.class, "1")) {
          return;
       }
       if (this.this$0.o0(this.$picTemplate).getValue() instanceof PicTemplate$b$c) {
          this.this$0.o0(this.$picTemplate).postValue(new PicTemplate$b$c(p0));
       }
       return;
    }
}
