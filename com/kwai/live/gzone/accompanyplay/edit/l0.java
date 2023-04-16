package com.kwai.live.gzone.accompanyplay.edit.l0;
import com.kwai.live.gzone.accompanyplay.edit.GzoneProgressTextSeekBar$a;
import com.kwai.live.gzone.accompanyplay.edit.m0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class l0 implements GzoneProgressTextSeekBar$a	// class@000c06
{
    public final int a;
    public final m0 b;

    public void l0(m0 p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public String getText(int p0){
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a1.q(0x7f103a4b, ((p0 * 5) + this.a));
    }
}
