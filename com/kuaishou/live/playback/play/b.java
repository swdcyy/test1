package com.kuaishou.live.playback.play.b;
import y8c.g;
import androidx.lifecycle.MutableLiveData;
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
import com.kuaishou.live.playback.play.b$b;
import ml8.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Number;
import java.util.List;
import g9c.a;

public class b extends g	// class@000d31
{
    public b$a w;
    public QPhoto x;
    public MutableLiveData y;

    public void b(MutableLiveData p0){
       super();
       this.y = p0;
    }
    public f h1(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.k(p0, 0x7f0d0d33, false), new b$b(this));
    }
    public int r1(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.Q0().indexOf(p0);
    }
}
