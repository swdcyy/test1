package com.kwai.feature.api.pendant.core.model.ChangeWidgetStatusBtnConfig;
import java.io.Serializable;
import com.kwai.feature.api.pendant.core.model.ChangeWidgetStatusBtnConfig$a;
import nsd.u;
import java.lang.Object;
import com.kwai.feature.api.pendant.core.model.ChangeWidgetStatusBtnConfig$Status;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ChangeWidgetStatusBtnConfig implements Serializable	// class@001032
{
    public ChangeWidgetStatusBtnConfig$Status status;
    public static final ChangeWidgetStatusBtnConfig$a Companion;

    static {
       ChangeWidgetStatusBtnConfig.Companion = new ChangeWidgetStatusBtnConfig$a(null);
    }
    public void ChangeWidgetStatusBtnConfig(){
       super();
       this.status = ChangeWidgetStatusBtnConfig$Status.NOT_SHOW;
    }
    public final ChangeWidgetStatusBtnConfig$Status getStatus(){
       return this.status;
    }
    public final void setStatus(ChangeWidgetStatusBtnConfig$Status p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChangeWidgetStatusBtnConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.status = p0;
       return;
    }
}
