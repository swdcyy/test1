package com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.bowl.data.center.data.model.live.agreement.AgreementPendant;
import lv.a;

public class MaterialMap implements Serializable	// class@0011c0
{
    public AgreementPendant agreementPendant;
    public boolean animationShow;
    public String areaCode;
    public List datas;
    public RegionDecorativeInfo decorativeInfo;
    public String pendantCode;
    public long pendantResourceId;
    public int pendantType;
    public String renderType;
    public SignalPendant signalPendant;
    public long templateDataType;
    public String token;
    public static final long serialVersionUID = 0x53d998146d224df6;

    public void MaterialMap(){
       super();
    }
    public boolean isDac(){
       Object obj = PatchProxy.apply(null, this, MaterialMap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.agreementPendant);
    }
}
