package com.kuaishou.growth.pendant.model.PendantChangeWidgetStatusResponse;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantChangeWidgetStatusResponse$a;
import nsd.u;
import java.lang.Object;
import java.util.List;

public final class PendantChangeWidgetStatusResponse implements Serializable	// class@00066b
{
    public List mEncourageWidgetParams;
    public static final PendantChangeWidgetStatusResponse$a Companion;
    public static final long serialVersionUID;

    static {
       PendantChangeWidgetStatusResponse.Companion = new PendantChangeWidgetStatusResponse$a(null);
    }
    public void PendantChangeWidgetStatusResponse(){
       super();
    }
    public final List getMEncourageWidgetParams(){
       return this.mEncourageWidgetParams;
    }
    public final void setMEncourageWidgetParams(List p0){
       this.mEncourageWidgetParams = p0;
    }
}
