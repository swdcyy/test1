package com.yxcorp.gifshow.detail.player.panel.elements.QualityMode;
import java.lang.Enum;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class QualityMode extends Enum	// class@00162b
{
    public int value;
    public static final QualityMode[] $VALUES;
    public static final QualityMode auto;
    public static final QualityMode higher;
    public static final QualityMode lower;

    static {
       QualityMode qualityMode;
       QualityMode[] qualityModeA = new QualityMode[]{qualityMode,qualityMode,qualityMode};
       qualityMode = new QualityMode("higher", 0, -201);
       QualityMode.higher = qualityMode;
       qualityMode = new QualityMode("lower", 1, -202);
       QualityMode.lower = qualityMode;
       qualityMode = new QualityMode("auto", 2, -100);
       QualityMode.auto = qualityMode;
       QualityMode.$VALUES = qualityModeA;
    }
    public void QualityMode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public void QualityMode(String p0,int p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p2 = -100;
       }
       super(p0, p1, p2);
       return;
    }
    public static QualityMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, QualityMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(QualityMode.class, p0);
    }
    public static QualityMode[] values(){
       Object obj = PatchProxy.apply(null, null, QualityMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QualityMode.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
    public final void setValue(int p0){
       this.value = p0;
    }
}
