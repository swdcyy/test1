package com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$c;
import erd.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import faa.a;
import q87.c;

public final class TextElementViewModel$c implements a	// class@00141d
{
    public final TextElementViewModel b;
    public final boolean c;

    public void TextElementViewModel$c(TextElementViewModel p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextElementViewModel$c.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.b.P0().setValue(Boolean.FALSE);
       }
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "waitAllTaskComplete complete", objArray);
       return;
    }
}
