package com.kwai.video.krtc.Arya$1;
import com.kwai.video.krtc.a$d;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.observers.AryaCallObserver;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class Arya$1 implements a$d	// class@000650
{
    public final Arya this$0;
    public final AryaCallObserver val$callObserver;

    public void Arya$1(Arya p0,AryaCallObserver p1){
       this.this$0 = p0;
       this.val$callObserver = p1;
       super();
    }
    public void onNotify(int p0){
       Arya$1 u1 = Arya$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "1")) {
          return;
       }
       u1 = this.this$0;
       String str = (Arya.a(u1, Arya.a(u1)))? Arya.a(this.this$0): "";
       Arya$1 tthis$0 = this.this$0;
       if (Arya.a(tthis$0, Arya.b(tthis$0))) {
          str = Arya.b(this.this$0);
       }
       Log.i("Arya", "Stannis onNotify callId:"+str+", type:"+p0);
       if (this.val$callObserver != null && (Arya.a(this.this$0, str) && (p0 != 9 && (p0 != 32 && (p0 != 35 && (p0 != 52 && (p0 != 103 && (p0 != 104 && (p0 != 2017 && (p0 != 2018 && (p0 == 2019 || p0 == 2020))))))))))) {
          this.val$callObserver.onNotify(str, p0, 0, "");
       }
    label_0095 :
       return;
    }
}
