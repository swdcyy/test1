package com.yxcorp.gifshow.v3.vm.MusicIconViewModel$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.vm.MusicIconViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;

public final class MusicIconViewModel$a implements Runnable	// class@001626
{
    public final MusicIconViewModel b;
    public final int c;

    public void MusicIconViewModel$a(MusicIconViewModel p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MusicIconViewModel$a.class, "1")) {
          return;
       }
       this.b.c.setValue(Integer.valueOf(this.c));
       return;
    }
}
