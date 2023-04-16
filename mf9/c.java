package mf9.c;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements g	// class@003023
{
    public final b b;

    public void c(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "23")) {
       }else if(tb.hasSticker()){
          tb.o2();
       }
       return;
    }
}
