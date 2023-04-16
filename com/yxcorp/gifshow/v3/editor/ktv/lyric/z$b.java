package com.yxcorp.gifshow.v3.editor.ktv.lyric.z$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import lnc.a1;
import java.lang.Integer;

public class z$b implements Runnable	// class@000feb
{
    public final z b;

    public void z$b(z p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, z$b.class, "1")) {
          return;
       }
       int[] ointArray = new int[2];
       this.b.q.getLocationOnScreen(ointArray);
       this.b.U.D0().setValue(Integer.valueOf((ointArray[1] - a1.e(20.00f))));
       return;
    }
}
