package com.yxcorp.gifshow.v3.editor.kuaishan_segment.state.KSKeyFramePanelPlayerState;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.state.KSKeyFramePanelPlayerState$UpdateTo;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KSKeyFramePanelPlayerState extends e	// class@001024
{
    public final boolean a;
    public final double b;
    public final KSKeyFramePanelPlayerState$UpdateTo c;

    public void KSKeyFramePanelPlayerState(){
       super(false, 0, null, 7, null);
    }
    public void KSKeyFramePanelPlayerState(boolean p0,double p1,KSKeyFramePanelPlayerState$UpdateTo p2){
       a.p(p2, "updateTo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void KSKeyFramePanelPlayerState(boolean p0,double p1,KSKeyFramePanelPlayerState$UpdateTo p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = false;
       }
       if (p3 & 0x02) {
          p1 = 0;
       }
       p2 = (p3 & 0x04)? KSKeyFramePanelPlayerState$UpdateTo.NONE: null;
       super(p0, p1, p2);
       return;
    }
    public static KSKeyFramePanelPlayerState b(KSKeyFramePanelPlayerState p0,boolean p1,double p2,KSKeyFramePanelPlayerState$UpdateTo p3,int p4,Object p5){
       KSKeyFramePanelPlayerState a;
       KSKeyFramePanelPlayerState b;
       KSKeyFramePanelPlayerState c;
       if (p4 & 0x01) {
          a = p0.a;
       }
       if (p4 & 0x02) {
          b = p0.b;
       }
       if (p4 & 0x04) {
          c = p0.c;
       }
       return p0.a(a, b, c);
    }
    public final KSKeyFramePanelPlayerState a(boolean p0,double p1,KSKeyFramePanelPlayerState$UpdateTo p2){
       if (PatchProxy.isSupport(KSKeyFramePanelPlayerState.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Double.valueOf(p1), p2, this, KSKeyFramePanelPlayerState.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "updateTo");
       return new KSKeyFramePanelPlayerState(p0, p1, p2);
    }
    public final double c(){
       return this.b;
    }
    public final boolean d(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof KSKeyFramePanelPlayerState) {
          return b;
       }
       if (this.a == p0.a && !this.b - p0.b) {
          b = true;
       }
       return b;
    }
    public int hashCode(){
       int i;
       KSKeyFramePanelPlayerState obj = PatchProxy.apply(null, this, KSKeyFramePanelPlayerState.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          i = 1;
       }
       long l = Double.doubleToLongBits(this.b);
       i = ((i * 31) + (int)(l ^ (l >> 32))) * 31;
       KSKeyFramePanelPlayerState tc = this.c;
       int i1 = (tc != null)? tc.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KSKeyFramePanelPlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KSKeyFramePanelPlayerState\(playerPaused="+this.a+", playbackPts="+this.b+", updateTo="+this.c+"\)";
    }
}
