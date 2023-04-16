package com.yxcorp.gifshow.aicut.logic.network.AICutStyleListResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.aicut.logic.network.AICutStyleListResponse$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AICutStyleListResponse implements Serializable	// class@00196d
{
    public List mGroupsList;
    public List mStyles;
    public static final AICutStyleListResponse$a Companion;
    public static final long serialVersionUID;

    static {
       AICutStyleListResponse.Companion = new AICutStyleListResponse$a(null);
    }
    public void AICutStyleListResponse(){
       super();
       this.mStyles = new ArrayList();
       this.mGroupsList = new ArrayList();
    }
    public final List getMGroupsList(){
       return this.mGroupsList;
    }
    public final List getMStyles(){
       return this.mStyles;
    }
    public final void setMGroupsList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutStyleListResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mGroupsList = p0;
       return;
    }
    public final void setMStyles(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutStyleListResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mStyles = p0;
       return;
    }
}
