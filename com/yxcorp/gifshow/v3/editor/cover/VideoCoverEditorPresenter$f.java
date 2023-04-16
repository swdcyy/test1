package com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$f;
import y8c.g;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$e;
import ml8.c;

public class VideoCoverEditorPresenter$f extends g	// class@000e31
{

    public void VideoCoverEditorPresenter$f(){
       super();
    }
    public f h1(ViewGroup p0,int p1){
       VideoCoverEditorPresenter$f uof = VideoCoverEditorPresenter$f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0230), new VideoCoverEditorPresenter$e());
    }
}
