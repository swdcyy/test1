package com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate$fontList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import di0.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Collection;

public final class FontVMDelegate$fontList$2 extends Lambda implements a	// class@00142b
{
    public final FontVMDelegate this$0;

    public void FontVMDelegate$fontList$2(FontVMDelegate p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList obj = PatchProxy.apply(null, this, FontVMDelegate$fontList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       ListHolder value = this.this$0.f().w0().getValue();
       if (value != null) {
          List list = value.c();
          if (list != null) {
             obj.addAll(list);
          }
       }
       return obj;
    }
}
