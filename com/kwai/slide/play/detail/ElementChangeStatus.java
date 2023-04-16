package com.kwai.slide.play.detail.ElementChangeStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ElementChangeStatus extends Enum	// class@001728
{
    public static final ElementChangeStatus[] $VALUES;
    public static final ElementChangeStatus ADD;
    public static final ElementChangeStatus CONTENT;
    public static final ElementChangeStatus DELETE;
    public static final ElementChangeStatus NONE;

    static {
       ElementChangeStatus uElementChan = new ElementChangeStatus("NONE", 0);
       ElementChangeStatus.NONE = uElementChan;
       ElementChangeStatus uElementChan1 = new ElementChangeStatus("ADD", 1);
       ElementChangeStatus.ADD = uElementChan1;
       ElementChangeStatus uElementChan2 = new ElementChangeStatus("DELETE", 2);
       ElementChangeStatus.DELETE = uElementChan2;
       ElementChangeStatus uElementChan3 = new ElementChangeStatus("CONTENT", 3);
       ElementChangeStatus.CONTENT = uElementChan3;
       ElementChangeStatus[] uElementChan4 = new ElementChangeStatus[]{uElementChan,uElementChan1,uElementChan2,uElementChan3};
       ElementChangeStatus.$VALUES = uElementChan4;
    }
    public void ElementChangeStatus(String p0,int p1){
       super(p0, p1);
    }
    public static ElementChangeStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ElementChangeStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ElementChangeStatus.class, p0);
    }
    public static ElementChangeStatus[] values(){
       Object obj = PatchProxy.apply(null, null, ElementChangeStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ElementChangeStatus.$VALUES.clone();
    }
}
