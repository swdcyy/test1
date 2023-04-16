package com.kuaishou.live.common.core.component.multipk.model.MultiPkPrepareResponse;
import java.io.Serializable;
import com.kuaishou.live.common.core.component.multipk.model.MultiPkPrepareResponse$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MultiPkPrepareResponse implements Serializable	// class@001650
{
    public String disableMessage;
    public boolean enableOpenMultiPk;
    public final String multiPkPlayConfigs;
    public String multiPkRule;
    public static final MultiPkPrepareResponse$a Companion;
    public static final long serialVersionUID;

    static {
       MultiPkPrepareResponse.Companion = new MultiPkPrepareResponse$a(null);
    }
    public void MultiPkPrepareResponse(){
       super();
       this.disableMessage = "";
       this.multiPkRule = "";
       this.multiPkPlayConfigs = "";
    }
    public final String getDisableMessage(){
       return this.disableMessage;
    }
    public final boolean getEnableOpenMultiPk(){
       return this.enableOpenMultiPk;
    }
    public final String getMultiPkPlayConfigs(){
       return this.multiPkPlayConfigs;
    }
    public final String getMultiPkRule(){
       return this.multiPkRule;
    }
    public final void setDisableMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiPkPrepareResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.disableMessage = p0;
       return;
    }
    public final void setEnableOpenMultiPk(boolean p0){
       this.enableOpenMultiPk = p0;
    }
    public final void setMultiPkRule(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiPkPrepareResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.multiPkRule = p0;
       return;
    }
}
