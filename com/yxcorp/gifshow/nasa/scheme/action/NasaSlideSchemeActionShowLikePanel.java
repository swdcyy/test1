package com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeActionShowLikePanel;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeAction;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Integer;

public final class NasaSlideSchemeActionShowLikePanel extends NasaSlideSchemeAction	// class@0020d9
{
    public String mAggregateUids;
    public final String mAnchorUserId;
    public static final long serialVersionUID = 0x99b55aaa18fb0f15;

    public void NasaSlideSchemeActionShowLikePanel(String p0){
       super(2);
       this.mAnchorUserId = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NasaSlideSchemeActionShowLikePanel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || NasaSlideSchemeActionShowLikePanel.class != p0.getClass()) {
          return false;
       }
       if (!super.equals(p0)) {
          return false;
       }
       if (!k.a(this.mAnchorUserId, p0.mAnchorUserId) || !k.a(this.mAggregateUids, p0.mAggregateUids)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, NasaSlideSchemeActionShowLikePanel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(super.hashCode()),this.mAggregateUids,this.mAnchorUserId};
       return k.b(obj);
    }
}
