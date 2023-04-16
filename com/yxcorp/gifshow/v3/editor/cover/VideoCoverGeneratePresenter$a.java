package com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.util.concurrent.atomic.AtomicBoolean;
import ppc.j2;
import t45.c;

public class VideoCoverGeneratePresenter$a implements Runnable	// class@000e36
{
    public final VideoCoverGeneratePresenter b;

    public void VideoCoverGeneratePresenter$a(VideoCoverGeneratePresenter p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoCoverGeneratePresenter$a.class, "1")) {
          return;
       }
       VideoCoverGeneratePresenter$a tb = this.b;
       if (tb.B == null) {
          objArray = new Object[0];
          a.D().w("VideoCoverGeneratePresenter", "mGenerateCoverAction is null", objArray);
          return;
       }else {
          tb.B = objArray;
          if (tb.A.get()) {
             objArray = new Object[0];
             a.D().w("VideoCoverGeneratePresenter", "mGenerateCoverAction is not null", objArray);
             c.a(new j2(this));
          }
          return;
       }
    }
}
