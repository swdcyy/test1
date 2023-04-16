package com.yxcorp.plugin.setting.widget.SettingsRoundRectImageView$d;
import rsd.c;
import java.lang.Object;
import com.yxcorp.plugin.setting.widget.SettingsRoundRectImageView;
import vsd.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class SettingsRoundRectImageView$d extends c	// class@00093a
{
    public final Object b;
    public final SettingsRoundRectImageView c;

    public void SettingsRoundRectImageView$d(Object p0,Object p1,SettingsRoundRectImageView p2){
       this.b = p0;
       this.c = p2;
       super(p1);
    }
    public void c(n p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SettingsRoundRectImageView$d.class, "1")) {
          return;
       }
       a.p(p0, "property");
       this.c.p0(p0, p1.intValue(), p2.intValue());
       return;
    }
}
