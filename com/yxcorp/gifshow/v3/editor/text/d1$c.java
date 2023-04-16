package com.yxcorp.gifshow.v3.editor.text.d1$c;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import com.yxcorp.gifshow.v3.editor.text.d1;
import java.lang.Object;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import nwc.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uv8.o$b;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.util.Objects;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;

public class d1$c implements VideoFrameChangeListener	// class@0013b9
{
    public final d1 b;

    public void d1$c(d1 p0){
       this.b = p0;
       super();
    }
    public void l(VideoFrameChangeListener$CHANGE_TYPE p0){
       n.b(this, p0);
    }
    public void o(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d1$c.class, "1")) {
          return;
       }
       this.b.i().q1(0, f.l(this.b.d));
       TextElementViewModel textElementV = this.b.i();
       Objects.requireNonNull(textElementV);
       if (!PatchProxy.applyVoid(objArray, textElementV, TextElementViewModel.class, "56")) {
          textElementV.i.setValue(Boolean.TRUE);
       }
       return;
    }
    public void r(VideoFrameChangeListener$CHANGE_TYPE p0,Size p1,int p2){
       n.d(this, p0, p1, p2);
    }
    public void w(VideoFrameChangeListener$CHANGE_TYPE p0,boolean p1){
       n.a(this, p0, p1);
    }
}
