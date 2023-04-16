package com.kwai.component.homepage_interface.uxmonitor.model.TargetViewInfo;
import com.kwai.component.homepage_interface.uxmonitor.model.ViewInfo;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class TargetViewInfo	// class@000981
{
    public final List parents;
    public final ViewInfo target;

    public void TargetViewInfo(ViewInfo p0,List p1){
       a.p(p0, "target");
       a.p(p1, "parents");
       super();
       this.target = p0;
       this.parents = p1;
    }
}
