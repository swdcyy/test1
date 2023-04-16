package com.kwai.video.krtc.Arya$8;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import com.kwai.video.krtc.Arya;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.video.krtc.a;
import com.kwai.video.krtc.a$a;

public class Arya$8 extends AryaCallObserverInner	// class@000658
{
    public final Arya this$0;

    public void Arya$8(Arya p0){
       this.this$0 = p0;
       super();
    }
    public void onMediaServerInfo(String p0,String p1,int p2,boolean p3){
    }
    public void onNotify(String p0,int p1,int p2,int p3,String p4,String p5){
    }
    public void onNotifyInnerAddArx(String p0,int p1,int p2,int p3,String p4){
       Arya$8 u8 = Arya$8.class;
       if (PatchProxy.isSupport(u8)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, u8, "1")) {
             return;
          }
       }
       Arya.d(this.this$0).a(p1, Arya.h(this.this$0), p2, p3, p4);
       return;
    }
    public void onNotifyInnerRemoveArx(String p0,int p1){
       if (PatchProxy.isSupport(Arya$8.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, Arya$8.class, "2")) {
          return;
       }
       Arya.d(this.this$0).a(p1);
       return;
    }
    public void onVideoSendParamChanged(int p0,int p1,int p2,int p3){
    }
}
